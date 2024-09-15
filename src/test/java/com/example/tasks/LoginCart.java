package com.example.tasks;

import com.example.userinterfaces.Cart;
import com.example.userinterfaces.Home;
import com.example.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.Login),
                Enter.theValue(Constantes.Name).into(Home.Name_Login),
                Enter.theValue(Constantes.Password).into(Home.Password_Login),
                Click.on(Home.ButtomLogin),

                WaitUntil.the(Home.UserLogin, isVisible()).forNoMoreThan(10).seconds(),

                Click.on(Home.Product),
                Click.on(Home.ButtomProduct)

        );
    }

    public static LoginCart loginCart(){
        return instrumented(LoginCart.class);
    }
}

