package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicQuery_Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query q =em.createQuery("update Student s set s.name = ?1 where s.id=?2");
		q.setParameter(1, "sagar");
		q.setParameter(2, 101);
		int n = q.executeUpdate();
		et.commit();
		if(n!=0) {
			System.out.println("record updated");
		}
		else {
			System.out.println("record not updated");
		}
	}

}
