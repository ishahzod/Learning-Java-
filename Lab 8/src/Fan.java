//Shahzodjon Ismatov (110518374)
public class Fan {
	
	public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int  speed = Fan.SLOW;
	private boolean on;
	private double radius = 5;
	private String color = "blue";
	
	public Fan(){}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		if(speed == Fan.SLOW || speed == Fan.MEDIUM || speed == Fan.FAST)
		this.speed = speed;
	}
	
	public boolean isOn(){
		return on;
	}
	
	public void setOn(boolean on){
		this.on = on;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		if(radius>0)
		this.radius = radius;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String toString(){
		if(on)
			return "Fan is on: speed=" + speed + " , radius=" + radius + " , color=" + color;
		else
			return "Fan is off: radius=" + radius + " , color=" + color;
	}
	
	public static void main(String[] args) {
		Fan a = new Fan();
		a.setSpeed(Fan.FAST);
		a.setOn(true);
		a.setRadius(10);
		a.setColor("yellow");
		
		Fan b = new Fan();
		b.setSpeed(Fan.MEDIUM);
		b.setOn(false);
		b.setColor("blue");
		b.setRadius(5);
		
		System.out.println(a.toString());
		System.out.println(b.toString());


	}

}
