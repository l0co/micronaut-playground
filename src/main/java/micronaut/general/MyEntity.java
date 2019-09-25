package micronaut.general;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyEntity {

	@Id
	protected Long id;
	
}
