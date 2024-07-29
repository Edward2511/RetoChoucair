package co.com.choucair.certification.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//@RunWith(CucumberWithSerenity.class): Esta anotación indica que las pruebas se ejecutarán con el corredor de Serenity BDD para Cucumber
@RunWith(CucumberWithSerenity.class)
//@CucumberOptions: Esta anotación proporciona opciones de configuración para la ejecución de las pruebas de Cucumber.
//features Indica la ubicación de los archivos de características de Cucumber que contienen los escenarios de prueba
@CucumberOptions(features = "src\\test\\resources\\features\\usuario_contratado.feature",
        //  Especifica el paquete donde se encuentran los step definitions de Cucumber.
        glue = "co.com.choucair.certification.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
//Clase CreateAccount
public class ChouRunner {
}
