package com.noteric.p1.bankconstuctor;

public class BankConstrutorTest {

    public static void main(String[] args) {

        BankModel bankModel = new BankModel("kalyani", "kallu@23", 23456);
        System.out.println(bankModel.getUserName());
        System.out.println(bankModel.getPassWord());
        System.out.println(bankModel.getOtp());


        BankModel bankModel2 = new BankModel("kalyani", "kallu@23");
        System.out.println(bankModel2.getUserName());
        System.out.println(bankModel2.getPassWord());


        BankModel bankModel1=new BankModel();
        System.out.println(bankModel1);
    }
}
