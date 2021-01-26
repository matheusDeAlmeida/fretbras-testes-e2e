package fretbras.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FreightDetails extends BasePage {
    private String tollsTable = "br.lgfelicio:id/tvTollsTable";

    public void clickOnTollsTable(AndroidDriver<MobileElement> driver) {
        tapById(tollsTable, driver);
    }
}