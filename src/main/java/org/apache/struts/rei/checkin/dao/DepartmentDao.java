package org.apache.struts.rei.checkin.dao;

import org.apache.struts.rei.checkin.model.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentDao {

    public List<Department> getAllDepartments();

    public Map<Integer, Department> getDepartmentsMap();

}
