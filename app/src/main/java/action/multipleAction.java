package action;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class multipleAction {
    public void Multi() throws InterruptedException{
        WebDriver driver;
    
    System.setProperty("webdriver.chrome.driver","E:\\seleniumdrivers\\chromedriver.exe");
            ChromeOptions obj = new ChromeOptions();
            obj.setBinary("E:\\seleniumdrivers\\chromedriver.exe");
         driver  = new ChromeDriver();
    String url = "https://web-locators-static-site-qa.vercel.app";
		driver.get(url);
    WebElement keyboardaction=driver.findElement(By.xpath("//a[@href='/Keyboard Operations']"));
    Actions action= new Actions(driver);
   action.click(keyboardaction).perform();
   Thread.sleep(2000);

   //locate the element
    WebElement copy=driver.findElement(By.xpath("//div[@class='copy']"));
 action.click(copy).perform();
        Thread.sleep(2000);

        // Performing copy operation
        action.keyDown(Keys.CONTROL);
        action.sendKeys("c");
        action.keyUp(Keys.CONTROL);
        action.build().perform();
        
        // Press the TAB Key to Switch Focus to next field
        action.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        // Performing paste operation
        action.keyDown(Keys.CONTROL);
        action.sendKeys("v");
        action.keyUp(Keys.CONTROL);
        action.build().perform();

        Thread.sleep(10000);
        
        //Closing the  browser
        driver.quit();
    }

}
