package com.septyana;

public class Cylinder extends Shape {
	private double radius;
	private double height;

	public Cylinder(double radius, double height)
	{
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}
	
	public String toString()
	{
		return super.toString() + "Radius : " + radius + "\nHeight : " + height;
	}
	
	@Override
	double area() {
		return Math.PI*radius*radius*height;
	}
}
