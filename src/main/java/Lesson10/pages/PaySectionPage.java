package Lesson10.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PaySectionPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public PaySectionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By block = By.xpath("//*[contains(text(),'Онлайн пополнение')]");
    private By logos = By.cssSelector("img");
    private By phoneInput = By.xpath("//input[@id='connection-phone']");
    private By continueBtn = By.xpath("//button[contains(text(),'Продолжить')]");

    public boolean isBlockVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(block)).isDisplayed();
    }

    public int countLogos() {
        return driver.findElements(logos).size();
    }

    public void enterPhone(String phone) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneInput)).sendKeys(phone);
    }

    public void clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }
}
