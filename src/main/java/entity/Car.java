package entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
public class Car extends BaseEntity{

	@Column(name = "sell_price", columnDefinition = "DECIMAL(10,3)")
	private BigDecimal sellPrice;
	
	@OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
						  CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "car_make_id")
	private CarMake carMake;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
						  CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "seller_id")
	private carSeller seller;

	@Override
	public String toString() {
		return "Car [sellPrice=" + sellPrice + ", getId()=" + getId() + "]";
	}
	
	
}
