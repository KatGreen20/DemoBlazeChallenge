package com.example.questions;

import com.example.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyPurchase  implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean compare= Cart.FinalMessagePurchase.resolveFor(actor).getText().contains("Thank you for your purchase!");
        return compare;
    }
    public static VerifyPurchase verifyPurchase(){
        return new VerifyPurchase();
    }
}
