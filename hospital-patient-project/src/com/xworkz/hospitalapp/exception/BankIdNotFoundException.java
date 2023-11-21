package com.xworkz.hospitalapp.exception;

public class BankIdNotFoundException extends Exception{

    public BankIdNotFoundException(String error)
    {
        System.out.println(error);
    }
}
