package hello;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
public class Person {

	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(
		name="UUID",
		strategy="org.hibernate.id.UUIDGenerator"
	)
	@Column(name="id", updatable=false, nullable=false)
	private UUID id;

	@Column private String firstName;
	@Column private String lastName;
	@Column private String summary;
	@Column private LocalDate dateOfBirth;
}