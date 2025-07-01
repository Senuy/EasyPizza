package com.devYunes.ezpizza.entities;

import java.util.Objects;

public class Pizzaria {

	private Long id;
	private String name;
	private String address;
	private String telephone;

	public Pizzaria() {
	}

	public Pizzaria(Long id, String name, String address, String telephone) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
		Pizzaria other = (Pizzaria) obj;
		return Objects.equals(id, other.id);
	}

}
