/**
 *
 */
package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Hello World
 */


@Controller
public class WelcomeController
{


	/**
	 * @param model
	 * @return View
	 */
	@RequestMapping(value = "/wel", method = RequestMethod.GET)
	public String welPage(final ModelMap model)
	{
		return "welcomePage";
	}


}
