package com.example.questions;

import com.example.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class VerifyUser implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String Usuario = actor.recall("Usuario");

        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(Home.UserLogin.resolveFor(actor)));

        String actualText = Home.UserLogin.resolveFor(actor).getText();
        boolean compare = actualText.equals("Welcome " + Usuario);
        return compare;
    }

    public static VerifyUser verifyUser(){
        return new VerifyUser();
    }
}



