package com.example.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    //Localizadores Singin
    public static final Target Sign_up= Target.the("SIGN UP").locatedBy("//a[@id=\"signin2\"]");
    public static final Target Name_Singin= Target.the("Name registro").located(By.id("sign-username"));
    public static final Target Password_Singin= Target.the("Password registro").located(By.id("sign-password"));
    public static final Target ButtomSign_up= Target.the("Registro completado").locatedBy("//button[@onclick=\"register()\"]");

    //Localizadores Login
    public static final Target Login= Target.the("LOG IN").locatedBy("//a[@id=\"login2\"]");
    public static final Target Name_Login= Target.the("Name login").locatedBy("//input[@id=\"loginusername\"]");
    public static final Target Password_Login= Target.the("Password login").locatedBy("//input[@id=\"loginpassword\"]");
    public static final Target ButtomLogin= Target.the("Login completado").locatedBy("//button[@onclick=\"logIn()\"]");
    public static final Target UserLogin= Target.the("Welcome").locatedBy("//a[@id=\"nameofuser\"]");

    //Localizadores producto
    public static final Target Product= Target.the("Producto").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target ButtomProduct= Target.the("Añadir al carrito").locatedBy("//a[contains(text(),'Add to cart')]");

}
