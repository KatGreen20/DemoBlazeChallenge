package com.example.questions;

import com.example.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyProduct implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        boolean compare= Cart.ProductInCart.resolveFor(actor).getText().contains("Samsung galaxy s6");
        return compare;
    }
    public static VerifyProduct verifyProduct(){
        return new VerifyProduct();
    }
}
