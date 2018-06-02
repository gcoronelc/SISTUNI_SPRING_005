package pe.egcc.app;

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
		
	
}
