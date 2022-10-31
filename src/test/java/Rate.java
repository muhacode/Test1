import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Rate {
//    @Test
//    public void top(){
//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
//        driver.quit();
//    }
    @Test
    public  void main() {
    String[] h = {"hello"};
    for (String elem : h) {
        System.out.println(" This is a qualification " + elem);
    }
 }
   @Test
    public void domain(){
        int[] d = {2,3,4,5};
       for (int i = 0; i<5; i++)
           System.out.println(i);
       }

}
