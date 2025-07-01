package com.devYunes.ezpizza.entities;

import java.util.Objects;

public class Delivery {
	private Long id;
	private String name;
	private String CPF;
	private String telephone;
	private StatusDelivery status;
	
	
	public Delivery() {
	}


	public Delivery(Long id, String name, String cPF, String telephone, StatusDelivery status) {;
		this.id = id;
		this.name = name;
		CPF = cPF;
		this.telephone = telephone;
		this.status = status;
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


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public StatusDelivery getStatusDelivery() {
		return status;
	}


	public void setStatusDelivery(StatusDelivery status) {
		this.status = status;
	}


	@Override
	public int hashCode() {
		return Objects.hash(CPF, id, telephone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Delivery other = (Delivery) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(id, other.id)
				&& Objects.equals(telephone, other.telephone);
	}
	
	
	
	
}
