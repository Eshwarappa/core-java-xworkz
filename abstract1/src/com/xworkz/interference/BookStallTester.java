package com.xworkz.interference;

import com.xworkz.interference.dto.BookDTO;
import com.xworkz.interference.hospital.BookStall;
import com.xworkz.interference.imliment.ManjuBookStallImp;

import java.util.Arrays;
import java.util.Scanner;

public class BookStallTester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter te bookStall size");
        int size = scanner.nextInt();
        BookStall bookStall = new ManjuBookStallImp(scanner.nextInt());
        ManjuBookStallImp manjuBookStallImp = new ManjuBookStallImp(size) ;
        for (int index=0; index<manjuBookStallImp.bookDTO.length; index++) {


            BookDTO book = new BookDTO();

            System.out.println("Enter the BookId");
            book.setBookId(scanner.nextInt());

            System.out.println("Enter the BookName");
            book.setBookName(scanner.next());

            System.out.println("Enter the Author Name");
            book.setAuthorName(scanner.next());

            System.out.println("Enter the price of the book");
            book.setPrice(scanner.nextDouble());

            System.out.println("Enter the Number of Pages");
            book.setNoOfPages(scanner.nextInt());

            System.out.println("Enter the PublisherName");
            book.setPublisherName(scanner.next());

            System.out.println("Enter the Publisher Date");
            book.setPublishDate(scanner.next());

            bookStall.addBookDetails(book);

        }

        //bookStall.getAllDetails();

        String userInput = null ;

        do {
            System.out.println("Press 1. To get Patient's details");
            System.out.println("Press2. To get Author Name");
            System.out.println("Press 3. To get Author Name");
            System.out.println("Press 4. To get Book Price");
            System.out.println("Press 5. To upDate BookPrice");
            System.out.println("Press 6. To upDate pages");
            System.out.println("Press 7. To delete book ");
            System.out.println("Press 8. To get SameYearBooksName");
            System.out.println("Press 9. To get book");

            int option = scanner.nextInt() ;
            switch (option){
                case 1: bookStall.getAllDetails();
                    break ;

                case 2:
                    System.out.println("Enter the BookId ");
                    String bookName = bookStall.getBookNameByBookId(scanner.nextInt()) ;
                    System.out.println("the Book Name : "+ bookName);

                        break;

                case 3:
                    System.out.println("Enter the book Name");
                    String authorName = bookStall.getAuthorNameByBookName(scanner.next()) ;
                    System.out.println("Author Name is :" +authorName);
                    break;

                case 4:
                    System.out.println("Enter the BookName");
                    double price = bookStall.getBookPriceByBookName(scanner.next());
                    System.out.println("The Price of the Book :" +price);
                    break;

                case 5 :
                    System.out.println("Enter the BookName");
                    String bookNames = scanner.next();
                    System.out.println("Enter the updated Prices");
                    double prices = scanner.nextDouble();
                    boolean  upDate = bookStall.upDateTheBookPriceByBookName(prices,bookNames) ;
                    System.out.println("UpDated Price is :"+upDate);
                    break;

                case 6 :
                    System.out.println("Enter the BookId");
                    int id = scanner.nextInt();

                    System.out.println("Enter new pages ");
                    int pages = scanner.nextInt();
                    boolean updatePages= bookStall.updateBookPagesByBookId(pages,id) ;
                    System.out.println(updatePages);


                case 7 :
                    System.out.println("Enter the BookId");
                    boolean delete = bookStall.deleteTheBookByBookId(scanner.nextInt()) ;
                    System.out.println("deleted : "+delete);
                    break;

                case 8 :
                    System.out.println("Enter the PublishDate");
                    //String book= Arrays.toString(bookStall.getBookByAuthor(scanner.next()));
                    BookDTO[] samePublisherDate = bookStall.getBookNameByPublishDate(scanner.next());
                    System.out.println("****************************");
                    for (BookDTO dto : samePublisherDate)
                    {
                        System.out.println(dto.toString());
                    }

                    break;

                case 9 :
                    System.out.println("Enter the Author Name");
                    //String books = String.valueOf(bookStall.getBookByPublisherName(scanner.next()));
                    BookDTO[] sameBookName = bookStall.getBookNameByAuthorName(scanner.next());
                    for (BookDTO dto:sameBookName) {
                        System.out.println(dto.toString());
                    }

            }
            System.out.println("Press yes/no to continue");

            userInput = scanner.next() ;
        }while (userInput.equals("YES"));

        System.out.println("Thanks for using");
    }
}
