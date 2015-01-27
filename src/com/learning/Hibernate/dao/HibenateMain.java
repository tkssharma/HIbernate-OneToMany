package com.learning.Hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.DataException;

import com.learning.Hibernate.model.Address;
import com.learning.Hibernate.model.Employee;
import com.learning.Hibernate.util.HibernateUtil;

public class HibenateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address = new Address();
		address.setCity("jaipur");
		address.setCountry("India");
		address.setState("Raj");

		Address address1 = new Address();
		address1.setCity("jaipur");
		address1.setCountry("India");
		address1.setState("Raj");

		List<Address>  list = new ArrayList<Address>();
		list.add(address1);
		list.add(address1);


		Employee data = new Employee();
		data.setEmail("Hello");
		data.setName("name");
		data.setAddress(list);

		Session session = HibernateUtil.getSessionAnnotationFactory().openSession();
		System.out.println(session);
		session.beginTransaction();
		session.save(data);
		
		session.save(address);
		session.save(address1);
		// session.save(data);
		session.getTransaction().commit();
		session.close();


	}

}
