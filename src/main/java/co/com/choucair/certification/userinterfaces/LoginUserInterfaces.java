package co.com.choucair.certification.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterfaces {

    public static final Target INP_USERNAME = Target.the("Input username").located(By.name("username"));
    public static final Target INP_PASSWORD = Target.the("Input password").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("Boton login").located(By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
}
