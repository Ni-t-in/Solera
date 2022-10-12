package jpaassociationandmapping.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneDemo {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		
//		StudentBi student = new StudentBi();
//		AddressBi address = new AddressBi();
//		
//		student.setName("Hemant Singh Changez");
//		
//		address.setCity("Mirzapur");
//		address.setState("Uttar Pradesh");
//		address.setStreet("Hindu Hemant Road");
//		address.setZipCode("454775");
//		address.setStudent(student);
//		
//		student.setAddress(address);
//		
//		
//		em.getTransaction().begin();
//		em.persist(student);
//		em.getTransaction().commit();
		
		AddressBi addressBi = em.find(AddressBi.class, 1);
		System.out.println(addressBi.getStudent().getName());
		System.out.println(addressBi.getCity());
		
		StudentBi studentBi = em.find(StudentBi.class, 1);
		System.out.println(studentBi.getAddress().getCity());
		System.out.println(studentBi.getName());
	}
}
