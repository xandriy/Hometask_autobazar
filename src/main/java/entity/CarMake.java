package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_make")
@Getter
@Setter
@NoArgsConstructor
public class CarMake extends BaseEntity{

	@Column(name = "make_title")
	private String makeTitle;
	
	@Column(name = "manufacture_year")
	private int manufactureYear;

	private CarModel model;
	
	private Car car;
	
	@Override
	public String toString() {
		return "CarMake [makeTitle=" + makeTitle + ", manufactureYear=" + manufactureYear + ", getId()=" + getId()
				+ "]";
	}
	
	
}
