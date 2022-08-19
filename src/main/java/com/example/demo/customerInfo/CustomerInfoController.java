package com.example.demo.customerInfo;

import com.example.demo.insuranceInfo.InsuranceInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Get to know this is controller
public class CustomerInfoController {

    @Autowired
    CustomerInfoService customerInfoService;

    @PostMapping("/customer/register")
    public CustomerInfoModelResponse customerInfoRegister(@RequestBody CustomerInfoModelRequest request){
        return customerInfoService.customerInfoCreate(request);
    }
    @GetMapping("/AllCustomer")
    public List<CustomerInfoEntity> findAll(){
        return customerInfoService.customerInfoRepository.findAll();
    }

}
