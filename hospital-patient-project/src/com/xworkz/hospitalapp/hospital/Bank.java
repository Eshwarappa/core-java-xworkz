package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.dto.BankCustomerDTO;
import com.xworkz.hospitalapp.dto.PatientDTO;

public class Bank {

   public BankCustomerDTO bankCustomerDTO[] ;    //instance variable

     int index ;

     public Bank(int size)   //Constructor is used to initialize the instance variable
     {
         bankCustomerDTO = new BankCustomerDTO[size] ;
     }


     public boolean creatAccount(BankCustomerDTO bankCustomer)
     {
         boolean isCreatAccount = false ;
         if (bankCustomer!=null)
         {
         this.bankCustomerDTO[index++] = bankCustomer ;
         isCreatAccount = true ;
         }
         else
         {
             System.out.println("Please Enter the bankCustomer Details");
         }

         return isCreatAccount ;

     }
        public void getAllCustomerDetails()
        {
            for (int index=0 ; index<bankCustomerDTO.length ; index++)
            {
                System.out.println(bankCustomerDTO[index]);
            }

        }

        public String getCustomerNameByCustomerAccountNumber(long customerAccountNumber)
        {
            String customerName = null ;
            for (int index=0 ; index< bankCustomerDTO.length ; index++)
            {
                if (bankCustomerDTO[index].getAccountNumber() == customerAccountNumber);
                {
                       customerName=bankCustomerDTO[index].getCustomerName();
                }
            }
            return customerName;
        }
            public long getCustomerPhoneNumberByCustomerAccountNumber(long customerAccountNumber)
            {
                long customerPhoneNumber = 0 ;
                for (int index=0 ; index<bankCustomerDTO.length ; index++)
                {
                    if (bankCustomerDTO[index].getAccountNumber()==customerAccountNumber)
                    {
                        customerPhoneNumber=bankCustomerDTO[index].getPhoneNumber() ;
                    }
                }
                return customerPhoneNumber;
            }

            public long getCustomerAccountNumberByCustomerPhoneNUmber(long customerPhoneNumber)
            {
                long customerAccountNumber = 0 ;
                for (int index=0; index<bankCustomerDTO.length; index++)
                {
                    if (bankCustomerDTO[index].getPhoneNumber()==customerPhoneNumber)
                    {
                        customerAccountNumber=bankCustomerDTO[index].getAccountNumber();
                    }
                }

                return customerAccountNumber;
            }
}
