package fretbras.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TollsTablePage {
    private String twoAxisTruckTollPriceXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[3]";

    public MobileElement getTwoAxisTruckTollPrice(AndroidDriver<MobileElement> driver) {
        return driver.findElementByXPath(twoAxisTruckTollPriceXpath);
    }
}