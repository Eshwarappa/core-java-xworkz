package com.xworkz.hospitalapp.dto;


import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.constants.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CustomerDTO {

    private int customerId ;
    private String customerName ;
    private long customerPhoneNumber ;
    private String customerEmail ;
    private Gender gender ;
    private BloodGroup bloodGroup ;
    private String customerPassword ;
    private String customerAddress ;



}
