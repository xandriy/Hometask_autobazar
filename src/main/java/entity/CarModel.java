package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_model")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"engineCapacity", "fuelType", "color", "make"})
public class CarModel extends BaseEntity{

	@Column(name = "model_title")
	private String modelTitle;

	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
						  CascadeType.PERSIST, CascadeType.REFRESH},
						  fetch = FetchType.LAZY)
	@JoinColumn(name = "engine_capacity_id")
	private CarEngineCapacity engineCapacity;
	
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH},
			  fetch = FetchType.LAZY)
	@JoinColumn(name = "fuel_type_id")
	private CarFuelType fuelType;
	
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH},
			  fetch = FetchType.LAZY)
	@JoinColumn(name = "color_id")
	private CarColor color;
	
	@OneToOne(mappedBy = "model", cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH})
	private CarMake make;
	
	
	
	@Override
	public String toString() {
		return "CarModel [modelTitle=" + modelTitle + ", getId()=" + getId() + "]";
	}

	public CarModel(String modelTitle) {
		this.modelTitle = modelTitle;
	}
	
	
	
}
