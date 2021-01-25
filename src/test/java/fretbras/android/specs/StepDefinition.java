package fretbras.android.specs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import fretbras.android.data.Constants;
import fretbras.android.pages.AccessPage;
import fretbras.android.pages.PermissionsDialog;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

    static AppiumDriver<MobileElement> driver;

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

            driver = new AppiumDriver<MobileElement>(url, cap);
            // to-do: verificar se isso funciona mesmo
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

    @When("I tap on start button")
    public void tapOnStart() {
        tapById(AccessPage.startButton, driver);
    }

    @And("I type my truck {string} and  tap on next button")
    public void fillPlateField(String string) {
        tapById(AccessPage.plateInputField, string, driver);
        tapById(AccessPage.plateNextButton, driver);
    }

    @When("I type my {string} and I tap on finish button")
    public void fillPasswordField(String string) {
        tapById(AccessPage.passwordInputField, string, driver);
        tapById(AccessPage.passwordFinishButton, driver);
    }

    @Then("I should be on checkin page and I should see the permissions dialog")
    public void finish() {
        tapById(PermissionsDialog.cancelButton, driver);
    }

}