/**
 *
 */
package com.mvc.DAO;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import com.mvc.model.EmployeeModel;


/**
 * Employee Data Access
 */
@Component
public class EmployeeDAO extends EntityDAO
{
	//Read (by Id)
	/**
	 * @param ID
	 * @return Get Employee By Id
	 */
	public EmployeeModel getEmployeeById(final int ID)
	{
		final String sql = "SELECT ID, EmployeeName, DOJ, Role, Designation, Location, Project,"
				+ " PragitiExperience, PreviousExperience, AvailableDate, NewProject, NewProjectStartDate,"
				+ " VisaStatus FROM emp WHERE ID = ?";

		EmployeeModel empl = null;

		try
		{
			empl = jdbcTemplate.queryForObject(sql, new Object[]
			{ ID }, new EmployeeModelMapper());
		}
		catch (final EmptyResultDataAccessException e)
		{

		}

		return empl;
	}

	//Read List
	/**
	 * @return List of all employees
	 */
	public List<EmployeeModel> getAllEmployees()
	{
		final String sql = "SELECT ID, EmployeeName, DOJ, Role, Designation, Location, Project,"
				+ " PragitiExperience, PreviousExperience, AvailableDate, NewProject, NewProjectStartDate, VisaStatus FROM emp";

		return jdbcTemplate.query(sql, new EmployeeModelMapper());
	}

	//Create

	/**
	 * @param empl
	 * @return Entry created - message
	 */
	public String createEmployee(final EmployeeModel empl)
	{
		final String sql = "INSERT INTO emp (ID, EmployeeName, DOJ, Role, Designation, Location, Project, PragitiExperience, "
				+ "PreviousExperience, AvailableDate, NewProject, NewProjectStartDate, VisaStatus) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		final int rows = jdbcTemplate.update(
				sql,
				new Object[]
				{ empl.getID(), empl.getEmployeeName(), empl.getDoj(), empl.getRole(), empl.getDesignation(), empl.getLocation(),
						empl.getProject(), empl.getPragitiExperience(), empl.getPreviousExperience(), empl.getAvailableDate(),
						empl.getNewProject(), empl.getNewProjectStartDate(), empl.getVisaStatus() });

		if (rows == 1)
		{
			return "Entry created successfully";
		}
		else
		{
			return "Unable to create Entry";
		}

	}

	//Update
	/**
	 * @param empl
	 * @return Entries updated - message
	 */
	public String updateEmployee(final EmployeeModel empl)
	{
		final String sql = "UPDATE emp SET EmployeeName = ?, DOJ= ?, Role=?, Designation=?, Location=?, Project=?, PragitiExperience=?, "
				+ "PreviousExperience=?, AvailableDate=?, NewProject=?, NewProjectStartDate=?, VisaStatus=? WHERE ID=?";

		final int rows = jdbcTemplate.update(
				sql,
				new Object[]
				{ empl.getEmployeeName(), empl.getDoj(), empl.getRole(), empl.getDesignation(), empl.getLocation(),
						empl.getProject(), empl.getPragitiExperience(), empl.getPreviousExperience(), empl.getAvailableDate(),
						empl.getNewProject(), empl.getNewProjectStartDate(), empl.getVisaStatus(), empl.getID() });
		if (rows == 0)
		{
			return "Could not find entries to update";
		}
		else
		{
			return "Updated " + rows + " entries";
		}

	}


	//Create or Update
	/**
	 * @param empl
	 * @return Entries Created or Updated
	 */
	public String createOrUpdateEmployee(final EmployeeModel empl)
	{
		String msg;
		final int paramId = empl.getID();
		if (getEmployeeById(paramId) == null)
		{
			msg = createEmployee(empl);
		}
		else
		{
			msg = updateEmployee(empl);

		}
		return msg;

	}

	//Generate New ID

	/**
	 * @return Generate a new Id for entry
	 */
	public int generateId()
	{
		final String sql = "SELECT max(ID) FROM emp";
		int genId = jdbcTemplate.queryForObject(sql, Integer.class);
		return ++genId;
	}
	//Delete

}
