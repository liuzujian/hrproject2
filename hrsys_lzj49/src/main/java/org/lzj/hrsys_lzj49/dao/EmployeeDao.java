package org.lzj.hrsys_lzj49.dao;


import org.apache.ibatis.annotations.Mapper;
import org.lzj.hrsys_lzj49.entity.Employee;
import java.util.List;


@Mapper
public interface EmployeeDao {

    // 多条件组合查询（重点！）
    List<Employee> search(Employee condition);

    // 根据ID查询员工
    Employee searchById(int id);

    // 添加员工
    int add(Employee emp);

    // 更新员工
    int update(Employee emp);

    // 删除员工
    int delete(int id);

    // 批量更新部门下的所有员工
    int updateByDep(int depId);
}