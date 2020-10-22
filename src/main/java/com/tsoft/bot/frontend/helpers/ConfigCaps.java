package com.tsoft.bot.frontend.helpers;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ConfigCaps {

    static String url = "http://127.0.0.1:4723/wd/hub";


            public static final URL appiumServerUrl(){
                try{
                    return new URL(url);
                }catch(MalformedURLException e){
                    e.printStackTrace();
                }
                return null;
            }

    public static final DesiredCapabilities dcAndroid_Celular(){

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0.0");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"BLL-L23");
                capabilities.setCapability(MobileCapabilityType.UDID, "NXPDU17707001579");
                capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
                capabilities.setCapability("appPackage", "pe.telefonica.mimovistarempresas"); //USSD
                capabilities.setCapability("appActivity", "pe.telefonica.mimovistarempresas.MainActivity"); // USSD
                return capabilities;
    }
    public static final DesiredCapabilities dcAndroid_Emulador(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"MATE20");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        capabilities.setCapability("appPackage", "pe.telefonica.mimovistarempresas"); //USSD
        capabilities.setCapability("appActivity", "pe.telefonica.mimovistarempresas.MainActivity"); // USSD
        return capabilities;
    }





}
