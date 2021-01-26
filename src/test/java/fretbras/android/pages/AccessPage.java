package fretbras.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AccessPage extends BasePage {

    private String startButtonId = "br.lgfelicio:id/roadButtonText";
    private String plateInputField = "br.lgfelicio:id/etVehiclePlate";
    private String plateNextButtonId = "br.lgfelicio:id/btVehiclePlateNext";
    private String passwordInputFieldId = "br.lgfelicio:id/etPassword";
    private String passwordFinishButtonId = "br.lgfelicio:id/btPasswordFinish";

    public void clickOnStartButton(AndroidDriver<MobileElement> driver) {
        tapById(startButtonId, driver);
    }

    public void typePlateInputField(AndroidDriver<MobileElement> driver, String plate) {
        tapById(plateInputField, plate, driver);
    }

    public void clickOnPlateNextButton(AndroidDriver<MobileElement> driver) {
        tapById(plateNextButtonId, driver);
    }

    public void typePassword(AndroidDriver<MobileElement> driver, String password) {
        tapById(passwordInputFieldId, password, driver);
    }

    public void clickOnPasswordFinishButton(AndroidDriver<MobileElement> driver) {
        tapById(passwordFinishButtonId, driver);
    }

}