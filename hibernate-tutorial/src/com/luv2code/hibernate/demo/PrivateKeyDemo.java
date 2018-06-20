package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrivateKeyDemo {

	public static void main(String[] args) {
		
		// Create Session Factory
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();

				System.out.println("Creating new Object");
				
				// Create session
				Session session = factory.getCurrentSession();
				
				try {
					//use session to save Java Object
					
					//create 3 student object
					System.out.println("Creating new Object");
					Student tempStudent1 = new Student("john","Roger","john@gmail.com");
					Student tempStudent2 = new Student("Mary","Lit","mary@gmail.com");
					Student tempStudent3 = new Student("Steve","Lisa","steve@gmail.com");
					
					//start a transaction
					System.out.println("Begin Transaction");
					session.beginTransaction();
					
					//save the student object
					System.out.println("Savinf students . . .");
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					
					//commit transaction
					System.out.println("Commit Transaction");
					session.getTransaction().commit();
					
				} finally {
					factory.close();
				}

	}

}
