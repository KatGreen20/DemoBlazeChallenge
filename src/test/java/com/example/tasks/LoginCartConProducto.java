package com.example.tasks;

import com.example.userinterfaces.Home;
import com.example.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginCartConProducto implements Task {

    private final String producto;

    // Constructor para recibir el producto dinámicamente
    public LoginCartConProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(Home.Login),
                Enter.theValue(Constantes.Name).into(Home.Name_Login),
                Enter.theValue(Constantes.Password).into(Home.Password_Login),
                Click.on(Home.ButtomLogin),

                // Espera que el usuario esté visible
                WaitUntil.the(Home.UserLogin, isVisible()).forNoMoreThan(10).seconds(),

                // Busca el producto dinámicamente y lo agrega al carrito
                Click.on(Home.Product.of(producto)),   // Usa el nombre del producto proporcionado
                Click.on(Home.ButtomProduct)
        );
    }

    public static LoginCartConProducto loginCartConProducto(String producto) {
        return instrumented(LoginCartConProducto.class, producto);
    }
}

