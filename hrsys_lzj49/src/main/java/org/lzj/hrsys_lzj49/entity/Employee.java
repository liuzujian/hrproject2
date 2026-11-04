package org.lzj.hrsys_lzj49.entity;

/**
 * 员工实体类
 * 用于映射数据库中的员工信息
 * 对应hrsys1数据库中的employee表
 */
public class Employee {

    /** 员工ID */
    private Integer id;

    /** 员工编号 */
    private String number;

    /** 员工姓名 */
    private String name;

    /** 员工性别 */
    private String gender;

    /** 员工年龄 */
    private Integer age;

    /** 部门ID */
    private Integer depId;

    /** 部门对象（关联查询用） */
    private Department dep;

    // 无参构造函数
    public Employee() {
    }

    // 全参构造函数
    public Employee(Integer id, String number, String name, String gender, Integer age, Integer depId) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.depId = depId;
    }

    // Getter和Setter方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", depId=" + depId +
                ", dep=" + dep +
                '}';
    }
}
