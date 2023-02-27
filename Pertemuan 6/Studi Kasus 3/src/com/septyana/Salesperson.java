package com.septyana;

public class Salesperson implements Comparable {
	private String firstName, lastName;
	private int totalSales;
	
	public Salesperson(String first, String last, int sales) 
	{
		firstName = first;
		lastName = last;
		totalSales = sales;
	}
	
	public String toString()
	{
		return lastName + ", " + firstName + ": \t" + totalSales;
	}
	
	public boolean equals (Object other)
	{
		return (lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
	}
	
	public int compareTo(Object order)
	{
		Salesperson Eb = (Salesperson) order;
		if(totalSales<Eb.totalSales) return -1;
		if(totalSales>Eb.totalSales) return 1;
		return 0;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getSales()
	{
		return totalSales;
	}
}
