package co.com.choucair.certification.proyectobase.stepdefinitions;


import co.com.choucair.certification.proyectobase.questions.Answer_1;

import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import org.mockito.stubbing.Answer;

import javax.security.auth.login.LoginContext;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Mathew wants to login at Utest$")
    public void thanMathewWantsToLoginAtUtest() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Mathew").wasAbleTo(OpenUp.thePage(),Login.onThePage());
    }

    @When("^he register for the Utest$")
    public void heRegisterForTheUtest(String welcome) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(welcome));
    }

    @Then("^He can in to the Utest plataform$")
    public void heCanInToTheUtestPlataform(String question) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer_1.toThe(question)));
    }


}
