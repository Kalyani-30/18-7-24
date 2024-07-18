package com.noteric.p1.bankconstuctor;

public class BankModel {
    private String userName;
    private String passWord;
    private int otp;

    //default constructor
    public BankModel(){
        System.out.println("default constructor");
    }

    public BankModel(String userName,String passWord,int otp){
         this.userName=userName;
        this.passWord=passWord;
        this.otp=otp;


    }
    public BankModel(String userName,String passWord){
        this.userName=userName;
        this.passWord=passWord;
    }

    public String getUserName(){
        return userName;
    }
    public String getPassWord(){
        return passWord;
    }
    public int getOtp(){
        return otp;
    }

    @Override
    public String toString() {
        return "BankModel{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", otp=" + otp +
                '}';
    }
}
