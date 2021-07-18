package com.cjc.springboot.mvc.springbootmvc.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.springboot.mvc.springbootmvc.model.User;

@Repository
public interface HomeRepository extends CrudRepository<User, Integer>{

	public User findByUnameAndPassword(String un, String pass);

	public User findByUid(int uid);

}
