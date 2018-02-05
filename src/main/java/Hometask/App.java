package Hometask;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Car;
import entity.CarColor;
import entity.CarEngineCapacity;
import entity.CarFuelType;
import entity.CarMake;
import entity.CarModel;
import entity.CarSeller;
import entity.FuelType;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
    	EntityManager  em = factory.createEntityManager();
    	em.getTransaction().begin();
    	
    	CarSeller seller1 = new CarSeller("Bill", "Gerret", 28, "380123456789");
    	em.persist(seller1);
    	CarSeller seller2 = new CarSeller("Jonh", "Doe", 35, "380987654321");
    	em.persist(seller2);
    	
    	CarColor red = new CarColor("Red");
    	em.persist(red);
    	CarColor black = new CarColor("Black");
    	em.persist(black);
    	CarColor yelow = new CarColor("Yelow");
    	em.persist(yelow);
    	CarColor white = new CarColor("White");
    	em.persist(white);
    	CarColor green = new CarColor("Green");
    	em.persist(green);
    	
    	CarEngineCapacity cap1 = new CarEngineCapacity(new BigDecimal("1.6"));
    	em.persist(cap1);
    	CarEngineCapacity cap2 = new CarEngineCapacity(new BigDecimal("2.0"));
    	em.persist(cap2);
    	CarEngineCapacity cap3 = new CarEngineCapacity(new BigDecimal("2.2"));
    	em.persist(cap3);
    	CarEngineCapacity cap4 = new CarEngineCapacity(new BigDecimal("2.8"));
    	em.persist(cap4);
    	CarEngineCapacity cap5 = new CarEngineCapacity(new BigDecimal("3.0"));
    	em.persist(cap5);
    	
    	
    	CarFuelType fuel1 = new CarFuelType(FuelType.DIESEL);
    	em.persist(fuel1);
    	CarFuelType fuel2 = new CarFuelType(FuelType.ELECTRIC);
    	em.persist(fuel2);
    	CarFuelType fuel3 = new CarFuelType(FuelType.GAS_PETROL);
    	em.persist(fuel3);
    	CarFuelType fuel4 = new CarFuelType(FuelType.PETROL);
    	em.persist(fuel4);
    	
    	
    	CarMake volkswagen = new CarMake("Volksvagen", 2015);
    	em.persist(volkswagen);
    	CarMake bmw = new CarMake("BMW", 2012);
    	em.persist(bmw);
    	CarMake nissan = new CarMake("Nissan", 2002);
    	em.persist(nissan);
    	
    	CarModel golf = new CarModel("Golf GTI");
    	golf.setColor(yelow);
    	golf.setEngineCapacity(cap2);
    	golf.setFuelType(fuel4);
    	golf.setMake(volkswagen);
    	em.persist(golf);
    	
    	CarModel caravelle = new CarModel("Caravelle");
    	caravelle.setColor(black);
    	caravelle.setEngineCapacity(cap2);
    	caravelle.setFuelType(fuel1);
    	caravelle.setMake(volkswagen);
    	em.persist(caravelle);
    	
    	CarModel fiveSeries = new CarModel("530d");
    	fiveSeries.setColor(red);
    	fiveSeries.setEngineCapacity(cap5);
    	fiveSeries.setFuelType(fuel4);
    	fiveSeries.setMake(bmw);
    	em.persist(fiveSeries);
    	
    	CarModel patrol = new CarModel("Patrol GR");
    	patrol.setColor(green);
    	patrol.setEngineCapacity(cap4);
    	patrol.setFuelType(fuel1);
    	patrol.setMake(nissan);
    	em.persist(patrol);
    	
    	Car carVolksGolf = new Car(new BigDecimal("19500"));
    	carVolksGolf.setSeller(seller1);
    	carVolksGolf.setCarMake(volkswagen);
    	em.persist(carVolksGolf);
    	
    	Car carVolksCaravelle = new Car(new BigDecimal("22700"));
    	carVolksCaravelle.setSeller(seller1);
    	carVolksCaravelle.setCarMake(volkswagen);
    	em.persist(carVolksCaravelle);
    	
    	Car carBmw5 = new Car(new BigDecimal("16200"));
    	carBmw5.setSeller(seller2);
    	carBmw5.setCarMake(bmw);
    	em.persist(carBmw5);
    	
    	Car carNissanPatrol = new Car(new BigDecimal("9700"));
    	carNissanPatrol.setSeller(seller2);
    	carNissanPatrol.setCarMake(nissan);
    	em.persist(carNissanPatrol);
    	
    	
    	
    	
    	
    	
    	 	
    	
    	
    	
    	
    	em.getTransaction().commit();
    	em.close();
    	factory.close();
    }
}
