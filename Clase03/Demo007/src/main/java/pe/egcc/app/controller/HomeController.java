package pe.egcc.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.xml.ws.ResponseWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import pe.egcc.app.dto.ClienteDto;
import pe.egcc.app.service.EurekaService;


@Controller
public class HomeController {
	
	@Autowired
	private EurekaService eurekaService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/getSaldoCuenta", method = RequestMethod.GET)
	@ResponseBody
	public String getSaldoCuenta(String cuenta){
		
		Double saldo = eurekaService.getSaldoCuenta(cuenta);
		
		return String.valueOf(saldo);
				
	}
	
	@RequestMapping(value="/getCliente", method = RequestMethod.GET)
	public String getCliente(){
				
		return "getCliente";
				
	}
	
	@RequestMapping(value="/traerCliente", method = RequestMethod.GET)
	@ResponseBody
	public String traerCliente(String codigo){
		
		ClienteDto rec = eurekaService.getCliente(codigo);
		
		Gson gson = new Gson();
		
		return gson.toJson(rec);
				
	}
	
}
