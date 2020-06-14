package com.bookstore.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bookstore.entity.Users;

public class UserDAOTest {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDAO userDao;
	
	@BeforeClass
	public static void setup() {
		
		 entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		 entityManager=entityManagerFactory.createEntityManager();
		
		 userDao=new UserDAO(entityManager);
	}

	@Test
	public void testCreateUsers() {
		
		Users user1=new Users();
		user1.setEmail("Sh@yahoo.com");
		user1.setFullName("somigg");
		user1.setPassword("ezzigg");
	
		user1= userDao.create(user1);
		
		assertTrue(user1.getUserId()>0);
	}
	
	@Test(expected = PersistenceException.class)
	public void testCreateUserNotNull() {
		
		Users user1=new Users();
		
		user1= userDao.create(user1);
		
	}
	
	
	
	@AfterClass
	public static void tearDown() {
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
	
	
	
	
	
	
	

}
