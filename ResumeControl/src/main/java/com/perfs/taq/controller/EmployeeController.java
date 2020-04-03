package com.perfs.taq.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.perfs.taq.model.Employee;
import com.perfs.taq.service.EmployeeService;



@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	
	@RequestMapping("/addemp")
	public ModelAndView newContact(ModelAndView model) {
		System.out.println("Reister");
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("profile");
		return model;
	}
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		if (employee.getEmpid() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			empservice.addEmployee(employee);
		} else {
			System.out.println("no id");
		}
		return new ModelAndView("redirect:/");
	}
	 @RequestMapping(value = "/viewallemp")
	    public ModelAndView listEmployee(ModelAndView model) throws IOException {
	        List<Employee> listEmployee = empservice.viewAll();
	        model.addObject("listEmployee", listEmployee);
	        model.setViewName("viewall");
	        return model;
	 }

}
