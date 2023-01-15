package com.osukatech.adminDashboard.DTO;

public class CustomerDTO {
    private int customerid;
    private  String customername;
    private int mobile;

    public CustomerDTO(int customerid, String customername, int mobile) {
        this.customerid = customerid;
        this.customername = customername;
        this.mobile = mobile;
    }

    public CustomerDTO() {
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
