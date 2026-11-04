-- ============================================================
-- 人事管理系统数据库初始化脚本
-- 数据库：hrsys1
-- 说明：employee.dep_id 外键关联 department.id，
--       建表顺序必须先 department 后 employee，删表顺序相反。
-- ============================================================

CREATE DATABASE IF NOT EXISTS `hrsys1` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `hrsys1`;

-- 先删子表，再删主表，避免外键约束报错
DROP TABLE IF EXISTS `employee`;
DROP TABLE IF EXISTS `department`;

-- ------------------------------------------------------------
-- 部门表
-- ------------------------------------------------------------
CREATE TABLE `department` (
    `id`     int(11) NOT NULL AUTO_INCREMENT COMMENT '部门ID，主键',
    `name`   varchar(50) NOT NULL COMMENT '部门名称',
    `number` int(11) NOT NULL COMMENT '部门编号',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_department_number` (`number`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT ='部门表';

-- ------------------------------------------------------------
-- 员工表
-- ------------------------------------------------------------
CREATE TABLE `employee` (
    `id`     int(11) NOT NULL AUTO_INCREMENT COMMENT '员工ID，主键',
    `number` varchar(20)  DEFAULT NULL COMMENT '员工编号',
    `name`   varchar(50)  NOT NULL COMMENT '员工姓名',
    `gender` varchar(10)  DEFAULT NULL COMMENT '员工性别',
    `age`    int(11)      DEFAULT NULL COMMENT '员工年龄',
    `dep_id` int(11)      DEFAULT NULL COMMENT '所属部门ID',
    PRIMARY KEY (`id`),
    KEY `idx_employee_name` (`name`),
    KEY `idx_employee_dep` (`dep_id`),
    CONSTRAINT `fk_employee_department` FOREIGN KEY (`dep_id`) REFERENCES `department` (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT ='员工信息表';

-- ------------------------------------------------------------
-- 测试数据
-- ------------------------------------------------------------
INSERT INTO `department` (`name`, `number`)
VALUES ('技术部', 1001),
       ('产品部', 1002),
       ('人事部', 1003),
       ('财务部', 1004);

INSERT INTO `employee` (`number`, `name`, `gender`, `age`, `dep_id`)
VALUES ('E001', '张三', '男', 28, 1),
       ('E002', '李四', '女', 26, 1),
       ('E003', '王五', '男', 30, 2),
       ('E004', '赵六', '女', 24, 3),
       ('E005', '钱七', '男', 32, 4),
       ('E006', '孙八', '女', 27, 3),
       ('E007', '周九', '男', 29, 4),
       ('E008', '吴十', '女', 25, 1);
