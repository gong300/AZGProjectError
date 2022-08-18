package com.example.demo.insuranceInfo;

import com.example.demo.insuranceInfo.exception.DataNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceInfoService {

    @Autowired
    InsuranceInfoRepository insuranceInfoRepository;

    public InsuranceInfoModelResponse insuranceInfoCreate (InsuranceInfoModelRequest request){
        if(request.getInsuranceID().equals("")||request.getInsuranceID().isEmpty()){
            throw new DataNullException("Insurance ID");
        }

        if(request.getInsuranceDetails().equals("")||request.getInsuranceDetails().isEmpty()){
            throw new DataNullException("Insurance Details");
        }

        if (request.getInsurancePic().equals("")||request.getInsurancePic().isEmpty()){
            throw new DataNullException("Insurance Picture");
        }

        if (request.getInsurancePrice().equals("")||request.getInsurancePrice().isEmpty()){
            throw new DataNullException("Insurance Price");
        }
        //Exception Condition

        InsuranceInfoEntity insuranceInfoEntity = new InsuranceInfoEntity();
        insuranceInfoEntity.setInsuranceID(request.getInsuranceID());
        insuranceInfoEntity.setInsurancePic(request.getInsurancePic());
        insuranceInfoEntity.setInsuranceDetails(request.getInsuranceDetails());
        insuranceInfoEntity.setInsurancePrice(request.getInsurancePrice());

        InsuranceInfoEntity insuranceInfoEntityResponse = insuranceInfoRepository.save(insuranceInfoEntity);

        InsuranceInfoModelResponse response = new InsuranceInfoModelResponse();
        response.setInsuranceDetails(insuranceInfoEntityResponse.getInsuranceDetails());
        response.setInsurancePics(insuranceInfoEntityResponse.getInsurancePic());
        response.setInsurancePrice(insuranceInfoEntityResponse.getInsurancePrice());

        return response;
    }
}
