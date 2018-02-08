package Hometask;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
    	
    	//   Criteria API queries
    	
    	CriteriaBuilder cb = em.getCriteriaBuilder();
    	
    	//  1
    	// SELECT m FROM CarModels m
    	
//    	CriteriaQuery<CarModel> modelQuery = cb.createQuery(CarModel.class);
//    	Root<CarModel> modelRoot = modelQuery.from(CarModel.class);
//    	modelQuery.select(modelRoot);
    	
//    	List<CarModel> models = em.createQuery(modelQuery).getResultList();
//    	models.forEach(m -> System.out.println(m));
    	
    	//  2
    	// SELECT m.color FROM CarModel m WHERE m.id = 1
    	
//    	CriteriaQuery<CarColor> query = cb.createQuery(CarColor.class);
//    	Root<CarModel> root = query.from(CarModel.class);
//    	query.select(root.get("color"));
//    	Expression<CarModel> colorExpression = root.get("id");
//    	Predicate idPredaicate = cb.equal(colorExpression, new Long(1));
//    	query.where(idPredaicate);
//    	System.out.println(em.createQuery(query).getSingleResult());
//    	
    	
    	//   3
    	//  SELECT c FROM CarModel c WHERE c.modelTitle LIKE '%a%'
    	
//    	CriteriaQuery<CarModel> query = cb.createQuery(CarModel.class);
//    	Root<CarModel> root = query.from(CarModel.class);
//    	query.select(root);
//    	Expression<String> expression = root.get("modelTitle");
//    	Predicate predicate = cb.like(expression, "%a%");    	
//    	query.where(predicate);
//    	
//    	List<CarModel> models = em.createQuery(query).getResultList();
//    	models.forEach(m -> System.out.println(m));
    	
    	
    	//   4
    	//   SELECT c FROM Car c WHERE c.price >= 17000 AND c.carMake.makeTitle  LIKE 'Volks%'
//    	
//    	CriteriaQuery<Car> query = cb.createQuery(Car.class);    	
//    	Root<Car> root = query.from(Car.class);
//    	query.select(root);
//    	Expression<BigDecimal> priceExpression = root.get("sellPrice");
//    	Predicate pricePredicate = cb.ge(priceExpression, new BigDecimal("17000"));
//    	
//    	Expression<String> makeTitleExpression = root.get("carMake").get("makeTitle");
//     	Predicate makeTitlePredicate = cb.like(makeTitleExpression, "Volks%");
//    	Predicate allPredicate = cb.and(pricePredicate, makeTitlePredicate);
//    	query.where(allPredicate);
//    	
//    	List<Car> cars = em.createQuery(query).getResultList();
//    	cars.forEach(c -> System.out.println(c + " - " + c.getCarMake()));
    	
    	//  5
    	// SELECT cm FROM CarMake cm WHERE cm.model.color.color = "Black" 
    	// 		cm.model.engineCapacity.engineCapacity BETWEEN 1.6 AND 2.5					
    	
//    	CriteriaQuery<CarMake> query = cb.createQuery(CarMake.class);
//    	Root<CarMake> root = query.from(CarMake.class);
//    	query.select(root);
//    	
//    	Expression<String> colorExpression = root.get("model").get("color").get("color");
//    	Predicate colorPredicate = cb.equal(colorExpression, "Black");
//    	
//    	Expression<BigDecimal> capacityExpression = root.get("model").get("engineCapacity")
//    			.get("engineCapacity");
//    	Predicate capacityPredicate = cb.between(capacityExpression, new BigDecimal("1.6"), new BigDecimal(2.5));
//    	Predicate allPredicate = cb.and(colorPredicate, capacityPredicate);
//    	
//    	query.where(allPredicate);
//    	System.out.println(em.createQuery(query).getSingleResult());
    	
    	
    	//  6
    	// SELECT md FROM CarMake mk JOIN mk.model md WHERE md.id = 3
    	
//    	CriteriaQuery<CarMake> query = cb.createQuery(CarMake.class);
//    	Root<CarMake> root = query.from(CarMake.class);
//    	query.select(root);
//    	
//    	Join<CarMake, CarModel> carMakeJoin = root.join("model");
//    	Expression<Long> carMakeIdJoin = root.get("id");
//    	Predicate carMakeIdPredicate = cb.equal(carMakeIdJoin, new Long(3));
//    	query.where(carMakeIdPredicate);
//    	
//    	System.out.println(em.createQuery(query).getSingleResult());
    	
    	//  7 
    	// SELECT m FROM CarModel m JOIN m.color c WHERE m.id = 2 AND c.color = "green"
    	
//    	
//    	CriteriaQuery<CarModel> query = cb.createQuery(CarModel.class);
//    	Root<CarModel> root = query.from(CarModel.class);
//    	query.select(root);
//    	
//    	Expression<Long> carModelIdExpression = root.get("id");
//    	Predicate carModelIdPredicate = cb.ge(carModelIdExpression, new Long(2));
//    	
//    	Join<CarModel, CarColor> carColorJoin = root.join("color");
//    	Expression<String> carColorExperession = carColorJoin.get("color");
//    	Predicate colorPredicate = cb.equal(carColorExperession, "green");
//    	
//    	Predicate allPredicate = cb.and(carModelIdPredicate, colorPredicate);
//    	
//    	query.where(allPredicate);
//    	System.out.println(em.createQuery(query).getSingleResult());
    	
    	//  8
    	//  SELECT COUNT(f.id) FROM CarFuelType f
    	
//    	CriteriaQuery<Long> query = cb.createQuery(Long.class);
//    	Root<CarFuelType> root = query.from(CarFuelType.class); 
//    	query.select(cb.count(root.get("id")));
//    	
//    	System.out.println(em.createQuery(query).getSingleResult());
    
    	//  9
    	//  SELECT s FROM CarSeller WHERE s.firstName IN ('Bill','Jonh')
    	
//    	CriteriaQuery<CarSeller> query = cb.createQuery(CarSeller.class);
//    	Root<CarSeller> root = query.from(CarSeller.class);
//    	query.select(root);
//    	List<String> names = Arrays.asList("Bill","Jonh");
//    	Expression<String> sellerExpression = root.get("firstName");
//    	Predicate sellerPredicate = sellerExpression.in(names);
//    	
//    	em.createQuery(query).getResultList().forEach(s -> System.out.println(s));
    	
    	
    	//  10
    	//  SELECT m FROM CarModel m WHERE m.fuelType = FuelType.DIESEL
    	
//    	CriteriaQuery<CarModel> query = cb.createQuery(CarModel.class);
//    	Root<CarModel> root = query.from(CarModel.class);
//    	query.select(root);
//    	Expression<FuelType> fuelTypeExpression = root.get("fuelType").get("fuelType");
//    	Predicate fuelTypePredicate = cb.equal(fuelTypeExpression, FuelType.DIESEL);
//    	query.where(fuelTypePredicate);
//    	em.createQuery(query).getResultList().forEach(m -> System.out.println(m));
    	
    	
    	
    	
    	
    	em.getTransaction().commit();
    	em.close();
    	factory.close();
    }
}
