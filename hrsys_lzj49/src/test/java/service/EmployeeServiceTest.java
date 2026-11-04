package org.lzj.hrsys_lzj49.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.lzj.hrsys_lzj49.entity.Employee;

import java.util.List;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void searchTest() {
        Employee condition = new Employee();
        condition.setName("张");
        List<Employee> list = employeeService.search(condition);
        System.out.println("员工查询结果：");
        list.forEach(System.out::println);
    }

    @Test
    void searchByIdTest() {
        Employee emp = employeeService.searchById(2);
        System.out.println("根据ID查询员工：" + emp);
    }

    @Test
    void addTest() {
        Employee emp = new Employee();
        emp.setNumber("10006");
        emp.setName("李四");
        emp.setGender("男");
        emp.setAge(28);
        emp.setDepId(3);
        boolean result = employeeService.add(emp);
        System.out.println("新增员工结果：" + result);
    }

    @Test
    void updateTest() {
        Employee emp = new Employee();
        emp.setId(5); // 假设数据库中存在id=5
        emp.setNumber("10005");
        emp.setName("王五修改版");
        emp.setGender("女");
        emp.setAge(30);
        emp.setDepId(2);
        boolean result = employeeService.update(emp);
        System.out.println("更新员工结果：" + result);
    }

    @Test
    void deleteTest() {
        boolean result = employeeService.delete(5); // 假设删除id=5
        System.out.println("删除员工结果：" + result);
    }
}
