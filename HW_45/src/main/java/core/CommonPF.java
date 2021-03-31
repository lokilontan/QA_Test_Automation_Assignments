package core;

import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.FindBy;


public class CommonPF {
	static WebDriver driver;
	
public static void open(String url) {
		
		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		PageFactory.initElements(driver, CommonPF.class);
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("User Agent: " + (String)((JavascriptExecutor)driver).executeScript("return navigator.userAgent;"));
		System.out.println("Page URL: " + driver.getCurrentUrl());
	}


public static boolean isPresentPF(WebElement element) {
	try {element.getTagName(); return true;}
	catch (NoSuchElementException e ) {return false;}
	}

public static void PageValidationPF(String test_case, WebElement element){
	System.out.println(test_case + (isPresentPF(element) ? "Exists" : "Doesn`t Exist"));
}



public static void quite(){driver.quit();}


	@FindBy(id = "id_quotes")  static WebElement el_1; 						//Sign Up - Quotes
	@FindBy(id = "id_current_location")   static WebElement el_2;  			//Sign Up - Current Location
	@FindBy(id = "id_weather_icon")   static WebElement el_3;					//Sign Up - Weather Icon
	@FindBy(id = "id_temperature")   static WebElement el_4;					//Sign Up - Temperature
	@FindBy(id = "id_f_title")   static WebElement el_5;						//Sign Up - Title
	@FindBy(id = "id_f_label_fn")   static WebElement el_6;						//Sign Up - First Name Label
	@FindBy(id = "id_fname")   static WebElement el_7;							//Sign Up - First Name Field
	@FindBy(id = "id_f_label_ln")   static WebElement el_8;						//Sign Up - Last Name Label
	@FindBy(id = "id_lname")   static WebElement el_9;							//Sign Up - Last Name Field		
	@FindBy(id = "id_f_label_ea")   static WebElement el_10;					//Sign Up - Email Address Label
	@FindBy(id = "id_email")   static WebElement el_11;							//Sign Up - Email Address Field
	@FindBy(id = "id_f_label_pn")   static WebElement el_12;					//Sign Up - Phone Number Label
	@FindBy(id = "id_phone")   static WebElement el_13;							//Sign Up - Phone Number Field
	@FindBy(id = "id_rb_label_g")   static WebElement el_14;					//Sign Up - Gender label
	@FindBy(id = "id_rb_label_m")   static WebElement el_15;					//Sign Up - Male label
	@FindBy(id = "id_gender_male")   static WebElement el_16;					//Sign Up - Male (Radio Button)
	@FindBy(id = "id_rb_label_f")   static WebElement el_17;					//Sign Up - Female label
	@FindBy(id = "id_gender_female")   static WebElement el_18;					//Sign Up - Female (Radio Button)
	@FindBy(id = "id_f_label_s")   static WebElement el_19;						//Sign Up - State Label
	@FindBy(id = "id_state")   static WebElement el_20;							//Sign Up - State (drop-down)
	@FindBy(xpath = "//*[@id='id_state']/option[6]")   static WebElement el_21;	//Sign Up - State (item)
	@FindBy(id = "id_cb_label_t")   static WebElement el_22;					//Sign Up - Terms Label
	@FindBy(id = "id_terms")   static WebElement el_23;							//Sign Up - Terms Check Box
	@FindBy(id = "id_img_facebook")   static WebElement el_24;					//Sign Up - Facebook icon
	@FindBy(id = "id_img_twitter")   static WebElement el_25;					//Sign Up - Twitter icon
	@FindBy(id = "id_img_flickr")   static WebElement el_26;					//Sign Up - Flickr icon
	@FindBy(id = "id_img_youtube")   static WebElement el_27;					//Sign Up - Youtube icon						
	@FindBy(id = "id_reset_button")   static WebElement el_28;					//Sign Up - Reset Button
	@FindBy(id = "id_submit_button")   static WebElement el_29;					//Sign Up - Submit Button
	@FindBy(id = "timestamp")   static WebElement el_30;						//Sign Up - Timestamp
	@FindBy(id = "copyright")   static WebElement el_31;						//Sign Up - Copyright
	@FindBy(id = "os_browser")   static WebElement el_32;						//Sign Up - OS & Browser
	@FindBy(id = "ErrorLine")   static WebElement el_33;						//Sign Up - Error Line
	@FindBy(xpath = "//*[contains(text(), 'Please enter First Name')]")   static WebElement el_34;		//Sign Up - First Name Error                                                                                                            
	@FindBy(xpath = "//*[text()='Please enter Last Name']")   static WebElement el_35;		//Sign Up - Last Name Error
	@FindBy(xpath = "//*[text()='Please enter Email Address']")   static WebElement el_36;  //Sign Up - Email Error
	@FindBy(xpath = "//*[text()='Please enter Phone Number']")   static WebElement el_37;	//Sign Up - Phone Error
	@FindBy(id = "fname_error")   static WebElement el_38;						//Sign Up - First Name Error (img)
	@FindBy(id = "lname_error")   static WebElement el_39;						//Sign Up - Last Name Error (img)
	@FindBy(id = "email_error")   static WebElement el_40;						//Sign Up - Email Error (img)
	@FindBy(id = "phone_error")   static WebElement el_41; 						//Sign Up - Phone Error (img)
	
	@FindBy(id = "id_f_title")   static WebElement el_c1;               		//Confirmation - Title
	@FindBy(id = "id_f_label_fn")   static WebElement el_c2; 					//Confirmation - First Name Label
	@FindBy(id = "id_f_label_ln")   static WebElement el_c3;					//Confirmation - Last Name Label
	@FindBy(id = "id_f_label_ea")   static WebElement el_c4;					//Confirmation - Email Label
	@FindBy(id = "id_f_label_pn")   static WebElement el_c5;					//Confirmation - Phone Number Label
	@FindBy(id = "id_gender")   static WebElement el_c6;						//Confirmation - Gender Field
	@FindBy(id = "id_state")   static WebElement el_c7;							//Confirmation - State Field
	@FindBy(id = "id_terms")   static WebElement el_c8;							//Confirmation - Terms Field
	@FindBy(id = "id_back_button")   static WebElement el_c9;					//Confirmation - Back Button	
	@FindBy(id = "copyright")   static WebElement el_c10;				 		//Confirmation - Copyright
	@FindBy(id = "id_fname")   static WebElement el_c11;						//Confirmation - First Name Field
	@FindBy(id = "id_lname")   static WebElement el_c12;						//Confirmation - Last Name Field
	
	
	
	
}

