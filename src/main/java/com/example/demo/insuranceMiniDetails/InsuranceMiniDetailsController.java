package com.example.demo.insuranceMiniDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsuranceMiniDetailsController {

    @Autowired
    InsuranceMiniDetailsService insuranceMiniDetailsService;

    @PostMapping("/InsuranceMiniDetails")
    public InsuranceMiniDetailsModelResponse insuranceMiniDetails(@RequestBody InsuranceMiniDetailsModelRequest request){
        return insuranceMiniDetailsService.insuranceMiniDetailsCreate(request);
    }

    @PostMapping("/Po")
    public List<InsuranceMiniDetailsModelResponse> searchByName(@RequestBody SearchNameRequest request){
        return insuranceMiniDetailsService.searchByName(request.getSearchString());
    }

    @GetMapping("/Noey")
    public List<InsuranceMiniDetailsModelResponse> showAll(){
        return insuranceMiniDetailsService.searchAll();
    }
}
