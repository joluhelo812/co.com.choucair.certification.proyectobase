package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//*[@id=\"yui_3_17_2_1_1613234306481_32\"]"));
    public static final Target INPUT_USER = Target.the("where we write the user").located(By.xpath("//*[@id=\"username\"]"));
    public static final Target INPUT_PASSWORD = Target.the("where we write the password").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//*[@id=\"yui_3_17_2_1_1613234306481_37\"]/div[3]/button"));

}
