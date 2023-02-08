package com.example.book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String addBook(Book book){
       return bookRepository.saveBook(book);

    }

    public String addAuthor(Author author){
       return bookRepository.saveAuthor(author);
    }

    public String  updateBook(String name, int updatedPageNo){
        return  bookRepository.updateBook(name,updatedPageNo);
    }

    public String  getHighestPageBook(){
       return bookRepository.getHighestPageBook();
    }

    public Author authorHighestPage(){

        return  bookRepository.authorHighestPage();
    }

    public String topratedBook(){
        return bookRepository.topratedBook();
    }

    public List<Book> getAllBook(){
        return bookRepository.getAllBook();
    }
    public List<Author> getAllAuthor(){
        return bookRepository.getAllAuthor();
    }
}
