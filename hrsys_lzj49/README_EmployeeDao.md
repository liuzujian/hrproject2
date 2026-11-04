# EmployeeDao 使用说明

## 项目概述

本项目使用 MyBatis 框架创建了完整的员工数据访问层（DAO），包括实体类、接口、XML 映射文件和单元测试。

## 文件结构

```
hrsys_lzj49/
├── src/main/java/org/lzj/hrsys_lzj49/
│   ├── entity/
│   │   └── Employee.java                 # 员工实体类
│   └── dao/
│       └── EmployeeDao.java              # 员工数据访问接口
├── src/main/resources/
│   ├── mapper/
│   │   └── EmployeeMapper.xml            # MyBatis映射文件
│   └── sql/
│       └── employee_table.sql            # 数据库表创建脚本
├── src/test/java/org/lzj/hrsys_lzj49/dao/
│   └── EmployeeDaoTest.java              # 单元测试类
└── src/test/resources/
    └── application-test.properties       # 测试配置文件
```

## 功能特性

### 1. Employee 实体类

- **功能描述**：映射数据库中的员工信息
- **主要属性**：
  - `id`: 员工 ID（主键）
  - `name`: 员工姓名
  - `gender`: 员工性别
  - `age`: 员工年龄
  - `department`: 员工部门
  - `position`: 员工职位
  - `salary`: 员工薪资
  - `hireDate`: 入职时间
  - `email`: 员工邮箱
  - `phone`: 员工电话
  - `createTime`: 创建时间
  - `updateTime`: 更新时间

### 2. EmployeeDao 接口

- **功能描述**：定义员工相关的数据库操作方法
- **主要方法**：
  - `findAllEmployees()`: 查询所有员工信息
  - `findEmployeeById(Integer id)`: 根据 ID 查询员工
  - `findEmployeesByName(String name)`: 根据姓名模糊查询员工
  - `findEmployeesByDepartment(String department)`: 根据部门查询员工
  - `insertEmployee(Employee employee)`: 添加新员工
  - `updateEmployee(Employee employee)`: 更新员工信息
  - `deleteEmployeeById(Integer id)`: 根据 ID 删除员工
  - `countEmployees()`: 统计员工总数

### 3. EmployeeMapper.xml

- **功能描述**：定义 SQL 语句，与 EmployeeDao 接口方法进行绑定
- **特性**：
  - 使用 ResultMap 进行结果映射
  - 支持动态 SQL
  - 包含完整的 CRUD 操作
  - 支持模糊查询和条件查询

### 4. 单元测试

- **功能描述**：测试 EmployeeDao 的各种功能
- **测试覆盖**：
  - 查询所有员工
  - 根据 ID 查询员工
  - 根据姓名查询员工
  - 根据部门查询员工
  - 添加员工
  - 更新员工
  - 删除员工
  - 统计员工总数
  - 完整功能综合测试

## 使用方法

### 1. 数据库准备

```sql
-- 执行sql/employee_table.sql脚本创建表和测试数据
source src/main/resources/sql/employee_table.sql;
```

### 2. 配置检查

确保`application.properties`中包含正确的 MyBatis 配置：

```properties
# MyBatis 配置
mybatis.mapper-locations=classpath:mapper/*.xml
mybatis.type-aliases-package=org.lzj.hrsys_lzj49.entity
mybatis.configuration.map-underscore-to-camel-case=true
mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl
```

### 3. 运行测试

```bash
# 在hrsys_lzj49目录下运行
mvn test -Dtest=EmployeeDaoTest
```

### 4. 在代码中使用

```java
@Autowired
private EmployeeDao employeeDao;

// 查询所有员工
List<Employee> employees = employeeDao.findAllEmployees();

// 根据ID查询员工
Employee employee = employeeDao.findEmployeeById(1);

// 添加新员工
Employee newEmployee = new Employee();
newEmployee.setName("新员工");
newEmployee.setDepartment("技术部");
// ... 设置其他属性
int result = employeeDao.insertEmployee(newEmployee);
```

## 技术特点

1. **MyBatis 集成**：使用@Mapper 注解和 XML 映射文件
2. **结果映射**：使用 ResultMap 处理数据库字段与 Java 对象属性的映射
3. **动态 SQL**：支持条件查询和动态更新
4. **测试覆盖**：完整的单元测试覆盖所有功能
5. **配置优化**：自动驼峰命名转换和 SQL 日志输出
6. **事务支持**：通过 Spring Boot 自动配置支持事务管理

## 注意事项

1. 确保数据库连接配置正确
2. 运行前需要先创建数据库表
3. 测试时使用独立的测试配置
4. 生产环境中建议关闭 SQL 日志输出
5. 根据实际需求调整实体类属性和 SQL 语句

## 扩展建议

1. 添加分页查询功能
2. 实现批量操作
3. 添加缓存支持
4. 实现软删除功能
5. 添加数据验证和异常处理

