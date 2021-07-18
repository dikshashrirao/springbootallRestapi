package com.cjc.springbootcrudhibernate.app.servicei;

import com.cjc.springbootcrudhibernate.app.model.User;

public interface UserServiceI {
	
	public void saveUser(User u);

	public Iterable<User> getAllUser();

	public void deleteData(User u);

	public Iterable<User> singleUser(String uname, String password);

	public User editUser(int uid);

	public void updateUser(User u);

}
