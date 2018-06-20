package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

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
			
			//start a transaction
			System.out.println("Begin Transaction");
			session.beginTransaction();
			
			// get student based on primary key
			Student myStudent = session.get(Student.class, 1);
			
			
			//save the student object
			System.out.println("Update");
			myStudent.setFirstName("Scooby");
			
			//commit transaction
			System.out.println("Commit Transaction");
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
	}

}
