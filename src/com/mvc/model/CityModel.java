/**
 *
 */
package com.mvc.model;

/**
 * Model of City
 */
public class CityModel
{
	private int iD, population;
	private String name, countryCode, district;

	/**
	 * @return the iD
	 */
	public int getiD()
	{
		return iD;
	}

	/**
	 * @param iD
	 *           the iD to set
	 */
	public void setiD(final int iD)
	{
		this.iD = iD;
	}

	/**
	 * @return the population
	 */
	public int getPopulation()
	{
		return population;
	}

	/**
	 * @param population
	 *           the population to set
	 */
	public void setPopulation(final int population)
	{
		this.population = population;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *           the name to set
	 */
	public void setName(final String name)
	{
		this.name = name;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode()
	{
		return countryCode;
	}

	/**
	 * @param countryCode
	 *           the countryCode to set
	 */
	public void setCountryCode(final String countryCode)
	{
		this.countryCode = countryCode;
	}

	/**
	 * @return the district
	 */
	public String getDistrict()
	{
		return district;
	}

	/**
	 * @param district
	 *           the district to set
	 */
	public void setDistrict(final String district)
	{
		this.district = district;
	}




}
