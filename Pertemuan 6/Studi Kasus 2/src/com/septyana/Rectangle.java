package com.septyana;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(double width, double length)
	{
		super("Rectangle");
		this.width = width;
		this.length = length;
	}
	
	public String toString()
	{
		return super.toString() + "width : " + width + "\nLength : " + length;
	}
	
	@Override
	double area() 
	{
		return width * length;
	}
	
	
}
