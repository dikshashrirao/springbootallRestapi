package com.cjc.app.servicei;

import java.util.List;

import com.cjc.app.model.Book;

public interface BookServiceI {

public	Book saveBook(Book k);

public List<Book> getBooks();

public String deleteBook(Integer id);

public Book upadateBook(Book k);

}
