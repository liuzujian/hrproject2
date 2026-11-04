package org.lzj.hrsys_lzj49.service;

import org.lzj.hrsys_lzj49.entity.Department;
import java.util.List;

public interface DepartmentService {
    List<Department> search();

    Department searchById(Integer id);

    boolean add(Department dep);

    boolean update(Department dep);

    boolean delete(Integer id);
}
