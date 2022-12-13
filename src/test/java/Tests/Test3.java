package Tests;

import Hooks.ClassCommune;
import Pages.*;
import org.testng.annotations.Test;

public class Test3 extends ClassCommune {
    @Test
    public void test3(){
        Login pagelogin = new Login(driver);
        Products pageProducts = new Products(driver);
        Panier pagePanier = new Panier(driver);
        Checkout pageCheckout= new Checkout(driver);
        OverView pageOverView= new OverView(driver);
        pagelogin.saisirLogin("standard_user");
        pagelogin.saisirMdp("secret_sauce");
        pagelogin.cliqueBoutonlogin();
        pageProducts.verifProducts();
        pageProducts.ajoutPremierProducts();
        pageProducts.ajoutsecondProducts();
        pageProducts.cliquePanierProducts();
        pagePanier.verifYourCart();
        pagePanier.verifieDeuxProduits();
        pageCheckout.checkout();
        pageCheckout.saisirFirstName("najla");
        pageCheckout.saisirLastName("WICHKA");
        pageCheckout.saisircode("95530");
        pageCheckout.verifYourInformation();
        pageCheckout.boutonContinue();
        pageOverView.verOverView();
        pageOverView.totalCommande();
        pageOverView.boutonFinish();
        pageOverView.veriAffichage("THANK YOU FOR YOUR ORDER");
    }
}
