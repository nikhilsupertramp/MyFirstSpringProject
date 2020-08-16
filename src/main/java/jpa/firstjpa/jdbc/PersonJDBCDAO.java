package jpa.firstjpa.jdbc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jpa.firstjpa.entity.Person;

@Repository

public class PersonJDBCDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Person> findAll(){
		return jdbcTemplate.query("SELECT * FROM PERSON", 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id) {
		String sql = "select * from person where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id) {
		String sql = "delete from person where id=?";
		return jdbcTemplate.update(sql, new Object[] {id});
	}
	
	public int insertById(Person person) {
		String sql = "insert into person (id, name, location, birth_date) " + "values(?, ?, ?, ?)";
		return jdbcTemplate.update(sql, 
				new Object[] {person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirth_date().getTime())});
	}
}
