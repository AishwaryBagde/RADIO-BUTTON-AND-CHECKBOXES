package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        

        // Launch Chrome :
        // Load URL  https://itera-qa.azurewebsites.net/home/automation
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        // Wait for 30 seconds  
        Thread.sleep(3000);
        // Scroll down to the element using javascript 
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(2000);
        // Select the Radio button (2 years) for category Years of experience in test automation Using Locator "XPath":"//label[contains(text(),'2 years')]"
        driver.findElementByXPath("//label[contains(text(),'2 years')]").click();
        Thread.sleep(1000);
        // Check the Check Boxes ‘Selenium Webdriver’  Using Locator "XPath" "//label[contains(text(),'Selenium Webdriver')]"
        driver.findElementByXPath("//label[contains(text(),'Selenium Webdriver')]").click();
        Thread.sleep(1000);
        // Check the Check Box TestNG Using Locator "XPath" "//label[contains(text(),'TestNG')]"
        driver.findElementByXPath("//label[contains(text(),'TestNG')]").click();
        Thread.sleep(1000);
    }


}
