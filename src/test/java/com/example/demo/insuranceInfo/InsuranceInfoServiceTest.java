//package com.example.demo.insuranceInfo;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Optional;
//
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class InsuranceInfoServiceTest {
//
//    @Mock
//    private InsuranceInfoRepository insuranceInfoRepository;
//
//    @Autowired
//    TestData testData;
//
//    @Test
//    void insuranceInfoCreate() {
//        InsuranceInfoEntity insuranceInfoEntity = testData.genInsuranceData();
//        when(insuranceInfoRepository.save(insuranceInfoEntity)).thenReturn(Optional.of(insuranceInfoEntity));
//    }
//}