package com.xworkz.hospitalapp.exception;

public class PatientNameNotFoundException extends Exception{

    public PatientNameNotFoundException(String error)
    {
        System.out.println(error);
    }
}
