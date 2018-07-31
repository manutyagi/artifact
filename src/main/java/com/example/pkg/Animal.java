package com.example.pkg;

import java.util.ArrayList;
import java.util.Set;

public class Animal {
	private double weight;
	private float height;
	private String SpeciesName;
	private Color color;
	private Size size;
//	private String validator;
	private Animal animal;
	
	private Set<String> names;
	
	public Set<String> getNames() {
		return names;
	}
	public void setNames(Set<String> names) {
		this.names = names;
	}
	
	
	
	
	public Animal() {
		
	}
	public Animal(Color color) {
		System.out.println("called constructor");
		this.color=color;
		
	}
	public Animal(double weight, float height, String speciesName, Color color , Size size) {
		super();
		this.weight = weight;
		this.height = height;
		SpeciesName = speciesName;
		this.color = color;
		this.size = size;
	}
	
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String getSpeciesName() {
		return SpeciesName;
	}
	public void setSpeciesName(String speciesName) {
		SpeciesName = speciesName;
	}
//	public String getValidator() {
//		return validator;
//	}
//	public void setValidator(String validator) {
//		this.validator = validator;
//	}
	
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
