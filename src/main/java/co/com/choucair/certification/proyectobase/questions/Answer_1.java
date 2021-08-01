package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.RegisterUtestPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer_1 implements Question<Boolean> {
    private String question;
    public Answer_1(String question) {
        this.question=question;
    }

    public static Answer_1 toThe(String question) {
        return new Answer_1(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String intoPage= Text.of(SearchWelcomePage.WELCOME_COURSE).viewedBy(actor).asString();
        if(question.equals(intoPage)){
            result=true;

        }else{
            result= false;
        }
        return result;

    }
}
