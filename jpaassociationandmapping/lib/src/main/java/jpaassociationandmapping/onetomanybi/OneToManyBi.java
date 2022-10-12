package jpaassociationandmapping.onetomanybi;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBi {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Department dep = new Department();
		Employee emp = new Employee();
		
		Set <Employee> set = new HashSet<>();
		
		emp.setEmpName("Hemant Bhaiya");
		emp.setHireDate(LocalDate.of(2022, 9, 19));
		set.add(emp);
		
		dep.setDeptName("Developer");
		dep.setEmployees(set);
		dep.setLocation("Banglore");
		em.persist(dep);
		em.persist(emp);
		em.getTransaction().commit();

	}

}
