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
	
@RequestMapping(value = "/mayor", method = RequestMethod.POST)
public String sumar(
		@RequestParam("num1") int A,
		@RequestParam("num2") int B, 
		@RequestParam("num3") int C,
		@RequestParam("num4") int D,
		Model model){
	// Proceso
	int mayor;
	int X;
	int Y;
	if(A > B && A > C && A > D){
        X=A;
    }else{
        if(B > A && B > C && B > D){
            X=B;
        }else{
            if(C > A && C > B && C > D){
                X=C;
            }else
                X=D;
        }
    }
    if(A < B && A < C && A < D){
        Y=A;
    }else{
        if(B < A && B < C && B < D){
            Y=B;
        }else{
            if(C < A && C < B && C < D){
                Y=C;
            }else
                Y=D;
        }
    }
	
	
	mayor = X;
	
	// Model
	model.addAttribute("n1", A);
	model.addAttribute("n2", B);
	model.addAttribute("n3", C);
	model.addAttribute("n4", D);
	model.addAttribute("mayor", mayor);
	return "mayor";
}
}
