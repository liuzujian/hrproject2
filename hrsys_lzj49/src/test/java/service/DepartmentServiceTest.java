package org.lzj.hrsys_lzj49.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.lzj.hrsys_lzj49.entity.Department;

import java.util.List;

@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @Test
    void searchTest() {
        List<Department> list = departmentService.search();
        System.out.println("部门查询结果：");
        list.forEach(System.out::println);
    }

    @Test
    void searchByIdTest() {
        Department dep = departmentService.searchById(1); // 假设数据库有id=1
        System.out.println("根据ID查询部门：" + dep);
    }

    @Test
    void addTest() {
        Department dep = new Department();
        dep.setNumber(108);
        dep.setName("新部门");
        boolean result = departmentService.add(dep);
        System.out.println("新增部门结果：" + result);
    }

    @Test
    void updateTest() {
        Department dep = new Department();
        dep.setId(1);
        dep.setNumber(101);
        dep.setName("更新后的开发部");
        boolean result = departmentService.update(dep);
        System.out.println("更新部门结果：" + result);
    }

    @Test
    void deleteTest() {
        boolean result = departmentService.delete(2); // 假设删除id=2
        System.out.println("删除部门结果：" + result);
    }
}
