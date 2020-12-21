package stepdefinitions.login;

import io.cucumber.java.en.Given;

public class LoginStepDefinitions {

    @Given("que estoy en la tienda de carros")
    public void imLogged(){

    }

    @Given("Given yo quiero comprar un arbolito de navidad")
    public void algo(){
        actor.attempsto(
                Login(),
                VerSiTengoPlata(),
                IrALAPaginaDeArbolitos()

                )

    }

}
