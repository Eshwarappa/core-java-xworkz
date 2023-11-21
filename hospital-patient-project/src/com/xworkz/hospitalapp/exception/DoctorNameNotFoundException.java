package com.xworkz.hospitalapp.exception;

public class DoctorNameNotFoundException extends RuntimeException{

    public DoctorNameNotFoundException(String error)
    {
        System.out.println(error);
    }
}
