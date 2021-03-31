package core;

import java.io.*;
import java.math.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;


public class Main {
	static String country_name = "";
	static String currency_symbol = "";
	static String currency_code = "";
	static String usa_symbol = "$";
	static String pair_code = "";
	static Double currency_rate = 0.0;
	static double price = 0.0;
	
	public static void getCountryInfo(String ip) throws InterruptedException, IOException, ParseException {
		
		URL cc_url = new URL ("http://www.geoplugin.net/json.gp?ip=" + ip);
		JSONParser jp = new JSONParser();
		JSONObject cc_json = (JSONObject) jp.parse(new BufferedReader(new InputStreamReader(cc_url.openConnection().getInputStream())));
		country_name = (String) cc_json.get("geoplugin_countryName");
		currency_code = (String) cc_json.get("geoplugin_currencyCode");
		currency_symbol = (String) cc_json.get("geoplugin_currencySymbol_UTF8");
		
}
	
	public static void getRate(String currency_code) throws InterruptedException, IOException, ParseException {
		URL rate_url = new URL("http://api.fixer.io/latest?base=USD");
		JSONParser jp = new JSONParser();
		JSONObject rate_json = (JSONObject) jp.parse(new BufferedReader(new InputStreamReader(rate_url.openConnection().getInputStream())));
		JSONObject rates = (JSONObject) rate_json.get("rates");
		currency_rate = (Double) rates.get(currency_code);
	}
	
	public static String getIP (int i) throws IOException, ParseException {
		JSONParser jp = new JSONParser();
		JSONObject ip_json = (JSONObject) jp.parse(new FileReader("src/main/java/core/ip.json"));
		JSONArray ip_ja = (JSONArray) ip_json.get("ip_addresses");
		return (String) ip_ja.get(i);		
	}
	
	public static int getIPquantity() throws IOException, ParseException {
		JSONParser jp = new JSONParser();
		JSONObject ip_json = (JSONObject) jp.parse(new FileReader("src/main/java/core/ip.json"));
		JSONArray ip_ja = (JSONArray) ip_json.get("ip_addresses");
		return ip_ja.size();		
	}
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		
        Logger logger = Logger.getLogger("");logger.setLevel(Level.OFF);
       String url = "https://www.amazon.com/All-New-Amazon-Echo-Dot-Add-Alexa-To-Any-Room/dp/B01DFKC2SO";

       String driverPath = "";
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
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);

			
        String product_title = driver.findElement(By.id("productTitle")).getText();    
       double original_price = Double.parseDouble(driver.findElement(By.id("priceblock_ourprice")).getText().replace("$", "")); // 49.99
       driver.quit();
        
        System.out.println("There is info for " + getIPquantity() + " countries");
        System.out.println();
        
        for (int i = 0; i < getIPquantity(); i++){
        getCountryInfo(getIP(i));
        getRate(currency_code);
 
        price = new BigDecimal(original_price * currency_rate).setScale(2, RoundingMode.HALF_UP).doubleValue();
      
        System.out.println("Item: " + product_title + "; "
                                    + "US Price: " + usa_symbol + 49.99 + "; "
                                    + "For country: " + country_name + "; "
                                    + "Local Price: " + currency_symbol + price);
        
        }

	
	}
	}
