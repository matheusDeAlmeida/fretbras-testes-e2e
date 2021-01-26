package fretbras.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PermissionsDialog extends BasePage {
    private String cancelButton = "android:id/button2";
    private String continueButton = "android:id/button1";

    public void clickOnCancelButton(AndroidDriver<MobileElement> driver) {
        tapById(cancelButton, driver);
    }

    public void clickOnContinueButton(AndroidDriver<MobileElement> driver) {
        tapById(continueButton, driver);
    }
}