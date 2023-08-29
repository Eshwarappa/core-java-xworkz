package com.xworkz.interference.imliment;

import com.xworkz.interference.constants.BloodGroup;
import com.xworkz.interference.constants.Gender;
import com.xworkz.interference.dto.PatientDTO;
import com.xworkz.interference.hospital.Hospital;

import java.util.Arrays;

public class ApolloHospitalImp implements Hospital {

    public PatientDTO patient[] ;


    public  ApolloHospitalImp(int size)
    {

        patient=new PatientDTO[size] ;

    }

    int index ;
    public int id ;


    public boolean addData(PatientDTO patient2) {
        boolean isAdd=false;

        if (patient!=null)
        {

            patient2.setId(++id);
            this.patient[index++] = patient2 ;

            isAdd = true ;
        }
        else
        {
            System.out.println("please add the details");
        }


        return isAdd;
    }

    @Override
    public void getAllPatient() {
        for (int patientIndex = 0 ; patientIndex<patient.length ; patientIndex++)
        {
            System.out.println(patient[patientIndex]);
        }
    }

    @Override
    public String getTheDoctorNameByPatientId(int patientId) {
        String doctorName = null ;

        for(int index=0 ; index<patient.length ; index++)
        {
            if (patient[index].getId() == patientId)
            {
                doctorName=patient[index].getDoctorName() ;


            }
        }

        return doctorName;

    }

    @Override
    public String getThePatientDiseaseNameById(int patientId) {
        String diseaseName =null ;

        for (int index=0 ; index<patient.length;index++)
        {
            if (patient[index].getId()==patientId)
            {
                diseaseName=patient[index].getDisease() ;
            }
        }
        return diseaseName;
    }

    @Override
    public Gender getPatientGenderByPatientName(String name) {
        Gender gender = null ;

        for (int index=0 ; index<patient.length ; index++)
        {
            if (patient[index].getName().equals(name))
            {
                gender= patient[index].getGender() ;
            }
        }
        return gender;
    }

    @Override
    public PatientDTO getThePatientDetailsByPatientId(int patientId) {
        PatientDTO patientDetail = null;

        for (int index=0 ; index<patient.length ; index++)
        {
            if (patient[index].getId()==patientId)
            {
                patientDetail=patient[index];
            }
        }
        return patientDetail;
    }

    @Override
    public String getThePatientAddressByPatientId(int patientId) {
        String address = null;

        for (int index = 0 ; index<patient.length ; index++)
        {
            if (patient[index].getId()==patientId)
            {
                address=patient[index].getAddress();
            }
        }
        return address;
    }

    @Override
    public BloodGroup getTheBloodGroupOfPatientByPatientName(String patientName) {
        BloodGroup bloodGroup = null ;

        for (int index=0 ; index<patient.length ; index++)
        {
            if (patient[index].getName().equals(patientName))
            {
                bloodGroup=patient[index].getBloodGroup();
            }
        }

        return bloodGroup;
    }

    @Override
    public boolean upDatePatientDiseaseByPatientName(String updateDisease, String patientName) {
        boolean isUpdateDisease = false ;

        for (int index=0 ; index<patient.length ; index++)
        {
            if (patient[index].getName().equals(patientName))
            {
                patient[index].setDisease(updateDisease);

                isUpdateDisease=true;
            }
        }
        return isUpdateDisease;
    }

    @Override
    public boolean deletePatientByPatientId(int patientId) {
        boolean isPatientDelete = false ;

        // PatientDTO newPatient[] = new PatientDTO[patient.length-1] ;

        int newIndex , oldIndex ;

        for (oldIndex=0 , newIndex=0 ; oldIndex<patient.length ; oldIndex++)
        {
            if (!(patient[oldIndex].getId() == patientId))
            {
                patient[newIndex++] = this.patient[oldIndex];
            }
        }
        patient = Arrays.copyOf(patient , newIndex) ;
        System.out.println(Arrays.toString(patient));
        return isPatientDelete;

    }
}
