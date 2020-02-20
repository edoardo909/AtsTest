package it.parello.ats.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
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
	
	
	@RequestMapping(value = {"/", "/login"})
	public String login(Locale locale, Model model) {
		List<ATM> element = service.listElements();
		model.addAttribute("collection", element);
		return "home";
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null) {
			new SecurityContextLogoutHandler().logout(request, response, authentication);
		}
		return "redirect:login";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String resultPage(@RequestParam (value = "search" , required  = false) String search, Model model) {
		List<ATM> element = service.findByString(search);
		if (element != null) {
			model.addAttribute("search", search);
			model.addAttribute("collection", element);
		}
		return "home";
	}
}
