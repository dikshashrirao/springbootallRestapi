package com.ws.curd.repositor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ws.curd.model.User;


@Repository
public interface HomeRepositoy extends CrudRepository<User, Integer>{

	User findByUnAndPs(String un, String ps);

}
