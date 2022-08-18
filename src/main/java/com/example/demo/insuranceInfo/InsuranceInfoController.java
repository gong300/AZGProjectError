package com.example.demo.insuranceInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceInfoController {

    @Autowired
    InsuranceInfoService insuranceInfoService;

    @PostMapping("/InsuranceDetails")
    public InsuranceInfoModelResponse insuranceDetail(@RequestBody InsuranceInfoModelRequest request){
        return insuranceInfoService.insuranceInfoCreate(request);
    }
}
