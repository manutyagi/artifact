package com.example.pkg;

public class Point {
	private int x;
	private int y;
	
//	public Point() {
//		System.out.println("default constructor");
//	}
//	public Point(String message ,int number) {
//		System.out.println(message +","+number);
//	}
//	public Point(double d ,float f,float f1) {
//		System.out.println(d +","+f+","+f1);
//	}
	public Point(double d ,float f) {
		System.out.println(d +","+f);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
