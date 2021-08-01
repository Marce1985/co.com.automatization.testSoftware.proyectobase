package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchWelcomePage extends PageObject {
    public static final Target WELCOME_COURSE= Target.the("extract welcome string")
            .located(By.xpath("//h1[contains(text(),'Welcome to the world')]"));

}
