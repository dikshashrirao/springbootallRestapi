package com.cjc.app.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.model.Book;
@Repository
public interface BookRepositary extends CrudRepository<Book, Integer> {

}
