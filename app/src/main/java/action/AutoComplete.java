package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete{

   
        public void Multi() throws InterruptedException{
        WebDriver driver;
    
    System.setProperty("webdriver.chrome.driver","E:\\seleniumdrivers\\chromedriver.exe");
            ChromeOptions obj = new ChromeOptions();
            obj.setBinary("E:\\seleniumdrivers\\chromedriver.exe");
         driver  = new ChromeDriver();
    String url = "https://web-locators-static-site-qa.vercel.app";
		driver.get(url);
    WebElement keyboardaction=driver.findElement(By.xpath("//a[@href='/Auto-complete']"));
    Actions action= new Actions(driver);
   action.click(keyboardaction).perform();
   Thread.sleep(2000);

   //Locate the element
   WebElement text=driver.findElement(By.xpath("//input[@spellcheck='false']"));
   text.sendKeys("god");
   Thread.sleep(1000);

   //locate the option in list
   WebElement option=driver.findElement(By.xpath("//li/div[@title='Goodfellas']"));
   option.click();
   Thread.sleep(10000);

		driver.quit();
		System.out.println("Driver closed");
        }

        

        
}
