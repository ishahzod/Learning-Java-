import java.util.*;

public class Testing {

	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		
		a.setHeight(40);
		a.setWidth(4);
		
		System.out.println("Rectangle A");
		System.out.println("Width: " + a.getWidth() + "   Height: " + a.getHeight() + "\n" +
				"Perimiter: " + a.getPerimiter() + "\n" +"Area: " + a.getArea() + "\n");
		
		b.setHeight(3.5);
		b.setWidth(35.9);
		
		System.out.println("Rectangle B");
		System.out.println("Width: " + b.getWidth() + "   Height: " + b.getHeight() + "\n" +
				"Perimiter: " + b.getPerimiter() + "\n" +"Area: " + b.getArea() + "\n");

	}

}
