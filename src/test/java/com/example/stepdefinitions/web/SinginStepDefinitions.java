package com.example.stepdefinitions.web;

import com.example.questions.VerifyProduct;
import com.example.questions.VerifyPurchase;
import com.example.questions.VerifyUser;
import com.example.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SinginStepDefinitions {

        @Managed(driver = "chrome")
        WebDriver hisdriver;

        @Before
        public void setThestage(){
            OnStage.setTheStage(new OnlineCast());
            OnStage.theActorCalled("cindy");
        }

        @Dado("^soy un usuario de DemoBlaze sin credenciales$")
        public void soyUnUsuarioDeDemoBlazeSinCredenciales(){
                theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
        }

        @Cuando("^ingreso informacion necesaria para creacion de usuario$")
        public void ingresoInformacionNecesariaParaCreacionDeUsuario(){
                theActorInTheSpotlight().attemptsTo(Singin.singin());
                theActorInTheSpotlight().attemptsTo(Login.login());
        }

        @Entonces("^se realiza el registro exitoso$")
        public void seRealizaElRegistroExitoso(){
                theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyUser.verifyUser(),Matchers.is(true)));
        }


        //Login con el Carrito

        @Dado("^que soy un usuario de DemoBlaze$")
        public void que_soy_un_usuario_de_demo_blaze() {
                theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));

        }
        @Cuando("^agrego un celular al carrito$")
        public void agrego_un_celular_al_carrito() {
                theActorInTheSpotlight().attemptsTo(LoginCart.loginCart());
        }

        //Ingresar para ir directo a la pestaña de Cart
        @Cuando("^ingreso para verificar carrito$")
        public void ingreso_para_verificar_carrito() {
                theActorInTheSpotlight().attemptsTo(LoginNewCart.loginNewCart());
        }

        @Entonces("^verifico que se encuentre agregado$")
        public void verifico_que_se_encuentre_agregado() {
                theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyProduct.verifyProduct(), Matchers.is(true)));
        }

        @Y("^finalizo la compra verificada$")
        public void finalizoLaCompraVerificada() {
                theActorInTheSpotlight().attemptsTo(Purchase.purchase());
                theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyPurchase.verifyPurchase(), Matchers.is(true)));
        }
}
