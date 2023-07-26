import java.util.Scanner;

public class Lesson2_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Task 1
		double david = 11;
		double sarah = 6.5;
		System.out.println(david*sarah);
		System.out.println(david/sarah);
		System.out.println(david+sarah);
		System.out.println(david-sarah);
		
		//Task 2
		boolean andrew = true;
		boolean jasmine = false;
		System.out.println(andrew);
		System.out.println(jasmine);
		
		//Task 3
		double leon = 11.7;
		leon = 10;
		double grace = 6.8;
		grace = 11;
		System.out.println(leon*grace-grace);
		
		//Task 4
		Scanner task4 = new Scanner(System.in);
		int A = task4.nextInt();
		int B = task4.nextInt();
		System.out.println(A+B);
		
		//Task 5
		Scanner task5 = new Scanner(System.in);
		double C = task5.nextDouble();
		double D = task5.nextDouble();
		double E = task5.nextDouble();
		System.out.println(C*D-E);
		
		//Task 6
		Scanner task6 = new Scanner(System.in);
		int F = task6.nextInt();
		double G = task6.nextDouble();
		int H = task6.nextInt();
		System.out.println(F+G*H);
		
		
	}

}
