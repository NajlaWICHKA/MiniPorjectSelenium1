package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Products {
    WebDriver driver;

    public Products(WebDriver driver){

        this.driver=driver;
    }
    public void verifProducts(){
        WebElement product=driver.findElement(By.id("header_container"));
        Assert.assertTrue(product.isDisplayed(),"non ok");

    }

    public void ajoutPremierProducts(){
        WebElement ajouterpanier1=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        ajouterpanier1.click();
    }
    public void ajoutsecondProducts(){
        WebElement ajouterpanier2=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        ajouterpanier2.click();
    }
    public void cliquePanierProducts(){
        WebElement boutonPanier=driver.findElement(By.id("shopping_cart_container"));
        boutonPanier.click();


    }

}
