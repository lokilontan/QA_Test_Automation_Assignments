package core;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Common {

	static WebDriver driver;
	
public static void open(String url) {
		
		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("User Agent: " + (String)((JavascriptExecutor)driver).executeScript("return navigator.userAgent;"));
		System.out.println("Page URL: " + driver.getCurrentUrl());
	}

public static void quite() {driver.quit();}

public static boolean isPresent(By by) {
	if (driver.findElements(by).size() > 0) return true; else return false;
}
public static boolean isVisible(By by) {
	if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed()) return true; else return false;
}

//All elements implementation!!!!!!!!!!!!!!!

		static By el_1 = By.id("id_quotes");               			//Sign Up - Quotes
		static By el_2 = By.id("id_current_location"); 				//Sign Up - Current Location
		static By el_3 = By.id("id_weather_icon");					//Sign Up - Weather Icon
		static By el_4 = By.id("id_temperature");					//Sign Up - Temperature
		static By el_5 = By.id("id_f_title");						//Sign Up - Title
		static By el_6 = By.id("id_f_label_fn");					//Sign Up - First Name Label
		static By el_7 = By.id("id_fname");							//Sign Up - First Name Field
		static By el_8 = By.id("id_f_label_ln");					//Sign Up - Last Name Label
		static By el_9 = By.id("id_lname");							//Sign Up - Last Name Field		
		static By el_10 = By.id("id_f_label_ea");					//Sign Up - Email Address Label
		static By el_11 = By.id("id_email");						//Sign Up - Email Address Field
		static By el_12 = By.id("id_f_label_pn");					//Sign Up - Phone Number Label
		static By el_13 = By.id("id_phone");						//Sign Up - Phone Number Field
		static By el_14 = By.id("id_rb_label_g");					//Sign Up - Gender label
		static By el_15 = By.id("id_rb_label_m");					//Sign Up - Male label
		static By el_16 = By.id("id_gender_male");					//Sign Up - Male (Radio Button)
		static By el_17 = By.id("id_rb_label_f");					//Sign Up - Female label
		static By el_18 = By.id("id_gender_female");				//Sign Up - Female (Radio Button)
		static By el_19 = By.id("id_f_label_s");					//Sign Up - State Label
		static By el_20 = By.id("id_state");						//Sign Up - State (drop-down)
		static By el_21 = By.xpath("//*[@id='id_state']/option[6]");//Sign Up - State (item)
		static By el_22 = By.id("id_cb_label_t");					//Sign Up - Terms Label
		static By el_23 = By.id("id_terms");						//Sign Up - Terms Check Box
		static By el_24 = By.id("id_img_facebook");					//Sign Up - Facebook icon
		static By el_25 = By.id("id_img_twitter");					//Sign Up - Twitter icon
		static By el_26 = By.id("id_img_flickr");					//Sign Up - Flickr icon
		static By el_27 = By.id("id_img_youtube");					//Sign Up - Youtube icon						
		static By el_28 = By.id("id_reset_button");					//Sign Up - Reset Button
		static By el_29 = By.id("id_submit_button");				//Sign Up - Submit Button
		static By el_30 = By.id("timestamp");						//Sign Up - Timestamp
		static By el_31 = By.id("copyright");						//Sign Up - Copyright
		static By el_32 = By.id("os_browser");						//Sign Up - OS & Browser
		static By el_33 = By.id("ErrorLine");						//Sign Up - Error Line
		static By el_34 = By.xpath("//*[text()='Please enter First Name']");		//Sign Up - First Name Error                                                                                                            
		static By el_35 = By.xpath("//*[text()='Please enter Last Name']");		//Sign Up - Last Name Error
		static By el_36 = By.xpath("//*[text()='Please enter Email Address']");  //Sign Up - Email Error
		static By el_37 = By.xpath("//*[text()='Please enter Phone Number']");			//Sign Up - Phone Error
		static By el_38 = By.id("fname_error");						//Sign Up - First Name Error (img)
		static By el_39 = By.id("lname_error");						//Sign Up - Last Name Error (img)
		static By el_40 = By.id("email_error");						//Sign Up - Email Error (img)
		static By el_41 = By.id("phone_error"); 					//Sign Up - Phone Error (img)
		
		static By el_c1 = By.id("id_f_title");               		//Confirmation - Title
		static By el_c2 = By.id("id_f_label_fn"); 					//Confirmation - First Name Label
		static By el_c3 = By.id("id_f_label_ln");					//Confirmation - Last Name Label
		static By el_c4 = By.id("id_f_label_ea");					//Confirmation - Email Label
		static By el_c5 = By.id("id_f_label_pn");					//Confirmation - Phone Number Label
		static By el_c6 = By.id("id_gender");						//Confirmation - Gender Field
		static By el_c7 = By.id("id_state");						//Confirmation - State Field
		static By el_c8 = By.id("id_terms");						//Confirmation - Terms Field
		static By el_c9 = By.id("id_back_button");					//Confirmation - Back Button	
		static By el_c10 = By.id("copyright");				 		//Confirmation - Copyright
		static By el_c11 = By.id("id_fname");						//Confirmation - First Name Field
		static By el_c12 = By.id("id_lname");						//Confirmation - Last Name Field
		
		

}
