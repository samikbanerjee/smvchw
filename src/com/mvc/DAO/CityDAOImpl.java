package com.mvc.DAO;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mvc.model.CityModel;


/**
 * City Data Access Object
 */
@Component
public class CityDAOImpl extends EntityDAO
{

	/**
	 * @param id
	 * @return A city
	 */
	public CityModel getCityById(final int id)
	{
		final String SQL = "SELECT ID, Name, CountryCode, District, Population  FROM city  WHERE ID=?";

		return jdbcTemplate.queryForObject(SQL, new Object[]
		{ id }, new CityModelMapper());
	}

	/**
	 * @param countryCode
	 * @return List of Cities
	 */
	public List<CityModel> getCitiesByCountryCd(final String countryCode)
	{
		final String SQL = "SELECT ID, Name, CountryCode, District, Population  FROM city  WHERE CountryCode=?";

		return jdbcTemplate.query(SQL, new Object[]
		{ countryCode }, new CityModelMapper());
	}

	/**
	 * @return List of country codes
	 */
	public List<String> getCountryCodes()
	{
		final String SQL = "select distinct(CountryCode) from city";
		return jdbcTemplate.queryForList(SQL, String.class);
	}

	/**
	 * @param city
	 * @return Entry created - message
	 */
	public String createCity(final CityModel city)
	{
		final String SQL = "INSERT INTO city (ID, Name, CountryCode, District, Population) VALUES (?,?,?,?,?)";
		final int i = jdbcTemplate.update(SQL, new Object[]
		{ city.getiD(), city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation() });
		if (i == 1)
		{
			return "Entry created successfully";
		}
		else
		{
			return "Unable to create Entry";
		}
	}

	/**
	 * @param city
	 * @return Entries updated - message
	 */
	public String updateCity(final CityModel city)
	{
		final String SQL = "UPDATE city SET NAME=?, CountryCode=?, District=?, Population=? WHERE ID=?";
		final int i = jdbcTemplate.update(SQL, new Object[]
		{ city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation(), city.getiD() });

		if (i == 0)
		{
			return "Could not find entries to update";
		}
		else
		{
			return "Updated " + i + " entries";
		}

	}

	/**
	 * @param id
	 * @return Entries Deleted - message
	 */
	public String deleteCityById(final int id)
	{
		final String SQL = "DELETE FROM city WHERE ID=?";
		final int i = jdbcTemplate.update(SQL, new Object[]
		{ id });
		if (i == 0)
		{
			return "Could not find entries to delete";
		}
		else
		{
			return "Deleted " + i + " entries";
		}

	}
}
