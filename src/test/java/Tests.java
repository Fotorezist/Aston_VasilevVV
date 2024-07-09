import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Tests {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by");

//        Принимаем cookie
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookieAgreeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree")));
        cookieAgreeButton.click();
    }

    @Test
    public void testPlaceholderTexts() {

//        Выбираем "Услуги связи" из выпадающего списка
        WebElement dropdownList = driver.findElement(By.xpath("//span[@class='select__now']"));
        dropdownList.click();
        WebElement listOption = driver.findElement(By.xpath("//p[contains(text(), 'Услуги связи')]"));
        listOption.click();

//        Находим текст placeholder для полей ввода номера телефона, суммы и E-mail
        String phoneNumberPlaceholder=driver.findElement(By.xpath("//input[@id='connection-phone']")).getAttribute("placeholder");
        String amountPlaceholder=driver.findElement(By.xpath("//input[@id='connection-sum']")).getAttribute("placeholder");
        String emailPlaceholder=driver.findElement(By.xpath("//input[@id='connection-email']")).getAttribute("placeholder");

//        Сравниваем текст placeholder с ожидаемым
        Assert.assertEquals(phoneNumberPlaceholder, "Номер телефона", "Текст плейсхолдера для номера телефона некорректен.");
        Assert.assertEquals(amountPlaceholder, "Сумма", "Текст плейсхолдера для суммы некорректен.");
        Assert.assertEquals(emailPlaceholder, "E-mail для отправки чека", "Текст плейсхолдера для E-mail некорректен.");
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
