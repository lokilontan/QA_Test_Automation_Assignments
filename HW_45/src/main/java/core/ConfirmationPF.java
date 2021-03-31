package core;

public class ConfirmationPF {
public static void validate (String url){
	CommonPF.open(url);
	//Presence!!!!!!!!!!!! 12 elements!!!!!!!
			CommonPF.PageValidationPF("1. Element [Title] " ,  CommonPF.el_c1) ;
			CommonPF.PageValidationPF("2. Element [First Name Label] " ,  CommonPF.el_c2) ;
			CommonPF.PageValidationPF("3. Element [Last Name Label] " ,  CommonPF.el_c3) ;
			CommonPF.PageValidationPF("4. Element [Email Label] " ,  CommonPF.el_c4) ;
			CommonPF.PageValidationPF("5. Element [Phone Number Label] " ,  CommonPF.el_c5) ;
			CommonPF.PageValidationPF("6. Element [Gender Field] " ,  CommonPF.el_c6) ;
			CommonPF.PageValidationPF("7. Element [State Field] " ,  CommonPF.el_c7) ;
			CommonPF.PageValidationPF("8. Element [Terms Field] " ,  CommonPF.el_c8) ;
			CommonPF.PageValidationPF("9. Element [Back Button] " ,  CommonPF.el_c9) ;
			CommonPF.PageValidationPF("10. Element [Copyright] " ,  CommonPF.el_c10) ;
			CommonPF.PageValidationPF("11. Element [First Name Field] " ,  CommonPF.el_c11) ;
			CommonPF.PageValidationPF("12. Element [Last Name Field] " ,  CommonPF.el_c12) ;
			//Presence!!!!!!!!!!!! 12 elements!!!!!!!

}
}
