package org.lzj.hrsys_lzj49.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.lzj.hrsys_lzj49.entity.Department;
import org.lzj.hrsys_lzj49.HrsysLzj49Application; // ✅ 添加这一行，明确主启动类路径

@SpringBootTest(classes = HrsysLzj49Application.class) // ✅ 指定主配置类
public class DepartmentDaoTest {

    @Autowired
    private DepartmentDao departmentDao;

    @Test
    void searchTest() {
        System.out.println("查询部门：" + departmentDao.search());
        System.out.println("根据ID查询部门：" + departmentDao.searchById(2));
    }

    @Test
    void insertTest() {
        Department department = new Department();
        department.setName("市场部");
        department.setNumber(106);
        System.out.println("新增部门：" + departmentDao.add(department));
    }

    @Test
    void updateTest() {
        Department department = new Department();
        department.setId(5);
        department.setName("测试部22");
        department.setNumber(122);
        System.out.println("更新部门：" + departmentDao.update(department));
    }

    @Test
    void deleteTest() {
        System.out.println("删除部门：" + departmentDao.delete(5));
    }
}
