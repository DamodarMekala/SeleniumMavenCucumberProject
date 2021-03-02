package seleniumcucumber.login;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumcucumber.DriverManager;



public class LoginPageSteps extends DriverManager {

   // WebDriver driver = new ChromeDriver();

   @And("Man log sich ein")
   public void Man_log_sich_ein(){
       this.getChromeDrive();
       this.getFacebook();
   }

   @And("Gebe in das feld userName {string}")
public void Gebe_in_das_feld_userName(String wert){
       WebElement feld = this.driver.findElement(By.xpath("//form//div//input[@id='txtUsername']"));
       feld.click();
       feld.sendKeys(wert);
   }

    @And("Gebe in das feld password {string}")
    public void Gebe_in_das_feld_password(String wert){
        WebElement feld = this.driver.findElement(By.xpath("//form//div[@id='divPassword']//input"));
        feld.click();
        feld.sendKeys(wert);
    }

    @And("Klicke auf den Button {string}")
    public void Klicke_auf_den_Button(String buttonName){
       WebDriverWait wait = new WebDriverWait(this.driver, 2);
     WebElement Button = this.driver.findElement(By.xpath("//div[@id='divLoginButton']//input[@value='"+buttonName+"']"));
       Button.click();
   }
}
