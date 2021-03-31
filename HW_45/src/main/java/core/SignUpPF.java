package core;

public class SignUpPF {
	public static void validate( String url){
		CommonPF.open(url);
		CommonPF.PageValidationPF("1. Element [Quotes]: ", CommonPF.el_1);
		CommonPF.PageValidationPF("2. Element [Current Location] " , CommonPF.el_2) ;
		CommonPF.PageValidationPF("3. Element [Weather Icon] " , CommonPF.el_3) ;
		CommonPF.PageValidationPF("4. Element [Temperature] " , CommonPF.el_4) ;
		CommonPF.PageValidationPF("5. Element [Title] " , CommonPF.el_5) ;
		CommonPF.PageValidationPF("6. Element [First Name Label] " , CommonPF.el_6) ;
		CommonPF.PageValidationPF("7. Element [First Name Field] " , CommonPF.el_7) ;
		CommonPF.PageValidationPF("8. Element [Last Name Label] " , CommonPF.el_8) ;
		CommonPF.PageValidationPF("9. Element [Last Name Field] " , CommonPF.el_9) ;
		CommonPF.PageValidationPF("10. Element [Email Address Label] " , CommonPF.el_10) ;
		CommonPF.PageValidationPF("11. Element [Email Address Field] " , CommonPF.el_11) ;
		CommonPF.PageValidationPF("12. Element [Phone Number Label] " , CommonPF.el_12) ;
		CommonPF.PageValidationPF("13. Element [Phone Number Field] " , CommonPF.el_13) ;
		CommonPF.PageValidationPF("14. Element [Gender label] " , CommonPF.el_14) ;
		CommonPF.PageValidationPF("15. Element [Male label] " , CommonPF.el_15) ;
		CommonPF.PageValidationPF("16. Element [Male (Radio Button)] " , CommonPF.el_16) ;
		CommonPF.PageValidationPF("17. Element [Female label] " , CommonPF.el_17) ;
		CommonPF.PageValidationPF("18. Element [Female (Radio Button)]" , CommonPF.el_18) ;
		CommonPF.PageValidationPF("19. Element [State Label] " , CommonPF.el_19) ;
		CommonPF.PageValidationPF("20. Element [State (drop-down)] " , CommonPF.el_20) ;
		CommonPF.PageValidationPF("21. Element [State (item)] " , CommonPF.el_21) ;
		CommonPF.PageValidationPF("22. Element [Terms Label] " , CommonPF.el_22) ;
		CommonPF.PageValidationPF("23. Element [Terms Check Box] " , CommonPF.el_23) ;
		CommonPF.PageValidationPF("24. Element [Facebook icon] " , CommonPF.el_24) ;
		CommonPF.PageValidationPF("25. Element [Twitter icon] " , CommonPF.el_25) ;
		CommonPF.PageValidationPF("26. Element [Flickr icon] " , CommonPF.el_26) ;
		CommonPF.PageValidationPF("27. Element [Youtube icon] " , CommonPF.el_27) ;
		CommonPF.PageValidationPF("28. Element [Reset Button] " , CommonPF.el_28) ;
		CommonPF.PageValidationPF("29. Element [Submit Button] " , CommonPF.el_29) ;
		CommonPF.PageValidationPF("30. Element [Timestamp] " , CommonPF.el_30) ;
		CommonPF.PageValidationPF("31. Element [Copyright] " , CommonPF.el_31) ;
		CommonPF.PageValidationPF("32. Element [OS & Browser] " , CommonPF.el_32) ;
		CommonPF.PageValidationPF("33. Element [Error Line] " , CommonPF.el_33) ;
		CommonPF.PageValidationPF("34. Element [First Name Error] " , CommonPF.el_34) ;
		CommonPF.PageValidationPF("35. Element [Last Name Error] " , CommonPF.el_35) ;
		CommonPF.PageValidationPF("36. Element [Email Error] " , CommonPF.el_36) ;
		CommonPF.PageValidationPF("37. Element [Phone Error] " , CommonPF.el_37) ;
		CommonPF.PageValidationPF("38. Element [First Name Error (img)] " , CommonPF.el_38) ;
		CommonPF.PageValidationPF("39. Element [Last Name Error (img)] " , CommonPF.el_39) ;
		CommonPF.PageValidationPF("40. Element [Email Error (img)] " , CommonPF.el_40) ;
		CommonPF.PageValidationPF("41. Element [Phone Error (img)] " , CommonPF.el_41) ;
		}

}
