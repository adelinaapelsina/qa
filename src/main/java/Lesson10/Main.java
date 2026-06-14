package Lesson10;

import Lesson10.pages.MainPage;
import Lesson10.pages.PaySectionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty(
                "webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        MainPage mainPage = new MainPage(driver);
        PaySectionPage paymentPage = new PaySectionPage(driver);

        mainPage.open("https://www.mts.by");
        mainPage.closeCookieIfPresent();

        System.out.println("Блок найден: " + paymentPage.isBlockVisible());
        System.out.println("Логотипов: " + paymentPage.countLogos());

        paymentPage.enterPhone("297777777");
        paymentPage.clickContinue();

        driver.quit();
    }
}