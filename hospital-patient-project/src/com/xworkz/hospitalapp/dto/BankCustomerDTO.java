package com.xworkz.hospitalapp.dto;

import com.xworkz.hospitalapp.constants.AccountType;
import com.xworkz.hospitalapp.constants.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BankCustomerDTO {

    private String bankName ;
    private long accountNumber ;
    private String customerName ;
    private Gender gender ;
    private long phoneNumber ;
    private AccountType accountType ;
    private String customerAddress ;

}
