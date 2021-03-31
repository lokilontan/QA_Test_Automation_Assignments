package core;

public class Confirmation {
	
	public static void validate(String url) {
		Common.open(url);
		//Presence!!!!!!!!!!!! 12 elements!!!!!!!
		System.out.println("----------------Presence Testing----------------");
		System.out.println("1. Element [Title] " + (Common.isPresent(Common.el_c1) ? "Exist" : "Doesn`t exist"));
		System.out.println("2. Element [First Name Label] " + (Common.isPresent(Common.el_c2) ? "Exist" : "Doesn`t exist"));
		System.out.println("3. Element [Last Name Label] " + (Common.isPresent(Common.el_c3) ? "Exist" : "Doesn`t exist"));
		System.out.println("4. Element [Email Label] " + (Common.isPresent(Common.el_c4) ? "Exist" : "Doesn`t exist"));
		System.out.println("5. Element [Phone Number Label] " + (Common.isPresent(Common.el_c5) ? "Exist" : "Doesn`t exist"));
		System.out.println("6. Element [Gender Field] " + (Common.isPresent(Common.el_c6) ? "Exist" : "Doesn`t exist"));
		System.out.println("7. Element [State Field] " + (Common.isPresent(Common.el_c7) ? "Exist" : "Doesn`t exist"));
		System.out.println("8. Element [Terms Field] " + (Common.isPresent(Common.el_c8) ? "Exist" : "Doesn`t exist"));
		System.out.println("9. Element [Back Button] " + (Common.isPresent(Common.el_c9) ? "Exist" : "Doesn`t exist"));
		System.out.println("10. Element [Copyright] " + (Common.isPresent(Common.el_c10) ? "Exist" : "Doesn`t exist"));
		System.out.println("11. Element [First Name Field] " + (Common.isPresent(Common.el_c11) ? "Exist" : "Doesn`t exist"));
		System.out.println("12. Element [Last Name Field] " + (Common.isPresent(Common.el_c12) ? "Exist" : "Doesn`t exist"));
		//Presence!!!!!!!!!!!! 12 elements!!!!!!!
	}

}
