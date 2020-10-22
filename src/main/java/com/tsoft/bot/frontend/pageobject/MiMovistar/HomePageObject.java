package com.tsoft.bot.frontend.pageobject.MiMovistar;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.List;

public class HomePageObject {

    private static final String EXCEL_APK = "excel/DataApp-MiMovistarEmpresas.xlsx";
    private static final String LOGIN_APK = "Login";
    private static final String COLUMNA_USUARIO = "NumDocumento";
    private static final String COLUMNA_PASSWORD = "Contrasena";

    public static GenerateWord generateWord = new GenerateWord();
    public AppiumDriver<MobileElement> driver;

    public HomePageObject() {
        this.driver = Hook.getDriver();
    }

    private static List<HashMap<String, String>> getData1() throws Throwable {
        return ExcelReader.data(EXCEL_APK, LOGIN_APK);
    }


    //public String BTN_MENU_PRODUCTOS="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[1]/android.view.View";
    // public String BTN_MENU_SOLICITUDES="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[2]/android.view.View";
    public String BTN_MENU_CASITA="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[3]/android.view.View/android.view.View";
    public String BTN_MENU_PRODUCTOS="tab-button-servicios";
    public String BTN_MENU_SOLICITUDES="tab-button-solicitudes";
    public String BTN_MENU_FACTURACION="tab-button-facturacion";
    public String BTN_MENU_COMPRAS="tab-button-compras";




    public void seleccionarMenuProductos() throws Throwable {
        try {
            driver.findElement(By.id(BTN_MENU_PRODUCTOS)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se selecciona Menú Mis Productos");
            generateWord.sendText("Se selecciona Menú Mis Productos");
            generateWord.addImageToWord(driver);
            Thread.sleep(30000);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }

    public void seleccionarMenuCasitaHome() throws Throwable {
        try {
            driver.findElement(By.xpath(BTN_MENU_CASITA)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se selecciona Menú Casita Home");
            generateWord.sendText("Se selecciona Menú Casita Home");
            generateWord.addImageToWord(driver);
            Thread.sleep(30000);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }

    public void seleccionarMenuSolitudes() throws Throwable {
        try {
            driver.findElement(By.id(BTN_MENU_SOLICITUDES)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se selecciona Menú Solicitudes");
            generateWord.sendText("Se selecciona Menú Solicitudes");
            generateWord.addImageToWord(driver);
            Thread.sleep(30000);

        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }

    public void seleccionarMenuFacturacion() throws Throwable {
        try {
            driver.findElement(By.id(BTN_MENU_FACTURACION)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se selecciona Menú Facturacion");
            generateWord.sendText("Se selecciona Menú Facturacion");
            generateWord.addImageToWord(driver);

            Thread.sleep(30000);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }

    public void seleccionarMenuCompras() throws Throwable {
        try {
            driver.findElement(By.id(BTN_MENU_COMPRAS)).click();

            ExtentReportUtil.INSTANCE.stepPass(driver, "Se selecciona Menú Compras");
            generateWord.sendText("Se selecciona Menú Compras");
            generateWord.addImageToWord(driver);
            Thread.sleep(30000);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }

}
