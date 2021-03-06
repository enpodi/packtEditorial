package org.packt.spring.boot.dao;

import java.util.List;

import org.packt.spring.boot.model.data.Employee;

public interface EmployeeDao {
	
	public List<Employee> getEmployees();
	public List<Employee> getEmployeeDept(Integer empId);
	public Employee getEmployee(Integer id);
	public void addEmployeeBySJI(Employee emp);
	public void addEmployeeByJT(Employee emp);
	public void updateEmployee(Employee emp);
	public void delEmployee(Integer empId);

}
