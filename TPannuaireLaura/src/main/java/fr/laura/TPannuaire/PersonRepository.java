package fr.laura.TPannuaire;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

	List<Person> findByName(String lastName);

	Person findById(int id);

	List<Person> findAll();

}
