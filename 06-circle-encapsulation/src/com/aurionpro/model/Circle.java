package com.aurionpro.model;

public class Circle {
	private String color;

	public void setColor(String color) { // setter
		this.color = getCorrectedValues(color);
	}

	private String getCorrectedValues(String color) {
		if (color == "red" || color == "blue" || color == "yellow") {
			return color;
		}
		return "red";

	}

	public String getColor() { // getter
		return color;
	}
}
