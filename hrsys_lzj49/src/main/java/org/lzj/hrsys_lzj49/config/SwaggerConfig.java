package org.lzj.hrsys_lzj49.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger 配置类（Springdoc 3.x 用法）
 * 访问地址：http://localhost:8080/swagger-ui/index.html
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("人事管理系统 API 文档") // 文档标题
                        .version("v1.0.0") // 版本号
                        .description("本项目为员工与部门模块的 RESTful 接口示例，包含基础的增删改查功能。") // 简介
                        .contact(new Contact()
                                .name("刘祖健") // 作者
                                .email("2845648726@qq.com") // 可改成你真实邮箱
                                .url("https://github.com/liu-zujian")) // 可选
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")));
    }
}
