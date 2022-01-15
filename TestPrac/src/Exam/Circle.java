package Exam;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double area() {
		double ar;
		ar = PI * radius * radius;
		return ar;
	}
	
	public double length() {
		double le;
		le = 2*PI*radius;
		return le;
	}
	
	public String toString() {
		return "Circle [type=¿ø, r="+radius+"]";
	}
   
  }
