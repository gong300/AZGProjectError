package com.example.demo.customerInfo;

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
public class CustomerInfoEntity {
    @Id //primary key
    @Column //Column of Table
    private String CustomerID;

    @Column
    private String FirstName;

    @Column
    private String LastName;

    @Column
    private String EMail;

    @Column
    private String Phone;

    @Column
    private String Sex;

    @Column
    private String Age; //Note

    @Column
    private String Title;

    @Column
    private String Birthday;

    @Column
    private String Job;

    @Column
    private String National;

    @Column
    private String PersonalID;

    @Column
    private String Address;

    @Column
    private String Weight;

    @Column
    private String Height;

    @Column
    private String Status;
    //UUID
    //Format date time
    //แก้ชื่อจากตัวใหญ่เป็นเล็ก
}
