package com.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Cart {

    //Localizadores Carrito
    public static final Target Cart= Target.the("Carrito").locatedBy("//a[@id=\"cartur\"]");
    public static final Target ProductInCart= Target.the("Celular").locatedBy("(//tr[@class=\"success\"])[1]");
    public static final Target PlaceOrderButtom= Target.the("Boton Place Order").locatedBy("//button[contains(text(),'Place Order')]");

    //Localizadores Formulario PlaceOrder
    public static final Target NamePlaceOrder= Target.the("Nombre en la orden de compra").locatedBy("//input[@id='name']");
    public static final Target CountryPlaceOrder= Target.the("Pais en la orden de compra").locatedBy("//input[@id='country']");
    public static final Target CityPlaceOrder= Target.the(" Ciudad en la orden de compra").locatedBy("//input[@id='city']");
    public static final Target CreditCardPlaceOrder= Target.the("Numero Tarjeta en la orden de compra").locatedBy("//input[@id='card']");
    public static final Target MonthPlaceOrder= Target.the("Mes en la orden de compra").locatedBy("//input[@id='month']");
    public static final Target YearPlaceOrder= Target.the("Año en la orden de compra").locatedBy("//input[@id='year']");
    public static final Target PurchaseButtom= Target.the("Año en la orden de compra").locatedBy("//button[contains(text(),'Purchase')]");
    public static final Target FinalMessagePurchase= Target.the("Año en la orden de compra").locatedBy("//h2[contains(text(),'Thank you for your purchase!')]");
    public static final Target OkButtom= Target.the("Año en la orden de compra").locatedBy("//button[contains(text(),'OK')]");


}
