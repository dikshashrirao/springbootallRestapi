package com.cjc.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.model.Book;
import com.cjc.app.repositary.BookRepositary;
import com.cjc.app.servicei.BookServiceI;
@Service
public class BookServiceImpl implements BookServiceI{

	@Autowired
	BookRepositary br;
	
	@Override
	public Book saveBook(Book k) {
		
		return br.save(k);
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return (List<Book>) br.findAll();
	}

	@Override
	public String deleteBook(Integer id) {
		// TODO Auto-generated method stub
		 br.deleteById(id);
		 return "book deleted successful";
	}

	@Override
	public Book upadateBook(Book k) {
		return br.save(k);
	}

}
