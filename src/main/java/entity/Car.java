package entity;

import java.math.BigDecimal;

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
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"carMake", "seller" })
public class Car extends BaseEntity{

	@Column(name = "sell_price", columnDefinition = "DECIMAL(10,3)")
	private BigDecimal sellPrice;
	
	@OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
						  CascadeType.PERSIST, CascadeType.REFRESH},
						fetch = FetchType.LAZY)
	@JoinColumn(name = "car_make_id")
	private CarMake carMake;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
						  CascadeType.PERSIST, CascadeType.REFRESH},
						  fetch = FetchType.LAZY)
	@JoinColumn(name = "seller_id")
	private CarSeller seller;

	@Override
	public String toString() {
		return "Car [sellPrice=" + sellPrice + ", getId()=" + getId() + "]";
	}

	public Car(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}
	
	
	
}
