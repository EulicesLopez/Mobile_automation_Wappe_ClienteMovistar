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

public class LoginPageObject {

    private static final String EXCEL_APK = "excel/DataApp-MiMovistarEmpresas.xlsx";
    private static final String LOGIN_APK = "Login";
    private static final String COLUMNA_USUARIO = "NumDocumento";
    private static final String COLUMNA_PASSWORD = "Contrasena";

    public static GenerateWord generateWord = new GenerateWord();
    public AppiumDriver<MobileElement> driver;


    public LoginPageObject() {
        this.driver = Hook.getDriver();
    }

    private static List<HashMap<String, String>> getData1() throws Throwable {
        return ExcelReader.data(EXCEL_APK, LOGIN_APK);
    }

    public String TXT_NUMERO_DOCUMENTO = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText";
    public String TXT_CONTRASENA = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText";
    public String BTN_INGRESAR = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[5]/android.widget.Button";


    public String BTN_SELECT_TIPO_DOCUMENTO = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Image";
    public String OPCION_CEX = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View";
    public String OPCION_PASAPORTE = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View";
    public String OPCION_OTROS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]/android.view.View";

    public String BTN_REGISTRARME = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[4]/android.view.View[6]/android.view.View/android.widget.Button";

    public String BTN_EMPRESA_MAQUINARIAS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View";
   // public String BTN_EMPRESA_MAQUINARIAS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View";
    public String BTN_EMPRESA_FAROLITO = "//android.view.View[3]/android.view.View[2]/android.view.View";


    public String BTN_NPS_10= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]";
    public String BTN_NPS_ENVIAR = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[5]/android.widget.Button";
    public String BTN_NPS_TEXTAREA = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
    public String BTN_NPS_ENVIAR2="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.widget.Button";


    public String ETIQUETA_NOMBRE_CLIENTE="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]";
    public String ETIQUETA_EMPRESA_ROL="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]";
    public String BTN_PERFIL="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View";
    public String BTN_CERAR_SESION="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]";




    public void ingresoCredencialesUsurioDocumento(String casoDePrueba) throws Throwable {
        try {
            int valores = Integer.parseInt(casoDePrueba) - 1;
            String numDocumentoData = getData1().get(valores).get(COLUMNA_USUARIO);
            String passwordData = getData1().get(valores).get(COLUMNA_PASSWORD);

            driver.findElement(By.xpath(TXT_NUMERO_DOCUMENTO)).sendKeys(numDocumentoData);
            driver.findElement(By.xpath(TXT_CONTRASENA)).sendKeys(passwordData);

            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresan Credenciales de Acceso: Documento: "+numDocumentoData+" - Contraseña: "+passwordData);
            generateWord.sendText("Se ingresan Credenciales de Acceso: Documento: "+numDocumentoData+" - Contraseña: "+passwordData);
            generateWord.addImageToWord(driver);

            driver.findElement(By.xpath(BTN_INGRESAR)).click();
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }



    public void seleccionarUnaEmpresa() throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se selecciona una empresa");
            generateWord.sendText("Se selecciona una empresa");
            generateWord.addImageToWord(driver);

            driver.findElement(By.xpath(BTN_EMPRESA_MAQUINARIAS)).click();
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }


    public void cerrarSesion() throws Throwable {
        try {

            driver.findElement(By.xpath(BTN_PERFIL)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se selecciona opciones Perfil");
            generateWord.sendText("Se selecciona opciones Perfil");
            generateWord.addImageToWord(driver);
            driver.findElement(By.xpath(BTN_CERAR_SESION)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se dio clic en cerrar sesion");
            generateWord.sendText("Se dio clic en cerrar sesion");
            Thread.sleep(30000);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }



    public void getNombreClienteyRol() throws Throwable {
        try {
            Thread.sleep(3000);
            String nombreCliente =driver.findElement(By.xpath(ETIQUETA_NOMBRE_CLIENTE)).getText();
            String rol =driver.findElement(By.xpath(ETIQUETA_EMPRESA_ROL)).getText();

            ExtentReportUtil.INSTANCE.stepPass(driver, "Datos de Login Cliente: "+nombreCliente+" Empresa/Rol: "+rol);
            generateWord.sendText("Datos de Login Cliente: "+nombreCliente+" Empresa/Rol: "+rol);
            generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }




    public void bienvenidaMovistarEmpresas() throws Exception {
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa a la APP Mi Movistar");
            generateWord.sendText("Se ingresa a la APP Mi Movistar");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }

    }


}
