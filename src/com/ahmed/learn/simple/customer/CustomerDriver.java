package com.ahmed.learn.simple.customer;

/**
 * Created by ahmed on 16.08.2015.
 */
public class CustomerDriver {

    public static void main(String... args) {

        Customer customer = new Customer();
        customer.setBalance(12506.45f);
        System.out.println(customer.toString());

    }

}
