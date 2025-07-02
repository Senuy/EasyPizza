package com.devYunes.ezpizza.entities;

import java.util.Objects;

public class Ingredients {
	
	private Long id;
	private String name;
	private String descripiton;
	private Double quantityInStock;
	// Ideia criar um enum para tipos de medida em estoque, g , kg, quantidade, Litros
	
	
	
	public Ingredients() {
	}

	public Ingredients(Long id, String name, String descripiton, Double quantityInStock) {
		this.id = id;
		this.name = name;
		this.descripiton = descripiton;
		this.quantityInStock = quantityInStock;
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

	public String getDescripiton() {
		return descripiton;
	}

	public void setDescripiton(String descripiton) {
		this.descripiton = descripiton;
	}

	public Double getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(Double quantityInStock) {
		this.quantityInStock = quantityInStock;
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
		Ingredients other = (Ingredients) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
