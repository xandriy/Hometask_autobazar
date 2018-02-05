package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
						  CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "engine_capacity_id")
	private CarEngineCapacity engineCapacity;
	
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "fuel_type_id")
	private CarFuelType fuelType;
	
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "color_id")
	private CarColor color;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "car_make_id")
	private CarMake make;
	
	@Override
	public String toString() {
		return "CarModel [modelTitle=" + modelTitle + ", getId()=" + getId() + "]";
	}
	
	
	
}
