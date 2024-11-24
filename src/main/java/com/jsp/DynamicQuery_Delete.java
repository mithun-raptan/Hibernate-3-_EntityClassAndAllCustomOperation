package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicQuery_Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query q = em.createQuery("delete from Student s where s.id=?1");
		q.setParameter(1, 101);
		int n = q.executeUpdate();
		et.commit();
		
		if(n!=0){
			System.out.println("particular record got deleted");
		}
		else {
			System.out.println("particular record not deleted");
		}
	}

}

