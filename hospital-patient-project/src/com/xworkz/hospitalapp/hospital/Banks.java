package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.dto.BankDTO;
import com.xworkz.hospitalapp.exception.BankIdNotFoundException;
import com.xworkz.hospitalapp.exception.BankNameNotFoundException;

import java.util.Arrays;

public class Banks {
//  public   BankDTO bankDTO[] ;
//
//    public Banks(int size)
//    {
//        bankDTO = new BankDTO[size] ;
//    }
//
//    int index ;
//
//
//    public boolean addBankDetails(BankDTO bankDTO1)
//    {
//        boolean isAdd = false ;
//
//        if (bankDTO1!=null)
//        {
//            this.bankDTO[index++] = bankDTO1 ;
//
//            isAdd = true ;
//        }
//        else
//        {
//            System.out.println("null point not allowed");
//        }
//
//
//        return isAdd ;
//    }
//
//    public void getAllDetails()
//    {
//        for (int index=0; index<bankDTO.length; index++)
//        {
//            System.out.println(bankDTO[index]);
//        }
//    }
//
//    public boolean isDeleted(int bankId)
//    {
//        boolean isDelete = false ;
//            int newIndex = 0 ;
//        for (int index=0; index<bankDTO.length; index++)
//        {
//            if (!(bankDTO[index].getBankId()==bankId))
//            {
//                bankDTO[newIndex++] = bankDTO[index] ;
//                isDelete = true ;
//            }
//        }
//
//        bankDTO = Arrays.copyOf(bankDTO,newIndex) ;
//        System.out.println(Arrays.toString(bankDTO));
//        return  isDelete ;
//
////        bankDTO = Arrays.copyOf(bankDTO,newIndex);
////        System.out.println(Arrays.toString(bankDTO));
////        return isDelete;
//    }
//
//    public  String getBankNameByBankId(int bankId)
//    {
//        String bankName = null ;
//
//        for ( int index=0; index<bankDTO.length; index++)
//        {
//            if (bankDTO[index].getBankId()==bankId)
//            {
//                bankName = bankDTO[index].getBankName() ;
//            }
//        }
//        return bankName ;
//    }

    public BankDTO[] bank;
    int index;
    public Banks(int size)
    {
        bank = new BankDTO[size] ;
    }

    public boolean addBankDetails(BankDTO bank1)
    {
        boolean isAdd = false ;

        if (bank1!=null)
        {
          bank[index++] = bank1 ;

          //this.bank[index].display() ;
          isAdd = true ;
        }

        return isAdd ;
    }


    public void getAllDetails()
    {
        for (BankDTO str :bank)
        {
            System.out.println(str);
        }
    }

   ;
    public String getBankNameByBankId( int bankId )
    {


        String bankName = null ;

        for (int index=0; index<bank.length; index++)
        {
            if (bank[index].getBankId()==bankId)
            {
                       bankName= bank[index].getBankName();
            }
        }
        if (bankName==null)
        {
         throw new BankNameNotFoundException("Bank Name is not found for this id :"+bankId) ;

        }

        return bankName;
    }

    public boolean updateContactNumber(long oldNumber,long newNumber)
    {
        boolean isUpdated=false ;

        for (int index=0; index<bank.length; index++)
        {
            if (bank[index].getContactNumber()==oldNumber)
            {
                bank[index].setContactNumber(newNumber);

                isUpdated = true ;
            }
        }

        return isUpdated ;
    }

    public boolean delete(int id) throws Exception
    {
        boolean isDelete = false ;
        int newIndex = 0 ;
        for (int index=0; index<bank.length; index++)
        {
            if (!(bank[index].getBankId()==id))
            {
                bank[newIndex++] = bank[index] ;

                isDelete = true ;
            }
        }

        if (!isDelete==false)
        {
            throw new BankIdNotFoundException("Bank id is Not found for this :"+id) ;
        }

            bank=Arrays.copyOf(bank,newIndex) ;
        System.out.println(Arrays.toString(bank));


        return isDelete;
    }
}

