package org.lzj.hrsys_lzj49.dao;  // ✅ 正确包路径

import org.lzj.hrsys_lzj49.entity.Department;  // ✅ 正确导入
import java.util.List;  // ✅ 标准库导入

public interface DepartmentDao {
    //    查询所有部门
    public List<Department> search();
    //    根据ID查询哪个部门
    public  Department searchById(int id);
    //    新增部门
    public int add(Department dep);
    //    更新部门
    public int update(Department dep);
    //    删除部门
    public int delete(int id);


}