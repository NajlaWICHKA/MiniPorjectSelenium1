package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ClassCommune {
    public ChromeDriver driver;

    @BeforeMethod
    public void befortest(){
        System.setProperty("webdriver.chrome.driver","C:\\DEV\\DRIVER\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void AfterN() {
        driver.quit();
    }
}

