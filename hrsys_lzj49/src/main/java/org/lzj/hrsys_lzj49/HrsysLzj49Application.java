package org.lzj.hrsys_lzj49;  // ✅ 根包路径正确

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;  // ✅ 正确导入路径

@SpringBootApplication  // ✅ 声明为Spring Boot主应用
@MapperScan("org.lzj.hrsys_lzj49.dao")  // ✅ 精确扫描DAO接口
public class HrsysLzj49Application {
    public static void main(String[] args) {
        SpringApplication.run(HrsysLzj49Application.class, args);
    }
}