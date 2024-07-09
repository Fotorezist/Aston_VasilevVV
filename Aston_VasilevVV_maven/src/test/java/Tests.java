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

        // Нажатие кнопки "cookie-agree"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookieAgreeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree")));
        cookieAgreeButton.click();
    }

    @Test(description="Проверка названия блока «Онлайн пополнение без комиссии»", priority = 1)
    public void testBlockTitle() {
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]"));
        Assert.assertNotNull(blockTitle, "Блок 'Онлайн пополнение без комиссии отсутствует'");
    }

    @Test(description="Проверка наличия логотипов платёжных систем", priority = 2)
    public void testPaymentLogos() {
        List<WebElement> paymentLogos = driver.findElements(By.id("//div[@class='pay__partners']"));
        Assert.assertTrue(paymentLogos.isEmpty(), "Логотипы платёжных систем отсутствуют");
    }

    @Test(description="Проверка работы ссылки «Подробнее о сервисе»", priority = 3)
    public void testMoreInfoLink() {
        // Проверка наличия ссылки «Подробнее о сервисе»
        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        Assert.assertNotNull(moreInfoLink, "Ссылка 'Подробнее о сервисе' отсутствует");
        moreInfoLink.click();

        // Проверка, что ссылка работает
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Ссылка 'Подробнее о сервисе' не ведёт на правильную страницу");
    }

    @Test(description="Проверка работы кнопки «Продолжить»", priority = 4)
    public void testPayWrapper() {
        // Заполннение полей формы оплаты
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement amountField = driver.findElement(By.xpath("//input[@id='connection-sum']"));

        phoneNumberField.sendKeys("297777777");
        amountField.sendKeys("10");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();


        // Проверка появления формы для ввода платежных данных после нажатия кнопки продолжить
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement paymentForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bepaid-app']")));
        Assert.assertNotNull(paymentForm, "Платёжная форма не открывается");

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
