import java.util.*;
import java.io.*;
public class Lesson171 {

	//Student, name & height & weight
	public static class Student {
	  String name;
	  double height;
	  double weight;
	  
	  public Student (String n, double h, double w) {
	        name = n;
	        height = h;
	        weight = w;
	  }
	}
	
	//Rectangle, only length & width
	public static class Rectangle {
	  double length;
	  double width;
	  
	  public Rectangle (double l, double w) {
	      length = l;
	      width = w;
	  }
	
	

		//creating behaviour
		//public returntype functionname(input parameter)
		public double calculateArea() {
	        return length*width;
		}
	
		public double calculatePerimeter() {
	        return 2*(length+width);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//type name = new type();
		Rectangle rectANGle = new Rectangle (5,5);
	      System.out.println(rectANGle.length+" "+rectANGle.width+" "+rectANGle.calculatePerimeter());
		
	}

}
