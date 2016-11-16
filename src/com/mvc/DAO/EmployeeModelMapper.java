/**
 *
 */
package com.mvc.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mvc.model.EmployeeModel;


/**
 *
 */
public class EmployeeModelMapper implements RowMapper<EmployeeModel>
{


	@Override
	public EmployeeModel mapRow(final ResultSet rs, final int rowNum) throws SQLException
	{
		final EmployeeModel empl = new EmployeeModel();
		empl.setID(rs.getInt("ID"));
		empl.setEmployeeName(rs.getString("EmployeeName"));
		empl.setDoj(rs.getDate("DOJ"));
		empl.setRole(rs.getString("Role"));
		empl.setDesignation(rs.getString("Designation"));
		empl.setLocation(rs.getString("Location"));
		empl.setProject(rs.getString("Project"));
		empl.setPragitiExperience(rs.getFloat("PragitiExperience"));
		empl.setPreviousExperience(rs.getFloat("PreviousExperience"));
		empl.setAvailableDate(rs.getDate("AvailableDate"));
		empl.setNewProject(rs.getString("NewProject"));
		empl.setNewProjectStartDate(rs.getDate("NewProjectStartDate"));
		empl.setVisaStatus(rs.getString("VisaStatus"));
		return empl;
	}

}
