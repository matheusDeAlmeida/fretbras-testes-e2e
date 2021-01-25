package fretbras.android;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.net.URL;

public class App 
{
    static AppiumDriver<MobileElement> driver;
    public static void main(String[] args){
       try {
           openCalculator();
       } catch(Exception exp){
           System.out.println(exp.getCause());
           System.out.println(exp.getMessage());
           exp.printStackTrace();
       }
    }

    public static void openCalculator() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "motorola one");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");

	cap.setCapability("appPackage", "br.lgfelicio");
	// br.lgfelicio.checkin.presentation.view.CheckInActivity
	cap.setCapability("appActivity", "br.lgfelicio.access.AccessActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(url, cap);
        System.out.println("app started");

	// logar
	MobileElement startButton = driver.findElement(By.id("br.lgfelicio:id/roadButtonText"));
	// MobileElement plateInputField = driver.findElement(By.id("br.lgfelicio:id/etVehiclePlate"));
	// MobileElement plateNextButton = driver.findElement(By.id("br.lgfelicio:id/btVehiclePlateNext"));
	// MobileElement passwordInputField = driver.findElement(By.id("br.lgfelicio:id/etPassword"));
	// MobileElement passwordFinishButton = driver.findElement(By.id("br.lgfelicio:id/btPasswordFinish"));
	
	startButton.click();
	// plateInputField.click();
    }
}



// Dados do veículo - login

// passo 1
// botao comecar: br.lgfelicio:id/roadButtonText
// username/placa: br.lgfelicio:id/etVehiclePlate
// botao próximo: br.lgfelicio:id/btVehiclePlateNext

// passo 2
// senha: br.lgfelicio:id/etPassword
// botaoEntrar: br.lgfelicio:id/btPasswordFinish

// passo 2.5 -- permissoes necessarias
// botao cancelar: android:id/button2
// botao continuar: android:id/button1
//
// passo 3 -- checkin
// botao "Digite uma cidade": br.lgfelicio:id/tvTypeCityCheckin
//
// passo 3.5 -- checkin
// input field, "Cidade de origem": br.lgfelicio:id/actvCheckinOrigin
// input field, "Destino (opcional)": br.lgfelicio:id/retCheckinDestination
// botao, "Ver fretes": br.lgfelicio:id/rbCheckinViewFreights
//
// passo 4 -- lista de fretes
// botao, frete 1: /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]
//
// passo 5 -- detalhes do frete
// botao, "Tabela de pedagios": br.lgfelicio:id/tvTollsTable
//
// passo 5.5 -- tabela de pedagios
// texto, valor do pedágio de um caminhão com dois eixos: /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[3]
//
//
//
//
//
//


// check-in
// botao comecar: br.lgfelicio:id/roadButtonText
// botão X: br.lgfelicio:id/ivRoadToolbarIcon
// exibir informações: br.lgfelicio:id/tvCheckinSharedInfTitle
// controle o compartilhamento de seus dados: br.lgfelicio:id/actvCheckinOrigin

