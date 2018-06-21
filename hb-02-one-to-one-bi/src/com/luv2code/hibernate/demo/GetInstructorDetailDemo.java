package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {
		
		// Create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		System.out.println("Creating new Object");
		
		// Create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//start a transaction
			System.out.println("Begin Transaction");
			session.beginTransaction();
			
			InstructorDetail theInstructorDetail = session.get(InstructorDetail.class, 2);
			
			System.out.println("theInstructorDetail :"+ theInstructorDetail);
			
			System.out.println("Associated Instructor :"+ theInstructorDetail.getInstructor());
			
			//commit transaction
			System.out.println("Commit Transaction");
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
		
	}

}
