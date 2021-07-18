package com.cjc.springbootcrudhibernate.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springbootcrudhibernate.app.daoi.UserDaoI;
import com.cjc.springbootcrudhibernate.app.model.User;
import com.cjc.springbootcrudhibernate.app.servicei.UserServiceI;
@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	UserDaoI udi;
	
	@Override
	public void saveUser(User u) {
		udi.saveUser(u);
	}

	@Override
	public Iterable<User> getAllUser() {
		return udi.getAllUser();
	}

	@Override
	public void deleteData(User u) {
		udi.deleteData(u);
	}

	@Override
	public Iterable<User> singleUser(String uname, String password) {
		return udi.singleUser(uname,password);
	}

	@Override
	public User editUser(int uid) {
		return udi.editUser(uid);
	}

	@Override
	public void updateUser(User u) {
		 udi.updateUser(u); 
	}

}
