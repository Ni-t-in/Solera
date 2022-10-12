package jpaassociationandmapping.onetoneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneDemo {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		
		Student student = new Student();
		Address address = new Address();
		
		address.setCity("Mirzapur");
		address.setState("Uttar Pradesh");
		address.setStreet("Hindu Hemant Road");
		address.setZipCode("454775");
		
		student.setName("Hemant Singh Changez");
		student.setAddress(address);
		
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
	}
}
