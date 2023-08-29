package com.xworkz.interference.imliment;

import com.xworkz.interference.dto.BookDTO;
import com.xworkz.interference.hospital.BookStall;

import java.util.Arrays;

public class ManjuBookStallImp implements BookStall {

    public BookDTO bookDTO[] ;

    public  ManjuBookStallImp(int size)
    {
        bookDTO = new BookDTO[size];
    }

    int index ;


    public boolean addBookDetails(BookDTO books)    //parameter methode
    {
        boolean isAdded = false;

        if (bookDTO!=null)
        {
            this.bookDTO[index++] =books ;

            isAdded = true ;
        }
        else
        {
            System.out.println("Please add the book details");
        }
        return isAdded;
    }
    public void getAllDetails()
    {
        for (int index=0 ; index<bookDTO.length ; index++)
        {
            System.out.println(bookDTO[index]);
        }
    }

    public String getBookNameByBookId(int bookId)
    {
        String bookName = null ;

        for (int index=0; index<bookDTO.length; index++)
        {
            if (bookDTO[index].getBookId()==bookId)
            {
                bookName = bookDTO[index].getBookName() ;
            }
        }
        return bookName;
    }

    public String getAuthorNameByBookName(String bookName)
    {
        String authorName = null ;
        for (int index=0; index<bookDTO.length; index++)
        {
            if (bookDTO[index].getBookName().equals(bookName))
            {
                authorName = bookDTO[index].getAuthorName() ;
            }
        }
        return authorName ;
    }

    public double getBookPriceByBookName(String bookName) {
        double bookPrice = 0;

        for (int index = 0; index < bookDTO.length; index++) {
            if (bookDTO[index].getBookName().equals(bookName)) {
                bookPrice = bookDTO[index].getPrice();
            }
        }
        return bookPrice;
    }

    public boolean upDateTheBookPriceByBookName(double upDatePrice,String bookName)
    {
        boolean isUpDate = false ;

        for (int index=0; index<bookDTO.length; index++)
        {
            if (bookDTO[index].getBookName().equals(bookName))
            {
                bookDTO[index].setPrice(upDatePrice);

                isUpDate=true ;
            }
        }
        return isUpDate;
    }

    public boolean updateBookPagesByBookId(int pages ,int bookId)
    {
        boolean isUpdated=false ;
        for (int index=0; index<bookDTO.length; index++)
        {
            if (bookDTO[index].getBookId()==bookId)
            {
                bookDTO[index].setNoOfPages(pages);
                isUpdated=true;
            }
        }
        return isUpdated;
    }

    public boolean deleteTheBookByBookId(int bookId)
    {
        boolean isDelete=false ;
        int oldIndex, newIndex;
        for (oldIndex=0 ,newIndex=0;oldIndex<bookDTO.length; oldIndex++)
        {
            if (!(bookDTO[oldIndex].getBookId()== bookId))
            {
                bookDTO[newIndex++] = this.bookDTO[oldIndex];
            }
        }
        bookDTO = Arrays.copyOf(bookDTO , oldIndex) ;
        System.out.println(Arrays.toString(bookDTO));
        return isDelete;
    }

    public BookDTO[] getBookNameByAuthorName(String authorName)
    {
        BookDTO[] sameBookName=new BookDTO[index];
        for (int oldIndex=0,newIndex=0; oldIndex<bookDTO.length; oldIndex++)
        {
            if (bookDTO[index].getAuthorName().equals(authorName))
            {
                sameBookName[newIndex++]= this.bookDTO[oldIndex] ;
            }
        }

        return sameBookName ;
    }

    public BookDTO[] getBookNameByPublishDate(String publishDate)
    {
        BookDTO[] samePublisherDate = new BookDTO[index];
        for (int oldIndex=0 , newIndex=0; oldIndex<bookDTO.length; oldIndex++)
        {
            if (bookDTO[index].getPublishDate().equals(publishDate))
            {
                samePublisherDate[newIndex++] = bookDTO[oldIndex] ;
            }
        }
        return samePublisherDate;
    }
}
