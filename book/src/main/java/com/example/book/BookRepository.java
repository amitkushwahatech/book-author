package com.example.book;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {

    Map<String,Book> bookMap =new HashMap<>();
    Map<String, Author> authorMap = new HashMap<>();

    public String saveBook(Book book){
       bookMap.put(book.getBookName(),book) ;
       return "Success";
    }

    public String saveAuthor(Author author){
        authorMap.put(author.getAuthorName(),author) ;
        return "Success";
    }

    public String  updateBook(String name, int updatedPageNo){
        if(bookMap.containsKey(name)){
            bookMap.get(name).setPageNo(updatedPageNo);
        }
        return updatedPageNo+ " Successful" ;
    }

    public String  getHighestPageBook(){
        int max=0;
        String bookMax="";
        for(String b: bookMap.keySet()){
            if(bookMap.get(b).getPageNo()>max){
                max=bookMap.get(b).getPageNo();
                bookMax=bookMap.get(b).getBookName();
            }
        }
        return max + " no. of page " + bookMax;
    }

    public Author authorHighestPage(){
        int max=0;
        String bookMax="";
        Book nb = null;
        for(String b: bookMap.keySet()){
            if(bookMap.get(b).getPageNo()>max){
                max=bookMap.get(b).getPageNo();
                nb=bookMap.get(b);

            }
        }
       return  authorMap.get(nb.getAuthorName());
    }

    public String topratedBook(){
        double maxRate =0;
        String bookName="";
        for(String b: bookMap.keySet()){
            if(bookMap.get(b).getRatingBook()>maxRate){
                maxRate=bookMap.get(b).getRatingBook();
                bookName=bookMap.get(b).getBookName();
            }
        }
        return bookName + " " + maxRate;
    }

    public List<Book> getAllBook(){
        return new ArrayList<>(bookMap.values());

    }
    public List<Author> getAllAuthor(){
        return new ArrayList<>(authorMap.values());
    }

}

