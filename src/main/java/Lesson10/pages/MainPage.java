package Lesson10.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By serviceLink = By.linkText("Подробнее о сервисе");

    public void open(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeCookieIfPresent() {
        try {
            WebElement acceptBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[contains(text(),'Принять')]")));

            acceptBtn.click();
            System.out.println("Cookie passed");

        } catch (Exception e) {
            System.out.println("Cookie's closed or not found");
        }
    }

    public void openServiceLink() {
        WebElement link = wait.until(
                ExpectedConditions.elementToBeClickable(serviceLink));
        link.click();
    }
}