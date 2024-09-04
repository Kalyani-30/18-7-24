package com.noteric.p1.model;

public class Address{

    public String area;
    public String pincode;
    public String city;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
