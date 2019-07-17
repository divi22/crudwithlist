package service;

import java.util.List;

import bean.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	public List<Employee> getEmployees();
	public void updateEmployee(Integer empId,String city);
	public void deleteEmployee(Integer empId);
}
