package com.noteric.p1;

import com.noteric.p1.ZomatoApplication.*;

import org.junit.jupiter.api.Test;

public class ZomatoForm {
@Test
    public void zomato(){
        Zomato zomato=new Zomato();
        ZomatoUser zomatoUser=new ZomatoUser();

        zomatoUser.userName="kalyani";
        zomatoUser.mailId="kalyani23@gmail.com";
        zomatoUser.phoneNo="955360256";


        UserAddress userAddress=new UserAddress();
        userAddress.area="kdd";
    userAddress.city="ABC";
        userAddress.flatNo="123";
        userAddress.pinCode="50348";


        Restaurant restaurant=new Restaurant();
        restaurant.resId="Res453";
        restaurant.resName="ABCD";
        restaurant.resLocation="kphb";
        restaurant.resTimings="9:00am to 10:00pm";


        Menu menu=new Menu();
        menu.itemId="AB-30";
        menu.itemName="biryani";
        menu.itemPrice=250;

        Order order=new Order();
        order.orderId="AD34";
        order.orderPrice=250;
        order.noOfItems=2;

        Payment payment=new Payment();
        payment.PaymentType="paytm";
        payment.PaymentId=123;

        zomato.zomatoUser=zomatoUser;
        zomato.menu=menu;
        zomato.order=order;
        zomato.userAddress=userAddress;
        zomato.payment=payment;
        zomato.restaurant=restaurant;



    }
}
