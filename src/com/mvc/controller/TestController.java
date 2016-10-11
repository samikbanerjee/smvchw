package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller for test page
 */
@Controller
@RequestMapping(value = "/test")
public class TestController
{

	/**
	 * @param model
	 * @return Test Page GET
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String testPageGet(final ModelMap model)
	{
		return "testPage";
	}

	/**
	 * @param request
	 * @param model
	 * @return Test Page POST
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String testPagePost(final HttpServletRequest request, final ModelMap model)
	{
		final String val = request.getParameter("textInput");
		model.addAttribute("val", val);
		return "testPage";
	}


}
