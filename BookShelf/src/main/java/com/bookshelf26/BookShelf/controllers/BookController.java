package com.bookshelf26.BookShelf.controllers;

import com.bookshelf26.BookShelf.modals.Book;

import org.springframework.ui.Model;
import com.bookshelf26.BookShelf.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@Controller("/")
public class BookController {
    private final BookService bookService;


    @GetMapping("/")
    public String books(Model model){
        model.addAttribute("books",bookService.list());
        return "books";
    }
    @GetMapping("/book/{id}")
    public String bookInfo(@PathVariable Long id, Model model){
        model.addAttribute("book",bookService.getBookID(id));
        return "book-info";

    }
    @PostMapping("/book/create")
    public String createBook(Book book){
        bookService.saveBook(book);
        return "redirect:/";
    }
    @PostMapping("/book/delete/{id}")
    public String deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return "redirect:/";
    }
}
