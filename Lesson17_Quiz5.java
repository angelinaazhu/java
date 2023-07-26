
public class Lesson17_Quiz5 {
	
	public static class Square { //Square class
		double side;	//instance variable, side
		
		public Square(double s) {
			side = s;
		}	
	
	
		public double calculateArea() {
			return side*side;
		}
		
		public double calculatePerimeter() {
			return side*4;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square angelina = new Square(5);	//object
		System.out.println("The area is "+angelina.calculateArea()+" and the perimeter is "+angelina.calculatePerimeter());
		
		
	}

}
