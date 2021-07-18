package com.cjc.springbootcrudhibernate.app.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.springbootcrudhibernate.app.daoi.UserDaoI;
import com.cjc.springbootcrudhibernate.app.model.User;
@Repository
public class UserDaoImpl implements UserDaoI {

	@Autowired
	SessionFactory sf;
	
	@Override
	public void saveUser(User u) {
		Session session=sf.openSession();
		session.save(u);
		session.beginTransaction().commit();
	}

	@Override
	public Iterable<User> getAllUser() {
		Session session=sf.openSession();
		List<User> l=session.createQuery("from User",User.class).getResultList();
		session.beginTransaction().commit();
		return l;
	}

	@Override
	public void deleteData(User u) {
		Session session=sf.openSession();
		session.delete(u);
		session.beginTransaction().commit();
		
	}

	@Override
	public Iterable<User> singleUser(String uname, String password) {
		Session session=sf.openSession();
		Query<User> q=session.createQuery("from User where uname=:uname and password=:password",User.class);
		q.setParameter("uname",uname );
		q.setParameter("password", password);
		List<User>l=q.getResultList();
		session.beginTransaction().commit();
		return l;
	}

	@Override
	public User editUser(int uid) {
		Session session=sf.openSession();
		Query<User> q=session.createQuery("from User where uid=:uid",User.class);
		q.setParameter("uid",uid );
	    User user=q.getSingleResult();
		session.beginTransaction().commit();
		return user;
	}

	@Override
	public void updateUser(User u) {
		Session session=sf.openSession();
	//	session.saveOrUpdate(u); from here also we get same result as update
		session.update(u);
		session.beginTransaction().commit();
	}

}
