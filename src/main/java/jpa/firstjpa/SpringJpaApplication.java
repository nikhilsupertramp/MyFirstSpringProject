package jpa.firstjpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jpa.firstjpa.entity.Person;
//import jpa.firstjpa.entity.Person;
import jpa.firstjpa.entity.PersonJpaRepository;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//logger.info("All Users -> {} ", dao.findAll());
		logger.info("User with Id 101 -> {}", repo.findById(101));
		Person person = new Person(1042, "bhoomi", "My home", new Date());
		logger.info("adding new Person", repo.insert(person));
		
		
		/*
		 * logger.info("Deleting user with id 102 -> {}",dao.deleteById(102));
		 * 
		logger.info("Deleting user with id 102 -> {}", dao.findAll());
		 */
		
	}
	/*
	 All Users -> [Person [id=1, name=rushi, location=himalay, birthDate=2020-08-15 00:00:00.0], 
	 			   Person [id=101, name=nikhil, location=hyderabad, birthDate=2020-08-15 00:00:00.0], 
	 			   Person [id=102, name=Sweety, location=BHEL, birthDate=2020-08-15 00:00:00.0], 
	 			   Person [id=103, name=ankur, location=Delhi, birthDate=2020-08-15 00:00:00.0], 
	 			   Person [id=104, name=john, location=New York, birthDate=2020-08-15 00:00:00.0]] 
2
	 */
	
}
