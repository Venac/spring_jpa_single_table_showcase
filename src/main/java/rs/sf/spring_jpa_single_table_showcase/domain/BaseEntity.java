package rs.sf.spring_jpa_single_table_showcase.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public BaseEntity() {
		super();
	}

	public BaseEntity(final Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("BaseEntity [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}
