package service;

import helper.DatabaseHelper;
import model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @program: chapter2
 * @description:
 * @author: liukai
 * @create: 2018-10-09 12:02
 **/
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList(String keyword) {
        String sql="SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(long id){
        return null;
    }

    public Boolean createCustomer(Map<String, Object> fieldMap) {
        return false;
    }

    public Boolean updateCustomer(long id, Map<String, Object> fieldMap){
        return false;
    }

    public Boolean deleteCustomer(long id){
        return false;
    }
}
