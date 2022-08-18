package com.example.demo.insuranceMiniDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceMiniDetailsService {

    @Autowired
    InsuranceMiniDetailsRepository insuranceMiniDetailsRepository;

    public InsuranceMiniDetailsModelResponse insuranceMiniDetailsCreate (InsuranceMiniDetailsModelRequest request){
        InsuranceMiniDetailsEntity insuranceMiniDetailsEntity = new InsuranceMiniDetailsEntity();
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsID(request.getInsuranceMiniDetailsID());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsPic(request.getInsuranceMiniDetailsPic());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsPrice(request.getInsuranceMiniDetailsPrice());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsFBulletin(request.getInsuranceMiniDetailsFBulletin());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsSBulletin(request.getInsuranceMiniDetailsSBulletin());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsTBulletin(request.getInsuranceMiniDetailsTBulletin());

        InsuranceMiniDetailsEntity insuranceMiniDetailsEntityResponse = insuranceMiniDetailsRepository.save(insuranceMiniDetailsEntity);

        InsuranceMiniDetailsModelResponse response = new InsuranceMiniDetailsModelResponse();
        response.setInsuranceMiniDetailsPic(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsPic());
        response.setInsuranceMiniDetailsPrice(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsPrice());
        response.setInsuranceMiniDetailsFBulletin(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsFBulletin());
        response.setInsuranceMiniDetailsSBulletin(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsSBulletin());
        response.setInsuranceMiniDetailsTBulletin(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsTBulletin());

        return response;
    }

}
