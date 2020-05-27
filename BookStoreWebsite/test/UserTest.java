import java.sql.Connection;
import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UserTest {

	public static void main(String[] args) {

		/*
		 * Users user1=new Users(); user1.setEmail("eric@gmail.com");
		 * user1.setFullName("Reza Eftekharzadeh"); user1.setPassword("helloerfan");
		 * 
		 * EntityManagerFactory entityManagerFactory =
		 * Persistence.createEntityManagerFactory("BookStoreWebsite"); EntityManager
		 * entityManager = entityManagerFactory.createEntityManager();
		 * 
		 * entityManager.getTransaction().begin(); entityManager.persist(user1);
		 * entityManager.getTransaction().commit(); entityManager.close();
		 * entityManagerFactory.close();
		 * 
		 * System.out.println("A user object is persisted");
		 */

		
		  String jdbcUrl = "jdbc:mysql://localhost:3306/bookstoredb?useSSL=false";
		  String user = "root"; String pass = "erfan4696";
		  
		  try { System.out.println("Connecting to database: " + jdbcUrl);
		  
		  Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
		  
		  System.out.println("Connection successful!!!");
		  
		  } catch (Exception exc) { exc.printStackTrace(); }
		 

	}

}
