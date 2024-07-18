package com.noteric.p1.BankDemo;



public class CustomerService {

    public OTP registration(Customer customer){

        OTP otp=new OTP();
        otp.otp=8679;
        otp.expireTime=3;
        System.out.println("registration successful");
        return otp;
    }
}
