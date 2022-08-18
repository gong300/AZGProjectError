package com.example.demo.insuranceInfo;

import org.springframework.stereotype.Service;

@Service
public class TestData {
    public InsuranceInfoEntity genInsuranceData(){
        InsuranceInfoEntity insuranceInfoEntity = new InsuranceInfoEntity();
        insuranceInfoEntity.setInsuranceID("1");
        insuranceInfoEntity.setInsurancePic("Photo");
        insuranceInfoEntity.setInsurancePrice("10000");
        insuranceInfoEntity.setInsuranceDetails("Hello");
        return insuranceInfoEntity;
    }
}
