package com.example.demo.customerInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //Get to know this is controller
public class CustomerInfoController {

    @Autowired
    CustomerInfoService customerInfoService;

    @PostMapping("/customer/register")
    public CustomerInfoModelResponse customerInfoRegister(@RequestBody CustomerInfoModelRequest request){
        return customerInfoService.customerInfoCreate(request);
    }

}
