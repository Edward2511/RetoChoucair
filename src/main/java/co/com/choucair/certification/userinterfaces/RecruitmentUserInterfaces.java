package co.com.choucair.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RecruitmentUserInterfaces {

        public static final Target INP_FIRSTNAME = Target.the("Input firstname").located(By.name("firstName"));
        public static final Target INP_MIDDLENAME = Target.the("Input middlename").located(By.name("middleName"));
        public static final Target INP_LASTNAME = Target.the("Input lastname").located(By.name("lastName"));
        public static final Target INP_VACANCY = Target.the("Input vacancy").located(By.xpath("//div[contains(@class, 'oxd-select-text-input')]"));
        public static final Target OPC_VACANCY= Target.the("option vacancy").located(By.xpath("/html/body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container orangehrm-save-candidate-page']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row'][2]/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[@class='oxd-grid-item oxd-grid-item--gutters']/div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/div[@class='oxd-select-wrapper']/div[@class='oxd-select-dropdown --positon-bottom']/div[@class='oxd-select-option'][8]"));
        public static final Target INP_EMAIL = Target.the("Input email").located(By.xpath("(//input[contains(@class, 'oxd-input oxd-input')])[5]"));
        public static final Target INP_CONTACTNUMBER = Target.the("Input contactnumber").located(By.xpath("(//input[contains(@class, 'oxd-input oxd-input')])[6]"));
        public static final Target INP_INTERVIEW = Target.the("Input interview").located(By.xpath("(//input[contains(@class,'oxd-input oxd-input')])[6]"));
        public static final Target INP_INTERVIEWER = Target.the("Input interviewer").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input"));
        public static final Target OPC_INTERVIEWER = Target.the("Option interviewer").located(By.xpath("/html/body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row'][2]/div[@class='oxd-grid-3']/div[@class='oxd-grid-item oxd-grid-item--gutters --offset-row-2'][1]/div[@class='orangehrm-recruitment-interviewer-input']/div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/div[@class='oxd-autocomplete-wrapper']/div[@class='oxd-autocomplete-dropdown --positon-bottom']/div[@class='oxd-autocomplete-option']/span"));
        public static final Target INP_DATEDAY = Target.the("Input dateday").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div/input"));
        public static final Target INP_TIME = Target.the("Input time").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div/input"));
        public static final Target INP_CANDIDATE = Target.the("Input candidate").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
        public static final Target TXT_HIRE= Target.the("Mensaje hire").located(net.serenitybdd.core.annotations.findby.By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div"));
        public static final Target BTN_RC = Target.the("Boton recruitment").located(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a"));
        public static final Target BTN_SV = Target.the("Boton Save").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));
        public static final Target BTN_SEARCH = Target.the("Boton Search").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]"));
        public static final Target BTN_ADD = Target.the("Boton Add ").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
        public static final Target BTN_SL = Target.the("Boton Shortlist ").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));
        public static final Target BTN_SV2 = Target.the("Boton Save2").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
        public static final Target BTN_SI= Target.the("Boton ShoudleInterview").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));
        public static final Target BTN_MIP = Target.the("Boton Mark Interview Pass").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));
        public static final Target BTN_OJ = Target.the("Boton Ofert Job").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));
        public static final Target OPC_NAME = Target.the("Option name").located(By.xpath("/html/body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-candidate-page']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row'][2]/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[@class='oxd-grid-item oxd-grid-item--gutters'][1]/div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/div[@class='oxd-autocomplete-wrapper']/div[@class='oxd-autocomplete-dropdown --positon-bottom']/div[@class='oxd-autocomplete-option']/span"));
        public static final Target BTN_HIRE= Target.the("Boton Hire").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));
        public static final Target BTN_SV4= Target.the("Boton Save4").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
        public static final Target TXT_AS= Target.the("Txt apllication stage").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/h6"));
}
