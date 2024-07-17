import io.qameta.allure.*;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
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
import java.util.concurrent.TimeUnit;

public class AllureTest {
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
    @Epic(value = "ДЗ к лекции 18")
    @Feature(value = "Проверка плейсхолдеров")
    @Description(value = "Проверка плейсхолдеров в разделе 'Услуги связи'")
    @Owner("Васильев Виктор")
    @Severity(value = SeverityLevel.NORMAL)
    @Link(name = "Homework for lesson18", url = "https://classroom.google.com/c/NjgzODA1ODM3ODc4/a/NjgxMTM4OTQxNTQ2/details")
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
    @Epic(value = "ДЗ к лекции 18")
    @Feature(value = "Проверка плейсхолдеров")
    @Description(value = "Проверка плейсхолдеров в разделе 'Домашний интернет'")
    @Owner("Васильев Виктор")
    @Severity(value = SeverityLevel.NORMAL)
    @Link(name = "Homework for lesson18", url = "https://classroom.google.com/c/NjgzODA1ODM3ODc4/a/NjgxMTM4OTQxNTQ2/details")
    @Test(description="Проверка плейсхолдеров в разделе 'Домашний интернет'", priority = 2)
    public void testPlaceholderTexts2() {

//        Выбираем "Домашний интернет" из выпадающего списка
        WebElement dropdownList = driver.findElement(By.xpath("//span[@class='select__now']"));
        dropdownList.click();
        WebElement listOption = driver.findElement(By.xpath("//p[contains(text(), 'Домашний интернет')]"));
        listOption.click();

//        Находим текст placeholder для полей ввода номера телефона, суммы и E-mail
        String phoneNumberPlaceholder=driver.findElement(By.xpath("//input[@id='internet-phone']")).getAttribute("placeholder");
        String amountPlaceholder=driver.findElement(By.xpath("//input[@id='internet-sum']")).getAttribute("placeholder");
        String emailPlaceholder=driver.findElement(By.xpath("//input[@id='internet-email']")).getAttribute("placeholder");

//        Сравниваем текст placeholder с ожидаемым
        Assert.assertEquals(phoneNumberPlaceholder, "Номер абонента", "Текст плейсхолдера для номера абонента некорректен.");
        Assert.assertEquals(amountPlaceholder, "Сумма", "Текст плейсхолдера для суммы некорректен.");
        Assert.assertEquals(emailPlaceholder, "E-mail для отправки чека", "Текст плейсхолдера для E-mail некорректен.");
    }
    @Epic(value = "ДЗ к лекции 18")
    @Feature(value = "Проверка плейсхолдеров")
    @Description(value = "Проверка плейсхолдеров в разделе 'Рассрочка'")
    @Owner("Васильев Виктор")
    @Severity(value = SeverityLevel.NORMAL)
    @Link(name = "Homework for lesson18", url = "https://classroom.google.com/c/NjgzODA1ODM3ODc4/a/NjgxMTM4OTQxNTQ2/details")
    @Test(description="Проверка плейсхолдеров в разделе 'Рассрочка'", priority = 3)
    public void testPlaceholderTexts3() {

//        Выбираем "Рассрочка" из выпадающего списка
        WebElement dropdownList = driver.findElement(By.xpath("//span[@class='select__now']"));
        dropdownList.click();
        WebElement listOption = driver.findElement(By.xpath("//p[contains(text(), 'Рассрочка')]"));
        listOption.click();

//        Находим текст placeholder для полей ввода номера телефона, суммы и E-mail
        String phoneNumberPlaceholder=driver.findElement(By.xpath("//input[@id='score-instalment']")).getAttribute("placeholder");
        String amountPlaceholder=driver.findElement(By.xpath("//input[@id='instalment-sum']")).getAttribute("placeholder");
        String emailPlaceholder=driver.findElement(By.xpath("//input[@id='instalment-email']")).getAttribute("placeholder");

//        Сравниваем текст placeholder с ожидаемым
        Assert.assertEquals(phoneNumberPlaceholder, "Номер счета на 44", "Текст плейсхолдера для номера счёта некорректен.");
        Assert.assertEquals(amountPlaceholder, "Сумма", "Текст плейсхолдера для суммы некорректен.");
        Assert.assertEquals(emailPlaceholder, "E-mail для отправки чека", "Текст плейсхолдера для E-mail некорректен.");
    }
    @Epic(value = "ДЗ к лекции 18")
    @Feature(value = "Проверка плейсхолдеров")
    @Description(value = "Проверка плейсхолдеров в разделе 'Задолженность'")
    @Owner("Васильев Виктор")
    @Severity(value = SeverityLevel.NORMAL)
    @Link(name = "Homework for lesson18", url = "https://classroom.google.com/c/NjgzODA1ODM3ODc4/a/NjgxMTM4OTQxNTQ2/details")
    @Test(description="Проверка плейсхолдеров в разделе 'Задолженность'", priority = 3)
    public void testPlaceholderTexts4() {

//        Выбираем "Задолженность" из выпадающего списка
        WebElement dropdownList = driver.findElement(By.xpath("//span[@class='select__now']"));
        dropdownList.click();
        WebElement listOption = driver.findElement(By.xpath("//p[contains(text(), 'Задолженность')]"));
        listOption.click();

//        Находим текст placeholder для полей ввода номера телефона, суммы и E-mail
        String phoneNumberPlaceholder=driver.findElement(By.xpath("//input[@id='score-arrears']")).getAttribute("placeholder");
        String amountPlaceholder=driver.findElement(By.xpath("//input[@id='arrears-sum']")).getAttribute("placeholder");
        String emailPlaceholder=driver.findElement(By.xpath("//input[@id='arrears-email']")).getAttribute("placeholder");

//        Сравниваем текст placeholder с ожидаемым
        Assert.assertEquals(phoneNumberPlaceholder, "Номер счета на 2073", "Текст плейсхолдера для номера счёта некорректен.");
        Assert.assertEquals(amountPlaceholder, "Сумма", "Текст плейсхолдера для суммы некорректен.");
        Assert.assertEquals(emailPlaceholder, "E-mail для отправки чека", "Текст плейсхолдера для E-mail некорректен.");
    }
    @Epic(value = "ДЗ к лекции 18")
    @Feature(value = "Проверка окна ввода платёжных данных")
    @Description(value = "Проверка введённых данных в разделе 'Услуги связи', после нажатия кнопки 'Продолжить'")
    @Owner("Васильев Виктор")
    @Severity(value = SeverityLevel.CRITICAL)
    @Link(name = "Homework for lesson18", url = "https://classroom.google.com/c/NjgzODA1ODM3ODc4/a/NjgxMTM4OTQxNTQ2/details")
    @Test(description="Проверка введённых данных в разделе 'Услуги связи', после нажатия кнопки 'Продолжить'", priority = 4)
    public void testPayWrapper() {
//        Заполняем поля формы оплаты
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement amountField = driver.findElement(By.xpath("//input[@id='connection-sum']"));

        phoneNumberField.sendKeys("297777777");
        amountField.sendKeys("10");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        continueButton.click();

//        Переключение на новый фрейм
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement newFrame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(newFrame);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

//        Проверяем корректность суммы и номера телефона в окне подтверждения оплаты
        String amountText=driver.findElement(By.xpath("//div[@class='pay-description__cost']")).getAttribute("textContent");
        String paymentInfoText=driver.findElement(By.xpath("//span[contains( text(),'375297777777')]")).getAttribute("textContent");
        String confirmButton=driver.findElement(By.xpath("//button[contains( text(),' Оплатить  10.00 BYN ')]")).getAttribute("textContent");

        Assert.assertEquals(amountText, "10.00 BYN", "Несоответствие суммы");
        Assert.assertEquals(paymentInfoText, "Оплата: Услуги связи\n" + "Номер:375297777777", "Несоответствие номера телефона");
        Assert.assertEquals(confirmButton, " Оплатить  10.00 BYN ", "Несоответствие текста кнопки оплаты");

//        Проверяем надписи в полях для заполнения данных карты
        String cardNumber=driver.findElement(By.xpath("//div[@class='content ng-tns-c46-1']")).getAttribute("textContent");
        String validity=driver.findElement(By.xpath("//div[@class='content ng-tns-c46-4']")).getAttribute("textContent");
        String cvc=driver.findElement(By.xpath("//div[@class='content ng-tns-c46-5']")).getAttribute("textContent");
        String cardHolder=driver.findElement(By.xpath("//div[@class='content ng-tns-c46-3']")).getAttribute("textContent");

        Assert.assertEquals(cardNumber, "Номер карты", "Несоответствие в поле номер карты");
        Assert.assertEquals(validity, "Срок действия", "Несоответствие в поле срок действия карты");
        Assert.assertEquals(cvc, "CVC", "Несоответствие в поле CVC");
        Assert.assertEquals(cardHolder, "Имя держателя (как на карте)", "Несоответствие в поле имя держателя карты");

//        Проверяем наличие логотипов платёжных систем
        WebElement masterCardLogo = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']"));
        Assert.assertNotNull(masterCardLogo, "Логотип платёжной системы Master Card отсутствует");

        WebElement visaLogo = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/visa-system.svg']"));
        Assert.assertNotNull(visaLogo, "Логотип платёжной системы Visa отсутствует");

        WebElement belkartLogo = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']"));
        Assert.assertNotNull(belkartLogo, "Логотип платёжной системы Белкарт отсутствует");

        WebElement mir = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']"));
        Assert.assertNotNull(mir, "Логотип платёжной системы Мир отсутствует");

        WebElement maestro = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']"));
        Assert.assertNotNull(maestro, "Логотип платёжной системы Мир отсутствует");

    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
