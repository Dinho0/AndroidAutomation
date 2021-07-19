package Steps;

import Screens.Genre;
import Screens.Home;
import Screens.Music;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base {

    AndroidDriver<AndroidElement> driver;
    Home homeScreen = new Home();
    Genre genreScreen = new Genre();
    Music musicScreen = new Music();



    public AndroidDriver<AndroidElement> desiredCap() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        File appdir = new File("src\\test\\resources");
        File app = new File(appdir,"UAMPMusicPlayerApp.apk");

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OlaEmulator");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

    return driver;
    }

    public void click(String path){
        driver.findElementByXPath(path).click();
    }

    public void waitForScreen() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void isDisplayed(String path){
        driver.findElementByXPath(path).isDisplayed();
    }

    public void scroll(){

    }
    public void longClick(){

    }





}
