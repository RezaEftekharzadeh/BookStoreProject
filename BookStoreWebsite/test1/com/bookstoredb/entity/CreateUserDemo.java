package com.bookstoredb.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bookstore.entity.Book;
import com.bookstore.entity.Category;
import com.bookstore.entity.Customer;
import com.bookstore.entity.Users;

public class CreateUserDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Category.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			
			
			 
			session.getTransaction().commit();

		} finally {

			factory.close();
		}

	}

	private static void displayUser(List<Users> theUsers) {
		for (Users users : theUsers) {
			System.out.println(users);

		}
	}

}
