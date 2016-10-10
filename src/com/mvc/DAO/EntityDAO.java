/**
 *
 */
package com.mvc.DAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * Template for the Data Access Object
 */
public class EntityDAO
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


}
