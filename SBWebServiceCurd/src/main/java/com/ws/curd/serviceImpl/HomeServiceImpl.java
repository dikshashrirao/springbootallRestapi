package com.ws.curd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.curd.model.User;
import com.ws.curd.repositor.HomeRepositoy;
import com.ws.curd.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{

	@Autowired 
	HomeRepositoy hr;
	
	@Override
	public Iterable<User> getAllUser() {
		return hr.findAll();
	}

	@Override
	public User getOneUser(String un, String ps) {
		return hr.findByUnAndPs(un,ps);
	}

	@Override
	public void saveData(User u) {
		hr.save(u);
	}

	@Override
	public void updateUserData(User u) {
		hr.save(u);	
	}

	@Override
	public void deleteUserData(int uid) {
		hr.deleteById(uid);
	}

}
