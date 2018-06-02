package pe.egcc.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		
		return "home";
	}
	
	@RequestMapping(value = "/mayor", method = RequestMethod.POST)
	public String mayor(int n1, int n2, int n3, int n4, Model model) {
		int mayor = 0;
		
		if (n1>n2){
			if(n1>n3){
				if (n1>n4){ mayor=n1; }else {mayor=n4;}
			}else {
				if (n3>n4){ mayor=n3; }else {mayor=n4;}
			}
			
		}else {			
			if(n2>n3){
				if (n2>n4){ mayor=n2; }else {mayor=n4;}
				
			}else {
				if (n3>n4){ mayor=n3; }else {mayor=n4;}
			}
		}
		
		
		//Model
			 
				model.addAttribute("mayor", mayor);
		return "mayor";
	}
	
}
