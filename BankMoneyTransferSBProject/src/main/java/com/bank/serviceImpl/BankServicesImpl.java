package com.bank.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.User;
import com.bank.repository.BankUserRepository;
import com.bank.service.BankServices;

@Service
public class BankServicesImpl implements BankServices{

	@Autowired 
	BankUserRepository bur;
	
	@Override
	public void save(User u) {
	   bur.save(u);
	}

	@Override
	public Iterable<User> showAll() {
		return bur.findAll();
	}

	@Override
	public User showOne(String un, String ps) {
		User user= bur.getUserByUnAndPs(un,ps);
		 return user;
	}

	@Override
	public void deleteData(User u) {
	Optional<User> u1=bur.findById(u.getUid());
		bur.delete(u1.get());
	}

	@Override
	public User editData(int uid) {
		return bur.getById(uid);
	}

	@Override
	public User saveUpadateuser(User u) {
		return bur.save(u);
	}

}
