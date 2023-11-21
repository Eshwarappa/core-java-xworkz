package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.dto.BookDTO;

import java.util.Arrays;

public class BookStall {

   public BookDTO bookDTO[] ;

    public BookStall(int size)
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

    public double getBookPriceByBookName(String bookName)
    {
        double bookPrice = 0 ;

        for (int index=0; index<bookDTO.length; index++)
        {
            if (bookDTO[index].getBookName().equals(bookName))
            {
                bookPrice = bookDTO[index].getPrice() ;
            }
        }
        return bookPrice ;
    }
//    public BookDTO getBooksBYPublishDate(String publishDate)
//    {
//
//        BookDTO books = null ;
//            if (bookDTO[index].getPublishDate() == publishDate) {
//                books = bookDTO[index];
//
//        }
//
//
//        return books ;
//    }

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

    public BookDTO[] getBookByAuthor(String authorName)
    {
        String bookName=null;
        for (int index=0; index<bookDTO.length; index++)
        {
            if (bookDTO[index].getAuthorName()==authorName)
            {
                bookName= bookDTO[index].getBookName();
            }
        }

        return null;
    }

    public BookDTO[] getBookByPublisherName(String publisherName)
    {
        BookDTO book = null;
        for (int index=0; index<bookDTO.length; index++)
        {
            if (bookDTO[index].getPublisherName()==publisherName)
            {
                book = bookDTO[index];
            }
        }
        return new BookDTO[]{book};
    }

}
