package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_color")
@Getter
@Setter
@NoArgsConstructor
public class CarColor extends BaseEntity{

	@Column(name = "color")
	private String color;

	private CarModel model;
	
	@Override
	public String toString() {
		return "CarColor [color=" + color + ", getId()=" + getId() + "]";
	}
	
	
	
}
