package com.example.demo.insuranceInfo;

import com.example.demo.insuranceMiniDetails.InsuranceMiniDetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsuranceInfoController {

    @Autowired
    InsuranceInfoService insuranceInfoService;

    @PostMapping("/InsuranceDetails")
    public InsuranceInfoModelResponse insuranceDetail(@RequestBody InsuranceInfoModelRequest request){
        return insuranceInfoService.insuranceInfoCreate(request);
    }
    @GetMapping("/AllDetails")
    public List<InsuranceInfoEntity> findAll(){
        return insuranceInfoService.insuranceInfoRepository.findAll();
    }
}
