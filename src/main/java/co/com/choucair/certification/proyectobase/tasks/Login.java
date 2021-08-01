package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.RegisterUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("IngresaPrimerNombre").into(RegisterUtestPage.INPUT_FIRST_NAME),
                Enter.theValue("IngresaApellido").into(RegisterUtestPage.INPUT_LAST_NAME),
                Enter.theValue("lifiunf@hotmail.com").into(RegisterUtestPage.EMAIL_ADDRESS),
                Click.on(RegisterUtestPage.MONTH_BIRTH),
                Click.on(RegisterUtestPage.DAY_BIRTH),
                Click.on(RegisterUtestPage.YEAR_BIRTH),
                Click.on(RegisterUtestPage.LANGUAGES_SPOKEN),
                Click.on(RegisterUtestPage.NEXT_LOCATION),


                Click.on(RegisterUtestPage.NEXT_DEVICES),



                 Click.on(RegisterUtestPage.BUTTON_NEXT_STEP),

                Enter.theValue("IngresarContraseña12345").into(RegisterUtestPage.PASSWORD_USER),
                Enter.theValue("IngresarContraseña12345").into(RegisterUtestPage.CONFIRM_PASSWORD_USER),
                Click.on(RegisterUtestPage.TERM_OF_USE),
                Click.on(RegisterUtestPage.PRIVACY_SETTINGS),
                 Click.on(RegisterUtestPage.COMPLETE_SETUP)

                );
    }
}
