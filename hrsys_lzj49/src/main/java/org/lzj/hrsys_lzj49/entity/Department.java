package org.lzj.hrsys_lzj49.entity;

/**
 * 部门实体
 */
public class Department {

    /** 部门ID */
    private Integer id;

    /** 部门名称 */
    private String name;

    /** 部门编号 */
    private Integer number;

    public Department() {
    }

    public Department(Integer id, String name, Integer number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}

