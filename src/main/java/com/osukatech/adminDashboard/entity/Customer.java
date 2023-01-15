package com.osukatech.adminDashboard.entity;

import jakarta.persistence.*;
@Entity
@Table(name= "customer")
public class Customer {
    //    fields for the customer table
    @Id
    @Column(name = "customer_id", length = 10)
    //   IDs are autogenerated by the server
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;

    @Column(name = "customer_name", length = 50)
    private  String customername;

    @Column(name = "mobile", length = 15)
    private int mobile;

    public Customer(int customerid, String customername, int mobile) {
        this.customerid = customerid;
        this.customername = customername;
        this.mobile = mobile;
    }

    public Customer() {
    }

    public Customer(String customername, int mobile) {
        this.customername = customername;
        this.mobile = mobile;
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
        return "Customer{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
