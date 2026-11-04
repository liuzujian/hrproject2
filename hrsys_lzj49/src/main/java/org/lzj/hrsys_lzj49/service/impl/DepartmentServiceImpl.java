package org.lzj.hrsys_lzj49.service.impl;

import org.lzj.hrsys_lzj49.dao.DepartmentDao;
import org.lzj.hrsys_lzj49.entity.Department;
import org.lzj.hrsys_lzj49.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门模块 Service 层实现类
 * 实现对部门信息的增删改查业务逻辑
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<Department> search() {
        return departmentDao.search();  // 无参查询所有部门
    }

    @Override
    public Department searchById(Integer id) {
        return departmentDao.searchById(id);
    }

    @Override
    public boolean add(Department dep) {
        return departmentDao.add(dep) > 0;
    }

    @Override
    public boolean update(Department dep) {
        return departmentDao.update(dep) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return departmentDao.delete(id) > 0;
    }
}
