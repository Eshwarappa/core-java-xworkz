package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.exception.DoctorNameNotFoundException;
import com.xworkz.hospitalapp.exception.PatientDetailsNotFoundException;
import com.xworkz.hospitalapp.exception.PatientIdNotFoundException;
import com.xworkz.hospitalapp.exception.PatientNameNotFoundException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

//@Setter
//@Getter
//@ToString
public class Hospital {

  public  PatientDTO patient[] ;


  public Hospital(int size)
  {

    patient=new PatientDTO[size] ;

  }

    int index ;
    public int id ;


    public boolean addData(PatientDTO patient2 )
    {
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

        public void getAllPatient()
        {
            for (int patientIndex = 0 ; patientIndex<patient.length ; patientIndex++)
            {
                System.out.println(patient[patientIndex]);
            }
        }

    public String getTheDoctorNameByPatientId(int patientId)
    {
        String doctorName = null ;

        for(int index=0 ; index<patient.length ; index++)
        {
            if (patient[index].getId() == patientId)
            {
                doctorName=patient[index].getDoctorName() ;

            }
        }
//            if (!(patient[index].getId()==patientId)) {
        if (doctorName==null){
//                DoctorNameNotFoundException doctorNameNotFoundException= new DoctorNameNotFoundException("DCTOR NAME IS NOT FOUND FOR :"+patientId);
//
//                throw doctorNameNotFoundException;

            throw  new DoctorNameNotFoundException("DCTOR NAME IS NOT FOUND FOR :"+patientId);

            }

        return doctorName;
    }
//
    public String getThePatientDiseaseNameById(int patientId)
    {
        String diseaseName =null ;

        for (int index=0 ; index<patient.length;index++)
        {
            if (patient[index].getId()==patientId)
            {
                diseaseName=patient[index].getDisease() ;
            }
        }
        if (diseaseName==null) {
            throw new PatientIdNotFoundException("Patient ID is not Found :"+patientId);
        }
        return diseaseName;
    }
//
    public Gender getPatientGenderByPatientName(String name) throws PatientNameNotFoundException
    {
        Gender gender = null ;

        for (int index=0 ; index<patient.length ; index++)
        {
            if (patient[index].getName().equals(name))
            {
                gender= patient[index].getGender() ;
            }
        }

        if (gender==null){
            throw new PatientNameNotFoundException("Gender is not found for :" +name) ;
        }
        return gender;
    }

    public PatientDTO getThePatientDetailsByPatientId(int patientId) throws PatientDetailsNotFoundException
    {
        PatientDTO patientDetail = null;

        for (int index=0 ; index<patient.length ; index++)
        {
            if (patient[index].getId()==patientId)
            {
                patientDetail=patient[index];
            }
        }

        if (patientDetail==null)
        {
            throw new PatientDetailsNotFoundException("PatientDetailsNotFound for this ID :"+patientId) ;
        }
        return patientDetail;
    }

    public String getThePatientAddressByPatientId(int patientId)
    {
        String address = null;

        for (int index = 0 ; index<patient.length ; index++)
        {
            if (patient[index].getId()==patientId)
            {
                address=patient[index].getAddress();
            }
        }
        if (address==null)
        {
            throw new PatientIdNotFoundException("Address is not found :"+patientId) ;
        }
        return address;
    }
    public BloodGroup getTheBloodGroupOfPatientByPatientName(String patientName)
    {
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

    public boolean upDatePatientDiseaseByPatientName(String updateDisease , String patientName)
    {
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

    public  boolean deletePatientByPatientId(int patientId)
    {
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


//T[] =
//Array is one of the  class
//binarySearch
//shorted means arrange increment order (Array.short(a));
//short methode return type is void
//Patient patient = new Patient() ;
//Object a() = new Object[]{ 21,patient,22,"mannj" , true,}
// Arrays.sort(a);
//object behaviou different form

