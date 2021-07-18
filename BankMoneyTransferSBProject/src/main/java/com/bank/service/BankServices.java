package com.bank.service;

import java.util.Optional;

import com.bank.model.User;

public interface BankServices {

	public void save(User u);

	public Iterable<User> showAll();

	public User showOne(String un, String ps);

	public void deleteData(User u);

	public User editData(int uid);

	public User saveUpadateuser(User u);

}
