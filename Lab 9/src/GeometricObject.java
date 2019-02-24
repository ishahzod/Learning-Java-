//Shahzodjon Ismatov (110518374)

public abstract class GeometricObject implements Comparable, Cloneable {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated = new java.util.Date();
	
	public GeometricObject() {}
	
	public GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	public String toString(){
		return "\nCreated: " + dateCreated + "\nColor: " + color 
				+"\nFilled: " + filled;
	}
	
	//Comparable interface
	
	public int compareTo(Object o){
		GeometricObject g = (GeometricObject)o;
		if(this.getArea() > g.getArea())
			return 1;
		else if(this.getArea() == g.getArea())
			return 0;
		else return -1;
	}
	
	//Statix Max Method
	
	public static Object max(Object o1, Object o2){
		if(((Comparable)o1).compareTo(o2)>0)
			return o1;
		else 
			return o2;
	}
	
	public static Object max(Object [] a){
		Object max = a[0];
		for(Object o: a)
			max = max(o, max);
		return max;
	}
	
	public static void sort(Comparable[] a){
		for(int i = 0; i<a.length; i++){
			Comparable max = a[i];
			int maxIndex = i;
			for(int j = i+1; j< a.length; j++)
				if(max.compareTo(a[i]) <0){
					max = a[i];
					maxIndex = i;
				}
			if(maxIndex != i){
				a[maxIndex]= a[i];
				a[i] = max;
			}
		}
	}
	
	public Object clone() {
		try {
			return super.clone(); 
		}catch (CloneNotSupportedException ex) {
			return null; 
		}
	}
	
	//Abstract Class declartions
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	//Test runs
	
	public static void main(String[] args) {
		System.out.print("*-Comparable interface-*");
		System.out.print("\nLargest of Two Circles: ");
		Circle c1 = new Circle(1); 
		c1.setColor("Black");
		Circle c2 = new Circle(3);
		c2.setColor("Orange");
		System.out.println((Circle)max(c1,c2));
		
		System.out.print("\nLargest Rectangle: ");
		Rectangle r1 = new Rectangle(2,3);
		r1.setColor("Blue");
		r1.setFilled(false);
		Rectangle r2 = new Rectangle(3,6); 
		r2.setColor("Red");
		r2.setFilled(true);
		System.out.println((Rectangle)max(r1,r2));
		
		System.out.println("\n*-Cloneable interface-*");
		Rectangle x = new Rectangle();
		Rectangle y = (Rectangle) x.clone();
		x = y;
		System.out.println("Is rectangle x == y ? " + (x == y)); 

	}
}
