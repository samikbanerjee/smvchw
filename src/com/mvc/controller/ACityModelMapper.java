package com.mvc.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
 * @author samik
 */
public final class ACityModelMapper implements RowMapper<ACityModel>
{

	@Override
	public ACityModel mapRow(final ResultSet rs, final int rownum) throws SQLException
	{
		final ACityModel city = new ACityModel();
		city.setId(rs.getInt("ID"));
		city.setName(rs.getString("Name"));
		city.setCountryCode(rs.getString("CountryCode"));
		city.setDistrict(rs.getString("District"));
		city.setPopulation(rs.getInt("Population"));
		return city;
	}
}
