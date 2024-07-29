package co.com.choucair.certification.tasks;
import co.com.choucair.certification.userinterfaces.RecruitmentUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.ui.Dropdown;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import static co.com.choucair.certification.userinterfaces.RecruitmentUserInterfaces.INP_VACANCY;

//clase Registro
public class EnterUserData implements Task{
    //Atributos son los datos necesarios para el formulario de registro de usuario
    private String firstsname;
    private String middlename;
    private String lastname;
    private String vacancy;
    private String email;
    private String contactnumber;
    private String interview;
    private String interviewer;
    private String dateday;
    private String time;


    public EnterUserData(String firstsname, String middlename, String lastname, String vacancy, String email, String contactnumber, String interview, String interviewer, String dateday, String time, String candidate) {
        this.firstsname = firstsname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.vacancy = vacancy;
        this.email = email;
        this.contactnumber = contactnumber;
        this.interview = interview;
        this.interviewer = interviewer;
        this.dateday = dateday;
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RecruitmentUserInterfaces.BTN_ADD, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(RecruitmentUserInterfaces.BTN_ADD),
                WaitUntil.the(RecruitmentUserInterfaces.INP_FIRSTNAME, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Enter.theValue(firstsname).into(RecruitmentUserInterfaces.INP_FIRSTNAME),
                Enter.theValue(middlename).into(RecruitmentUserInterfaces.INP_MIDDLENAME),
                Enter.theValue(lastname).into(RecruitmentUserInterfaces.INP_LASTNAME),
                Click.on(RecruitmentUserInterfaces.INP_VACANCY),
                Click.on(RecruitmentUserInterfaces.OPC_VACANCY),
                Enter.theValue(email).into(RecruitmentUserInterfaces.INP_EMAIL),
                Enter.theValue(contactnumber).into(RecruitmentUserInterfaces.INP_CONTACTNUMBER),
                WaitUntil.the(RecruitmentUserInterfaces.BTN_SV, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(RecruitmentUserInterfaces.BTN_SV),
                WaitUntil.the(RecruitmentUserInterfaces.BTN_SL, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(RecruitmentUserInterfaces.BTN_SL),
                WaitUntil.the(RecruitmentUserInterfaces.BTN_SV2, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(RecruitmentUserInterfaces.BTN_SV2),
                WaitUntil.the(RecruitmentUserInterfaces.BTN_SI, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(RecruitmentUserInterfaces.BTN_SI),
                Enter.theValue(interview).into(RecruitmentUserInterfaces.INP_INTERVIEW),
                Enter.keyValues(interviewer).into(RecruitmentUserInterfaces.INP_INTERVIEWER),
                WaitUntil.the(RecruitmentUserInterfaces.OPC_INTERVIEWER, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(RecruitmentUserInterfaces.OPC_INTERVIEWER),
                Enter.theValue(dateday).into(RecruitmentUserInterfaces.INP_DATEDAY),
                Enter.theValue(time).into(RecruitmentUserInterfaces.INP_TIME),
                WaitUntil.the(RecruitmentUserInterfaces.BTN_SV4, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(RecruitmentUserInterfaces.BTN_SV4)
//                Click.on(RecruitmentUserInterfaces.BTN_MIP),
//                Click.on(RecruitmentUserInterfaces.BTN_SV4),
//                WaitUntil.the(RecruitmentUserInterfaces.BTN_OJ, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
//                Click.on(RecruitmentUserInterfaces.BTN_OJ),
//                Click.on(RecruitmentUserInterfaces.BTN_SV4),
//                Enter.theValue(candidate).into(RecruitmentUserInterfaces.INP_CANDIDATE),
//                WaitUntil.the(RecruitmentUserInterfaces.BTN_MIP, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
//                Click.on(RecruitmentUserInterfaces.BTN_MIP),
//                WaitUntil.the(RecruitmentUserInterfaces.BTN_SV2, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
//                Click.on(RecruitmentUserInterfaces.BTN_SV2),
//                WaitUntil.the(RecruitmentUserInterfaces.BTN_OJ, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
//                Click.on(RecruitmentUserInterfaces.BTN_OJ),
//                WaitUntil.the(RecruitmentUserInterfaces.BTN_SV3, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
//                Click.on(RecruitmentUserInterfaces.BTN_SV3),
//                WaitUntil.the(RecruitmentUserInterfaces.BTN_SEARCH, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
//                Click.on(RecruitmentUserInterfaces.BTN_SEARCH)
        );
    }

    public static EnterUserData Data(String firtsname, String middlename, String lastname, String vacancy, String email, String contactnumber, String interview, String interviewer, String dateday, String time, String candidate) {
        return Tasks.instrumented(EnterUserData.class,firtsname, middlename, lastname, vacancy, email, contactnumber, interview, interviewer, dateday, time, candidate);


    }

}


