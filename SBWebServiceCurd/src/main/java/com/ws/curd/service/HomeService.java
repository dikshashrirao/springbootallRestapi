package com.ws.curd.service;

import com.ws.curd.model.User;

public interface HomeService {

public Iterable<User> getAllUser();

public User getOneUser(String un, String ps);

public void saveData(User u);

public void updateUserData(User u);

public void deleteUserData(int uid);

}
