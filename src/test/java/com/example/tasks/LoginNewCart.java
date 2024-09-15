package com.example.tasks;

import com.example.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginNewCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Cart.Cart, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(Cart.Cart)
        );

    }
    public static LoginNewCart loginNewCart(){
        return instrumented(LoginNewCart.class);
    }
}
