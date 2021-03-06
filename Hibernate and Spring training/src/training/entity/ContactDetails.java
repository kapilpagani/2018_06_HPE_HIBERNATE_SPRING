package training.entity;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class ContactDetails {
	private String phone;
	private String address;
	private String city;
	private String state;
	private String country;
}
