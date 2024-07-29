package co.com.choucair.certification.questions;

import co.com.choucair.certification.userinterfaces.RecruitmentUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.userinterfaces.RecruitmentUserInterfaces.*;

public class RegistroQuestion implements Question {

    private String candidate;
    private String hire;

    public RegistroQuestion(String candidate, String hire) {
        this.candidate = candidate;
        this.hire = hire;
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_AS, WebElementStateMatchers.isEnabled()).forNoMoreThan(30).seconds(),
                Click.on(BTN_RC),
                WaitUntil.the(INP_CANDIDATE, WebElementStateMatchers.isEnabled()).forNoMoreThan(20).seconds(),
                Enter.theValue(candidate).into(INP_CANDIDATE),
                Click.on(OPC_NAME),
                WaitUntil.the(BTN_SEARCH, WebElementStateMatchers.isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(BTN_SEARCH));
        return TXT_HIRE.resolveFor(actor).getText();
    }

    public static RegistroQuestion hire(String candidate, String hire) {
        return new RegistroQuestion(candidate, hire);
    }

}