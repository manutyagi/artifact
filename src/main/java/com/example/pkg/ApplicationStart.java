package com.example.pkg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ApplicationStart {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Beans.xml");
//		Calculator cal = (Calculator) applicationContext.getBean("calc");
//		Animal animal = (Animal) applicationContext.getBean("animal");
//		Animal zeb = (Animal) applicationContext.getBean("zebra");
//		Animal bobby = (Animal) applicationContext.getBean("bobby");
		Animal zeb1 = (Animal) applicationContext.getBean("zebra1");
		Animal zeb2 = (Animal) applicationContext.getBean("zebra2");
		Animal zeb3 = (Animal) applicationContext.getBean("zebra3");
//		BeanValidator val = (BeanValidator) applicationContext.getBean("validatorBean");


//		Point p =(Point)applicationContext.getBean("Point10");
//		System.out.println(p.getX());
//		System.out.println(p.getY());
		
//		System.out.println(cal.add());
//		System.out.println(cal.multiply());
//		System.out.println(cal.divide());
//		System.out.println(cal.subtract());
		
//		System.out.println(animal.getWeight());
//		System.out.println(animal.getHeight());
//		System.out.println(animal.getSpeciesName());
		
		
//		System.out.println(animal.getColor().getColorName());
//		System.out.println(animal.getWeight());
		
//		System.out.println(animal.getColor().getColorName());
//		System.out.println(animal.getColor().getColorId());
		
//		System.out.println(animal.getSize().getWeight());
//		System.out.println(animal.getSize().getHeight());

//		System.out.println(zeb.getValidator());

//		System.out.println(val);
		
//		System.out.println(zeb.getSize().getWeight());
//		System.out.println(bobby.getSize().getWeight());
		
//		System.out.println(zeb.getNames().get(0));
//		System.out.println(zeb.getNames().get(1));
		
//		System.out.println(zeb.getNames());
//		System.out.println(zeb.getColor().getColorName());
		
		System.out.println(zeb1.getColor().getColorName());
		System.out.println(zeb2.getColor().getColorName());
		System.out.println(zeb3.getAnimal().getColor().getColorName());
	}

}
