package com.tsoft.bot.frontend.pageobject.MiMovistar;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.GenerateWord;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.HashMap;
import java.util.List;

public class ComprasPageObject {
    private static final String EXCEL_APK = "excel/DataApp-MiMovistarEmpresas.xlsx";
    private static final String LOGIN_APK = "Login";
    private static final String COLUMNA_USUARIO = "NumDocumento";
    private static final String COLUMNA_PASSWORD = "Contrasena";

    public static GenerateWord generateWord = new GenerateWord();
    public AppiumDriver<MobileElement> driver;


    public ComprasPageObject() {
        this.driver = Hook.getDriver();
    }

    private static List<HashMap<String, String>> getData1() throws Throwable {
        return ExcelReader.data(EXCEL_APK, LOGIN_APK);
    }

    public String TXT_NUMERO_DOCUMENTO ="";
}
