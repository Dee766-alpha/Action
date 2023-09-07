package action;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class click {
  public static  void launch() throws InterruptedException{
 WebDriver driver;
    System.setProperty("webdriver.chrome.driver","E:\\seleniumdrivers\\chromedriver.exe");
            ChromeOptions obj = new ChromeOptions();
            obj.setBinary("E:\\seleniumdrivers\\chromedriver.exe");
         driver  = new ChromeDriver();
    String url = "https://web-locators-static-site-qa.vercel.app";
		driver.get(url);
    Actions action = new Actions(driver);
    WebElement button = driver.findElement(By.xpath("//a[@href='/Mouse']"));
    action.click(button).perform();
    JavascriptExecutor js=(JavascriptExecutor) driver;
    WebElement button1=driver.findElement(By.xpath("//button[@class='button_mouse']"));
    //js.executeScript("argument[0].scrollIntoView();",button1);
  //js.executeScript("window.scrollBy(0,350)", "");
  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    action.click(button1).perform();
    System.out.println("button clicked once");
    Thread.sleep(2000);
    action.doubleClick(button1).perform();
    System.out.println("button clicked twice");
    Thread.sleep(2000);
    action.contextClick(button1).perform();
    System.out.println("right clicked");
    Thread.sleep(2000);
    driver.quit();
  
  }
        

    
}
