package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.DAO.CityDAOImpl;
import com.mvc.model.CityModel;


/**
 * City Edit Controller
 */
@Controller
@RequestMapping(value = "/editcity")
public class CityEditController
{
	@Autowired
	CityDAOImpl cityDao;


	/**
	 * @param cityId
	 * @param model
	 * @return Edit City Form
	 */

	@RequestMapping(method = RequestMethod.GET)
	public String editCityForm(@RequestParam(value = "cityId", required = false) final int cityId, final ModelMap model)
	{
		final CityModel city = cityDao.getCityById(cityId);
		model.addAttribute("city", city);
		return "cityEdit";
	}

	/**
	 * @param cityUpdated
	 * @param model
	 * @return Edit City Confirmation
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String editCityConfirmation(@ModelAttribute("city") final CityModel cityUpdated, final ModelMap model)
	{
		final String message = cityDao.updateCity(cityUpdated);
		model.addAttribute("message", message);
		return "cityEdit";
	}















	/**
	 * @return the cityDao
	 */
	public CityDAOImpl getCityDao()
	{
		return cityDao;
	}

	/**
	 * @param cityDao
	 *           the cityDao to set
	 */
	public void setCityDao(final CityDAOImpl cityDao)
	{
		this.cityDao = cityDao;
	}
}
