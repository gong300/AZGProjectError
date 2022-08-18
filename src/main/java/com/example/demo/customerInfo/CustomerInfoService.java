package com.example.demo.customerInfo;

import com.example.demo.insuranceInfo.exception.DataNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoService {
    @Autowired
    CustomerInfoRepository customerInfoRepository;
    public CustomerInfoModelResponse customerInfoCreate (CustomerInfoModelRequest request){
        if(request.getCustomerID().equals("")||request.getCustomerID().isEmpty()){
            throw new DataNullException("Customer ID");
        }

        if(request.getPhone().equals("")||request.getPhone().isEmpty()){
            throw new DataNullException("Phone");
        }

        if(request.getEMail().equals("")||request.getEMail().isEmpty()){
            throw new DataNullException("E-Mail");
        }

        if(request.getLastName().equals("")||request.getLastName().isEmpty()){
            throw new DataNullException("Lastname");
        }

        if(request.getFirstName().equals("")||request.getFirstName().isEmpty()){
            throw new DataNullException("Firstname");
        }

        if(request.getSex().equals("")||request.getSex().isEmpty()){
            throw new DataNullException("Sex");
        }

        if(request.getTitle().equals("")||request.getTitle().isEmpty()){
            throw new DataNullException("Title");
        }

        if(request.getBirthday().equals("")||request.getBirthday().isEmpty()){
            throw new DataNullException("Birthday");
        }

        if(request.getJob().equals("")||request.getJob().isEmpty()){
            throw new DataNullException("Job");
        }

        if(request.getNational().equals("")||request.getNational().isEmpty()){
            throw new DataNullException("National");
        }

        if(request.getPersonalID().equals("")||request.getPersonalID().isEmpty()){
            throw new DataNullException("ID Card");
        }

        if(request.getAddress().equals("")||request.getAddress().isEmpty()){
            throw new DataNullException("Address");
        }

        if(request.getWeight().equals("")||request.getWeight().isEmpty()){
            throw new DataNullException("Weight");
        }

        if(request.getHeight().equals("")||request.getHeight().isEmpty()){
            throw new DataNullException("Height");
        }

        if(request.getStatus().equals("")||request.getStatus().isEmpty()){
            throw new DataNullException("Status");
        }

        if(request.getAge().equals("")||request.getAge().isEmpty()){
            throw new DataNullException("Age");
        }

        CustomerInfoEntity customerInfoEntity = new CustomerInfoEntity();
        customerInfoEntity.setCustomerID(request.getCustomerID());
        customerInfoEntity.setAge(request.getAge());
        customerInfoEntity.setPhone(request.getPhone());
        customerInfoEntity.setEMail(request.getEMail());
        customerInfoEntity.setLastName(request.getLastName());
        customerInfoEntity.setFirstName(request.getFirstName());
        customerInfoEntity.setSex(request.getSex());
        customerInfoEntity.setTitle(request.getTitle());
        customerInfoEntity.setBirthday(request.getBirthday());
        customerInfoEntity.setJob(request.getJob());
        customerInfoEntity.setNational(request.getNational());
        customerInfoEntity.setPersonalID(request.getPersonalID());
        customerInfoEntity.setAddress(request.getAddress());
        customerInfoEntity.setWeight(request.getWeight());
        customerInfoEntity.setHeight(request.getHeight());
        customerInfoEntity.setStatus(request.getStatus());
        //Create to response the format

        CustomerInfoEntity customerInfoEntityResponse = customerInfoRepository.save(customerInfoEntity);//Insert Into ....
        //Create to execute

        CustomerInfoModelResponse response = new CustomerInfoModelResponse();
        response.setEMail(customerInfoEntityResponse.getEMail());
        response.setPhone(customerInfoEntityResponse.getPhone());
        response.setFirstName(customerInfoEntityResponse.getFirstName());
        response.setLastName(customerInfoEntityResponse.getLastName());
        response.setBirthday(customerInfoEntityResponse.getBirthday());
        response.setTitle(customerInfoEntity.getTitle());
        response.setWeight(customerInfoEntity.getWeight());
        response.setHeight(customerInfoEntity.getHeight());
        response.setSex(customerInfoEntityResponse.getSex());
        response.setStatus(customerInfoEntity.getStatus());
        response.setPersonalID(customerInfoEntity.getPersonalID());
        response.setJob(customerInfoEntity.getJob());
        response.setAddress(customerInfoEntity.getAddress());
        //Mapping Value to return to FrontEnd

        return response;
    }
}
