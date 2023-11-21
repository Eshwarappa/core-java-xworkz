package com.xworkz.hospitalapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BankDTO {

    private int bankId ;
    private String bankName ;
    private String branch ;
    private long contactNumber ;
    private String ifscCode ;


    public void display()
    {
        System.out.println("Bank Id :" +bankId);
        System.out.println("bank name :"+bankName);
        System.out.println("branch name :"+ branch);
        System.out.println("contact Number :"+contactNumber);
        System.out.println("IFSC code :"+ifscCode);
    }

}
