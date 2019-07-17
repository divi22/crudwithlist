package service;

import java.util.List;

import bean.Employee;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao dao = new EmployeeDaoImpl();
	@Override
	public void addEmployee(Employee employee) {
		
		//validate employee details
		
		dao.addEmployee(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		
		return dao.getEmployees();
		
	}

	@Override
	public void updateEmployee(Integer empId, String city) {
		// TODO Auto-generated method stub
		dao.updateEmployee(empId, city);
	}

	@Override
	public void deleteEmployee(Integer empId) {
		dao.deleteEmployee(empId);
		
	}

}
