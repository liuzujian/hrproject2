package org.lzj.hrsys_lzj49.service.impl;

import org.lzj.hrsys_lzj49.dao.EmployeeDao;
import org.lzj.hrsys_lzj49.entity.Employee;
import org.lzj.hrsys_lzj49.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工模块 Service 层实现类
 * 实现对员工信息的增删改查业务逻辑
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> search(Employee condition) {
        return employeeDao.search(condition);
    }

    @Override
    public Employee searchById(Integer id) {
        return employeeDao.searchById(id);
    }

    @Override
    public boolean add(Employee emp) {
        return employeeDao.add(emp) > 0;
    }

    @Override
    public boolean update(Employee emp) {
        return employeeDao.update(emp) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return employeeDao.delete(id) > 0;
    }
}
