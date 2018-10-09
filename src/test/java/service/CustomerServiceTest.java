package service;

import model.Customer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerServiceTest {
    public final CustomerService customerService = new CustomerService();

    @Before
    public void init() throws Exception {
        //TODO: init database connection
    }

    @Test
    public void getCustomerList() {
        List<Customer> list = customerService.getCustomerList(null);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void getCustomer() {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomer() {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact","john");
        fieldMap.put("telephone","44444");
        Boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomer() {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("contact","EEE");
        Boolean result = customerService.updateCustomer(id,fieldMap);
    }

    @Test
    public void deleteCustomer() {
        long id = 1;
        Boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }


    @After
    public void tearDown() throws Exception {
    }
}