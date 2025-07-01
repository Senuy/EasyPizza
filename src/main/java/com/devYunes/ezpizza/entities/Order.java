package com.devYunes.ezpizza.entities;

import java.time.Instant;
import java.util.List;
import java.util.Objects;



public class Order {
	
	private Long id;
	private Instant date_time;
	private StatusOrder statusOrder;
	private List<Pizza> pizzas;
	private Delivery delivery;
	private Client client;
	private Double totalPrice;
	
	public Order() {
	}

	public Order(Long id, Instant date_time, StatusOrder statusOrder, List<Pizza> pizzas, Delivery delivery,
			Client client, Double totalPrice) {
		this.id = id;
		this.date_time = date_time;
		this.statusOrder = statusOrder;
		this.pizzas = pizzas;
		this.delivery = delivery;
		this.client = client;
		this.totalPrice = totalPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDate_time() {
		return date_time;
	}

	public void setDate_time(Instant date_time) {
		this.date_time = date_time;
	}

	public StatusOrder getStatusOrder() {
		return statusOrder;
	}

	public void setStatusOrder(StatusOrder statusOrder) {
		this.statusOrder = statusOrder;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(client, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(client, other.client) && Objects.equals(id, other.id);
	}

	
	
}
