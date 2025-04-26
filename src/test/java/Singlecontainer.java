import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Singlecontainer {
    public static void main(String[] args) throws MalformedURLException {
          URL url=new URL("http://localhost:4444/wd/hub");
        FirefoxOptions options = new FirefoxOptions();
        RemoteWebDriver driver=new RemoteWebDriver(url,options);
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.get("http://gmail.com");
        System.out.println(driver.getTitle());



    }
}
