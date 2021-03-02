package seleniumcucumber;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;



public class DriverManager {
    public WebDriver driver;

    public void getChromeDrive() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\damekala\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        deleteAllCookies();
     //   driver.implicitWait(10);
        driver.manage().window().maximize();
    }

    public void deleteAllCookies() {
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie cookie : allCookies) {
            driver.manage().deleteCookieNamed(cookie.getName());
        }
    }

    public void getFacebook() {
        driver.get("https://www.seleniumeasy.com/test/");
    }
}
