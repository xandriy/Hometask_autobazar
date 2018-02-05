package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

	@OneToMany(mappedBy = "make", cascade = {CascadeType.DETACH, CascadeType.MERGE,
			  CascadeType.PERSIST, CascadeType.REFRESH})
	private List<CarModel> models = new ArrayList<>();
	
	@OneToOne(mappedBy = "carMake", cascade = CascadeType.ALL)
	private Car car;
	
	@Override
	public String toString() {
		return "CarMake [makeTitle=" + makeTitle + ", manufactureYear=" + manufactureYear + ", getId()=" + getId()
				+ "]";
	}
	
	
}
