package fretbras.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CheckinPage extends BasePage {

    private String typeCityId = "br.lgfelicio:id/tvTypeCityCheckin";
    private String originCityInputId = "br.lgfelicio:id/actvCheckinOrigin";
    private String originCityFirstOptionId = "br.lgfelicio:id/llCheckinContent";
    private String seeFreightsTableButtonId = "br.lgfelicio:id/rbCheckinViewFreights";

    public void clickOnTypeCity(AndroidDriver<MobileElement> driver) {
        tapById(typeCityId, driver);
    }

    // Esse trecho de código é para forçar a aparição do autocomplete
    // Esse campo só aceita a entrada quando alguma opção autocomplete é pressionado
    public void chooseOriginCity(AndroidDriver<MobileElement> driver, String originCity) {
        tapById(originCityInputId, originCity, driver);
        tapById(seeFreightsTableButtonId, driver);
        tapById(originCityInputId, driver);
        driver.pressKey(new KeyEvent(AndroidKey.SPACE));
        tapById(originCityFirstOptionId, driver);
    }

    public void clickOnSeeFreights(AndroidDriver<MobileElement> driver) {
        tapById(seeFreightsTableButtonId, driver);
    }
}