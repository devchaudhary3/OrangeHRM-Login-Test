package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dev chaudhary\\Desktop\\chromedriver\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        // Use WebDriverWait to wait for the login elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();

        // Wait for Dashboard
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String dashboardText = driver.findElement(By.tagName("h6")).getText();
        if (dashboardText.contains("Dashboard")) {
            System.out.println("✅ Login Successful! Dashboard loaded.");
        } else {
            System.out.println("❌ Login Failed.");
        }

        //driver.quit();
    }
}
