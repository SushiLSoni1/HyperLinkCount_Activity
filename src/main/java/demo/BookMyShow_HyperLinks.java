package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow_HyperLinks {
    ChromeDriver driver;
       public BookMyShow_HyperLinks()
    {
        System.out.println("Constructor: BookMyShow_HyperLinks");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void BookMyShow_HyperLinks(){
           System.out.println("Start Test case: BookMyShow_HyperLinks");
           //navigate to
           //driver.get("https://in.bookmyshow.com/explore/home/chennai");
           driver.get("https://in.bookmyshow.com/explore/home/chennai");
           //Get the count of HyperLinks using locator tagName  "a"
           WebElement count = driver.findElement(By.tagName("a"));
           //Print the count on console using getSize()
           
           System.out.println("The count of HyperLinks are ---.>"+count.getSize());
         //End Test
           System.out.println("End Test case: BookMyShow_HyperLinks");

     } 

     public void endTest()
    {
        System.out.println("End Test: BookMyShow_HyperLinks");
        driver.close();
        driver.quit();

    }
}
