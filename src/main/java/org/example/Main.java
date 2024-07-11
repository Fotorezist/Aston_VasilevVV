package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver;




            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.mts.by");

//        Принимаем cookie
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement cookieAgreeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree")));
            cookieAgreeButton.click();

//        Заполннение полей формы оплаты
            WebElement phoneNumberField = driver.findElement(By.xpath("//input[@id='connection-phone']"));
            WebElement amountField = driver.findElement(By.xpath("//input[@id='connection-sum']"));

            phoneNumberField.sendKeys("297777777");
            amountField.sendKeys("10");

            WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
            continueButton.click();

//        Переключение на новый фрейм
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement newFrame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@src='https://checkout.bepaid.by/widget_v2/index.html']")));
            driver.switchTo().frame(newFrame);

//        Проверка корректности суммы и номера телефона
        WebElement amountText = driver.findElement(By.xpath("//div[@class='pay-description__cost']/span"));
//            WebElement amountText = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]"));
            String text10 = amountText.getText();
        System.out.println("123");
            System.out.println(text10);
//        WebElement paymentInfoText = driver.findElement(By.xpath("//span[contains( text(),'375297777777')]"));
//        WebElement confirmButton = driver.findElement(By.xpath("//button[contains( text(),' Оплатить  10.00 BYN ')]"));

//        Assert.assertEquals(amountText.getText(), "10.00 BYN", "Несоответствие суммы");
//        Assert.assertEquals(paymentInfoText.getText(), "Оплата: Услуги связи\n" +
//                "Номер:375297777777", "Несоответствие информации об оплате");
//        Assert.assertEquals(confirmButton.getText(), " Оплатить  10.00 BYN ", "Несоответствие текста кнопки оплаты");


//        Проверка появления формы для ввода платежных данных после нажатия кнопки продолжить
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement paymentForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bepaid-app']")));
//        Assert.assertNotNull(paymentForm, "Платёжная форма не открывается");


    }
}