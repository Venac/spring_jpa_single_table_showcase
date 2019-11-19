package rs.sf.spring_jpa_single_table_showcase.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import rs.sf.spring_jpa_single_table_showcase.dao.PersonRepository;
import rs.sf.spring_jpa_single_table_showcase.dao.ProfessorRepository;
import rs.sf.spring_jpa_single_table_showcase.dao.StudentRepository;
import rs.sf.spring_jpa_single_table_showcase.domain.Person;
import rs.sf.spring_jpa_single_table_showcase.domain.Professor;
import rs.sf.spring_jpa_single_table_showcase.domain.Student;
import rs.sf.spring_jpa_single_table_showcase.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	private final PersonRepository personRepository;
	private final ProfessorRepository professorRepository;
	private final StudentRepository studentRepository;

	public PersonServiceImpl(final PersonRepository personRepository, final ProfessorRepository professorRepository,
			final StudentRepository studentRepository) {
		super();
		this.personRepository = personRepository;
		this.professorRepository = professorRepository;
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public List<Professor> findAllProfessors() {
		return professorRepository.findAll();
	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Person findById(final Long id) {
		return personRepository.findById(id).orElseThrow(() -> new RuntimeException());
	}

	@Override
	public Person findByLastName(final String lastName) {
		return personRepository.findByLastName(lastName).orElseThrow(() -> new RuntimeException());
	}

}
