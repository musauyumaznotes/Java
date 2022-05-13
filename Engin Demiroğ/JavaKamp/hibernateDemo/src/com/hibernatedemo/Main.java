package com.hibernatedemo;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//HQL-->Hibernate Querry Language
			//"from City c where c.countryCode='TUR' AND c.district='Ankara'"
			//ASC-->Ascending
			//DESC-->Descending
			/*List<String> countryCodes = session.createQuery("select c.countryCode from City c Group BY c.countryCode").getResultList();
			
			for(String countryCode:countryCodes) {
				System.out.println(countryCode);
			}*/
			
			//INSERT
//			City city = new  City();
//			city.setName("Düzce 10");
//			city.setCountryCode("TUR");
//			city.setDistrict("Karadeniz");
//			city.setPopulation(100000);
//			
//			session.save(city);
			
			//UPDATE
			City city1 = session.get(City.class, 4080);
			city1.setPopulation(110000);
			
			session.save(city1);
			
			//CRUD Create Read Update Delete
			
			//DELETE
			
			City city = session.get(City.class, 4080);
			session.delete(city);
			
			session.getTransaction().commit();
			System.out.println("Þehir Silindi");
		}finally {
			factory.close();
		}
		
	}

}
