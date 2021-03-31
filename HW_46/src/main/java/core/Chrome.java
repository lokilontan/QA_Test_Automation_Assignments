package core;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

import javax.crypto.spec.SecretKeySpec;

public class Chrome {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
		
		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		
		String driverPath = "";

		String url = "http://facebook.com/";
		String email_address = "lokilontan@yandex.ru";
		String encrypted_password = "******************==";
		String password = Encrypt.decrypt(encrypted_password, new SecretKeySpec(Arrays.copyOf(MyMacAddress.getMac().getBytes("UTF-8"), 16), "AES"));

		if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "./resources/webdrivers/pc/chromedriver.exe";
		else throw new IllegalArgumentException("Unknown OS");
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-infobars"); 
			option.addArguments("--disable-notifications");
		    if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
				option.addArguments("--start-maximized");
			else throw new IllegalArgumentException("Unknown OS");
			driver = new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get(url);

		Thread.sleep(2000); // Pause in milleseconds (1000 – 1 sec)
		
		String title = driver.getTitle(); 
		String copyright = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[3]/div/span")).getText();
		
		driver.findElement(By.id("email")).sendKeys(email_address);
		driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
        
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='u_0_a']/div[1]/div[1]/div/a/span")).click();

        Thread.sleep(1000);
        String friends = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[3]/div/div[2]/div[2]/ul/li[3]/a/span[1]")).getText();
        
        Thread.sleep(1000);
        driver.findElement(By.id("userNavigationLabel")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[text()='Выйти']")).click();
      
        Thread.sleep(1000);
		driver.quit();
        
		System.out.println("Browser is: Chrome");
        System.out.println("Title of the page: " + title);
        System.out.println("Copyright: " + copyright);
        System.out.println("You have " + friends + " friends");
	}
}