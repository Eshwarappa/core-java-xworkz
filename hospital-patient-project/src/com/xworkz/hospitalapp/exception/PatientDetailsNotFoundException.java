package com.xworkz.hospitalapp.exception;

public class PatientDetailsNotFoundException extends Exception{

    public PatientDetailsNotFoundException(String error)
    {
        System.out.println(error);
    }
}
