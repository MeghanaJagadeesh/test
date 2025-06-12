package admin_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import StudentDto.Student;

public class AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Student s) {
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
	}

	public String delete(String regno) {
		Student s = entityManager.find(Student.class, regno);
		if (s != null) {
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
			return "Data deleted";
		} else {
			return "Data not found";
		}
	}

	public Object fetch(String regno) {
		Student fetch = entityManager.find(Student.class, regno);
		if (fetch != null) {
			return fetch;
		} else {
			return "data not found";
		}
	}

	public Object fetchAll() {
		Query q = entityManager.createQuery("select data from Student data");
		List<Student> s = q.getResultList();
		if (s.isEmpty()) {
			return s;
		} else
			return "data not fount";
	}
}
