package com.cjc.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.model.Book;
import com.cjc.app.servicei.BookServiceI;

@RestController
public class BookController {
	@Autowired
	BookServiceI bsi;
	
	@RequestMapping(value = "/book",method = RequestMethod.POST)
	//@PostMapping("/book")
	public ResponseEntity<Book> saveBook(@RequestBody Book k) {
			Book k1=bsi.saveBook(k);
		return new ResponseEntity<>(k1,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/books",method = RequestMethod.GET,produces = {"application/json"})
	//@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks(){
		
		List<Book> l=bsi.getBooks();
		return new ResponseEntity<List<Book>>(l,HttpStatus.OK);
	}
	
	//@RequestMapping(value = "/book/{id}",method = RequestMethod.DELETE)
	@DeleteMapping("/book/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id){
		System.out.println("in delete");
		if(id==0) {
			System.out.println(id);
			return new ResponseEntity<String>("bad request",HttpStatus.BAD_REQUEST);
		}else {
		bsi.deleteBook(id);
		}
		return new ResponseEntity<String>("book deleted successfully",HttpStatus.OK);
	}
	
	//@RequestMapping(value = "/book/{id}",method = RequestMethod.PUT)
	@PutMapping(value = "/book/{id}",consumes = "application/json")
	public ResponseEntity<Book> upadateBook(@PathVariable Integer id,@RequestBody Book k){
					
		Book book;
		try {
			book = bsi.upadateBook(k);
			if(book==null) {
				return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
			}
			
			
		} catch (Exception e) {
			return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	

}
