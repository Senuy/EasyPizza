package com.devYunes.ezpizza.entities;

import java.util.List;
import java.util.Objects;

public class Pizza {

	private Long id;
	private String name;
	private Size size;
	private Double price;
	private List<Ingredients> ingredients;

	public Pizza() {
	}

	public Pizza(Long id, String name, Size size, Double price) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		return Objects.equals(id, other.id);
	}
	

}
