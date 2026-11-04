package org.lzj.hrsys_lzj49.dao;

import org.junit.jupiter.api.Test;
import org.lzj.hrsys_lzj49.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EmployeeDaoTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSearch() {
        // 构建查询条件
        Employee condition = new Employee();
        condition.setName("刘");
        condition.setGender("男");

        // 执行查询
        List<Employee> result = employeeDao.search(condition);


        System.out.println("=== 多条件组合查询结果 ===");
        System.out.println("查询条件: name='张', gender='男'");
        System.out.println("匹配员工数量: " + result.size());
        for (Employee e : result) {
            System.out.println(e);
        }
    }
}