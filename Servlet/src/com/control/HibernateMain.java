package com.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.io.Department;
import com.io.Employee;

public class HibernateMain {

	public static void main(String[] args) {
		
		insertEmployeeinDB();
//		updateEmployeeFromDB();
	}
	
	public static void insertEmployeeinDB() {
		
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.io.Employee.class);
		configuration.addAnnotatedClass(com.io.Department.class);
		StandardServiceRegistryBuilder builder = 
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
				
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Department d1 = new Department("CS");
		Employee e1 = new Employee("Amit", "Roy", "17-03-1997", "amitroy@cisco.com", d1);
		session.save(d1);
		session.save(e1);
		transaction.commit();
		session.close();
	}
	
	public static void deleteEmployeeFromDB() {
		
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.io.Employee.class);
		configuration.addAnnotatedClass(com.io.Department.class);
		StandardServiceRegistryBuilder builder = 
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
				
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = session.get(Employee.class, 1);
		System.out.println(e1);
		session.delete(e1);
		transaction.commit();
		session.close();
	
	}
	
public static void updateEmployeeFromDB() {
		
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.io.Employee.class);
		configuration.addAnnotatedClass(com.io.Department.class);
		StandardServiceRegistryBuilder builder = 
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
				
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = session.get(Employee.class, 1);
		e1.setLname("Kumar");
		System.out.println(e1);
		transaction.commit();
		session.close();
	}

}
