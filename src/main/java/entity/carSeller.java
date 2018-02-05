package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_seller")
@Getter
@Setter
@NoArgsConstructor
public class carSeller extends BaseEntity{

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "phone_number")
	private String phoneNumber;

	private List<Car> cars = new ArrayList<>();
	
	@Override
	public String toString() {
		return "carSeller [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNumber="
				+ phoneNumber + ", getId()=" + getId() + "]";
	}
	
	
}