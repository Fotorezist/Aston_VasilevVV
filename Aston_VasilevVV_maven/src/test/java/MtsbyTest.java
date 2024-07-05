import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MtsbyTest {
    public static void main(String[] args){
//        System.setProperty("webdriver.chrome.driver", "Resourses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }
}
