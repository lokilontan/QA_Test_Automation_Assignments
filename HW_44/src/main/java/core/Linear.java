package core;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Linear {
	
	static WebDriver driver;
	static String url;
	static long start;
	static long finish;
	
	public static void open(String url) {
		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("Page URL: " + driver.getCurrentUrl());
		System.out.println("User Agent: " + (String)((JavascriptExecutor)driver).executeScript("return navigator.userAgent;"));
	}
	
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
	
	
	public static void main(String[] args) {
		System.out.println("Browser: HtmlUnit");
		start = System.currentTimeMillis();
		url = "http://alex.academy/exe/signup/v1/index.php";              //URL!!!!!!!!!!
		open(url);
		
		//Presence!!!!!!!!!!!! 41 elements!!!!!!!
		System.out.println("----------------Sign Up Page Elements Presence Testing----------------");
		System.out.println("1. Element [Quotes] " + (isPresent(el_1) ? "Exist" : "Doesn`t exist"));
		System.out.println("2. Element [Current Location] " + (isPresent(el_2) ? "Exist" : "Doesn`t exist"));
		System.out.println("3. Element [Weather Icon] " + (isPresent(el_3) ? "Exist" : "Doesn`t exist"));
		System.out.println("4. Element [Temperature] " + (isPresent(el_4) ? "Exist" : "Doesn`t exist"));
		System.out.println("5. Element [Title] " + (isPresent(el_5) ? "Exist" : "Doesn`t exist"));
		System.out.println("6. Element [First Name Label] " + (isPresent(el_6) ? "Exist" : "Doesn`t exist"));
		System.out.println("7. Element [First Name Field] " + (isPresent(el_7) ? "Exist" : "Doesn`t exist"));
		System.out.println("8. Element [Last Name Label] " + (isPresent(el_8) ? "Exist" : "Doesn`t exist"));
		System.out.println("9. Element [Last Name Field] " + (isPresent(el_9) ? "Exist" : "Doesn`t exist"));
		System.out.println("10. Element [Email Address Label] " + (isPresent(el_10) ? "Exist" : "Doesn`t exist"));
		System.out.println("11. Element [Email Address Field] " + (isPresent(el_11) ? "Exist" : "Doesn`t exist"));
		System.out.println("12. Element [Phone Number Label] " + (isPresent(el_12) ? "Exist" : "Doesn`t exist"));
		System.out.println("13. Element [Phone Number Field] " + (isPresent(el_13) ? "Exist" : "Doesn`t exist"));
		System.out.println("14. Element [Gender label] " + (isPresent(el_14) ? "Exist" : "Doesn`t exist"));
		System.out.println("15. Element [Male label] " + (isPresent(el_15) ? "Exist" : "Doesn`t exist"));
		System.out.println("16. Element [Male (Radio Button)] " + (isPresent(el_16) ? "Exist" : "Doesn`t exist"));
		System.out.println("17. Element [Female label] " + (isPresent(el_17) ? "Exist" : "Doesn`t exist"));
		System.out.println("18. Element [Female (Radio Button)]" + (isPresent(el_18) ? "Exist" : "Doesn`t exist"));
		System.out.println("19. Element [State Label] " + (isPresent(el_19) ? "Exist" : "Doesn`t exist"));
		System.out.println("20. Element [State (drop-down)] " + (isPresent(el_20) ? "Exist" : "Doesn`t exist"));
		System.out.println("21. Element [State (item)] " + (isPresent(el_21) ? "Exist" : "Doesn`t exist"));
		System.out.println("22. Element [Terms Label] " + (isPresent(el_22) ? "Exist" : "Doesn`t exist"));
		System.out.println("23. Element [Terms Check Box] " + (isPresent(el_23) ? "Exist" : "Doesn`t exist"));
		System.out.println("24. Element [Facebook icon] " + (isPresent(el_24) ? "Exist" : "Doesn`t exist"));
		System.out.println("25. Element [Twitter icon] " + (isPresent(el_25) ? "Exist" : "Doesn`t exist"));
		System.out.println("26. Element [Flickr icon] " + (isPresent(el_26) ? "Exist" : "Doesn`t exist"));
		System.out.println("27. Element [Youtube icon] " + (isPresent(el_27) ? "Exist" : "Doesn`t exist"));
		System.out.println("28. Element [Reset Button] " + (isPresent(el_28) ? "Exist" : "Doesn`t exist"));
		System.out.println("29. Element [Submit Button] " + (isPresent(el_29) ? "Exist" : "Doesn`t exist"));
		System.out.println("30. Element [Timestamp] " + (isPresent(el_30) ? "Exist" : "Doesn`t exist"));
		System.out.println("31. Element [Copyright] " + (isPresent(el_31) ? "Exist" : "Doesn`t exist"));
		System.out.println("32. Element [OS & Browser] " + (isPresent(el_32) ? "Exist" : "Doesn`t exist"));
		System.out.println("33. Element [Error Line] " + (isPresent(el_33) ? "Exist" : "Doesn`t exist"));
		System.out.println("34. Element [First Name Error] " + (isPresent(el_34) ? "Exist" : "Doesn`t exist"));
		System.out.println("35. Element [Last Name Error] " + (isPresent(el_35) ? "Exist" : "Doesn`t exist"));
		System.out.println("36. Element [Email Error] " + (isPresent(el_36) ? "Exist" : "Doesn`t exist"));
		System.out.println("37. Element [Phone Error] " + (isPresent(el_37) ? "Exist" : "Doesn`t exist"));
		System.out.println("38. Element [First Name Error (img)] " + (isPresent(el_38) ? "Exist" : "Doesn`t exist"));
		System.out.println("39. Element [Last Name Error (img)] " + (isPresent(el_39) ? "Exist" : "Doesn`t exist"));
		System.out.println("40. Element [Email Error (img)] " + (isPresent(el_40) ? "Exist" : "Doesn`t exist"));
		System.out.println("41. Element [Phone Error (img)] " + (isPresent(el_41) ? "Exist" : "Doesn`t exist"));
		//Presence!!!!!!!!!!!! 41 elements!!!!!!!
		
		//VISABILITY!!!!!!!!!!!! 10 elements!!!!!!!
		System.out.println();
		System.out.println("----------------Sign Up Page Elements Visability Testing----------------");
		System.out.println("4. Element [Temperature] " + (isVisible(el_4) ? "Visible" : "Not Visible"));
		System.out.println("7. Element [First Name Field] " + (isVisible(el_7) ? "Visible" : "Not Visible"));
		System.out.println("10. Element [Email Address Label] " + (isVisible(el_10) ? "Visible" : "Not Visible"));
		System.out.println("13. Element [Phone Number Field] " + (isVisible(el_13) ? "Visible" : "Not Visible"));
		System.out.println("20. Element [State (drop-down)] " + (isVisible(el_20) ? "Visible" : "Not Visible"));
		System.out.println("24. Element [Facebook icon] " + (isVisible(el_24) ? "Visible" : "Not Visible"));
		System.out.println("33. Element [Error Line] " + (isVisible(el_33) ? "Visible" : "Not Visible"));
		System.out.println("34. Element [First Name Error] " + (isVisible(el_34) ? "Visible" : "Not Visible"));
		System.out.println("36. Element [Email Error] " + (isVisible(el_36) ? "Visible" : "Not Visible"));
		System.out.println("38. Element [First Name Error (img)] " + (isVisible(el_38) ? "Visible" : "Not Visible"));
		//VISABILITY!!!!!!!!!!!! 10 elements!!!!!!!

		/////////////////////////////////////////////////////////////////////////////////////////////
		
		url = "http://alex.academy/exe/signup/v1/confirmation.php"; 
		open(url);
		
		//Presence!!!!!!!!!!!! 12 elements!!!!!!!
				System.out.println();
				System.out.println("----------------Confirmation Page Elements Presence Testing----------------");
				System.out.println("1. Element [Title] " + (isPresent(el_c1) ? "Exist" : "Doesn`t exist"));
				System.out.println("2. Element [First Name Label] " + (isPresent(el_c2) ? "Exist" : "Doesn`t exist"));
				System.out.println("3. Element [Last Name Label] " + (isPresent(el_c3) ? "Exist" : "Doesn`t exist"));
				System.out.println("4. Element [Email Label] " + (isPresent(el_c4) ? "Exist" : "Doesn`t exist"));
				System.out.println("5. Element [Phone Number Label] " + (isPresent(el_c5) ? "Exist" : "Doesn`t exist"));
				System.out.println("6. Element [Gender Field] " + (isPresent(el_c6) ? "Exist" : "Doesn`t exist"));
				System.out.println("7. Element [State Field] " + (isPresent(el_c7) ? "Exist" : "Doesn`t exist"));
				System.out.println("8. Element [Terms Field] " + (isPresent(el_c8) ? "Exist" : "Doesn`t exist"));
				System.out.println("9. Element [Back Button] " + (isPresent(el_c9) ? "Exist" : "Doesn`t exist"));
				System.out.println("10. Element [Copyright] " + (isPresent(el_c10) ? "Exist" : "Doesn`t exist"));
				System.out.println("11. Element [First Name Field] " + (isPresent(el_c11) ? "Exist" : "Doesn`t exist"));
				System.out.println("12. Element [Last Name Field] " + (isPresent(el_c12) ? "Exist" : "Doesn`t exist"));
				//Presence!!!!!!!!!!!! 12 elements!!!!!!!
				
				driver.quit();
				finish = System.currentTimeMillis();
				System.out.println("Response time: "+(finish-start)+" ms");
	}
}
