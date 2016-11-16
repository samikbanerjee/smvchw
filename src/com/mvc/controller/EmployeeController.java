/**
 *
 */
package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mvc.DAO.EmployeeDAO;
import com.mvc.model.EmployeeModel;


/**
 *
 */
@Controller
public class EmployeeController
{


	/**
	 * @param map
	 * @return List of employees page
	 */
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public String displayAllEmployees(final ModelMap map)
	{
		final List<EmployeeModel> employees = employeeDAO.getAllEmployees();
		map.addAttribute("employees", employees);
		return "employeeList";
	}


	/**
	 * @param empl
	 * @param redirectAtt
	 * @return Add or Update Employee
	 */
	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public String createOrUpdateEmployee(@ModelAttribute("empl") final EmployeeModel empl, final RedirectAttributes redirectAtt)
	{
		final String msg = employeeDAO.createOrUpdateEmployee(empl);
		redirectAtt.addFlashAttribute("msg", msg);
		return "redirect:/employees/" + empl.getID();
	}

	/**
	 * @param id
	 * @param map
	 * @return Employee Details Page
	 */
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public String displayEmployeeDetails(@PathVariable("id") final int id, final ModelMap map)
	{
		final EmployeeModel empl = employeeDAO.getEmployeeById(id);
		map.addAttribute("empl", empl);
		return "employeeDetails";
	}



	/**
	 * @param map
	 * @return Employee Form - to add new Employee
	 */
	@RequestMapping(value = "/employees/add", method = RequestMethod.GET)
	public String createEmployee(final ModelMap map)
	{
		final EmployeeModel empl = new EmployeeModel();
		final int genId = employeeDAO.generateId();
		empl.setID(genId);
		map.addAttribute("userAction", "add");
		map.addAttribute("empl", empl);
		return "employeeForm";
	}

	/**
	 * @param id
	 * @param map
	 * @return Employee Form - to update an Employee
	 */
	@RequestMapping(value = "/employees/{id}/update", method = RequestMethod.GET)
	public String updateEmployee(@PathVariable("id") final int id, final ModelMap map)
	{
		final EmployeeModel empl = employeeDAO.getEmployeeById(id);
		map.addAttribute("userAction", "update");
		map.addAttribute("empl", empl);
		return "employeeForm";
	}


	@Autowired
	EmployeeDAO employeeDAO;

	/**
	 * @return the employeeDAO
	 */
	public EmployeeDAO getEmployeeDAO()
	{
		return employeeDAO;
	}

	/**
	 * @param employeeDAO
	 *           the employeeDAO to set
	 */
	public void setEmployeeDAO(final EmployeeDAO employeeDAO)
	{
		this.employeeDAO = employeeDAO;
	}


}
