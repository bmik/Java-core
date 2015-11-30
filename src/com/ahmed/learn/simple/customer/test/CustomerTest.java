package com.ahmed.learn.simple.customer.test;

import com.ahmed.learn.simple.customer.Customer;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by ahmed on 18.08.2015.
 */
public class CustomerTest {

    private static final Customer c = new Customer();

    @Test
    public void testGetName() throws Exception {
        c.setAccountNumber(12345);
        Assert.assertEquals("Assert account must be 12345", 12344, c.getAccountNumber());
    }

    @Test
    public void testGetAccountNumber() throws Exception {

    }

    @Test
    public void testGetBalance() throws Exception {

    }
}
