//package com.example.demo.insuranceInfo;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) //Ramdom Port in order to dont want tohave the same port
//class InsuranceInfoControllerTest {
//
//    @Autowired
//    private TestRestTemplate testRestTemplate; //Library that can test API
//
//    @MockBean
//    private  InsuranceInfoService insuranceInfoService; //Mock Service
//
//    @Test
//    void insuranceDetail() {
//        InsuranceInfoModelRequest insuranceInfoModelRequest = new InsuranceInfoModelRequest();
//        insuranceInfoModelRequest.setInsuranceID("1");
//        insuranceInfoModelRequest.setInsurancePic("Photo");
//        insuranceInfoModelRequest.setInsurancePrice("10000");
//        insuranceInfoModelRequest.setInsuranceDetails("Hello");
//
//        InsuranceInfoModelResponse insuranceInfoModelResponse = new InsuranceInfoModelResponse();
//        insuranceInfoModelResponse.setInsurancePics("Photo");
//        insuranceInfoModelResponse.setInsurancePrice("10000");
//        insuranceInfoModelResponse.setInsuranceDetails("Hello");
//        System.out.println(insuranceInfoModelResponse);
////        when(insuranceInfoService.insuranceInfoCreate(insuranceInfoModelRequest)).thenReturn(insuranceInfoModelResponse);
//        //Arrange Value
//
//        InsuranceInfoModelResponse result = testRestTemplate.getForObject("/InsuranceDetails",InsuranceInfoModelResponse.class);
//        System.out.println(result);
//        //Act = Doing STH With Data
//
//        assertEquals(insuranceInfoModelResponse.getInsuranceDetails(),result.getInsuranceDetails());
//        //Assert = Check the result for the expected result
//    }
//}
////Make sure it can work correctly