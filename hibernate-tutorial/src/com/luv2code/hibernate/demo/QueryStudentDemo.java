package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

import java.util.List;

public class QueryStudentDemo {

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
			
			//query students
			List<Student> theStudents = session.createQuery("from Student").getResultList(); 
			
			//display students
			for (Student tempStudent : theStudents) {
				System.out.println(tempStudent);
			}
			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		} finally {
			factory.close();
		}
		
	}

}
