package in.ashokit.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Contact_Dtls")
public class Contact {
	@Id
	@GeneratedValue
	private Integer contectId;
	private String contectName;
	private String contectEmail;
	private Long contectNumber;
	

}
