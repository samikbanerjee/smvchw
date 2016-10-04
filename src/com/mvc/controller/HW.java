/**
 *
 */
package com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	ACityDAOImpl cityDAO;

	/**
	 * @return the cityDAO
	 */
	public ACityDAOImpl getCityDAO()
	{
		return cityDAO;
	}


	/**
	 * @param cityDAO
	 *           the cityDAO to set
	 */
	public void setCityDAO(final ACityDAOImpl cityDAO)
	{
		this.cityDAO = cityDAO;
	}


	/**
	 * @param model
	 * @return View
	 */
	@RequestMapping(value = "/wel", method = RequestMethod.GET)
	public String welPage(final ModelMap model)
	{
		final List<String> msgLi = createList();
		final String city = getCity();
		model.addAttribute("msgList", msgLi);
		model.addAttribute("city", city);
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

	private String getCity()
	{
		final ACityModel ct = cityDAO.getCityById(1024);


		return (ct.getCountryCode() + "--" + ct.getName() + "--" + ct.getDistrict());
	}
}
