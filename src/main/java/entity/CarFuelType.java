package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_fuel_type")
@Getter
@Setter
@NoArgsConstructor
public class CarFuelType extends BaseEntity{

	@Column(name = "furl_type")
	private FuelType fuelType;

	private CarModel model;
	
	@Override
	public String toString() {
		return "CarFuelType [fuelType=" + fuelType + ", getId()=" + getId() + "]";
	} 
	
	
}
