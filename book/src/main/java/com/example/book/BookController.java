package com.example.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/add-book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        String bk = bookService.addBook(book);
        return new ResponseEntity<>(bk, HttpStatus.CREATED);
    }

    @PostMapping("/add-author")
    public ResponseEntity<String> addAuthor(@RequestBody Author author){
        String auth = bookService.addAuthor(author);
        return new ResponseEntity<>(auth, HttpStatus.CREATED);
    }

    @PutMapping("/update-book/{bookname}")
    public ResponseEntity<String> updateBook(@PathVariable("bookname") String bookName, @RequestParam("pageNum") int pageNum){
        return new ResponseEntity<>(bookService.updateBook(bookName,pageNum), HttpStatus.FOUND);
    }

    @GetMapping("/get-hpbook")
    public ResponseEntity<String> getHighestPageBook(){
        return new ResponseEntity<>(bookService.getHighestPageBook(),HttpStatus.FOUND);
    }

    @GetMapping("/get-authmaxpage")
    public ResponseEntity<Author> authorHighestPage(){
        return new ResponseEntity<>(bookService.authorHighestPage(),HttpStatus.FOUND);
    }

    @GetMapping("/get-topratedbook")
    public ResponseEntity<String> topratedBook(){
        return new ResponseEntity<>(bookService.topratedBook(),HttpStatus.FOUND);
    }

    @GetMapping("/get-allBook")
    public ResponseEntity <List<Book>> allbook(){
        return new ResponseEntity<>(bookService.getAllBook(),HttpStatus.FOUND);
    }

    @GetMapping("/get-allAuthor")
    public ResponseEntity<List<Author>> allauthor(){
        return new ResponseEntity<>(bookService.getAllAuthor(),HttpStatus.FOUND);
    }

}
