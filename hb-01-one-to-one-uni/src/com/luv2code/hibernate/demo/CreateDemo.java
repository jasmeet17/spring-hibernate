package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

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
			/*
			//create the object
			Instructor tempInstructor = new Instructor("qwe","wer","ase@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("Youtube.com/luv2code","luv2code");
			
			//associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			*/
			
			//create the object
			Instructor tempInstructor = new Instructor("ZZ","wtt","aqwqse@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("vemo.com","luv2code");
			
			//associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//start a transaction
			System.out.println("Begin Transaction");
			session.beginTransaction();
			
			//Save the instructor
			// this will also save the instructor detail
			// because of CascadeType.ALL
			session.save(tempInstructor);
			
			//commit transaction
			System.out.println("Commit Transaction");
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
		
	}

}
