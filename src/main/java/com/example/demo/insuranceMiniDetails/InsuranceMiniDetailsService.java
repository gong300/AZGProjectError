package com.example.demo.insuranceMiniDetails;

import com.example.demo.insuranceMiniDetails.exception.DataNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InsuranceMiniDetailsService {

    @Autowired
    InsuranceMiniDetailsRepository insuranceMiniDetailsRepository;

    public InsuranceMiniDetailsModelResponse insuranceMiniDetailsCreate (InsuranceMiniDetailsModelRequest request){
        if (request.getInsuranceMiniDetailsID().equals("")||request.getInsuranceMiniDetailsID().isEmpty()){
            throw new DataNullException("Insurance Mini ID");
        }

        if (request.getInsuranceMiniDetailsPic().equals("")||request.getInsuranceMiniDetailsPic().isEmpty()){
            throw new DataNullException("Insurance Pic");
        }

        if (request.getInsuranceMiniDetailsPrice().equals("")||request.getInsuranceMiniDetailsPrice().isEmpty()){
            throw new DataNullException("Insurance Price");
        }

        if (request.getInsuranceMiniDetailsName().equals("")||request.getInsuranceMiniDetailsName().isEmpty()){
            throw new DataNullException("Insurance Name");
        }

        if (request.getInsuranceMiniDetailsFBulletin().equals("")||request.getInsuranceMiniDetailsFBulletin().isEmpty()){
            throw new DataNullException("Insurance First Bulletin");
        }

        if (request.getInsuranceMiniDetailsSBulletin().equals("")||request.getInsuranceMiniDetailsSBulletin().isEmpty()){
            throw new DataNullException("Insurance Second Bulletin");
        }

        if (request.getInsuranceMiniDetailsTBulletin().equals("")||request.getInsuranceMiniDetailsTBulletin().isEmpty()){
            throw new DataNullException("Insurance Third Bulletin");
        }

        InsuranceMiniDetailsEntity insuranceMiniDetailsEntity = new InsuranceMiniDetailsEntity();
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsID(request.getInsuranceMiniDetailsID());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsPic(request.getInsuranceMiniDetailsPic());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsPrice(request.getInsuranceMiniDetailsPrice());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsFBulletin(request.getInsuranceMiniDetailsFBulletin());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsSBulletin(request.getInsuranceMiniDetailsSBulletin());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsTBulletin(request.getInsuranceMiniDetailsTBulletin());
        insuranceMiniDetailsEntity.setInsuranceMiniDetailsName(request.getInsuranceMiniDetailsName());
        System.out.println(insuranceMiniDetailsEntity);

        InsuranceMiniDetailsEntity insuranceMiniDetailsEntityResponse = insuranceMiniDetailsRepository.save(insuranceMiniDetailsEntity);

        InsuranceMiniDetailsModelResponse response = new InsuranceMiniDetailsModelResponse();
        response.setInsuranceMiniDetailsPic(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsPic());
        response.setInsuranceMiniDetailsPrice(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsPrice());
        response.setInsuranceMiniDetailsFBulletin(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsFBulletin());
        response.setInsuranceMiniDetailsSBulletin(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsSBulletin());
        response.setInsuranceMiniDetailsTBulletin(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsTBulletin());
        response.setInsuranceMiniDetailsName(insuranceMiniDetailsEntityResponse.getInsuranceMiniDetailsName());

        return response;
    }

//    public List<InsuranceMiniDetailsModelResponse> searchByName (String searchString){
//       searchString = "%"+searchString+"%";
//       System.out.println(searchString);
//       List<InsuranceMiniDetailsEntity> insuranceMiniDetailsEntitySearch = insuranceMiniDetailsRepository.findByInsuranceMiniDetailsNameLike(searchString);
//
//       List<InsuranceMiniDetailsModelResponse> insuranceMiniDetailsModelResponseList = new ArrayList<>();
//       insuranceMiniDetailsEntitySearch.forEach(data->{
//           InsuranceMiniDetailsModelResponse response = new InsuranceMiniDetailsModelResponse();
//           response.setInsuranceMiniDetailsPic(data.getInsuranceMiniDetailsPic());
//           response.setInsuranceMiniDetailsPrice(data.getInsuranceMiniDetailsPrice());
//           response.setInsuranceMiniDetailsTBulletin(data.getInsuranceMiniDetailsTBulletin());
//           response.setInsuranceMiniDetailsSBulletin(data.getInsuranceMiniDetailsSBulletin());
//           response.setInsuranceMiniDetailsFBulletin(data.getInsuranceMiniDetailsFBulletin());
//           response.setInsuranceMiniDetailsName(data.getInsuranceMiniDetailsName());
//       });
//       return insuranceMiniDetailsModelResponseList;
//    }
//    public List<InsuranceMiniDetailsModelResponse> searchAll (){
//        List<InsuranceMiniDetailsEntity> insuranceMiniDetailsEntitySearch = insuranceMiniDetailsRepository.findAll();
//        List<InsuranceMiniDetailsModelResponse> insuranceMiniDetailsModelResponseList = new ArrayList<>();
//        insuranceMiniDetailsEntitySearch.forEach(data->{
//            InsuranceMiniDetailsModelResponse response = new InsuranceMiniDetailsModelResponse();
//            response.setInsuranceMiniDetailsPic(data.getInsuranceMiniDetailsPic());
//            response.setInsuranceMiniDetailsPrice(data.getInsuranceMiniDetailsPrice());
//            response.setInsuranceMiniDetailsTBulletin(data.getInsuranceMiniDetailsTBulletin());
//            response.setInsuranceMiniDetailsSBulletin(data.getInsuranceMiniDetailsSBulletin());
//            response.setInsuranceMiniDetailsFBulletin(data.getInsuranceMiniDetailsFBulletin());
//            response.setInsuranceMiniDetailsName(data.getInsuranceMiniDetailsName());
//        });
//        return insuranceMiniDetailsModelResponseList;
//    }
}