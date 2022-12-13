package Pages;

import com.sun.source.tree.IfTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;

    }

    public void saisirLogin( String login) {
        WebElement user = driver.findElement(By.id("user-name"));
        user.sendKeys(login);
    }
    ;public void saisirMdp(String mdp) {
            WebElement passe = driver.findElement(By.id("password"));
            passe.sendKeys(mdp);
    }

    public void saisirNom( String nom) {
        WebElement user = driver.findElement(By.id("Nom"));
        user.sendKeys(nom);
    }
    public void saisirPrenom( String prenom) {
        WebElement user = driver.findElement(By.id("Nom"));
        user.sendKeys(prenom);
    }

    public void cliqueBoutonlogin() {
        WebElement btnlogin = driver.findElement(By.id("login-button"));
        btnlogin.click();
    }

    public void verifieMsg( String msg) {
        WebElement message = driver.findElement(By.id("login_button_container"));
        Assert.assertTrue(message.isDisplayed(),"message non affiché");
        }
    public void verifieAffiche( String affiche) {
        WebElement message = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        Assert.assertTrue(message.isDisplayed(), "message non affiché");
    }
    }
