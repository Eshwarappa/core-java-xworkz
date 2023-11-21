package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.dto.CustomerDTO;
import com.xworkz.hospitalapp.exception.CustomerEmailIdNotFoundException;



public class ECommerce {


     public CustomerDTO customerDTO[] ;


            //Constuctore with parameter
     public ECommerce(int size)
     {
         customerDTO=new CustomerDTO[size] ;          //which type of initilization
     }

     int index ;

         public int id ;
    public boolean saveCustomerData(CustomerDTO customerDTO)
    {
        boolean isSave = false ;

        if (customerDTO!=null)
        {
            customerDTO.setCustomerId(++id);
            this.customerDTO[index++] = customerDTO ;
            isSave = true ;

        }
        else
        {
            System.out.println("Save Customer Details");
        }
        return isSave;
    }

    public void getAllCustomerDetails()
    {

        for (int index = 0 ; index<customerDTO.length ; index++)
        {
            System.out.println(customerDTO[index]);
        }

    }

    //Return type  method with parameters
    public String getTheAddressOfTheCustomerByCustomerId(int customerId)
    {
        String address = null ;

          for (int index=0 ; index<customerDTO.length ; index++)

          {
              if (customerDTO[index].getCustomerId()==customerId)
              {
                address= customerDTO[index].getCustomerAddress() ;                 //Initialization


              }
          }
        return address;
    }

    public String getTheCustomerEmailAndCustomerPasswordByCustomerId(int customerId)
    {
        String customerEmail = null ;
        String customerPassword = null ;
        for (int index=0 ; index<customerDTO.length ; index++)
        {
            if (customerDTO[index].getCustomerId() == customerId)
            {
                customerEmail = customerDTO[index].getCustomerEmail();
                customerPassword = customerDTO[index].getCustomerPassword() ;

            }
        }
        return customerEmail;
    }





    public String getCustomerEmailByCustomerPhoneNumber(long customerNumber)
    {
        String customerEmailId = null ;

        for (int index=0; index<customerDTO.length; index++)
        {
            if (customerDTO[index].getCustomerPhoneNumber()==customerNumber)
            {
                   customerEmailId=customerDTO[index].getCustomerEmail() ;
            }
        }

        if (customerEmailId==null)
        {
            throw new CustomerEmailIdNotFoundException("EmailId is not found for :"+customerNumber);
        }
            return customerEmailId ;
    }

    public boolean upDateCustomerEmailByCustomerPhoneNumber(String upDatedEmailId, long phoneNumber)
    {
        boolean isUpDated = false ;

        for (int index=0; index<customerDTO.length; index++)
        {
            if (customerDTO[index].getCustomerPhoneNumber()==phoneNumber)
            {
                customerDTO[index].setCustomerEmail(upDatedEmailId);

                isUpDated= true ;
            }
        }
        if (isUpDated == false)
        {
            throw new CustomerEmailIdNotFoundException("Email is not found for :"+phoneNumber) ;
        }
        return isUpDated ;
    }




}
