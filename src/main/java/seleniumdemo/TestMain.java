package seleniumdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMain {

    public static void main(String[] args) {
        String driverLocation = System.getProperty("user.dir") + "\\src\\main\\resources\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverLocation);
        final WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(
                "https://hub.docker.com/layers/santaji1986/gifmanageapplications/accountmanager/images/sha256-510a15a6e1d1c81fe47924bfa7ee92e98340359f1cf765c4748f1e250e4469f7?context=explore");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        final List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='styles__instruction___Kwt89']"));

        for (final WebElement allLink : allLinks) {
            System.out.println(allLink.getText());
        }

    }

}
