/**
 *
 */
package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.DAO.CityDAOImpl;
import com.mvc.model.CityModel;


/**
 * City
 */
@Controller
public class CityController
{

	@Autowired
	CityDAOImpl cityDao;

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

	/**
	 * @param model
	 * @return City Display
	 */
	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public String cityPage(final ModelMap model)
	{
		final CityModel city = cityDao.getCityById(5);
		model.addAttribute("city", city);
		return "cityPage";
	}
}
