package com.xworkz.hospitalapp.exception;

public class BankNameNotFoundException extends RuntimeException {

    public BankNameNotFoundException(String error)
    {
        System.out.println(error);
    }

}
