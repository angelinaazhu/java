import java.io.*;
import java.util.*;
public class Lesson19_TriangleClass {
	
	public static class Triangle7 {
		double side1;
		double side2;
		double side3;
		
		public Triangle7(double S1, double S2, double S3) {
			side1 = S1;
			side2 = S2;
			side3 = S3;
		}
		
		public double calculateArea() {
			double semiperimeter = (side1+side2+side3)/2;
			return Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
		}
		
		public double calculatePerimeter() {
			return side1+side2+side3;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle7 angelinasTriangle = new Triangle7 (1,2,3);
		System.out.println(angelinasTriangle.calculateArea());
		System.out.println(angelinasTriangle.calculatePerimeter());

	}

}
