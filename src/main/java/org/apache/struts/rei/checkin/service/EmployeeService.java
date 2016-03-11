package org.apache.struts.rei.checkin.service;

import org.apache.struts.rei.checkin.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List getAllEmployees();

    public void updateEmployee(Employee emp);

    public void deleteEmployee(Integer id);

    public Employee getEmployee(Integer id);

    public void insertEmployee(Employee emp);

}
