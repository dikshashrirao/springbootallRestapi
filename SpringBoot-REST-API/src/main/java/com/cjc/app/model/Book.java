package com.cjc.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity

public class Book {
	@Id
	private int bookId;
	private String bookName;
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

}
