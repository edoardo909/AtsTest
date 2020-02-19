package it.parello.ats.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.parello.ats.beans.ATM;


@Controller
public class AtsController {

	private static final Logger logger = LoggerFactory.getLogger(AtsController.class);
	
	@Autowired
	private AtsService service;
	
	@RequestMapping("/")
	public String login(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	@RequestMapping("/main")
	public String searchPage(Model model) {
		List<ATM> element = service.listElements();
		model.addAttribute("collection", element);
		return "searchPage";
	}
	
	@RequestMapping(value = "/search/{valore}", method = RequestMethod.GET)
	public String resultPage(@RequestParam (value = "valore" , required  = false) String search, Model model) {
		logger.info(String.format("search string %s", search));
		
		ATM atm = service.findByString(search);
		if (atm != null) {
			model.addAttribute("valore", search);
			model.addAttribute("atm", atm);
		}else {
			model.addAttribute("css", "danger");
			model.addAttribute("msg", "User not found");
		}
		return "searchPage";
	}
}
