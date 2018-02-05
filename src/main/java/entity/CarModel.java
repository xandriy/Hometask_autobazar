package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_model")
@Getter
@Setter
@NoArgsConstructor
public class CarModel extends BaseEntity{

	@Column(name = "model_title")
	private String modelTitle;

	@Column(name = "engine_capacity")
	private CarEngineCapacity engineCapacity;
	
	@Column(name = "fuel_type")
	private CarFuelType fuelType;
	
	private CarColor color;
	
	private CarMake make;
	
	@Override
	public String toString() {
		return "CarModel [modelTitle=" + modelTitle + ", getId()=" + getId() + "]";
	}
	
	
	
}
