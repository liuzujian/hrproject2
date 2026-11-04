package org.lzj.hrsys_lzj49.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.lzj.hrsys_lzj49.entity.Employee;
import org.lzj.hrsys_lzj49.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "员工管理接口") // ✅ 替代 @Api
@CrossOrigin
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Operation(summary = "查询员工（可按姓名模糊查）")
    @GetMapping("/search")
    public List<Employee> search(
            @Parameter(description = "查询条件（支持按姓名模糊查询）") Employee condition) {
        return employeeService.search(condition);
    }

    @Operation(summary = "根据ID查询单个员工")
    @GetMapping("/{id:\\d+}")
    public Employee searchById(
            @Parameter(description = "员工ID") @PathVariable Integer id) {
        return employeeService.searchById(id);
    }

    @Operation(summary = "新增员工")
    @PostMapping("/add")
    public String add(
            @Parameter(description = "员工对象") @RequestBody Employee emp) {
        boolean result = employeeService.add(emp);
        return result ? "新增成功" : "新增失败";
    }

    @Operation(summary = "修改员工信息")
    @PutMapping("/update")
    public String update(
            @Parameter(description = "员工对象（必须包含ID）") @RequestBody Employee emp) {
        boolean result = employeeService.update(emp);
        return result ? "修改成功" : "修改失败";
    }

    @Operation(summary = "根据ID删除员工")
    @DeleteMapping("/delete/{id}")
    public String delete(
            @Parameter(description = "员工ID") @PathVariable Integer id) {
        boolean result = employeeService.delete(id);
        return result ? "删除成功" : "删除失败";
    }
}
