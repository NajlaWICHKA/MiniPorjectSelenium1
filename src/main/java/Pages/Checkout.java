package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Checkout {
    public WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }
    public void checkout() {
        WebElement clicCheckout = driver.findElement(By.id("checkout"));
        clicCheckout.click();
    }
        public void saisirFirstName( String user) {
            WebElement nomUser = driver.findElement(By.id("first-name"));
            nomUser.sendKeys(user);
        }
        public void saisirLastName( String user) {
            WebElement lastName = driver.findElement(By.id("last-name"));
            lastName.sendKeys(user);
        }
      public void saisircode(String C){
            WebElement code=driver.findElement(By.id("postal-code"));
            code.sendKeys(C);
        }
    public void verifYourInformation(){
        WebElement titre= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]"));
        Assert.assertTrue(titre.isDisplayed(),"titre non affiché");
    }
    public void boutonContinue() {
        WebElement clicContinue = driver.findElement(By.id("continue"));
        clicContinue.click();
    }

        }
