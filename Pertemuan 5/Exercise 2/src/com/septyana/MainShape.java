package com.septyana;

public class MainShape {
	public static void main(String[] args) {
		// memanggil class circle tanpa parameter construct
		// dan meanmpilkan sesuai yang sudah di inisiasikan pada contruct
		Circle c1 = new Circle();
		System.out.println("Circle:\n"
				+"Color : " + c1.getColor()
				+"\nRadius : " + c1.getRadius()
				+"\nArea : " + c1.getArea()
				+"\nPerimeter : " + c1.getPerimeter());
		System.out.println(c1.toString());
		System.out.println();
		
		// memanggil class circle dengan parameter sebagai nilai radius
		Circle c2 = new Circle(9);
		System.out.println("Circle:\n"
				+"Color : " + c2.getColor()
				+"\nRadius : " + c2.getRadius()
				+"\nArea : " + c2.getArea()
				+"\nPerimeter : " + c2.getPerimeter());
		System.out.println(c2.toString());
		System.out.println();
		
		// memanggil class circle dengan 3 parameter sebagai nilai radius, warna dan nilai filled
		Circle c3 = new Circle(15, "Biru", false);
		System.out.println("Circle:\n"
				+"Color : " + c3.getColor()
				+"\nRadius : " + c3.getRadius()
				+"\nArea : " + c3.getArea()
				+"\nPerimeter : " + c3.getPerimeter());
		System.out.println(c3.toString());
		System.out.println();
		
		// memanggil class Rectangle tanpa parameter output 
		// dan meanmpilkan sesuai yang sudah di inisiasikan pada contruct 
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle:\n"
				+"Color : " + r1.getColor()
				+"\nLength : "+ r1.getLength()
				+"\nWidth : "+ r1.getWidth()
				+"\nArea : " + r1.getArea()
				+"\nPerimeter : " + r1.getPerimeter());
		System.out.println(r1.toString());
		System.out.println();
		
		// memanggil class Rectangle dengan 2 parameter sebagai nilai panjang dan lebar
		Rectangle r2 = new Rectangle(8, 7);
		System.out.println("Rectangle:\n"
				+"Color : " + r2.getColor()
				+"\nLength : "+ r2.getLength()
				+"\nWidth : "+ r2.getWidth()
				+"\nArea : " + r2.getArea()
				+"\nPerimeter : " + r1.getPerimeter());
		System.out.println(r2.toString());
		System.out.println();
		
		// memanggil class Rectangle dengan 4 parameter nilai panjang, lebar, warna, dan boolean 
		Rectangle r3 = new Rectangle(9, 6, "Hijau", false);
		System.out.println("Rectangle:\n"
				+"Color : " + r3.getColor()
				+"\nLength : "+ r3.getLength()
				+"\nWidth : "+ r3.getWidth()
				+"\nArea : " + r3.getArea()
				+"\nPerimeter : " + r3.getPerimeter());
		System.out.println(r3.toString());
		System.out.println();
		
		// memanggil class square tanpa parameter construct
		// dan meanmpilkan sesuai yang sudah di inisiasikan pada contruct 
		Square s1 = new Square();
		System.out.println("Square:\n"
				+"Color : " + s1.getColor()
				+"\nSide : " + s1.getSide()
				+"\nArea : " + s1.getArea()
				+"\nPerimeter : " + s1.getPerimeter());
		System.out.println(s1.toString());
		System.out.println();
		
		// memanggil class square dengan parameter sebagai nilai sisi square
		Square s2 = new Square(9);
		System.out.println("Square:\n"
				+"Color : " + s2.getColor()
				+"\nSide : " + s2.getSide()
				+"\nArea : " + s2.getArea()
				+"\nPerimeter : " + s2.getPerimeter());
		System.out.println(s2.toString());
		System.out.println();
		
		// memanggil class square dengan 3 parameter niali sisi, warna dan boolean filled
		Square s3 = new Square(7, "ungu", false);
		System.out.println("Square:\n"
				+"Color : " + s3.getColor()
				+"\nSide : " + s3.getSide()
				+"\nArea : " + s3.getArea()
				+"\nPerimeter : " + s3.getPerimeter());
		System.out.println(s3.toString());
		System.out.println();	
	}
}