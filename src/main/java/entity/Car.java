package entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	private CarMake make;
	
	private carSeller seller;

	@Override
	public String toString() {
		return "Car [sellPrice=" + sellPrice + ", getId()=" + getId() + "]";
	}
	
	
}
