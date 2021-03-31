package core;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

import javax.crypto.spec.SecretKeySpec;

public class Firefox {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
		
		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		
		String driverPath = "";

		String url = "http://facebook.com/";
		String email_address = "lokilontan@yandex.ru";
		String encrypted_password = "**************";
		String password = Encrypt.decrypt(encrypted_password, new SecretKeySpec(Arrays.copyOf(MyMacAddress.getMac().getBytes("UTF-8"), 16), "AES"));

	    if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "./resources/webdrivers/pc/geckodriver.exe";
	    else throw new IllegalArgumentException("Unknown OS");
			
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
		driver.get(url);

		Thread.sleep(1000); // Pause in milleseconds (1000 – 1 sec)
		
		String title = driver.getTitle();
		String copyright = driver.findElement(By.xpath("//*[@id=\'pageFooter\']/div[3]/div/span")).getText();
		
		driver.findElement(By.id("email")).sendKeys(email_address);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/a/span/span")).click();

        Thread.sleep(1000);
        String friends = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[3]/div/div[2]/div[2]/ul/li[3]/a/span[1]")).getText();
        
        Thread.sleep(1000);
        driver.findElement(By.id("userNavigationLabel")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Выйти']")).click();
      
        Thread.sleep(1000);
		driver.quit();
        
		System.out.println("Browser is: Firefox");
        System.out.println("Title of the page: " + title);
        System.out.println("Copyright: " + copyright);
        System.out.println("You have " + friends + " friends");
	}
}