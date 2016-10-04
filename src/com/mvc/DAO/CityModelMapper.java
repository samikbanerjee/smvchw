/**
 *
 */
package com.mvc.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mvc.model.CityModel;


/**
 *
 */
public class CityModelMapper implements RowMapper<CityModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public CityModel mapRow(final ResultSet rs, final int rownum) throws SQLException
	{
		final CityModel city = new CityModel();
		city.setiD(rs.getInt("ID"));
		city.setName(rs.getString("Name"));
		city.setCountryCode(rs.getString("CountryCode"));
		city.setDistrict(rs.getString("District"));
		city.setPopulation(rs.getInt("Population"));
		return city;
	}
}
