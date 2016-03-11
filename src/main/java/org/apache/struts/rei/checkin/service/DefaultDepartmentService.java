package org.apache.struts.rei.checkin.service;

import org.apache.struts.rei.checkin.dao.DepartmentDao;
import org.apache.struts.rei.checkin.dao.InMemoryDepartmentDao;

import java.util.List;

public class DefaultDepartmentService implements DepartmentService {

    private DepartmentDao dao;

    public DefaultDepartmentService() {
        this.dao = new InMemoryDepartmentDao();
    }

    public List getAllDepartments() {
        return dao.getAllDepartments();
    }

}
