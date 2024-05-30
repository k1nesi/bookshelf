package com.bookshelf26.BookShelf.modals;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
private Long id;
    private String nameBook;
    private String author;
    private int year_of_release;
    private String description;
    private String user;



}
