package action;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;

public class drag {
    public void DropandDrop() throws InterruptedException{
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","E:\\seleniumdrivers\\chromedriver.exe");
            ChromeOptions obj = new ChromeOptions();
            obj.setBinary("E:\\seleniumdrivers\\chromedriver.exe");
         driver  = new ChromeDriver();
    String url = "https://web-locators-static-site-qa.vercel.app";
		driver.get(url);
        
        //click on the Mouse 
        Actions action = new Actions(driver);
    WebElement button = driver.findElement(By.xpath("//a[@href='/Mouse']"));
    action.click(button).perform();

    //drag and drop the box 
    //locate the element
    WebElement drag = driver.findElement(By.xpath("//div[text()='Drag me around']"));
    // //perform drag and drop
    action.dragAndDropBy(drag, 300,300);
    System.out.println("Drag to desired location");
    // Locating the web elements
  


    // Drag and drop to desired location
// //locate the element
    WebElement dragto = driver.findElement(By.xpath("//div[text()='Drag me to target']"));
    //locate the target element
    WebElement targetelement = driver.findElement(By.xpath("//div[@class='Mouse_draft2'][2]/div[2]"));

    // //drag to target
    action.dragAndDrop(dragto, targetelement);


    //changing the order of table element
    WebElement row1=driver.findElement(By.xpath("//div[@class='Mouse_section3']/div/div/div/div[2]/div/div[2]"));
    WebElement row4=driver.findElement(By.xpath("//div[@class='Mouse_section3']/div/div/div/div[2]/div/div[4]"));

    
        action.clickAndHold(row1).build().perform();
        action.moveToElement(row4).build().perform();
        action.release().build().perform();

        Thread.sleep(2000);

        WebElement row2=driver.findElement(By.xpath("//div[@class='Mouse_section3']/div/div/div/div[2]/div/div[3]"));
    WebElement row5=driver.findElement(By.xpath("//div[@class='Mouse_section3']/div/div/div/div[2]/div/div[5]"));
      action.clickAndHold(row2).build().perform();
      Thread.sleep(2000);
        action.moveToElement(row5).build().perform();
        Thread.sleep(2000);
        action.release().build().perform();
        Thread.sleep(2000);

        driver.quit();
        

    }
    
}
