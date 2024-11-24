package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveObjectIntoDB {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		//create object
		Student s=new Student();
		s.setId(101);
		s.setName("mithun");
		s.setEmail("m@g.com");
		s.setPassword("1234");
		s.setMobile(69696969l);
		s.setGfname("nidhi");
		
		et.begin();
		em.persist(s);
		et.commit();
	}
	

	

}
