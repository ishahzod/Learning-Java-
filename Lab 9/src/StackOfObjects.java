//Shahzodjon Ismatov (110518374)
import java.util.*;
public class StackOfObjects {
	private ArrayList<Object> elements;
	
	public StackOfObjects(){
		//default capacity of 2
		elements = new ArrayList<>(2);
	}
	
	public boolean isEmpty(){
		return elements.isEmpty();
	}
	
	public int getSize(){
		return elements.size();
	}
	
	public Object peep(){
		return elements.get(getSize()-1);
	}
	
	public Object pop(){
		Object o = elements.get(getSize()-1);
		elements.remove(getSize()-1);
		return o;
	}
	
	public void push(Object o){
		elements.add(o);
	}
	
	@Override
	public String toString(){
		return elements.toString();
	}
	
	//Simple Test, feel free to adjust. 
	public static void main(String [] args){
		StackOfObjects o = new StackOfObjects();
		o.push("two");
		o.push(6);
		o.push("ch");
		System.out.println("Is the Stack Empty? " + o.isEmpty());
		System.out.println("Capacity of the Stack: " + o.getSize());
		System.out.println("Elements of the Stack: " + o.toString());
	}
}
