package Project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    static String browser = "Firefox";
    static String baseURL ="https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Get Title of the page
        String title = driver.getTitle();
        System.out.println("Page title is" + title);
        //Get the Current Url
        String currentUrlUrl = driver.getCurrentUrl();
        System.out.println("CurrentURL" + currentUrlUrl);
        //Print the page source
        System.out.println("page source" + driver.getPageSource());
        //get the Email field
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("Prime123@gmail.com");
        WebElement PasswordField = driver.findElement(By.name("user[password]"));
        PasswordField.sendKeys("prime123");
        //close browser
        driver.close();
    }


}
