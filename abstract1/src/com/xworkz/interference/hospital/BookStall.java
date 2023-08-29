package com.xworkz.interference.hospital;

import com.xworkz.interference.dto.BookDTO;

public interface BookStall {

    public boolean addBookDetails(BookDTO books) ;

    public void getAllDetails() ;

    public String getBookNameByBookId(int bookId) ;

    public String getAuthorNameByBookName(String bookName) ;

    public double getBookPriceByBookName(String bookName) ;

    public boolean upDateTheBookPriceByBookName(double upDatePrice,String bookName) ;

    public boolean updateBookPagesByBookId(int pages ,int bookId) ;

    public boolean deleteTheBookByBookId(int bookId) ;

    public BookDTO[] getBookNameByAuthorName(String authorName) ;

    public BookDTO[] getBookNameByPublishDate( String publishDate) ;
}
