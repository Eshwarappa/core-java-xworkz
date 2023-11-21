package com.xworkz.hospitalapp.dto;

import com.xworkz.hospitalapp.constants.BookType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BookDTO {

private int bookId ;
private String BookName ;
private String authorName ;
private double price;

private int noOfPages ;

private String publisherName ;

private String publishDate ;
private BookType bookType ;
}
