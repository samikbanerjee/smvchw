package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.model.Person;


/**
 * Registration
 */
@Controller
public class RegistrationController
{
	/**
	 * @param model
	 * @return Registration Form View
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String viewRegistration(final ModelMap model)
	{
		model.addAttribute("personForm", new Person());
		return "registrationForm";
	}

	/**
	 * @param person
	 * @param model
	 * @return nothing
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("personForm") final Person person, final ModelMap model)
	{
		model.addAttribute("fn", person.getfName());
		model.addAttribute("ln", person.getlName());
		return "regSuccess";
	}

}
