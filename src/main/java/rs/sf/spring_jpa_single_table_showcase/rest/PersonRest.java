package rs.sf.spring_jpa_single_table_showcase.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rs.sf.spring_jpa_single_table_showcase.domain.Person;
import rs.sf.spring_jpa_single_table_showcase.domain.Professor;
import rs.sf.spring_jpa_single_table_showcase.domain.Student;
import rs.sf.spring_jpa_single_table_showcase.service.PersonService;

@RestController
@RequestMapping("api")
public class PersonRest {

	private final PersonService personService;

	public PersonRest(final PersonService personService) {
		super();
		this.personService = personService;
	}

	@GetMapping("person")
	public List<Person> findAll() {
		return personService.findAll();
	}
	
	@GetMapping("professor")
	public List<Professor> findAllProfessors() {
		return personService.findAllProfessors();
	}
	
	@GetMapping("student")
	public List<Student> findAllStudents() {
		return personService.findAllStudents();
	}
	
	@GetMapping("person/{id}")
	public Person findById(@PathVariable("id") final Long id) {
		return personService.findById(id);
	}
	
	@GetMapping("person/lastName")
	public Person findByLastName(@RequestParam final String lastName) {
		return personService.findByLastName(lastName);
	}
	
}
