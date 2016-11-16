/**
 *
 */
package com.mvc.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


/**
 *
 */
public class EmployeeModel
{
	private int ID;
	private String employeeName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date doj;
	private String role;
	private String designation;
	private String location;
	private String project;
	private float pragitiExperience;
	private float previousExperience;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date availableDate;
	private String newProject;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date newProjectStartDate;
	private String visaStatus;

	/**
	 * @return the iD
	 */
	public int getID()
	{
		return ID;
	}

	/**
	 * @param iD
	 *           the iD to set
	 */
	public void setID(final int iD)
	{
		ID = iD;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName()
	{
		return employeeName;
	}

	/**
	 * @param employeeName
	 *           the employeeName to set
	 */
	public void setEmployeeName(final String employeeName)
	{
		this.employeeName = employeeName;
	}

	/**
	 * @return the doj
	 */
	public Date getDoj()
	{
		return doj;
	}

	/**
	 * @param doj
	 *           the doj to set
	 */
	public void setDoj(final Date doj)
	{
		this.doj = doj;
	}

	/**
	 * @return the role
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * @param role
	 *           the role to set
	 */
	public void setRole(final String role)
	{
		this.role = role;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation()
	{
		return designation;
	}

	/**
	 * @param designation
	 *           the designation to set
	 */
	public void setDesignation(final String designation)
	{
		this.designation = designation;
	}

	/**
	 * @return the location
	 */
	public String getLocation()
	{
		return location;
	}

	/**
	 * @param location
	 *           the location to set
	 */
	public void setLocation(final String location)
	{
		this.location = location;
	}

	/**
	 * @return the project
	 */
	public String getProject()
	{
		return project;
	}

	/**
	 * @param project
	 *           the project to set
	 */
	public void setProject(final String project)
	{
		this.project = project;
	}

	/**
	 * @return the pragitiExperience
	 */
	public float getPragitiExperience()
	{
		return pragitiExperience;
	}

	/**
	 * @param pragitiExperience
	 *           the pragitiExperience to set
	 */
	public void setPragitiExperience(final float pragitiExperience)
	{
		this.pragitiExperience = pragitiExperience;
	}

	/**
	 * @return the previousExperience
	 */
	public float getPreviousExperience()
	{
		return previousExperience;
	}

	/**
	 * @param previousExperience
	 *           the previousExperience to set
	 */
	public void setPreviousExperience(final float previousExperience)
	{
		this.previousExperience = previousExperience;
	}

	/**
	 * @return the availableDate
	 */
	public Date getAvailableDate()
	{
		return availableDate;
	}

	/**
	 * @param availableDate
	 *           the availableDate to set
	 */
	public void setAvailableDate(final Date availableDate)
	{
		this.availableDate = availableDate;
	}

	/**
	 * @return the newProject
	 */
	public String getNewProject()
	{
		return newProject;
	}

	/**
	 * @param newProject
	 *           the newProject to set
	 */
	public void setNewProject(final String newProject)
	{
		this.newProject = newProject;
	}

	/**
	 * @return the newProjectStartDate
	 */
	public Date getNewProjectStartDate()
	{
		return newProjectStartDate;
	}

	/**
	 * @param newProjectStartDate
	 *           the newProjectStartDate to set
	 */
	public void setNewProjectStartDate(final Date newProjectStartDate)
	{
		this.newProjectStartDate = newProjectStartDate;
	}

	/**
	 * @return the visaStatus
	 */
	public String getVisaStatus()
	{
		return visaStatus;
	}

	/**
	 * @param visaStatus
	 *           the visaStatus to set
	 */
	public void setVisaStatus(final String visaStatus)
	{
		this.visaStatus = visaStatus;
	}


}
