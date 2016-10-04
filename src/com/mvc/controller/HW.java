/**
 *
 */
package com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Hello World
 */


@Controller
public class HW
{


	/**
	 * @param model
	 * @return View
	 */
	@RequestMapping(value = "/wel", method = RequestMethod.GET)
	public String welPage(final ModelMap model)
	{
		final List<String> msgLi = createList();
		model.addAttribute("msgList", msgLi);
		return "welcomePage";
	}


	private List<String> createList()
	{
		final List<String> li = new ArrayList<String>();
		li.add("From Samik List");
		li.add("From Tanushree List");
		li.add("From Poko List");
		return li;
	}

}
