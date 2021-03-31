package core;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.math.*;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import java.util.regex.*;

public class HtmlUnit {

       public static void main(String[] args) throws InterruptedException {
              Logger.getLogger("").setLevel(Level.OFF);
              String[] url = {"http://alex.academy/exe/payment/index.html" , "http://alex.academy/exe/payment/index2.html" , 
		  					  "http://alex.academy/exe/payment/index3.html", "http://alex.academy/exe/payment/index4.html" , 
							  "http://alex.academy/exe/payment/indexE.html"};

                     
              WebDriver driver = new HtmlUnitDriver();
              ((HtmlUnitDriver) driver).setJavascriptEnabled(true); // JavaScript Enable

              driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
              driver.manage().window().maximize();

              for (int i = 0 ; i<5; i++) {
             	  
  	            driver.get(url[i]);
  	//$1,654.55
  	            String string_monthly_payment = driver.findElement(By.id("id_monthly_payment")).getText();
  	            
  	                String regex = "^"
  	                              + "(?:\\$)?"
  	                              + "(?:\\s*)?"
  	                              + "((?:\\d{1,3})(?:\\,)?(?:\\d{3})?(?:\\.)?(\\d{0,2})?)"
  	                              + "$";
  	                
  	                // String regex = "(1,654.55)";
  	                   Pattern p = Pattern.compile(regex);
  	                   Matcher m = p.matcher(string_monthly_payment);
  	                   m.find(); // 1,654.55
  	                   double monthly_payment = Double.parseDouble(m.group(1).replaceAll(",", ""));
  	//1654.55 * 12 = 19854.60
  	double annual_payment = new BigDecimal(monthly_payment * 12).setScale(2, RoundingMode.HALF_UP).doubleValue();
  	                   DecimalFormat df = new DecimalFormat("0.00"); // 19854.6 =>19854.60
  	                   String f_annual_payment = df.format(annual_payment);
  	driver.findElement(By.id("id_annual_payment")).sendKeys(String.valueOf(f_annual_payment));
  	                   driver.findElement(By.id("id_validate_button")).submit();
  	                   String actual_result = driver.findElement(By.id("id_result")).getText();
  	                   System.out.println("Browser: HtmlUnit");
  	                   System.out.println("String: \t" + string_monthly_payment);
  	                   System.out.println("Annual Payment: " + f_annual_payment);
  	                   System.out.println("Result: \t" + actual_result);
  	                   System.out.println();
  	                   
  	            }
  	            
  	            driver.quit();
  	     }
  	}