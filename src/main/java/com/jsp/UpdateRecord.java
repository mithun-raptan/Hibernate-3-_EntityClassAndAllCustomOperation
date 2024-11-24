package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = em.find(Student.class, 101);
		if(s!=null) {
			s.setName("sazu");
			et.begin();
			em.merge(s);
			et.commit();
		}
		else {
			System.out.println("record not found");
		}
	}

}
