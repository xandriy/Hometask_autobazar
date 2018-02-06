package Hometask;

import java.math.BigDecimal;
import java.util.List;

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
    	
    	// Adding info to database
    	
    	
//    	CarSeller seller1 = new CarSeller("Bill", "Gerret", 28, "380123456789");
//    	em.persist(seller1);
//    	CarSeller seller2 = new CarSeller("Jonh", "Doe", 35, "380987654321");
//    	em.persist(seller2);
//    	
//    	CarColor red = new CarColor("Red");
//    	em.persist(red);
//    	CarColor black = new CarColor("Black");
//    	em.persist(black);
//    	CarColor yelow = new CarColor("Yelow");
//    	em.persist(yelow);
//    	CarColor white = new CarColor("White");
//    	em.persist(white);
//    	CarColor green = new CarColor("Green");
//    	em.persist(green);
//    	
//    	CarEngineCapacity cap1 = new CarEngineCapacity(new BigDecimal("1.6"));
//    	em.persist(cap1);
//    	CarEngineCapacity cap2 = new CarEngineCapacity(new BigDecimal("2.0"));
//    	em.persist(cap2);
//    	CarEngineCapacity cap3 = new CarEngineCapacity(new BigDecimal("2.2"));
//    	em.persist(cap3);
//    	CarEngineCapacity cap4 = new CarEngineCapacity(new BigDecimal("2.8"));
//    	em.persist(cap4);
//    	CarEngineCapacity cap5 = new CarEngineCapacity(new BigDecimal("3.0"));
//    	em.persist(cap5);
//    	
//    	
//    	CarFuelType fuel1 = new CarFuelType(FuelType.DIESEL);
//    	em.persist(fuel1);
//    	CarFuelType fuel2 = new CarFuelType(FuelType.ELECTRIC);
//    	em.persist(fuel2);
//    	CarFuelType fuel3 = new CarFuelType(FuelType.GAS_PETROL);
//    	em.persist(fuel3);
//    	CarFuelType fuel4 = new CarFuelType(FuelType.PETROL);
//    	em.persist(fuel4);
//    	
//    	
//    	
//    	
//    	CarModel golf = new CarModel("Golf GTI");
//    	golf.setColor(yelow);
//    	golf.setEngineCapacity(cap2);
//    	golf.setFuelType(fuel4);
//    	em.persist(golf);
//    	
//    	CarModel caravelle = new CarModel("Caravelle");
//    	caravelle.setColor(black);
//    	caravelle.setEngineCapacity(cap2);
//    	caravelle.setFuelType(fuel1);
//    	em.persist(caravelle);
//    	
//    	CarModel fiveSeries = new CarModel("530d");
//    	fiveSeries.setColor(red);
//    	fiveSeries.setEngineCapacity(cap5);
//    	fiveSeries.setFuelType(fuel4);
//    	em.persist(fiveSeries);
//    	
//    	CarModel patrol = new CarModel("Patrol GR");
//    	patrol.setColor(green);
//    	patrol.setEngineCapacity(cap4);
//    	patrol.setFuelType(fuel1);
//    	em.persist(patrol);
//    	
//    	CarMake volkswagenGolf = new CarMake("Volksvagen", 2015);
//    	volkswagenGolf.setModel(golf);
//    	em.persist(volkswagenGolf);
//    	
//    	CarMake volkswagenCar = new CarMake("Volksvagen", 2015);
//    	volkswagenCar.setModel(caravelle);
//    	em.persist(volkswagenCar);
//    	
//    	CarMake bmw = new CarMake("BMW", 2012);
//    	bmw.setModel(fiveSeries);
//    	em.persist(bmw);
//    	
//    	CarMake nissan = new CarMake("Nissan", 2002);
//    	nissan.setModel(patrol);
//    	em.persist(nissan);
//    	
//    	Car carVolksGolf = new Car(new BigDecimal("19500"));
//    	carVolksGolf.setSeller(seller1);
//    	carVolksGolf.setCarMake(volkswagenGolf);
//    	em.persist(carVolksGolf);
//    	
//    	Car carVolksCaravelle = new Car(new BigDecimal("22700"));
//    	carVolksCaravelle.setSeller(seller1);
//    	carVolksCaravelle.setCarMake(volkswagenCar);
//    	em.persist(carVolksCaravelle);
//    	
//    	Car carBmw5 = new Car(new BigDecimal("16200"));
//    	carBmw5.setSeller(seller2);
//    	carBmw5.setCarMake(bmw);
//    	em.persist(carBmw5);
//    	
//    	Car carNissanPatrol = new Car(new BigDecimal("9700"));
//    	carNissanPatrol.setSeller(seller2);
//    	carNissanPatrol.setCarMake(nissan);
//    	em.persist(carNissanPatrol);
    	
    	
    	//  JPQL queries
    	//  1
    	
