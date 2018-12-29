package com.neuedu.pojos;

import java.io.Serializable;

public class Boys implements Serializable {
    private Integer id;
    private String boyname;
    private Integer usercp;
    public Boys(){}
    public Boys(Integer id, String boyname, Integer usercp) {
        this.id = id;
        this.boyname = boyname;
        this.usercp = usercp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoyname() {
        return boyname;
    }

    public void setBoyname(String boyname) {
        this.boyname = boyname;
    }

    public Integer getUsercp() {
        return usercp;
    }

    public void setUsercp(Integer usercp) {
        this.usercp = usercp;
    }

    @Override
    public String toString() {
        return "Boys{" +
                "id=" + id +
                ", boyname='" + boyname + '\'' +
                ", usercp=" + usercp +
                '}';
    }
}
