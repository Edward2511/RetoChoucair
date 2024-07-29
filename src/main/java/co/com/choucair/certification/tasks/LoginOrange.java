package co.com.choucair.certification.tasks;
import co.com.choucair.certification.userinterfaces.LoginUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

//clase Registro
public class LoginOrange implements Task{
    //Atributos son los datos necesarios para el formulario de registro de usuario
    private String user;
    private String password;

    public LoginOrange(String username, String password) {
        this.user= username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginUserInterfaces.INP_USERNAME, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Enter.theValue(user).into(LoginUserInterfaces.INP_USERNAME),
                Enter.theValue(password).into(LoginUserInterfaces.INP_PASSWORD)
        );
    }

    public static LoginOrange Login(String username, String password){
        return Tasks.instrumented(LoginOrange.class, username, password);
    }
}


