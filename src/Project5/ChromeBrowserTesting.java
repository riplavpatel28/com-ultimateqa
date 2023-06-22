package Project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {

        String baseURL = "https://courses.ultimateqa.com/users/sign_in";
        //Launch Chrome browser

        WebDriver driver = new ChromeDriver();
        //open the URL in to browser
        driver.get(baseURL);
        //Maximise Browser
        driver.manage().window().maximize();
        //Give driver to Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title =driver.getTitle();
        System.out.println("Page Title is:" +title);
        //Get the current URL
        System.out.println("Current URL:" +driver.getCurrentUrl());
        //get the page source
        System.out.println("Page source:" +driver.getPageSource());
        // Get the email id
        WebElement emailField=driver.findElement(By.name("user[email]"));
        emailField.sendKeys("Prime123@gmail.com");
        //Get the Password
        driver.findElement(By.name("user[password]")).sendKeys("prime123");
        //Close the Browser



    }

}
