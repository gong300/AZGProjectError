package com.example.demo.customerInfo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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
    private String Age;

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

    @Column
    @GenericGenerator( name = "uuid2",strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "uuid2")
    private String policyNumber;

    //UUID
    //Format date time
    //แก้ชื่อจากตัวใหญ่เป็นเล็ก
}
