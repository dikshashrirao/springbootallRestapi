package com.cjc.springboot.mvc.springbootmvc.service;

import java.util.List;

import com.cjc.springboot.mvc.springbootmvc.model.User;

public interface HomeService {

	public void save(User user);

	public User logincheck(String un, String pass);

	public Iterable<User> getAllData();

	public void deleteData(User u);

	public User editData(int uid);


}
