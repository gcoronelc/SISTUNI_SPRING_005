package pe.egcc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.egcc.app.service.Matematica;

@Controller
public class AppController {
  
  @Autowired
  private Matematica matematica;
  
  
  @RequestMapping(value = "index.htm", method = RequestMethod.GET)
  public String index(Model model){
    
    model.addAttribute("n1", 12);
    model.addAttribute("n2", 15);
    model.addAttribute("suma", matematica.sumar(12, 15));
    
    
    return "index";
  }
  
}
