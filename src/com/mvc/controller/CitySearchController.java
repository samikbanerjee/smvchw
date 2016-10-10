package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.DAO.CityDAOImpl;
import com.mvc.model.CityModel;


/**
 * Search City
 */
@Controller
@RequestMapping(value = "/citySearch")
public class CitySearchController
{
	@Autowired
	CityDAOImpl cityDAO;

	/**
	 * @param model
	 * @return City Search Area
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String searchCity(final ModelMap model)
	{
		model.addAttribute("city", new CityModel());
		return "citySearch";
	}

	/**
	 * @return the cityDAO
	 */
	public CityDAOImpl getCityDAO()
	{
		return cityDAO;
	}

	/**
	 * @param cityDAO
	 *           the cityDAO to set
	 */
	public void setCityDAO(final CityDAOImpl cityDAO)
	{
		this.cityDAO = cityDAO;
	}

	/**
	 * @param city
	 * @param model
	 * @return Searched city
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String displayCity(@ModelAttribute("city") final CityModel city, final ModelMap model)
	{
		final CityModel ct = cityDAO.getCityById(city.getiD());
		model.addAttribute("ct", ct);
		return "citySearch";
	}



}
