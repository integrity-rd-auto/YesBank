package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	Properties prop;

	public TestBase() throws IOException {

		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Config\\config.properties");
		prop.load(ip);
       if(prop.getProperty("browser").equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
       }
       
       else {
    	   WebDriverManager.firefoxdriver().setup();
   		   driver = new FirefoxDriver();  
       }

	}

	public static void initialization() {

		driver.get("http://www.demo.guru99.com/V4/");

		driver.manage().window().maximize();
	}

}
