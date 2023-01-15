package com.osukatech.adminDashboard.DTO;

public class CustomerSaveDTO {
    //  New customer added

    private  String customername;
    private int mobile;

    public CustomerSaveDTO( String customername, int mobile) {

        this.customername = customername;
        this.mobile = mobile;
    }

    public CustomerSaveDTO() {
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
                ", customername='" + customername + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
