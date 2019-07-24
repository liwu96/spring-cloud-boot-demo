package com.cloud_customer.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Author: Patrick
 * Date: 2019/2/25
 * Time: 23:38
 * Description:
 */
@RestController
public class CustomerControler {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return customerService.hiService(name);
    }
}

