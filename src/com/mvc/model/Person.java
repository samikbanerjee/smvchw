package com.mvc.model;

/**
 *
 */
public class Person
{
	private String fName;
	private String lName;

	/**
	 * @param fName
	 * @param lName
	 */
	public Person(final String fName, final String lName)
	{
		setfName(fName);
		setlName(lName);
	}

	/**
	 *
	 */
	public Person()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the fName
	 */
	public String getfName()
	{
		return fName;
	}

	/**
	 * @param fName
	 *           the fName to set
	 */
	public void setfName(final String fName)
	{
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName()
	{
		return lName;
	}

	/**
	 * @param lName
	 *           the lName to set
	 */
	public void setlName(final String lName)
	{
		this.lName = lName;
	}

}
