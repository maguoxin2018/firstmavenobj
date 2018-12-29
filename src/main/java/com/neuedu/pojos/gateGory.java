package com.neuedu.pojos;

import java.io.Serializable;

public class gateGory implements Serializable {
    private int shop_gate_id;
    private String gate_name;
    private int gate_parent_id;

    public gateGory(int shop_gate_id, String gate_name, int gate_parent_id) {
        this.shop_gate_id = shop_gate_id;
        this.gate_name = gate_name;
        this.gate_parent_id = gate_parent_id;
    }

    public int getShop_gate_id() {
        return shop_gate_id;
    }

    public void setShop_gate_id(int shop_gate_id) {
        this.shop_gate_id = shop_gate_id;
    }

    public String getGate_name() {
        return gate_name;
    }

    public void setGate_name(String gate_name) {
        this.gate_name = gate_name;
    }

    public int getGate_parent_id() {
        return gate_parent_id;
    }

    public void setGate_parent_id(int gate_parent_id) {
        this.gate_parent_id = gate_parent_id;
    }

    @Override
    public String toString() {
        return "gateGory{" +
                "shop_gate_id=" + shop_gate_id +
                ", gate_name='" + gate_name + '\'' +
                ", gate_parent_id=" + gate_parent_id +
                '}';
    }
}
