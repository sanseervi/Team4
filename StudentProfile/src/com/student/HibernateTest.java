package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student.model.Student;
public class HibernateTest {
	public static void main(String[] args) {
		
		try //Try-catch to handle exceptions
		{			
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession(); //To open a session
			Transaction tx=session.beginTransaction();
			
			Student stud=new Student();	//Creating object of Student class
			stud.setStudent_name("Ashwathi");
			stud.setMarks(90.0);
			session.save(stud); //To save the entity to the database
			tx.commit();		//ending the transaction and updating the record into db
			session.close();	//To close the session
			
			stud=null;
			session=sessionFactory.openSession();
			session.beginTransaction();
			stud=(Student)session.load(Student.class,1);
			
			//calling getter methods of student class and displaying the results
			System.out.println(stud.getRoll_no());
			System.out.println(stud.getStudent_name());
			System.out.println(stud.getMarks());
			session.getTransaction().commit();
			session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
