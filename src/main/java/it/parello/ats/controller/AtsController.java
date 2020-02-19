package it.parello.ats.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AtsController {

	private static final Logger logger = LoggerFactory.getLogger(AtsController.class);
	
	@Autowired
	private AtsService service;
	
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	@RequestMapping("/ats/searchpage")
	public String searchPage(Model model) {
		//TODO: implementare qualcosa?
		return "searchPage";
	}
	
	@RequestMapping(value = "/ats/search/{search}", method = RequestMethod.GET)
	public String resultPage(@PathVariable("search") String search, Model model) {
		logger.info("search string %s", search);
		
		//TODO: implementare logica di ricerca
		Object obj = service.findByString(search);
		if (obj == null) {
			model.addAttribute("css", "danger");
			model.addAttribute("msg", "User not found");
		}
		model.addAttribute("obj", obj);
		
		return "resultPage";
	}
}
