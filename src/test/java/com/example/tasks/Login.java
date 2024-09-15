package com.example.tasks;

import com.example.userinterfaces.Home;
import com.example.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String usuario= actor.recall("Usuario");
        actor.attemptsTo(
                Click.on(Home.Login),
                Enter.theValue(usuario).into(Home.Name_Login),
                Enter.theValue(Constantes.Password).into(Home.Password_Login),
                Click.on(Home.ButtomLogin)
        );
    }
    public static Login login(){
        return instrumented(Login.class);
    }
}
