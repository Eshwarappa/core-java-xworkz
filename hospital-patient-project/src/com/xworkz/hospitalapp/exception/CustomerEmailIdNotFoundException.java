package com.xworkz.hospitalapp.exception;

public class CustomerEmailIdNotFoundException extends RuntimeException {

    public CustomerEmailIdNotFoundException(String error)
    {
        System.out.println(error);
    }
}
