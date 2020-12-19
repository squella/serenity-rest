package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetAllUsers implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Get.resource("/users?page=2");
    }
}
