package org.lzj.hrsys_lzj49.service;

import org.lzj.hrsys_lzj49.entity.Employee;
import java.util.List;

/**
 * 员工模块 Service 层接口
 * 定义员工信息的业务逻辑方法
 */
public interface EmployeeService {

    // 按条件查询员工列表
    List<Employee> search(Employee condition);

    // 根据ID查询单个员工
    Employee searchById(Integer id);

    // 新增员工
    boolean add(Employee emp);

    // 更新员工信息
    boolean update(Employee emp);

    // 删除员工
    boolean delete(Integer id);
}
