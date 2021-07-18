package com.cjc.springbootcrudhibernate.app.daoi;

import com.cjc.springbootcrudhibernate.app.model.User;

public interface UserDaoI {

public	void saveUser(User u);

public Iterable<User> getAllUser();

public void deleteData(User u);

public Iterable<User> singleUser(String uname, String password);

public User editUser(int uid);

public void updateUser(User u);

}
