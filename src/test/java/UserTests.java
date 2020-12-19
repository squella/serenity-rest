

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.internal.filter.SendRequestFilter;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(SerenityRunner.class)
public class UserTests {

    @Test
    public void getAllUsers() {
        String url = "https://reqres.in/api";

        Actor actor = Actor.named("Alejandro")
                .describedAs("El administrador");

        actor.can(CallAnApi.at(url));
        SerenityRest.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

        actor.attemptsTo(
                Get.resource("/users?page=2")
        );

        actor.should(
                seeThat("el codigo de respuesta", new ResponseCode(), equalTo(200) )
        );
    }

}
