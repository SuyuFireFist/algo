package Exam;

public class Exam2 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);
				
		for(Shape s : shapes) {
			System.out.println(s+",≥–¿Ã:"+s.area()+", µ—∑π:"+s.length());
		}
	}

}
