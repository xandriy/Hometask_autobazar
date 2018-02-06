package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_color")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = "models")
public class CarColor extends BaseEntity{

	@Column(name = "color")
	private String color;

	@OneToMany(mappedBy = "color", cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH})
	private List<CarModel> models = new ArrayList<>();
	
	public CarColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "CarColor [color=" + color + ", getId()=" + getId() + "]";
	}
}
