package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Panier {
    public WebDriver driver;
    public Panier(WebDriver driver){
        this.driver= driver;
    }
    public void verifYourCart(){
        WebElement titre= driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span"));
      Assert.assertTrue(titre.isDisplayed(),"titre non affiché");
    }
    public void verifieDeuxProduits(){
        WebElement nbr= driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span"));
        Assert.assertTrue(nbr.isDisplayed(),"panier non affiché");
        Assert.assertTrue(nbr.getText().contains("2")," non ok");
    }

}
