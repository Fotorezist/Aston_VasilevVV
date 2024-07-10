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

    @Test(description="Проверка плейсхолдеров в разделе 'Услуги связи'", priority = 1)
    public void testPlaceholderTexts1() {

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

    @Test(description="Проверка плейсхолдеров в разделе 'Домашний интернет'", priority = 2)
    public void testPlaceholderTexts2() {

//        Выбираем "Услуги связи" из выпадающего списка
        WebElement dropdownList = driver.findElement(By.xpath("//span[@class='select__now']"));
        dropdownList.click();
        WebElement listOption = driver.findElement(By.xpath("//p[contains(text(), 'Домашний интернет')]"));
        listOption.click();

//        Находим текст placeholder для полей ввода номера телефона, суммы и E-mail
        String phoneNumberPlaceholder=driver.findElement(By.xpath("//input[@id='internet-phone']")).getAttribute("placeholder");
        String amountPlaceholder=driver.findElement(By.xpath("//input[@id='internet-sum']")).getAttribute("placeholder");
        String emailPlaceholder=driver.findElement(By.xpath("//input[@id='internet-email']")).getAttribute("placeholder");

//        Сравниваем текст placeholder с ожидаемым
        Assert.assertEquals(phoneNumberPlaceholder, "Номер абонента", "Текст плейсхолдера для номера телефона некорректен.");
        Assert.assertEquals(amountPlaceholder, "Сумма", "Текст плейсхолдера для суммы некорректен.");
        Assert.assertEquals(emailPlaceholder, "E-mail для отправки чека", "Текст плейсхолдера для E-mail некорректен.");
    }

    @Test(description="Проверка плейсхолдеров в разделе 'Рассрочка'", priority = 3)
    public void testPlaceholderTexts3() {

//        Выбираем "Услуги связи" из выпадающего списка
        WebElement dropdownList = driver.findElement(By.xpath("//span[@class='select__now']"));
        dropdownList.click();
        WebElement listOption = driver.findElement(By.xpath("//p[contains(text(), 'Рассрочка')]"));
        listOption.click();

//        Находим текст placeholder для полей ввода номера телефона, суммы и E-mail
        String phoneNumberPlaceholder=driver.findElement(By.xpath("//input[@id='score-instalment']")).getAttribute("placeholder");
        String amountPlaceholder=driver.findElement(By.xpath("//input[@id='instalment-sum']")).getAttribute("placeholder");
        String emailPlaceholder=driver.findElement(By.xpath("//input[@id='instalment-email']")).getAttribute("placeholder");

//        Сравниваем текст placeholder с ожидаемым
        Assert.assertEquals(phoneNumberPlaceholder, "Номер счета на 44", "Текст плейсхолдера для номера телефона некорректен.");
        Assert.assertEquals(amountPlaceholder, "Сумма", "Текст плейсхолдера для суммы некорректен.");
        Assert.assertEquals(emailPlaceholder, "E-mail для отправки чека", "Текст плейсхолдера для E-mail некорректен.");
    }

    @Test(description="Проверка плейсхолдеров в разделе 'Задолженность'", priority = 3)
    public void testPlaceholderTexts4() {

//        Выбираем "Услуги связи" из выпадающего списка
        WebElement dropdownList = driver.findElement(By.xpath("//span[@class='select__now']"));
        dropdownList.click();
        WebElement listOption = driver.findElement(By.xpath("//p[contains(text(), 'Задолженность')]"));
        listOption.click();

//        Находим текст placeholder для полей ввода номера телефона, суммы и E-mail
        String phoneNumberPlaceholder=driver.findElement(By.xpath("//input[@id='score-arrears']")).getAttribute("placeholder");
        String amountPlaceholder=driver.findElement(By.xpath("//input[@id='arrears-sum']")).getAttribute("placeholder");
        String emailPlaceholder=driver.findElement(By.xpath("//input[@id='arrears-email']")).getAttribute("placeholder");

//        Сравниваем текст placeholder с ожидаемым
        Assert.assertEquals(phoneNumberPlaceholder, "Номер счета на 2073", "Текст плейсхолдера для номера телефона некорректен.");
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
