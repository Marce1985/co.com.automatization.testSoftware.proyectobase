package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RegisterUtestPage extends PageObject {
    public static final Target INPUT_FIRST_NAME= Target.the("where do we write the first name user")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME= Target.the("where do we write the last name user")
            .located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS= Target.the("where do we write the email address user")
            .located(By.id("email"));
    public static final Target MONTH_BIRTH= Target.the("where do we write the birth month user")
            .located(By.id("birthMonth"));
    public static final Target DAY_BIRTH= Target.the("where do we write the birth day user")
            .located(By.xpath("//select[@name='birthDay']"));
    public static final Target YEAR_BIRTH= Target.the("where do we write the birth year user")
            .located(By.xpath("//select[@name='birthYear']"));
    public static final Target LANGUAGES_SPOKEN= Target.the("where do we write the languages (spoken) user")
            .located(By.id("languages"));
    public static final Target NEXT_LOCATION= Target.the("the button that shows to locations page ")
            .located(By.xpath("//a[@class='btn btn-blue']"));


    public static final Target CITY_USER= Target.the("where do we write the city user")
            .located(By.xpath("//input[@name='city']"));
    public static final Target ZIP_USER= Target.the("where do we write the zip user")
            .located(By.xpath("//input[@name='zip']"));
    public static final Target STATE_LOCATION= Target.the("where do we write the state location user")
            .located(By.xpath("//div[@class='ui-select-match']"));
    public static final Target NEXT_DEVICES= Target.the("the button that shows to devices page")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target MOBILE_DEVICE= Target.the("where do we write the mobile device user")
            .located(By.xpath("//span[contains(text(),'Select Brand')]"));
    public static final Target MODEL_DEVICE= Target.the("where do we write the model device user")
            .located(By.xpath("//div[@aria-label='Select a Model' ]"));
    public static final Target OS_DEVICE= Target.the("where do we write the os device user")
            .located(By.name("handsetOSId"));
    public static final Target OS_COMPUTER= Target.the("where do we write the os computer user")
            .located(By.name("osId"));
    public static final Target VERSION_COMPUTER= Target.the("where do we write the version computer user")
            .located(By.name("osVersionId"));
    public static final Target LANGUAGE_OS_COMPUTER= Target.the("where do we write the language os computer user")
            .located(By.name("osLanguageId"));
    public static final Target BUTTON_NEXT_STEP= Target.the("the button that shows to the next step page")
            .located(By.xpath("//div[@class='pull-right next-step']"));


    public static final Target PASSWORD_USER= Target.the("where do we write the password user")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_USER= Target.the("where do we write the confirm password user")
            .located(By.id("confirmPassword"));
    public static final Target TERM_OF_USE= Target.the("where do we select the version computer user")
            .located(By.id("termOfUse"));
    public static final Target PRIVACY_SETTINGS= Target.the("where do we select the term of use")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP= Target.the("where do we select the privacy settings")
            .located(By.id("laddaBtn"));



}
