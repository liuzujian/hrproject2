-- 创建员工表的SQL脚本
-- 功能：为人力资源管理系统创建员工信息表

-- 如果表已存在则删除
DROP TABLE IF EXISTS `employee`;

-- 创建员工表
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工ID，主键',
  `name` varchar(50) NOT NULL COMMENT '员工姓名',
  `gender` varchar(10) NOT NULL COMMENT '员工性别',
  `age` int(11) DEFAULT NULL COMMENT '员工年龄',
  `department` varchar(50) NOT NULL COMMENT '员工部门',
  `position` varchar(50) NOT NULL COMMENT '员工职位',
  `salary` decimal(10,2) DEFAULT NULL COMMENT '员工薪资',
  `hire_date` date DEFAULT NULL COMMENT '入职时间',
  `email` varchar(100) DEFAULT NULL COMMENT '员工邮箱',
  `phone` varchar(20) DEFAULT NULL COMMENT '员工电话',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`),
  KEY `idx_department` (`department`),
  KEY `idx_hire_date` (`hire_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工信息表';

-- 插入测试数据
INSERT INTO `employee` (`name`, `gender`, `age`, `department`, `position`, `salary`, `hire_date`, `email`, `phone`) VALUES
('张三', '男', 28, '技术部', 'Java开发工程师', 12000.00, '2023-01-15', 'zhangsan@company.com', '13800138001'),
('李四', '女', 26, '技术部', '前端开发工程师', 11000.00, '2023-02-20', 'lisi@company.com', '13800138002'),
('王五', '男', 30, '产品部', '产品经理', 15000.00, '2022-12-10', 'wangwu@company.com', '13800138003'),
('赵六', '女', 24, '设计部', 'UI设计师', 9000.00, '2023-03-05', 'zhaoliu@company.com', '13800138004'),
('钱七', '男', 32, '销售部', '销售经理', 13000.00, '2022-11-20', 'qianqi@company.com', '13800138005'),
('孙八', '女', 27, '人事部', '人事专员', 8000.00, '2023-04-10', 'sunba@company.com', '13800138006'),
('周九', '男', 29, '财务部', '会计师', 10000.00, '2023-01-25', 'zhoujiu@company.com', '13800138007'),
('吴十', '女', 25, '技术部', '测试工程师', 9500.00, '2023-05-15', 'wushi@company.com', '13800138008');

