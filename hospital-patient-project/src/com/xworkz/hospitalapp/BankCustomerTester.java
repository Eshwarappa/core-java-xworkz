package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constants.AccountType;
import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.dto.BankCustomerDTO;
import com.xworkz.hospitalapp.hospital.Bank;

import java.util.Scanner;

public class BankCustomerTester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter The Size Of The BankCustomer");
        int size = scanner.nextInt() ;
        Bank bank = new Bank(size) ;
        for (int index=0; index<bank.bankCustomerDTO.length; index++) {
            BankCustomerDTO bankCustomer = new BankCustomerDTO();
//
//        do {
//            System.out.println("Press 1 . to get customer's details");
//
//            int option = scanner.nextInt() ;
//
//            switch (option){
////
//                case 1 :
//                    System.out.println("Enter customer Account number ");
//                             String customerName = bank.getCustomerNameByCustomerAccountNumber(scanner.nextLong()) ;
//                    System.out.println("The name of the Bank Customer is = "+customerName );
////
//                 case 2 : System.out.println("Enter the CustomerAccountNumber ");
//                    long customerAccountNumber = scanner.nextLong() ;
//                    long accountNumber=bank.getCustomerPhoneNumberByCustomerAccountNumber(customerAccountNumber) ;
//                  System.out.println("The Customer AccountNumber is = " +accountNumber) ;

//            }
//        }

            System.out.println("Enter The BankName");
            bankCustomer.setBankName(scanner.next());

            System.out.println("Enter The Customer AccountNumber");
            bankCustomer.setAccountNumber(scanner.nextLong());

            System.out.println("Enter the Bank customerName");
            bankCustomer.setCustomerName(scanner.next());

            System.out.println("Enter the customer Gender");
            bankCustomer.setGender(Gender.valueOf(scanner.next()));

            System.out.println("Enter the phoneNumber");
            bankCustomer.setPhoneNumber(scanner.nextLong());

            System.out.println("Enter the customer accountType");
            bankCustomer.setAccountType(AccountType.valueOf(scanner.next()));

            System.out.println("Enter the customer address");
            bankCustomer.setCustomerAddress(scanner.next());

            bank.creatAccount(bankCustomer);
        }

        bank.getAllCustomerDetails();
    }
}
