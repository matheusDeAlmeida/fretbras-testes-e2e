package fretbras.android.specs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import fretbras.android.data.Constants;
import fretbras.android.pages.AccessPage;
import fretbras.android.pages.CheckinPage;
import fretbras.android.pages.CheckinViewFreightsPage;
import fretbras.android.pages.FreightDetails;
import fretbras.android.pages.PermissionsDialog;
import fretbras.android.pages.TollsTablePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class StepDefinition {

    static AndroidDriver<MobileElement> driver;

    @Before
    public void setup() {
        final int device = 0;

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", Constants.DEVICES_CAPABILITIES[device].getDeviceName());
            cap.setCapability("platformName", Constants.DEVICES_CAPABILITIES[device].getPlatformName());
            cap.setCapability("platformVersion", Constants.DEVICES_CAPABILITIES[device].getPlatformVersion());

            cap.setCapability("appPackage", "br.lgfelicio");
            cap.setCapability("appActivity", "br.lgfelicio.access.AccessActivity");
            URL url = new URL("http://0.0.0.0:4723/wd/hub");

            driver = new AndroidDriver<MobileElement>(url, cap);
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }

    @After
    public void finishTest() {
        try {
            // driver.close();
            driver.quit();
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }

    @Dado("que eu faço login")
    public void login() {
        AccessPage accessPage = new AccessPage();
        PermissionsDialog permissionsDialog = new PermissionsDialog();

        accessPage.clickOnStartButton(driver);
        accessPage.typePlateInputField(driver, Constants.USERS[0].getUserPlate());
        accessPage.clickOnPlateNextButton(driver);
        accessPage.typePassword(driver, Constants.USERS[0].getPassword());
        accessPage.clickOnPasswordFinishButton(driver);

        permissionsDialog.clickOnCancelButton(driver);
    }

    /**
     * Se o usuário já fez checkin, esse passo dever ser pulado.
     *
     */
    @E("eu faço checkin")
    public void checkin() {
        CheckinPage checkinPage = new CheckinPage();
        checkinPage.clickOnTypeCity(driver);
        checkinPage.chooseOriginCity(driver, Constants.CITIES[0]);
        checkinPage.clickOnSeeFreights(driver);
    }

    @E("eu escolho um frete")
    public void chooseFreight() {
        CheckinViewFreightsPage checkinViewFreightsPage = new CheckinViewFreightsPage();
        checkinViewFreightsPage.clickOnFirstFreight(driver);
    }

    /**
     * O botão/link da tabela de pedágios nem sempre aparece. Quando ele não
     * aparece, esse teste quebra.
     *
     */
    @Entao("eu vejo a tabela de pedágios com o pedágio para um caminhão de 2 eixos")
    public void twoAxisTruck() {
        FreightDetails freightDetails = new FreightDetails();
        TollsTablePage tollsTablePage = new TollsTablePage();

        freightDetails.clickOnTollsTable(driver);
        String twoAxisTollPrice = tollsTablePage.getTwoAxisTruckTollPrice(driver).getText();
        System.out.println(twoAxisTollPrice);
    }
}