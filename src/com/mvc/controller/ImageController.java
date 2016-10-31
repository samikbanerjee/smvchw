package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 */
@Controller
@RequestMapping(value = "/img")
public class ImageController
{
	/**
	 * @param id
	 * @param model
	 * @return ImagePage
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String imageDisplay(@RequestParam(value = "id", required = false) final String id, final ModelMap model)
	{
		final String imagesource = "resources/img/h" + id + ".jpg";
		model.addAttribute("imagesource", imagesource);
		return "imgPage";
	}
}
