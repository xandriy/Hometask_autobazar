package entity;

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
@Table(name = "car_color")
@Getter
@Setter
@NoArgsConstructor
public class CarColor extends BaseEntity{

	@Column(name = "color")
	private String color;

	@OneToMany(mappedBy = "color", cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH})
	private List<CarModel> models = new ArrayList<>();
	
	@Override
	public String toString() {
		return "CarColor [color=" + color + ", getId()=" + getId() + "]";
	}
	
	
	
}
