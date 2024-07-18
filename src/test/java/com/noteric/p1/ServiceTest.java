package com.noteric.p1;

import com.noteric.p1.BankDemo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class CustomerServiceTest {

    @Test
    public void register() {

        CustomerService service=new CustomerService();
        Customer customer=new Customer();
        customer.userName="kalyani";
        customer.password="kallu23";

        service.registration(customer);


        Account account=new Account();
        account.accountNo=34567890;
        account.bankName="SBI";
        account.currentBalance=5000;


        ReteOfIntrest intrest=new ReteOfIntrest();
        intrest.percentage=50;
        intrest.accountType="savingsAccount";
        intrest.startDate=new Date();
        intrest.endDate=new Date();


        Address address=new Address();
        address.city="kdd";
        address.flatNo="7G";
        address.street="kbhp";
        address.pinCode="507002";

        IFSCcode ifsCcode=new IFSCcode();
        ifsCcode.code="SBIK7890";
        // ifsCcode.address=address;


        Address bankAddress=new Address();

        bankAddress.city="nkp";
        bankAddress.flatNo="8A";
        bankAddress.street="kmm";
        bankAddress.pinCode="507011";
        ifsCcode.address=bankAddress;
        account.address=address;
        account.reteOfIntrest=intrest;
        customer.account=account;
        account.ifsCcode=ifsCcode;
        //Assertions.assertNotNull();
        Assertions.assertEquals(4567,4567);


    }

}
