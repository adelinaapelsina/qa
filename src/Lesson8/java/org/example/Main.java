package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.setProperty(
                "webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://www.mts.by");

            try {
                WebElement cookie = wait.until(
                        ExpectedConditions.presenceOfElementLocated(
                                By.cssSelector(".cookie")));

                ((JavascriptExecutor) driver)
                        .executeScript("arguments[0].remove();", cookie);

            } catch (Exception e) {
                System.out.println("Cookies are not found");
            }

            WebElement block = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[contains(text(),'Онлайн пополнение')]")));

            System.out.println("Блок найден: " + block.isDisplayed());

            List<WebElement> logos = driver.findElements(By.cssSelector("img"));
            System.out.println("Логотипов найдено: " + logos.size());

            WebElement link = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.linkText("Подробнее о сервисе")));
            link.click();

            driver.navigate().back();

            WebElement phone = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//input[contains(@placeholder,'Номер')]")));

            phone.sendKeys("297777777");

            WebElement button = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[contains(text(),'Продолжить')]")));

            button.click();

            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}