//    	List<Car> cars = em.createQuery("SELECT c FROM Car c WHERE c.sellPrice BETWEEN :low AND :high", Car.class)
//    					.setParameter("low", new BigDecimal("12000")).setParameter("high", new BigDecimal("18000"))
//    					.getResultList();
//    	cars.forEach(c -> System.out.println(c + "\n" + c.getCarMake()));
    	 	
    	//  2
    	
//    	CarColor color = em.createQuery("SELECT c FROM CarColor c WHERE c.color = :color", CarColor.class)
//    					.setParameter("color", "Green").getSingleResult();
//    	List<CarModel> models = em.createQuery("SELECT m FROM CarModel m WHERE m.color = :color", CarModel.class)
//    			.setParameter("color", color).getResultList();
//    	models.forEach(m -> System.out.println(m));
    	
    	//  3
    	
//    	List<CarModel> models = em.createQuery("SELECT c FROM CarModel c WHERE c.modelTitle LIKE '%a%'", CarModel.class)
//    			.getResultList();
//    	
//    	models.forEach(m -> System.out.println(m));
    	
    	//  4 
//    	
//    	CarFuelType fuel = em.createQuery("SELECT f FROM CarFuelType f "
//    			+ "WHERE f.fuelType = :fuel", CarFuelType.class).setParameter("fuel", FuelType.DIESEL).getSingleResult();
//    	
//    	List<CarModel> models = em.createQuery("SELECT m FROM CarModel m WHERE m.fuelType = :fuel ",
//    				CarModel.class).setParameter("fuel", fuel)
//    						.getResultList();
//    	models.forEach(m -> System.out.println(m));

    	//  5
//    	CarEngineCapacity capacity = em.createQuery("SELECT cec FROM CarEngineCapacity cec "
//    			+ "WHERE  cec.engineCapacity = 2.0 ", CarEngineCapacity.class).getSingleResult();
//    	
//    	List<CarModel> models = em.createQuery("SELECT m FROM CarModel m "
//    			+ "WHERE m.engineCapacity = :capacity ",
//				CarModel.class).setParameter("capacity", capacity)
//						.getResultList();
//    	models.forEach(m -> System.out.println(m + "\n" + m.getMake()));
    	
    	//  6
    	
//    	List<CarMake> makes = em.createQuery("SELECT m FROM CarMake m "
//    			+ "WHERE m.makeTitle IN ('Volksvagen', 'BMW')", CarMake.class)
//    			.getResultList();
//    	makes.forEach(m -> System.out.println(m));
    	
    	// 7
    	
//    	List<CarMake> makes = em.createQuery("SELECT m FROM CarMake m "
//    			+ "WHERE m.makeTitle NOT IN  ('BMW')", CarMake.class)
//    			.getResultList();
//    	makes.forEach(m -> System.out.println(m));
    	
    	// 8
    	
//    	List<Car> cars = em.createQuery("SELECT c FROM Car c "
//    			+ "WHERE c.seller IN (SELECT s FROM CarSeller s WHERE s.id = 1)", Car.class)
//    			.getResultList();
//    	cars.forEach(c -> System.out.println(c));
    	
    	// 9
    	
//    	Long number = em.createQuery("SELECT COUNT(c) FROM Car c", Long.class).getSingleResult();
//    	System.out.println("Number of cars - " + number);
    	
    	//  10
    	
//    	CarColor color = em.createQuery("SELECT md.color FROM CarModel md WHERE "
//    			+ "md.make IN (SELECT mk FROM CarMake mk WHERE mk.makeTitle = 'BMW')", CarColor.class)
//    			.getSingleResult();
//    	
//    	System.out.println(color);
    	
    	em.getTransaction().commit();
    	em.close();
    	factory.close();
    }
}
