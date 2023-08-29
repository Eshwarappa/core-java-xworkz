package com.xworkz.interference;

import com.xworkz.interference.constants.BloodGroup;
import com.xworkz.interference.constants.Gender;
import com.xworkz.interference.dto.PatientDTO;
import com.xworkz.interference.hospital.Hospital;
import com.xworkz.interference.imliment.ApolloHospitalImp;

import java.util.Scanner;

public class HospitalApolloTester {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of patient");
        int size = sc.nextInt();
        Hospital hospital = new ApolloHospitalImp(size);
        ApolloHospitalImp apolloHospitalImp = new ApolloHospitalImp(size) ;
        for (int index = 0; index < apolloHospitalImp.patient.length; index++) {
            PatientDTO patient1 = new PatientDTO();

//            int count;
//            int id = ++count;
            // patient.setId(PatientDTO.count++);

            System.out.println("name");
            patient1.setName(sc.next());

            System.out.println("diseasename");
            patient1.setDisease(sc.next());

            System.out.println("Doctorname");
            patient1.setDoctorName(sc.next());

            System.out.println("Hospitalname");
            patient1.setHospitalName(sc.next());

            System.out.println("BloodGroup");
            patient1.setBloodGroup(BloodGroup.valueOf(sc.next()));

            System.out.println("Gender");
            patient1.setGender(Gender.valueOf(sc.next()));

//            System.out.println("Status");
//            patient1.setStatus(Status.valueOf(sc.next()));

            System.out.println("Address");
            patient1.setAddress(sc.next());


            hospital.addData(patient1);
//
//
        }

        String userInput = null;


        boolean Yes = false;
        do {
            System.out.println("Press 1. To get Patient's Info ");
            System.out.println("Press 2. To Get Doctor's Name ");
            System.out.println("Press 3 . to get PatientDisease");
            System.out.println("Press 4 .  to get patient gender");
            System.out.println("Press 5 .  to get patientDetails");
            System.out.println("Press 6 .  to get PatientAddress ");
            System.out.println("Press 7 .  to get patientBloodGroup");
            System.out.println("Press 8 . to update the patientDisease");
            System.out.println("Press 9 . to delete patientDetails");
            // System.out.println("After UpDating the patientDiseaseName ------------------------");
            // System.out.println("Press 10 . to get updated patient Details");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    hospital.getAllPatient();

                    break;
                case 2:
                    System.out.println("Enter the patiant Id to get doctoreName");
                    String doctorName = hospital.getTheDoctorNameByPatientId(sc.nextInt());
                    System.out.println("the doctoreName is:" + doctorName);
                    break;

                case 3 :    System.out.println("Enter The PatientId to get Patientdisease");
                    String DiseaseName =hospital.getThePatientDiseaseNameById(sc.nextInt());
                    System.out.println("The Disease Name is = "+ DiseaseName);
                    break;

                case 4 :         System.out.println("Enter the patient name for to get patient gender");
                    Gender gender=hospital.getPatientGenderByPatientName(sc.next());
                    System.out.println("the gender is = "+ gender);

                    break;

                case 5 :   System.out.println("Enter the patientId to get patientDetails");
                    PatientDTO patient = hospital.getThePatientDetailsByPatientId(sc.nextInt());
                    System.out.println("The PatientDetails are + "+ patient);

                    break;
                case 6 :    System.out.println("Enter the patientId to get PatientAddress");

                    String address=hospital.getThePatientAddressByPatientId(sc.nextInt());
                    System.out.println("the address oa patient is = "+ address);

                    break;

                case 7 :  System.out.println("Enter the patientName to get patientBloodGroup");
                    BloodGroup bloodGroup = hospital.getTheBloodGroupOfPatientByPatientName(sc.next());
                    System.out.println("the bloodgroup is +" + bloodGroup);
                    break;

                case 8 :   System.out.println("Enter the patientName to update the patientDisease");
                    String patientName = sc.next();
                    System.out.println("Enter the new diseaseName for Patient Name");
                    String updateDisease = sc.next();
                    //  boolean dieaseUpdated = hospital.upDatePatientDiseaseByPatientName(sc.next(), sc.next());
                    boolean isDiseaseUpdated = hospital.upDatePatientDiseaseByPatientName(updateDisease,patientName) ;
                    System.out.println("Updated patientDiseaseName is = " + isDiseaseUpdated);

                    break;

                case 9 :
                    System.out.println("Enter the patientId to delete");
                    boolean isPatientDelete =hospital.deletePatientByPatientId(sc.nextInt()) ;
                    System.out.println("Patient details is deleted = "+ isPatientDelete);

            }
            System.out.println("Press yes/no to continue");

            userInput = sc.next() ;

        } while (userInput.equals("YES"));

        System.out.println("Thanks for using");
        // hospital.getAllPatient();

//            System.out.println("Enter the patiant Id to get doctoreName");
//            String doctorName= hospital.getTheDoctorNameByPatientId(sc.nextInt());
//            System.out.println("the doctoreName is:" + doctorName);
//
//
//            System.out.println("Enter The PatientId to get Patientdisease");
//            String DiseaseName =hospital.getThePatientDiseaseNameById(sc.nextInt());
//            System.out.println("The Disease Name is = "+ DiseaseName);
//
//
//            System.out.println("Enter the patient name for to get patient gender");
//            Gender gender=hospital.getPatientGenderByPatientName(sc.next());
//            System.out.println("the gender is = "+ gender);
//
//
//            System.out.println("Enter the patientId to get patientDetails");
//            PatientDTO patient = hospital.getThePatientDetailsByPatientId(sc.nextInt());
//            System.out.println("The PatientDetails are + "+ patient);
//
//            System.out.println("Enter the patientId to get PatientAddress");
//
//            String address=hospital.getThePatientAddressByPatientId(sc.nextInt());
//            System.out.println("the address oa patient is = "+ address);
//
//            System.out.println("Enter the patientName to get patientBloodGroup");
//            BloodGroup bloodGroup = hospital.getTheBloodGroupOfPatientByPatientName(sc.next());
//            System.out.println("the bloodgroup is +" + bloodGroup);
//
//            System.out.println("Enter the patientName to update the patientDisease");
//
//            String patientName = sc.next();
//
//            System.out.println("Enter the new diseaseName for Patient Name");
//
//
//            boolean dieaseUpdated = hospital.upDatePatientDiseaseByPatientName(sc.next(), sc.next());
//              boolean isUpdateDisease = hospital.upDatePatientDiseaseByPatientName(sc.next(), sc.next()) ;
//            System.out.println("Updated patientDiseaseName is = " + dieaseUpdated);

        //  System.out.println("After UpDating the patientDiseaseName ------------------------");

        //1
//             hospital.getAllPatient();
    }
}


//partiall information abstract class
//class = compit information/representation of object, concret methode , with body
//
