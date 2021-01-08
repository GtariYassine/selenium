import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        URL url=new URL("http://localhost:4446/wd/hub");
        RemoteWebDriver driver=new RemoteWebDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        driver.get("https://www.google.com/");
        Thread.sleep(20000);
        System.out.println(driver.getTitle());

        System.out.println("commit 1");

        System.out.println("commit 3");

        System.out.println("commit 4");

        System.out.println("commit 5");




        driver.close();
        driver.quit();


    }


}
