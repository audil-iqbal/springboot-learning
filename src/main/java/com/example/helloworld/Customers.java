package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int custid;
    private String custname;
    private String cousrename;

    @Autowired
    private Technologies techdetail;

    public Technologies getTechdetail() {
        return techdetail;
    }

    public void setTechdetail(Technologies techdetail) {
        this.techdetail = techdetail;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCousrename() {
        return cousrename;
    }

    public void setCousrename(String cousrename) {
        this.cousrename = cousrename;
    }
    public void display(){
        System.out.println("Object returned success");
        techdetail.tech();
    }
}
