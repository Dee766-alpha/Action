package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
    public void keyaction() throws InterruptedException{
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
   // Locating name field
   WebElement name=driver.findElement((By.xpath("//input[@placeholder='Name of  the user']")));

       
        // Entering values in input box using sendkeys() method
       name.sendKeys("username");
       Thread.sleep(2000);
        // Press the TAB Key to switch focus to next field
        name.sendKeys(Keys.TAB);
      


        // Locating email field
        WebElement email=driver.findElement((By.xpath("//input[@placeholder='example@example.com']")));
        
       
        // Entering values in input boxes using sendkeys() method
        email.sendKeys("abc@gamil.com");
        Thread.sleep(2000);

      

        // Press the TAB Key to switch focus to next field
        email.sendKeys(Keys.TAB);
       


        // Locating phone number field
        
        WebElement phonenumber=driver.findElement((By.xpath("//input[@placeholder='999999999']")));
        
                        

        // Entering values in phone number field
        phonenumber.sendKeys("9654788");
        Thread.sleep(2000);
        

        //Closing the browser
        driver.quit();

    }
}
