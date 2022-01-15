package Exam;

public class Rectangle extends Shape {

	private int a;
	private int b;

	public Rectangle(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public double area() {
		double ar;
		ar = a*b;
		return ar;
	}

	public double length() {
		double len;
		len = (a*2)+(b*2);
		return len;
	}
	
	public String toString() {
		return "Rectangle [type=»ç°¢Çü, width="+a+", height="+b+"]";
	}

}
