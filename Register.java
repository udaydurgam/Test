package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Register {
    public static void main(String[] args) {

        try {
            // Set the path to Chrome WebDriver
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\udayd\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

            // Initialize ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Maximize the browser window
            driver.manage().window().maximize();

            driver.get("https://www.naukri.com/");
            System.out.println("Navigated to website");

            WebElement register = driver.findElement(By.id("register_Layer"));
            register.click();
            Thread.sleep(1000);

            WebElement name = driver.findElement(By.id("name"));
            name.sendKeys("Shital Durgam");
            Thread.sleep(1000);

            driver.findElement(By.id("email")).sendKeys("subhadradurgam2019@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Shital@2004");
            driver.findElement(By.id("mobile")).sendKeys("7888232538");
            driver.findElement(By.className("main-2")).click();

            driver.findElement(By.className("submitbtn resman-btn-primary resman-btn-regular")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}