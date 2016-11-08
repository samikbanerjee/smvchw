package com.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.model.Person;
import com.mvc.model.ToolBox;


/**
 * Person
 */
@Controller
public class PersonController
{



	/**
	 * @param model
	 * @param req
	 * @return View
	 * @throws IOException
	 */
	@RequestMapping(value = "/pers", method = RequestMethod.GET)
	public String personPage(final ModelMap model, final HttpServletRequest req) throws IOException
	{

		final ToolBox tool = new ToolBox();
		final List<Person> persons = tool.getCsvToBeanList(req, "Dataconnector", "Person.csv", ';', Person.class);
		model.addAttribute("personList", persons);
		return "personPage";
	}
}
