package com.septyana;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle ()
	{
		width = 1.0;
		length = 1.0;
	}
	public Rectangle (double l, double w)
	{
		length = l;
		width = w;
	}
	public Rectangle (double l, double w, String c, boolean f)
	{
		super(c, f);
		length = l;
		width = w;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea()
	{
		return length * width;
	}
	public double getPerimeter()
	{
		return (length + width) * 2;
	}
	@Override
	public String toString() 
	{
		return "A Rectangle with width= "+width+" and length= " +length+ ", which is a subclass of "+super.toString();
	}
}
