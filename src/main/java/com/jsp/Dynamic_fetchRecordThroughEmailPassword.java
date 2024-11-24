package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Dynamic_fetchRecordThroughEmailPassword {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select s from Student s where s.email=?1 and password =?2");
		q.setParameter(1, "m@g.com");
		q.setParameter(2, "1234");
		List<Student> l =q.getResultList();
		if(!l.isEmpty()) {
			for(Student s:l) {
				System.out.println(s.getName()+" "+s.getGfname());
			}
		}
		else {
			System.out.println("record not found");
		}
	}

}
