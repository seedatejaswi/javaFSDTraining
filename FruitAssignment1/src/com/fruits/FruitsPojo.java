package com.fruits;

import netscape.javascript.JSObject;

public class FruitsPojo {
	private String color;
	private int weight;
	private String name;
	private int price;

	public FruitsPojo(String color, String name, int price, int weight) {
		this.color = color;
		this.name = name;
		this.price = price;
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "FruitsPojo [color=" + color + ",fruitName = " + name + ",price = " + price + ",weight = " + weight + "]";
	}
}
