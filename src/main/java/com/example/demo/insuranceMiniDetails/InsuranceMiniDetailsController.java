package com.example.demo.insuranceMiniDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceMiniDetailsController {

    @Autowired
    InsuranceMiniDetailsService insuranceMiniDetailsService;

    @PostMapping("/InsuranceMiniDetails")
    public InsuranceMiniDetailsModelResponse insuranceMiniDetails(@RequestBody InsuranceMiniDetailsModelRequest request){
        return insuranceMiniDetailsService.insuranceMiniDetailsCreate(request);
    }
}
