package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
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

	@Enumerated(value = EnumType.STRING)
	@Column(name = "furl_type")
	private FuelType fuelType;

	@OneToMany(mappedBy = "fuelType", cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH})
	private List<CarModel> models = new ArrayList<>();
	
	public CarFuelType(FuelType fuelType) {
		super();
		this.fuelType = fuelType;
	}
	
	
	@Override
	public String toString() {
		return "CarFuelType [fuelType=" + fuelType + ", getId()=" + getId() + "]";
	}

}
