package entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car_make")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"car", "model"})
public class CarMake extends BaseEntity{

	@Column(name = "make_title")
	private String makeTitle;
	
	@Column(name = "manufacture_year")
	private int manufactureYear;

	@OneToOne(cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY )
	@JoinColumn(name = "car_model_id", nullable = true)
	private CarModel model;
	
	@OneToOne(mappedBy = "carMake", cascade = CascadeType.ALL,
			  fetch = FetchType.LAZY)
	private Car car;

	public CarMake(String makeTitle, int manufactureYear) {
		this.makeTitle = makeTitle;
		this.manufactureYear = manufactureYear;
	}
	
	@Override
	public String toString() {
		return "CarMake [makeTitle=" + makeTitle + ", manufactureYear=" + manufactureYear + ", getId()=" + getId()
				+ "]";
	}
}
