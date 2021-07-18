package com.cjc.springboot.mvc.springbootmvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springboot.mvc.springbootmvc.model.User;
import com.cjc.springboot.mvc.springbootmvc.repo.HomeRepository;
import com.cjc.springboot.mvc.springbootmvc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
  @Autowired
  HomeRepository hr;
  
	@Override
	public void save(User user) {
		hr.save(user);
	}

	@Override
	public User logincheck(String un, String pass) {
		return hr.findByUnameAndPassword(un, pass);
	}

	@Override
	public Iterable<User> getAllData() {
		return hr.findAll();
	}

	@Override
	public void deleteData(User u) {
		hr.delete(u);
	}

	@Override
	public User editData(int uid) {
		return hr.findByUid(uid);
	}

	

}
