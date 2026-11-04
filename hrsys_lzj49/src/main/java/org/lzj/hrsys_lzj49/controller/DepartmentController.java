package org.lzj.hrsys_lzj49.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.lzj.hrsys_lzj49.entity.Department;
import org.lzj.hrsys_lzj49.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "部门管理接口") // ✅ Swagger 文档显示的模块名称
@CrossOrigin
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Operation(summary = "查询所有部门")
    @GetMapping("/search")
    public List<Department> search() {
        return departmentService.search();
    }

    @Operation(summary = "根据ID查询部门")
    @GetMapping("/{id}")
    public Department searchById(
            @Parameter(description = "部门ID") @PathVariable Integer id) {
        return departmentService.searchById(id);
    }

    @Operation(summary = "新增部门")
    @PostMapping("/add")
    public String add(
            @Parameter(description = "部门对象") @RequestBody Department dep) {
        boolean result = departmentService.add(dep);
        return result ? "新增成功" : "新增失败";
    }

    @Operation(summary = "修改部门信息")
    @PutMapping("/update")
    public String update(
            @Parameter(description = "部门对象（必须包含ID）") @RequestBody Department dep) {
        boolean result = departmentService.update(dep);
        return result ? "修改成功" : "修改失败";
    }

    @Operation(summary = "删除部门")
    @DeleteMapping("/delete/{id}")
    public String delete(
            @Parameter(description = "部门ID") @PathVariable Integer id) {
        boolean result = departmentService.delete(id);
        return result ? "删除成功" : "删除失败";
    }
}
