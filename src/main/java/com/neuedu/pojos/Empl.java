package com.neuedu.pojos;

import java.io.Serializable;
import java.util.List;

public class Empl implements Serializable {
    private Integer employee_id;
    private String name;
    private Integer manager_id;
    private List<Empl> empls;

    public Empl() {
    }

    public Empl(Integer employee_id, String name, Integer manager_id, List<Empl> empls) {
        this.employee_id = employee_id;
        this.name = name;
        this.manager_id = manager_id;
        this.empls = empls;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public List<Empl> getEmpls() {
        return empls;
    }

    public void setEmpls(List<Empl> empls) {
        this.empls = empls;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", manager_id=" + manager_id +
                ", empls=" + empls +
                '}';
    }
}
