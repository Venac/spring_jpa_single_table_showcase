package rs.sf.spring_jpa_single_table_showcase.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("professor")
public class Professor extends Person {

	private String email;

	public Professor() {
		super();
	}

	public Professor(final Long id, final String firstName, final String lastName, final String email) {
		super(id, firstName, lastName);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Professor [email=");
		builder.append(email);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
