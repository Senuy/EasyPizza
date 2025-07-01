package com.devYunes.ezpizza.entities;

import java.util.Objects;

public class Client {
	
	private Long id;
	private String name;
	private String telephone;
	
	public Client() {
	}

	public Client(Long id, String name, String telephone) {
		this.id = id;
		this.name = name;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	
	

}
