package com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.model.Person;


/**
 * Person
 */
@Controller
public class PersonController
{
	/**
	 * @param model
	 * @return View
	 */
	@RequestMapping(value = "/pers", method = RequestMethod.GET)
	public String personPage(final ModelMap model)
	{
		final List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Samik", "Banerjee"));
		persons.add(new Person("Tanushree", "Goswami"));

		model.addAttribute("personList", persons);
		return "personPage";
	}

}
