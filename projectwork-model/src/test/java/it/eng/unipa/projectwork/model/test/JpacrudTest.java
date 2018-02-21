package it.eng.unipa.projectwork.model.test;

import java.util.List;

import javax.persistence.Query;

import org.junit.Test;

import it.eng.projectwork.gruppo03.model.*;

public class JpacrudTest extends JPAHibernateTest {

	
	@Test
	public void test1() {
		em.getTransaction().begin();
		
		
		User u = new User();
		u.setNome("giancarlo");
		u.setCognome("compagno");
		u.setUsername("giacompa");
		u.setEmail("giancarlo.compagno@eng.it");
		
		em.persist(u);
		
		
		em.getTransaction().commit();
		
	}
	
	@Test
	public void test2() {
		
		Query query = em.createQuery("SELECT u FROM User u WHERE u.email=:email");
		query.setParameter("email", "giancarlo.compagno@eng.it");
		List<User> users = query.getResultList();
		for(User user : users) {
			System.out.println(user.getNome());
		}
		 
	}
	
	@Test
	public void test3() {
		em.getTransaction().begin();
		
		Supplier s = new Supplier();
		s.setNome("giancarlo");
		s.setCognome("compagno");
		s.setUsername("giacompa");
		s.setEmail("giancarlo.compagno@eng.it");
		s.setNomeAzienda("Engineering");
		s.setPiva("123");
		
		em.persist(s);
		
		em.getTransaction().commit();		
	}
	
	
	@Test
	public void test4() {
		
		Query query1 = em.createQuery("SELECT u FROM User u WHERE u.email=:email");
		query1.setParameter("email", "giancarlo.compagno@eng.it");
		Query query2 = em.createQuery("SELECT s FROM Supplier s");
		List<User> users = query1.getResultList();
		for(User user : users) {
			System.out.println(user.getNome());
		}
		
		users = query2.getResultList();
		
		for(User user : users) {
			System.out.println(user.getNome());
		}
		 
	}
	
}
