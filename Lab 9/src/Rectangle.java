//Shahzodjon Ismatov (110518374)
public class Rectangle extends GeometricObject implements Comparable {
	private double width = 1, height = 1;
	
	public Rectangle() {}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public double getArea(){
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2*(this.width + this.height);
	}
}
