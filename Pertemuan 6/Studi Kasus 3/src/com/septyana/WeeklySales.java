package com.septyana;

import java.util.Scanner;

public class WeeklySales {
	public static void main(String[] args) {
		Salesperson[] salesStaff;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many data Staff you want to add? ");
		int size = sc.nextInt();
		salesStaff = new Salesperson[size];
		for(int i = 0; i < size; i++)
		{
			System.out.println("Type Staff[" + i + "] first name : ");
			String first = sc.next();
			System.out.println("\nType Staff[" + i + "] last name : ");
			String last = sc.next();
			System.out.println("\nEnter Staff[" + i + "] total sales : ");
			int total = sc.nextInt();
			System.out.println();
			salesStaff[i] = new Salesperson(first, last, total);
		}
		Sorting.insertionSort(salesStaff);
		System.out.println("\nRanking of Sales for the Week\n");
		for (Salesperson s : salesStaff)
			System.out.println(s);
	}
}
