package com.bookshelf26.BookShelf;

import com.bookshelf26.BookShelf.modals.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private  List<Book> books = new ArrayList<>();
    private long ID=0;
    {
        books.add(new Book(++ID,"золтая рыбка","Пушкин",1800,"норм","Николай"));
        books.add(new Book(++ID,"7 богатырей","Пушкин",1888,"норм","Тимоха"));
    }
    public List<Book> list(){return books;}
    public void saveBook(Book book){
        book.setId(++ID);
        books.add(book);
    }
    public void deleteBook(Long id){
        books.removeIf(book -> book.getId().equals(id));
    }

    public Book listBooks() {

        return null;
    }

    public Book getBookID(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id))return book ;
        }
        return null;
    }
}