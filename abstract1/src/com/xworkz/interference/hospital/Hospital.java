package com.xworkz.interference.hospital;

import com.xworkz.interference.constants.BloodGroup;
import com.xworkz.interference.constants.Gender;
import com.xworkz.interference.dto.PatientDTO;

public interface Hospital {

    public boolean addData(PatientDTO patient2 ) ;

    public void getAllPatient() ;

    public String getTheDoctorNameByPatientId(int patientId) ;

    public String getThePatientDiseaseNameById(int patientId) ;

    public Gender getPatientGenderByPatientName(String name) ;

    public PatientDTO getThePatientDetailsByPatientId(int patientId) ;

    public String getThePatientAddressByPatientId(int patientId) ;

    public BloodGroup getTheBloodGroupOfPatientByPatientName(String patientName) ;

    public boolean upDatePatientDiseaseByPatientName(String updateDisease , String patientName) ;

    public  boolean deletePatientByPatientId(int patientId) ;
}
