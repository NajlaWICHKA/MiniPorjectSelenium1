package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.security.PublicKey;

public class OverView {
    WebDriver driver;

  public OverView(WebDriver driver){
      this.driver=driver;
  }
   public void verOverView(){
       WebElement titre=driver.findElement(By.id("header_container"));
       Assert.assertTrue(titre.isDisplayed(),"titre non affiché");
   }
   public void totalCommande(){
       WebElement prix=driver.findElement(By.id("checkout_summary_container"));
       Assert.assertTrue(prix.isDisplayed(),"titre non affiché");

   }
    public void boutonFinish() {
        WebElement clicFinish = driver.findElement(By.id("finish"));
        clicFinish.click();
    }
    public void veriAffichage( String msg) {
        WebElement message = driver.findElement(By.xpath("//*[@id='checkout_complete_container']/h2"));
        Assert.assertTrue(message.isDisplayed(),"message non affiché");
    }
}
