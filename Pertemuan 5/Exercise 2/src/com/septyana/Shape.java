package com.septyana;

public class Shape {
	private String color;
	private boolean filled;
	public Shape ()
	{
		color = "red";
		filled = true;
	}
	public Shape (String c, boolean f)
	{
		color = c;
		filled = f;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString ()
	{
		return (filled == true) ? "A Shape with color of " + color + " and filled" : "A Shape with color of " + color + " and Not filled";
	}
}