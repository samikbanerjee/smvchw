package com.mvc.DAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mvc.model.CityModel;


/**
 * City Data Access Object
 */
@Component
public class CityDAOImpl
{
	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource()
	{
		return dataSource;
	}

	/**
	 * @param dataSource
	 *           the dataSource to set
	 */
	public void setDataSource(final DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate()
	{
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate
	 *           the jdbcTemplate to set
	 */
	public void setJdbcTemplate(final JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

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
}
