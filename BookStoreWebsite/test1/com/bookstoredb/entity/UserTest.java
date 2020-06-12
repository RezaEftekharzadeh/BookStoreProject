package com.bookstoredb.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.tomcat.jni.User;

import com.bookstore.entity.Users;

public class UserTest {

	public static void main(String[] args) {
		
		Users user1=new Users();
		user1.setEmail("haldis@yahoo.com");
		user1.setFullName("hali");
		user1.setPassword("hhhhhh");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(user1);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A user persisted");
		

		

	}

}
