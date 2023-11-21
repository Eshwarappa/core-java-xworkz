package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.dto.CustomerDTO;
import com.xworkz.hospitalapp.exception.CustomerEmailIdNotFoundException;
import com.xworkz.hospitalapp.hospital.ECommerce;

import java.util.Scanner;

public class ECommerceCustomerTester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of customers");
        int size = scanner.nextInt();

        ECommerce eCommerce = new ECommerce(size);

        for (int index = 0; index < eCommerce.customerDTO.length; index++) {

            CustomerDTO customer = new CustomerDTO();

//            System.out.println("Enter the CustomerId");
//            customer.setCustomerId(scanner.nextInt());

            System.out.println("Enter the CustomerName");
            customer.setCustomerName(scanner.next());

            System.out.println("Enter the customerPhoneNumber");
            customer.setCustomerEmail(scanner.next());

            System.out.println("Enter the customerEmail");
            customer.setCustomerEmail(scanner.next());

            System.out.println("Enter the CustomerGender");
            customer.setGender(Gender.valueOf(scanner.next()));

            System.out.println("Enter the CustomerBloodGroup");
            customer.setBloodGroup(BloodGroup.valueOf(scanner.next()));

            System.out.println("Enter the customer Password");
            customer.setCustomerPassword(scanner.next());

            System.out.println("Enter the customer address");
            customer.setCustomerAddress(scanner.next());

            eCommerce.saveCustomerData(customer);

        }
        String userInput = null;

        //boolean yes = false ;
        do {

            System.out.println("Press 1 : for to get all customer Details");
            System.out.println("press 2, to get customer Address ");
            System.out.println("press 3 : to upDateCustomerEmailByCustomerPhoneNumber");


            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    eCommerce.getAllCustomerDetails();
                    break;

                case 2:
                    System.out.println("Enter the customerId");
                    String customerAddress = eCommerce.getTheAddressOfTheCustomerByCustomerId(scanner.nextInt());
                    System.out.println(customerAddress);
                    break;

                case 3:
                    System.out.println("getCustomerEmailByCustomerPhoneNumber");
                    try {
                        String getCustomerEmailByCustomerPhoneNumber = eCommerce.getCustomerEmailByCustomerPhoneNumber(scanner.nextLong());
                        System.out.println(getCustomerEmailByCustomerPhoneNumber);
                    } catch (CustomerEmailIdNotFoundException ce) {
                        ce.printStackTrace();
                    }

                case 4:

                    try {
                        System.out.println("Enter customerPhoneNumber");
                        long customerNumber = scanner.nextLong();

                        System.out.println("Enter customerUpdatedEmailId");
                        String upDatedCustomerEmailId = scanner.next();

                        eCommerce.upDateCustomerEmailByCustomerPhoneNumber(upDatedCustomerEmailId, customerNumber);
                    } catch (CustomerEmailIdNotFoundException ce) {
                        ce.printStackTrace();
                    }
            }
                    System.out.println("Press yes/no to continue");

                    userInput = scanner.next();

            }
            while (userInput.equals("YES")) ;

            System.out.println("thank u");


//            eCommerce.getAllCustomerDetails();
//
//        System.out.println("Enter the customerId to get customerAddress");
//        String customerAddress = eCommerce.getTheAddressOfTheCustomerByCustomerId(scanner.nextInt()) ;
//
//        System.out.println("The customerAddress is = " + customerAddress );
//
//        System.
//        out.println("Enter the customerId to get customerEmail and customerPassword");
//        String customerEmail = eCommerce.getTheCustomerEmailAndCustomerPasswordByCustomerId(scanner.nextInt());
//        String customerPassword = eCommerce.getTheCustomerEmailAndCustomerPasswordByCustomerId(scanner.nextInt()) ;
//
//        System.out.println("The cuatomerEmail is = "+customerEmail);
//        System.out.println("the customerPassword is = "+customerPassword);


        }
    }

