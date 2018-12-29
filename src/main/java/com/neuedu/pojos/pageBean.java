package com.neuedu.pojos;

import java.io.Serializable;
import java.util.List;

public class pageBean implements Serializable {
    private Integer pageNum;
    private Integer pageSize;
    private Integer allRecods;
    private Integer startPage;
    private Integer endPage;
    private Integer allPages;
    private Integer startindex;
    private List<Shops> shops;
    private List<gateGory> gateGories;



    public pageBean(){

    }
    public pageBean(int pageNum, int pageSize, int allRecods){
        this.allRecods=allRecods;
        this.pageNum=pageNum;
        this.pageSize=pageSize;
        if (allRecods%pageSize==0){
            this.allPages=allRecods/pageSize;
        }else{
            this.allPages=allRecods/pageSize+1;
        }
        this.startindex = (pageNum-1)*pageSize;
        this.startPage=1;
        this.endPage = 5;
        if (allPages<= 5 ){
            this.startPage = 1;
            this.endPage = this.allPages;
        }else{
            this.startPage = this.pageNum-2;
            this.endPage = this.pageNum+2;
            if (startPage<=0){
                this.startPage = 1;
                this.endPage = 5;
            }
            if (endPage>=allPages){
                this.startPage = endPage-4;
                this.endPage = this.allPages;
            }
        }
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getAllRecods() {
        return allRecods;
    }

    public void setAllRecods(Integer allRecods) {
        this.allRecods = allRecods;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    public Integer getAllPages() {
        return allPages;
    }

    public void setAllPages(Integer allPages) {
        this.allPages = allPages;
    }

    public Integer getStartindex() {
        return startindex;
    }

    public void setStartindex(Integer startindex) {
        this.startindex = startindex;
    }

    public List<Shops> getShops() {
        return shops;
    }

    public void setShops(List<Shops> shops) {
        this.shops = shops;
    }

    public List<gateGory> getGateGories() {
        return gateGories;
    }

    public void setGateGories(List<gateGory> gateGories) {
        this.gateGories = gateGories;
    }

    @Override
    public String toString() {
        return "pageBean{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", allRecods=" + allRecods +
                ", startPage=" + startPage +
                ", endPage=" + endPage +
                ", allPages=" + allPages +
                ", startindex=" + startindex +
                ", shops=" + shops +
                ", gateGories=" + gateGories +
                '}';
    }
}
