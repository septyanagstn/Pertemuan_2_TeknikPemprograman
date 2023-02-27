package com.septyana;

import java.text.DecimalFormat;

public class PaintThings 
{
	public static void main(String[] args) {
		final double COVERAGE = 350;
		Paint paint = new Paint(COVERAGE);
		
		Rectangle deck = new Rectangle(20, 35);
		Sphere bigBall = new Sphere(15);
		Cylinder tank = new Cylinder(10, 30);
		
		double deckAmt, ballAmt, tankAmt;
		DecimalFormat fmt = new DecimalFormat("0.#");
		
		deckAmt = paint.amount(deck);
		System.out.println("Number of gallons of paint needed...");
		System.out.println("Deck " + fmt.format(deckAmt)+"\n");
		
		ballAmt = paint.amount(bigBall);
		System.out.println("Number of gallons of paint needed...");
		System.out.println("Big Ball " + fmt.format(ballAmt)+"\n");
		
		tankAmt = paint.amount(tank);
		System.out.println("Number of gallons of paint needed...");
		System.out.println("Tank " + fmt.format(tankAmt)+"\n");
	}
}
