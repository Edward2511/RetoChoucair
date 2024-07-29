package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.models.LoginOrangeModel;
import co.com.choucair.certification.models.RecruitmentModel;
import co.com.choucair.certification.questions.RegistroQuestion;
import co.com.choucair.certification.tasks.LoginOrange;
import co.com.choucair.certification.tasks.EnterUserData;
import co.com.choucair.certification.userinterfaces.RecruitmentUserInterfaces;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.Map;
import static co.com.choucair.certification.userinterfaces.LoginUserInterfaces.BTN_LOGIN;
import static co.com.choucair.certification.userinterfaces.RecruitmentUserInterfaces.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

//Clase ChouStepdefinitions esta clase tiene los pasos de definicion para las pruebas en Cucumber
public class ChouStepdefinitions {

    @DataTableType
    public LoginOrangeModel convert(Map<String, String> entry) {
        LoginOrangeModel login = new LoginOrangeModel();
        login.setUser(entry.get("user"));
        login.setPassword(entry.get("password"));
        return login;
    }
    @DataTableType
    public RecruitmentModel convert2(Map<String, String> entry2) {
        RecruitmentModel recruitment = new RecruitmentModel();
        recruitment.setFirtsname(entry2.get("firstname"));
        recruitment.setMiddlename(entry2.get("middlename"));
        recruitment.setLastname(entry2.get("lastname"));
        recruitment.setVacancy(entry2.get("vacancy"));
        recruitment.setEmail(entry2.get("email"));
        recruitment.setContactnumber(entry2.get("contactnumber"));
        recruitment.setInterview(entry2.get("interview"));
        recruitment.setInterviewer(entry2.get("interviewer"));
        recruitment.setDateday(entry2.get("dateday"));
        recruitment.setTime(entry2.get("time"));
        recruitment.setCandidate(entry2.get("candidate"));
        recruitment.setHire(entry2.get("hire"));
        return  recruitment;
    }
@Managed
//Objeto WebDriver representa el navegador que se utilizara para realizar las pruebas
//Atributo Navegador representa el navegador que se utilizara para realizar las pruebas
private WebDriver navegador;


@Before
//Metodo Begin se ejecuta antes de que comiencen las pruebas
//configura el escenario, establece el navegador y el actor que realizara la prueba
public void Begin() {
   OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(navegador)));
   OnStage.theActorCalled("Edward");
}

    //Metodo ingresarAlBotonJointoday este Metodo define el paso "Given" de la prueba, que consiste en abrir la URL de la página de inicio de sesión.
    @Given("el usuario está en la pantalla de inicio y coloca las siguientes credenciales")
    public void elUsuarioEstaEnLaPantallaDeInicioYColocaLasSiguientesCredenciales(List<LoginOrangeModel>data) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
        OnStage.theActorInTheSpotlight().wasAbleTo(LoginOrange.Login(data.get(0).getUser(),data.get(0).getpassword()));
    }

    @And("el usuario presiona el boton Login")
    public void elUsuarioPresionaElBotonLogin() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Click.on(BTN_LOGIN));
    }

    @Given("el usuario esta en la pagina de reclutamiento de candidatos")
    public void elUsuarioEstaEnLaPaginaDeReclutamientoDeCandidatos() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Click.on(BTN_RC));
    }

    @When("el usuario registra al candidato con los siguientes datos")
    public void elUsuarioRegistraAlCandidatoConLosSiguientesDatos(List<RecruitmentModel>data2) {
        OnStage.theActorInTheSpotlight().wasAbleTo(EnterUserData.Data(data2.get(0).getFirtsname(),data2.get(0).getMiddlename(),data2.get(0).getLastname(),data2.get(0).getVacancy(),data2.get(0).getEmail(),data2.get(0).getContactnumber(),data2.get(0).getInterview(),data2.get(0).getInterviewer(),data2.get(0).getDateday(),data2.get(0).getTime(),data2.get(0).getCandidate()));
    }

    @And("el usuario aprueba la entrevista")
    public void elUsuarioApruebaLaEntrevista() {
        OnStage.theActorInTheSpotlight().wasAbleTo(WaitUntil.the(BTN_MIP, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(), Click.on(BTN_MIP), Click.on(BTN_SV4));
    }

    @And("el usuario contrata al candidato")
    public void elUsuarioContrataAlCandidato() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Click.on(BTN_OJ),Click.on(BTN_SV4),Click.on(BTN_HIRE),Click.on(BTN_SV4));
    }

    @Then("el usuario vera la informacion del candidato en estado contratado")
    public void elUsuarioVeraLaInformacionDelCandidatoEnEstadoContratado(List<RecruitmentModel>data2) {
        OnStage.theActorInTheSpotlight().should(seeThat(RegistroQuestion.hire(data2.get(0).getCandidate(),data2.get(0).getHire()), Matchers.is(data2.get(0).getHire())));
}
}

