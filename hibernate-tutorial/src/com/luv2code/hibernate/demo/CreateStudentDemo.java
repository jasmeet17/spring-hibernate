package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

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
			
			//create a student object
			System.out.println("Creating new Object");
			Student tempStudent = new Student("Pauly","Smith","paulsmith@gmail.com");
			
			//start a transaction
			System.out.println("Begin Transaction");
			session.beginTransaction();
			
			//save the student object
			System.out.println("Save object");
			session.save(tempStudent);
			
			//commit transaction
			System.out.println("Commit Transaction");
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
	}

}
