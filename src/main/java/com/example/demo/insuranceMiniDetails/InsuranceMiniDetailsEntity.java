package com.example.demo.insuranceMiniDetails;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class InsuranceMiniDetailsEntity {
    @Id
    @Column
    private String insuranceMiniDetailsID;

    //Name of Insurance

    @Column
    private String insuranceMiniDetailsPic;

    @Column
    private String insuranceMiniDetailsPrice;

    @Column
    private String insuranceMiniDetailsFBulletin;

    @Column
    private String insuranceMiniDetailsSBulletin;

    @Column
    private String insuranceMiniDetailsTBulletin;
}
