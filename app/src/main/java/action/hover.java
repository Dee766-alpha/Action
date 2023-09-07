package action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class hover {
    public static void scrollandhover() throws InterruptedException
{
    //(//input[@type='password'])[1]
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
    Thread.sleep(2000);
    JavascriptExecutor js=(JavascriptExecutor) driver;
    WebElement button1=driver.findElement(By.xpath("//button[@class='button_mouse']"));
    WebElement scroll=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
    js.executeScript("arguments[0].scrollIntoView();", scroll);
    action.moveToElement(scroll).perform();
    Thread.sleep(2000);
    driver.quit();
}    
}
