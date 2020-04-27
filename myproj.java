import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myproj {
    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // open a web page
        driver.navigate().to("https://groupstudy.lib.byu.edu/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        String wbtitle = driver.getTitle();

        System.out.println("");
        System.out.println("Output:");
        System.out.println(wbtitle);
        System.out.println("");

        driver.close();
        driver.quit();
    }
}