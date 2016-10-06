/**
 *
 */
package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	 * @param countryCode
	 * @param model
	 * @return City Display
	 */
	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public String cityPage(@RequestParam(value = "countryCode", required = false) final String countryCode, final ModelMap model)
	{
		final List<String> countryCodes = cityDao.getCountryCodes();
		final List<CityModel> cities = cityDao.getCitiesByCountryCd(countryCode);
		model.addAttribute("countryCodes", countryCodes);
		model.addAttribute("cities", cities);
		return "cityPage";
	}

}
