import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class Node2 {
    @Test
    public void facebook() throws MalformedURLException {
        URL url=new URL("http://localhost:4444/wd/hub");
        ChromeOptions options = new ChromeOptions();
        RemoteWebDriver driver=new RemoteWebDriver(url,options);
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.get("http://facebook.com");
        System.out.println(driver.getTitle());
    }
}
