package pe.egg.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	@RequestMapping(value = "/sumar", method = RequestMethod.POST)
	public String sumar(
			@RequestParam("num1") int n1, 
			@RequestParam("num2") int n2, 
			Model model) {
		
		// Proceso
		int suma = n1 + n2;
		
		// Model
		model.addAttribute("n1", n1);
		model.addAttribute("n2", n2);
		model.addAttribute("suma", suma);
		
		return "sumar";
	}	
	
	@RequestMapping(value = "/mayor", method = RequestMethod.POST)
	public String mayor(
			@RequestParam("num1") int n1, 
			@RequestParam("num2") int n2,
			@RequestParam("num3") int n3, 
			@RequestParam("num4") int n4, 
			
			Model model) {
		
		// Proceso
		int mayor = n1;
		if(n2 > mayor)
			mayor = n2;
		if(n3 > mayor)
			mayor = n3;
		if(n4 > mayor)
			mayor = n4;

		
		// Model
		model.addAttribute("n1", n1);
		model.addAttribute("n2", n2);
		model.addAttribute("n3", n3);
		model.addAttribute("n4", n4);		
		model.addAttribute("mayor", mayor);
		
		return "mayor";
	}		
	
}
