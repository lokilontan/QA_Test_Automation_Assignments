package core;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Chrome {
	
	static WebDriver driver;
	
	 By by;
     
     public static boolean isPresent(final By by) {
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         if (!driver.findElements(by).isEmpty()) return true;
         else return false;
         
     }
     
     
     public static boolean isVisible(final By by) {
  	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  	   if (driver.findElement(by).isDisplayed()) return true;
  	   else return false;
  	   
     }
     
     public static boolean isEnable(final By by) {
  	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  	   if (driver.findElement(by).isEnabled()) return true;
  	   else return false;
  	   
     }
     
   /*  public static boolean isReadOnly(final By by) {
  	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  	   if (!driver.findElement(by).getAttribute("readonly").isEmpty()) return true;
  	   else return false;
  	   
     }*/

	public static void main(String[] args) throws InterruptedException {
		
		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		
		String driverPath = "";
		String url = "https://www.macys.com/shop/product/under-armour-mens-tech-short-sleeve-shirt?ID=1719317&CategoryID=30423&selectedSize=#fn=sp%3D1%26spc%3D2255%26ruleId%3D85|BS|BA%26slotId%3D4";


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
		
//      /html/body/div[3]/div[2]/section/div[2]/div/div[1]/div[1]/div[3] - Availability Panel
//      //*[@id="productHeaderBox"]/div[1]/div/div/div/div/h1 - Item Title
//      //*[@id="product-shipping-returns-header"] - Shipping and Returns Block
//      //*[@id="carousel"] - Slider
//		//*[@id="BVRRContainer"]/div - Reviews Content     
//      //*[@id="bottomTabs"]/div[1]/ul/li[2] - Product Q&A Button
//      //*[@id="bottomTabs"]/div[1]/ul/li[3]- Customer Pictures
//		//*[@id="tagCloud"] - Popular Searches
//      //*[@id="creditCard"] - Macy`s Credit Card
//      //*[@id="stayconnected"] - Stay Connected   

		 By availPanel = By.xpath("/html/body/div[3]/div[2]/section/div[2]/div/div[1]/div[1]/div[3]");
         By itemTitle = By.xpath("//*[@id='productHeaderBox']/div[1]/div/div/div/div/h1");
         By shipnReturn = By.xpath("//*[@id='product-shipping-returns-header']");
         By slider = By.xpath("//*[@id='carousel']");
         By revContent = By.xpath("//*[@id='BVRRContainer']/div");
         By qnaButton = By.xpath("//*[@id='bottomTabs']/div[1]/ul/li[2]");
         By custPict = By.xpath("//*[@id='bottomTabs']/div[1]/ul/li[3]");
         By popSearches = By.xpath("//*[@id='tagCloud']");
         By creditCard = By.xpath("//*[@id='creditCard']");
         By stayConn = By.xpath("//*[@id='stayconnected']");

System.out.println("Browser: Chrome");
System.out.println("Page URL: " + driver.getCurrentUrl());
System.out.println("01. Element [availPanel]: " + (isPresent(availPanel) ? "Exists" : " Doesn`t exist "));
/*System.out.println("                             " + (isVisible(availPanel) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(availPanel) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(availPanel) ? "Read only" : " Not read only "));
*/System.out.println("02. Element [itemTitle]: " + (isPresent(itemTitle) ? "Exists" : " Doesn`t exist "));
/*System.out.println("                             " + (isVisible(itemTitle) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(itemTitle) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(itemTitle) ? "Read only" : " Not read only "));
*/System.out.println("03. Element [shipnReturn]: " + (isPresent(shipnReturn) ? "Exists" : " Doesn`t exist"));
/*System.out.println("                             " + (isVisible(shipnReturn) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(shipnReturn) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(shipnReturn) ? "Read only" : " Not read only "));
*/System.out.println("04. Element [slider]: " + (isPresent(slider) ? "Exists" : " Doesn`t exist "));
/*System.out.println("                             " + (isVisible(slider) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(slider) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(slider) ? "Read only" : " Not read only "));
*/System.out.println("05. Element [revContent]: " + (isPresent(revContent) ? "Exists" : " Doesn`t exist "));
/*System.out.println("                             " + (isVisible(revContent) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(revContent) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(revContent) ? "Read only" : " Not read only "));
*/System.out.println("06. Element [qnaButton]: " + (isPresent(qnaButton) ? "Exists" : " Doesn`t exist"));
/*System.out.println("                             " + (isVisible(qnaButton) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(qnaButton) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(qnaButton) ? "Read only" : " Not read only "));
*/System.out.println("07. Element [custPict]: " + (isPresent(custPict) ? "Exists" : " Doesn`t exist "));
/*System.out.println("                             " + (isVisible(custPict) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(custPict) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(custPict) ? "Read only" : " Not read only "));
*/System.out.println("08. Element [popSearches]: " + (isPresent(popSearches) ? "Exists" : " Doesn`t exist"));
/*System.out.println("                             " + (isVisible(popSearches) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(popSearches) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(popSearches) ? "Read only" : " Not read only "));
*/System.out.println("09. Element [creditCard]: " + (isPresent(creditCard) ? "Exists" : " Doesn`t exist "));
/*System.out.println("                             " + (isVisible(creditCard) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(creditCard) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(creditCard) ? "Read only" : " Not read only "));
*/System.out.println("10. Element [stayConn]: " + (isPresent(stayConn) ? "Exists" : " Doesn`t exist "));
/*System.out.println("                             " + (isVisible(stayConn) ? "Visible" : " Not visible "));
System.out.println("                             " + (isEnable(stayConn) ? "Enable" : " Not enable "));
System.out.println("                             " + (isReadOnly(stayConn) ? "Read only" : " Not read only "));
*/
}
}
