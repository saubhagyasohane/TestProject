package seleniumtestpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirstTest {

	static String sitetitle;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		//Implicit Wait Syntax
		driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Explicit Wait Syntax
		//WebDriverWait wait=new WebDriverWait(driver1, 20);
		driver1.get("http://www.google.com");
		driver1.manage().window().maximize() ;
		String sitetitle = driver1.getTitle();
		System.out.println("Chrome Brwoser Title name is "+sitetitle);
		//driver1.close();
		driver1.quit();

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver2 = new FirefoxDriver();
		//driver2.get("https://github.com/bonigarcia/webdrivermanager/blob/master/README.md");
		//driver2.getTitle();
		//System.out.println("Firefox brower title is"+driver2.getTitle());
		//driver2.close();
		//driver2.quit();
	}

}
