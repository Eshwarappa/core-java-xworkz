package com.xworkz.hospitalapp.exception;

//It is called costume run-timme/unchecked exception
public class PatientIdNotFoundException extends RuntimeException{


     public PatientIdNotFoundException(String exception)
     {
         System.out.println("PatientIdNotFoundException");
     }
}
//public,protected,default,private;

//exception = try catch throws, throw compile time checked exception,run time,