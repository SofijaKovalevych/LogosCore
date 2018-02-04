package controllers;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Join;

import ua.entity.Car;
import ua.entity.CarMake;
import ua.entity.CarSeller;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
//		createCars(em);
//		ceareCarsMakers(em);
//		createCarsSellers(em);
//		
//		setMakersAndSellersToAllItems(em);
		
//		List<Car> cars = em
//				.createQuery("SELECT i FROM Car i JOIN i.carSeller c WHERE c.name = :name", Car.class)
//				.setParameter("name", "Seller2").getResultList();
//
//		cars.forEach(System.out::println);
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Car> query = cb.createQuery(Car.class);
		Root<Car> root = query.from(Car.class);
		query.select(root);
		Join<Car, CarSeller> selerJoin = root.join("carSeller");
		Expression<String> someName = selerJoin.get("name");
		Predicate sellerPredicate = cb.like(someName, "Seller2%");
		Predicate all = cb.and(sellerPredicate);
		
		query.where(all);
		root.fetch("carSeller");
		List<Car> itemsCriteria = em.createQuery(query).getResultList();

		itemsCriteria.forEach(System.out::println);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	private static void createCars(EntityManager em) {
		for (int i = 1; i <= 1000; i++) {
			Car car = new Car();
			car.setName("Test" + i);
			BigDecimal price = new BigDecimal(1.00 + i);
			car.setPrice(price);
			em.persist(car);
			em.merge(car);
		}

	}
	
	private static void ceareCarsMakers(EntityManager em) {
		for (int i = 1; i <= 10; i++) {
			CarMake carMake = new CarMake();
			carMake.setName("Maker" + i);
			em.persist(carMake);
			em.merge(carMake);
		}

	}
	
	private static void createCarsSellers(EntityManager em) {
		for (int i = 1; i <= 5; i++) {
			CarSeller carSeller = new CarSeller();
			carSeller.setName("Seller" + i);
			em.persist(carSeller);
			em.merge(carSeller);
		}
		
	}
	
	private static CarMake getRandomCarMake(EntityManager em) {
		CarMake carMake = (CarMake) em.createQuery("select b from CarMake b ORDER BY rand()", CarMake.class).getResultList()
				.get(0);
		return carMake;
	}
	
	private static CarSeller getRandomCarSeller(EntityManager em) {
		CarSeller carSeller = (CarSeller) em.createQuery("select b from CarSeller b ORDER BY rand()", CarSeller.class).getResultList()
				.get(0);
		return carSeller;
	}
	
	private static List<Car> findAllCars(EntityManager em) {
		List<Car> cars = em.createQuery("Select v from Car v", Car.class).getResultList();
		return cars;
	}
	
	private static void setMakersAndSellersToAllItems(EntityManager em) {
		findAllCars(em).forEach(i -> {
			i.setCarMake(getRandomCarMake(em));
			i.setCarSeller(getRandomCarSeller(em));
			em.persist(i);
		});
	}

}
