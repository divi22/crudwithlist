package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	List<Employee> employeeList = new ArrayList();
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		employeeList.add(employee);
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeList;
	}

	@Override
	public void updateEmployee(Integer empId, String city) {
		// TODO Auto-generated method stub
		
		for(Employee emp: employeeList) {
			if(emp.getEmpId().equals(empId))
				emp.setCity(city);
		}
		
	}

	@Override
	public void deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		for(Employee emp: employeeList) {
			if(emp.getEmpId().equals(empId))
				employeeList.remove(emp);
		}
		
	}

}
