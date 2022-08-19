package com.example.demo.insuranceMiniDetails;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InsuranceMiniDetailsRepository extends JpaRepository<InsuranceMiniDetailsEntity,String> {
    List<InsuranceMiniDetailsEntity> findByInsuranceMiniDetailsNameLike (String name);

}
