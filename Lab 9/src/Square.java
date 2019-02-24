//Shahzodjon Ismatov (110518374)
public class Square extends GeometricObject implements Colorable {
	private double side = 1;

	public Square(){}

	public Square(double side){
		this.side = side;
	}

	public String howToColor() {
		return "Color all four sides.";
	}

	public boolean isColorable(){
		if(this.side > 0)
			return true;
		return false;
	}

	public double getSide(){
		return this.side;
	}

	public double getArea(){
		return this.side * this.side;
	}

	public double getPerimeter(){
		return 4*(this.side);
	}
	// Test run
	public static void main(String[] args) {

		GeometricObject[] obj = new GeometricObject[5];
		obj[0] = new Square(1);
		obj[1] = new Rectangle(2, 6);
		obj[2] = new Square(3);
		obj[3] = new Rectangle(10, 5);
		obj[4] = new Square(25);

		for (int i = 0; i < obj.length; i++) {
			System.out.println("Object #" + (i + 1) + " area = " + obj[i].getArea());
			if (obj[i] instanceof Colorable) {
				System.out.println("How to color: "+((Colorable)obj[i]).howToColor());
			}
		}

	}
}
