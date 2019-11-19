package rs.sf.spring_jpa_single_table_showcase.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import rs.sf.spring_jpa_single_table_showcase.domain.Person;

@NoRepositoryBean
public interface PersonNoRepository<T extends Person> extends JpaRepository<T, Long> {

	@SuppressWarnings("el-syntax")
	@Query("select e from #{#entityName} as e where e.lastName = ?1")
	public Optional<T> findByLastName(String lastName);
}
