package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.dto.BankDTO;
import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.exception.*;
import com.xworkz.hospitalapp.hospital.Banks;

import java.util.Scanner;

public class BanksTester {

//    public static void main(String[] args) {
//
//        Scanner scanner=new Scanner(System.in) ;
//        System.out.println("Enter the size of the bank");
//        int size =scanner.nextInt() ;
//        Banks banks = new Banks(size);
//
//        for (int index=0; index<banks.bankDTO.length; index++) {
//
//            BankDTO bankDTO4 = new BankDTO();
//
//            System.out.println("enter id");
//            bankDTO4.setBankId(scanner.nextInt());
//
//            System.out.println("Enter the bankName");
//            bankDTO4.setBankName(scanner.next());
//
//            System.out.println("enter branch");
//            bankDTO4.setBranch(scanner.next());
//            //System.out.println(bankDTO4);
//            banks.addBankDetails(bankDTO4);
//            //banks.getAllDetails();
//
////            System.out.println("enter the id to delete");
////            boolean isDelete = banks.isDeleted(scanner.nextInt());
////            System.out.println(isDelete);
//        }
//        banks.getAllDetails();
//        System.out.println("enter the id to delete");
//        boolean isDelete = banks.isDeleted(scanner.nextInt());
//        System.out.println(isDelete);
//
//       // banks.getAllDetails();
//
//
//
//    }



    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("entre the size");

        int size = scanner.nextInt() ;
        Banks banks = new Banks(size) ;

        for (int index=0; index<banks.bank.length;index++) {

            BankDTO bankDTO = new BankDTO();

            System.out.println("Enter the Bank id");
            bankDTO.setBankId(scanner.nextInt());

            System.out.println("Enter bank name");
            bankDTO.setBankName(scanner.next());

            System.out.println("Enter the Branch name");
            bankDTO.setBranch(scanner.next());

            System.out.println("Enter contact number ");
            bankDTO.setContactNumber(scanner.nextLong());

            System.out.println("Enter the bank IFSC code");
            bankDTO.setIfscCode(scanner.next());

            banks.addBankDetails(bankDTO);

        }
//
//            String userInput = null ;
//            boolean YES = false ;
//
//        do {
//
//            System.out.println("press1 :to get bankDetails ");
//            System.out.println("Press 2 : to get BankName");
//            System.out.println("Press 3: to upDate ");
//            System.out.println("Press 4: to Delete");
//
//            int option = scanner.nextInt();
//            switch (option){
//                case 1 :
//                    banks.getAllDetails();
//                    break;
//
//                    case 2:
//                        System.out.println("Bank Id ");
//                      String name = banks.getBankNameByBankId(scanner.nextInt());
//                        System.out.println(name);
//                        break ;
//                case 3:
//                    System.out.println("Enter old contact Number");
//                    long oldNumber = scanner.nextLong() ;
//                    System.out.println("Enter new contact Number");
//                    long newNumber = scanner.nextLong() ;
//
//                    boolean isUpdated = banks.updateContactNumber(oldNumber,newNumber) ;
//                    System.out.println(isUpdated);
//                    break ;
//
//                case 4 :
//                    System.out.println("enter BankId");
//                     boolean isDelete = banks.delete(scanner.nextInt()) ;
//                    System.out.println(isDelete);
//
//
//
//
//            }
//            System.out.println("Enter yes/no to continue");
//
//            String userInputs = scanner.next();
//
//        }while (userInput.equals(YES));
//        System.out.println("thanks for visiting");



String userInput= null ;


        boolean YES = false;
        do {
            System.out.println("press1 :to get bankDetails ");
            System.out.println("Press 2 : to get BankName");
            System.out.println("Press 3: to upDate ");
            System.out.println("Press 4: to Delete");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    banks.getAllDetails();
                    break;

                    case 2:
                        System.out.println("Bank Id ");
                        try {
                            String name = banks.getBankNameByBankId(scanner.nextInt());
                            System.out.println(name);
                        }catch(BankNameNotFoundException ba)
                        {
                            ba.printStackTrace();
                            System.out.println("Bank Name is not found for this id ");
                        }
//                        finally {
//                            scanner.close();
//                        }
                        break ;
                case 3:
                    System.out.println("Enter old contact Number");
                    long oldNumber = scanner.nextLong() ;
                    System.out.println("Enter new contact Number");
                    long newNumber = scanner.nextLong() ;

                    boolean isUpdated = banks.updateContactNumber(oldNumber,newNumber) ;
                    System.out.println(isUpdated);
                    break ;

                case 4 :
                    System.out.println("enter BankId");
                    try {
                        boolean isDelete = banks.delete(scanner.nextInt());
                        System.out.println(isDelete);
                    }catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }

            }
            System.out.println("enter yes/no");
             userInput = scanner.next();


        } while (userInput.equals("YES"));

        System.out.println("Thanks for using");





           // bankDTO.display();
    }




}
