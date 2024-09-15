package com.example.tasks;

import com.example.userinterfaces.Cart;
import com.example.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Purchase implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Cart.PlaceOrderButtom),
                Enter.theValue(Constantes.NamePlaceOrder).into(Cart.NamePlaceOrder),
                Enter.theValue(Constantes.Country).into(Cart.CountryPlaceOrder),
                Enter.theValue(Constantes.City).into(Cart.CityPlaceOrder),
                Enter.theValue(Constantes.CreditCard).into(Cart.CreditCardPlaceOrder),
                Enter.theValue(Constantes.Month).into(Cart.MonthPlaceOrder),
                Enter.theValue(Constantes.Year).into(Cart.YearPlaceOrder),
                Click.on(Cart.PurchaseButtom)
                //WaitUntil.the(Cart.FinalMessagePurchase, isPresent()).forNoMoreThan(10).seconds(),
                //Click.on(Cart.OkButtom)
        );
    }
    public static Purchase purchase(){
        return instrumented(Purchase.class);
    }
}
