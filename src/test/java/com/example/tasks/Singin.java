package com.example.tasks;

import com.example.userinterfaces.Home;
import com.example.utils.Constantes;
import io.cucumber.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Singin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int valor=new Random().nextInt(10000+1)+1;
        actor.attemptsTo(
                Click.on(Home.Sign_up),
                Enter.theValue(Constantes.Name+valor).into(Home.Name_Singin),
                Enter.theValue(Constantes.Password).into(Home.Password_Singin),
                Click.on(Home.ButtomSign_up)
        );
        actor.remember("Usuario",Constantes.Name+valor);
    }

    public static Singin singin(){
        return instrumented(Singin.class);
    }
}
