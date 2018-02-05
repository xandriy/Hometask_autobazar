package entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_engine_capacity")
@Getter
@Setter
@NoArgsConstructor
public class CarEngineCapacity extends BaseEntity{

	@Column(name = "engine_capacity", columnDefinition = "DECIMAL(2,1)")
	private BigDecimal engineCapacity;

	@OneToMany(mappedBy = "engineCapacity", cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH})
	private List<CarModel> models = new ArrayList<>();
	
	@Override
	public String toString() {
		return "CarEngineCapacity [engineCapacity=" + engineCapacity + ", getId()=" + getId() + "]";
	}
	
	
	
}
