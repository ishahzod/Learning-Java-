//Shahzodjon Ismatov (110518374)
public class Circle extends GeometricObject {
	private double radius = 1;
	
	public Circle() {}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
	//Perimeter of a Circle = Circumference 
	@Override
	public double getPerimeter() {
		return 2*(Math.PI)*this.radius;
	}


}
