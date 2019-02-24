//Shahzodjon Ismatov (110518374)
public class Rectangle {
	
	//data fields
	private double height=1, width=1;
	
	//default constructor 
	public Rectangle(){
	}
	
	public Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
/*	public void setWidth(double w){
		this.width = w;
	}
	
	public void setHeight(double h){
		this.height = h;
	}*/
	
	public double getWidth(){
		return this.width;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public double getArea(){
		double area = width*height;
		return area;
	}
	
	public double getPerimiter(){
		double perimeter = 2*width + 2*height;
		return perimeter;
	}
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle(4, 40);
		Rectangle b = new Rectangle(3.5, 35.9);

		
		System.out.println("The area of a " + a.getWidth() + " x " + a.getHeight() + " Rectangle is " + a.getArea());
		System.out.println("The perimeter of a " + a.getWidth() + " x " + a.getHeight() + " Rectangle is " + a.getPerimiter());
		
	
		System.out.println("The area of a " + b.getWidth() + " x " + b.getHeight() + " Rectangle is " + b.getArea());
		System.out.println("The perimeter of a " + b.getWidth() + " x " + b.getHeight() + " Rectangle is " + b.getPerimiter());

	}
	
}
