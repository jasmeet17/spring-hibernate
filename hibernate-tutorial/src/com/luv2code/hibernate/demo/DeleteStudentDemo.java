package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

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
			
			
			//Delete the student object
			System.out.println("Delete . . .");
//			session.delete(myStudent);
			
			// another approach using HQL
			session.createQuery("delete from Student where id=2").executeUpdate();
			
			//commit transaction
			System.out.println("Commit Transaction");
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
	}

}
