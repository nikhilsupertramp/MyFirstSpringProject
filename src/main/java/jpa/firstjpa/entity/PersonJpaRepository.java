package jpa.firstjpa.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

//Repo
@Repository
@Transactional
public class PersonJpaRepository {
	//Connect to DB
	@PersistenceContext
	EntityManager entityManeger;
	
	public Person findById(int id) {
		return entityManeger.find(Person.class, id);
	}
	
	public Person insert(Person person) {
		return entityManeger.merge(person);
	}
	
	public Person update(Person person) {
		return entityManeger.merge(person);
	}
	
	public  void deleteById(int id) {
		Person person = findById(id);
		entityManeger.remove(person);
	}
	
}
