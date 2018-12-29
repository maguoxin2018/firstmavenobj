package com.neuedu.pojos;

import java.io.Serializable;
import java.math.BigDecimal;

public class Shops implements Serializable {
    private int shop_id;
    private String shop_name;
    private String shop_des;
    private String shop_img;
    private BigDecimal shop_price;
    private int shop_gate_id;
    private int shop_stock;
    private int shop_isgc;


    public Shops() {
    }

    @Override
    public String toString() {
        return "Shops{" +
                "shop_id=" + shop_id +
                ", shop_name='" + shop_name + '\'' +
                ", shop_des='" + shop_des + '\'' +
                ", shop_img='" + shop_img + '\'' +
                ", shop_price=" + shop_price +
                ", shop_gate_id=" + shop_gate_id +
                ", shop_stock=" + shop_stock +
                ", shop_isgc=" + shop_isgc +
                '}';
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_des() {
        return shop_des;
    }

    public void setShop_des(String shop_des) {
        this.shop_des = shop_des;
    }

    public String getShop_img() {
        return shop_img;
    }

    public void setShop_img(String shop_img) {
        this.shop_img = shop_img;
    }

    public BigDecimal getShop_price() {
        return shop_price;
    }

    public void setShop_price(BigDecimal shop_price) {
        this.shop_price = shop_price;
    }

    public int getShop_gate_id() {
        return shop_gate_id;
    }

    public void setShop_gate_id(int shop_gate_id) {
        this.shop_gate_id = shop_gate_id;
    }

    public int getShop_stock() {
        return shop_stock;
    }

    public void setShop_stock(int shop_stock) {
        this.shop_stock = shop_stock;
    }

    public int getShop_isgc() {
        return shop_isgc;
    }

    public void setShop_isgc(int shop_isgc) {
        this.shop_isgc = shop_isgc;
    }

    public Shops(int shop_id, String shop_name, String shop_des, String shop_img, BigDecimal shop_price, int shop_gate_id, int shop_stock, int shop_isgc) {
        this.shop_id = shop_id;
        this.shop_name = shop_name;
        this.shop_des = shop_des;
        this.shop_img = shop_img;
        this.shop_price = shop_price;
        this.shop_gate_id = shop_gate_id;
        this.shop_stock = shop_stock;
        this.shop_isgc = shop_isgc;
    }
}
