package com.example.questions;

import com.example.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyProduct implements Question<Boolean> {
    private final String producto;

    public VerifyProduct(String producto) {
        this.producto = producto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Cart.ProductInCart.resolveFor(actor).getText().contains(producto);
    }

    public static VerifyProduct verifyProduct(String producto) {
        return new VerifyProduct(producto);
    }
}
