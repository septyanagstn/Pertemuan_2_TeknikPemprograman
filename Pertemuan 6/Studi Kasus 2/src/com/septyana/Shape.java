package com.septyana;

abstract public class Shape {
	String shapeName;
	
	public Shape(String shape) {
		this.shapeName = shape;
	}

	abstract double area();
	public String toString()
	{
		return "shape : " + shapeName + "\n";
	}
}