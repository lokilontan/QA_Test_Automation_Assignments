package core;

public class SignUp {
public static void validate(String url) {
	Common.open(url);
	System.out.println("----------------Presence Testing----------------");
	System.out.println("1. Element [Quotes] " + (Common.isPresent(Common.el_1) ? "Exist" : "Doesn`t exist"));
	System.out.println("2. Element [Current Location] " + (Common.isPresent(Common.el_2) ? "Exist" : "Doesn`t exist"));
	System.out.println("3. Element [Weather Icon] " + (Common.isPresent(Common.el_3) ? "Exist" : "Doesn`t exist"));
	System.out.println("4. Element [Temperature] " + (Common.isPresent(Common.el_4) ? "Exist" : "Doesn`t exist"));
	System.out.println("5. Element [Title] " + (Common.isPresent(Common.el_5) ? "Exist" : "Doesn`t exist"));
	System.out.println("6. Element [First Name Label] " + (Common.isPresent(Common.el_6) ? "Exist" : "Doesn`t exist"));
	System.out.println("7. Element [First Name Field] " + (Common.isPresent(Common.el_7) ? "Exist" : "Doesn`t exist"));
	System.out.println("8. Element [Last Name Label] " + (Common.isPresent(Common.el_8) ? "Exist" : "Doesn`t exist"));
	System.out.println("9. Element [Last Name Field] " + (Common.isPresent(Common.el_9) ? "Exist" : "Doesn`t exist"));
	System.out.println("10. Element [Email Address Label] " + (Common.isPresent(Common.el_10) ? "Exist" : "Doesn`t exist"));
	System.out.println("11. Element [Email Address Field] " + (Common.isPresent(Common.el_11) ? "Exist" : "Doesn`t exist"));
	System.out.println("12. Element [Phone Number Label] " + (Common.isPresent(Common.el_12) ? "Exist" : "Doesn`t exist"));
	System.out.println("13. Element [Phone Number Field] " + (Common.isPresent(Common.el_13) ? "Exist" : "Doesn`t exist"));
	System.out.println("14. Element [Gender label] " + (Common.isPresent(Common.el_14) ? "Exist" : "Doesn`t exist"));
	System.out.println("15. Element [Male label] " + (Common.isPresent(Common.el_15) ? "Exist" : "Doesn`t exist"));
	System.out.println("16. Element [Male (Radio Button)] " + (Common.isPresent(Common.el_16) ? "Exist" : "Doesn`t exist"));
	System.out.println("17. Element [Female label] " + (Common.isPresent(Common.el_17) ? "Exist" : "Doesn`t exist"));
	System.out.println("18. Element [Female (Radio Button)]" + (Common.isPresent(Common.el_18) ? "Exist" : "Doesn`t exist"));
	System.out.println("19. Element [State Label] " + (Common.isPresent(Common.el_19) ? "Exist" : "Doesn`t exist"));
	System.out.println("20. Element [State (drop-down)] " + (Common.isPresent(Common.el_20) ? "Exist" : "Doesn`t exist"));
	System.out.println("21. Element [State (item)] " + (Common.isPresent(Common.el_21) ? "Exist" : "Doesn`t exist"));
	System.out.println("22. Element [Terms Label] " + (Common.isPresent(Common.el_22) ? "Exist" : "Doesn`t exist"));
	System.out.println("23. Element [Terms Check Box] " + (Common.isPresent(Common.el_23) ? "Exist" : "Doesn`t exist"));
	System.out.println("24. Element [Facebook icon] " + (Common.isPresent(Common.el_24) ? "Exist" : "Doesn`t exist"));
	System.out.println("25. Element [Twitter icon] " + (Common.isPresent(Common.el_25) ? "Exist" : "Doesn`t exist"));
	System.out.println("26. Element [Flickr icon] " + (Common.isPresent(Common.el_26) ? "Exist" : "Doesn`t exist"));
	System.out.println("27. Element [Youtube icon] " + (Common.isPresent(Common.el_27) ? "Exist" : "Doesn`t exist"));
	System.out.println("28. Element [Reset Button] " + (Common.isPresent(Common.el_28) ? "Exist" : "Doesn`t exist"));
	System.out.println("29. Element [Submit Button] " + (Common.isPresent(Common.el_29) ? "Exist" : "Doesn`t exist"));
	System.out.println("30. Element [Timestamp] " + (Common.isPresent(Common.el_30) ? "Exist" : "Doesn`t exist"));
	System.out.println("31. Element [Copyright] " + (Common.isPresent(Common.el_31) ? "Exist" : "Doesn`t exist"));
	System.out.println("32. Element [OS & Browser] " + (Common.isPresent(Common.el_32) ? "Exist" : "Doesn`t exist"));
	System.out.println("33. Element [Error Line] " + (Common.isPresent(Common.el_33) ? "Exist" : "Doesn`t exist"));
	System.out.println("34. Element [First Name Error] " + (Common.isPresent(Common.el_34) ? "Exist" : "Doesn`t exist"));
	System.out.println("35. Element [Last Name Error] " + (Common.isPresent(Common.el_35) ? "Exist" : "Doesn`t exist"));
	System.out.println("36. Element [Email Error] " + (Common.isPresent(Common.el_36) ? "Exist" : "Doesn`t exist"));
	System.out.println("37. Element [Phone Error] " + (Common.isPresent(Common.el_37) ? "Exist" : "Doesn`t exist"));
	System.out.println("38. Element [First Name Error (img)] " + (Common.isPresent(Common.el_38) ? "Exist" : "Doesn`t exist"));
	System.out.println("39. Element [Last Name Error (img)] " + (Common.isPresent(Common.el_39) ? "Exist" : "Doesn`t exist"));
	System.out.println("40. Element [Email Error (img)] " + (Common.isPresent(Common.el_40) ? "Exist" : "Doesn`t exist"));
	System.out.println("41. Element [Phone Error (img)] " + (Common.isPresent(Common.el_41) ? "Exist" : "Doesn`t exist"));
	//Presence!!!!!!!!!!!! 41 elements!!!!!!!
	
	//VISABILITY!!!!!!!!!!!! 10 elements!!!!!!!
	System.out.println();
	System.out.println("----------------Visability Testing----------------");
	System.out.println("4. Element [Temperature] " + (Common.isVisible(Common.el_4) ? "Visible" : "Not Visible"));
	System.out.println("7. Element [First Name Field] " + (Common.isVisible(Common.el_7) ? "Visible" : "Not Visible"));
	System.out.println("10. Element [Email Address Label] " + (Common.isVisible(Common.el_10) ? "Visible" : "Not Visible"));
	System.out.println("13. Element [Phone Number Field] " + (Common.isVisible(Common.el_13) ? "Visible" : "Not Visible"));
	System.out.println("20. Element [State (drop-down)] " + (Common.isVisible(Common.el_20) ? "Visible" : "Not Visible"));
	System.out.println("24. Element [Facebook icon] " + (Common.isVisible(Common.el_24) ? "Visible" : "Not Visible"));
	System.out.println("33. Element [Error Line] " + (Common.isVisible(Common.el_33) ? "Visible" : "Not Visible"));
	System.out.println("34. Element [First Name Error] " + (Common.isVisible(Common.el_34) ? "Visible" : "Not Visible"));
	System.out.println("36. Element [Email Error] " + (Common.isVisible(Common.el_36) ? "Visible" : "Not Visible"));
	System.out.println("38. Element [First Name Error (img)] " + (Common.isVisible(Common.el_38) ? "Visible" : "Not Visible"));
	System.out.println();
	//VISABILITY!!!!!!!!!!!! 10 elements!!!!!!!
}
}
