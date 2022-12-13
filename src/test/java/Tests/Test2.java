package Tests;

import Hooks.ClassCommune;
import Pages.Login;
import org.testng.annotations.Test;

public class Test2 extends ClassCommune {
    @Test
    public void Test(){
        Login pagelogin = new Login(driver);
        pagelogin.saisirLogin("standard_user");
        pagelogin.saisirMdp("locked_out_user");
        pagelogin.cliqueBoutonlogin();
        pagelogin.verifieAffiche("Epic sadface: Username and password do not match any user in this service");

    }
}
