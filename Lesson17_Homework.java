import java.util.*;
import java.io.*;
public class Lesson17_Homework {

	public static class Circle {
		//instance variable
		//type name;
		double radius;
		
		//create a constructor --> defines the input required by the class (Circle)
		public Circle (double r) {
			radius = r;
		}
		
		//method --> defines what you can do with the class
		public double calculateArea() {
			return Math.PI*radius*radius;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//type name = new type(  );
		Circle homework = new Circle(5);
		System.out.println(homework.calculateArea());

		Scanner sc = new Scanner(System.in);
		
		
		//Task 1
		//input 5 numbers and store into array A
		//output the even number sum from array A
		int[] A = new int[5];
		int evenSum = 0;
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
			if (A[i]%2==0) { //if no remainder --> even
				evenSum += A[i];
			}
		}
		System.out.println(evenSum);
		
		//Task 2
		//input 6 numbers and store into array B
		//update array B and change all the even number to 0
		//output value one by one from array B
		int[] B = new int[6];
		for (int i=0; i<B.length; i++) {
			B[i] = sc.nextInt();
			if (B[i]%2==0) {
				B[i] = 0;
			}
		}
		for (int i=0; i<B.length; i++) {
			System.out.print(B[i]+" ");
		}
		
		//Task 3 
		//input String S
		//output the amount of "AB" inside String S
		String S = sc.next();
		int countAB = 0;
		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i)=='A' && S.charAt(i+1)=='B') {
				countAB ++;
			}
		}
		System.out.println(countAB);
		
		
		//05J2 RSA numbers --> help
		int start = sc.nextInt();
		int end = sc.nextInt();
		int numDivisors = 0;
		int numRSA = 0;
		
		for (int j=start; j<=end; j++) { //repeating for all numbers in the inputted range (inclusive)
			numDivisors = 0;
			for (int i=1; i<=j; i++) { //finding how many divisors per number
				if (j%i==0) { //if number in range is divisible by a number between 1 and itself (inclusive)
					numDivisors ++; //divisor counter increases by 1
				}
			}
			if (numDivisors==4) { //if there are exactly 4 divisors
				numRSA ++; //RSA counter increases by 1
			}
		}
		System.out.println("The number of RSA numbers between "+start+" and "+end+" is "+numRSA);
		
		
		//04J2 Terms of Office
		int X = sc.nextInt(); //year
		int Y = sc.nextInt(); //future year
		for (int m=X; m<=Y; m+=4) { //mayor reelections
			for (int t=X; t<=Y; t+=2) { //treasurer reelections
				for (int c=X; c<=Y; c+=3) { //chief reelections
					for (int d=X; d<=Y; d+=5) { //dog-catcher reelection
						if (m==t && t==c && c==d) { //if all of them are equal
							System.out.println("All positions change in year "+m);
						}
					}
				}
			}
		}
		
		
		//03J2 Picture perfect
		while (true) {
			int C = sc.nextInt(); //number of pictures to be laid out
			int perimeter = 2*(C+1);
			int length = 0;
			int width = 0;
			if (C==0) {
				break;
			} else {
				for (int i=2; i<(C/2); i++) { //repeating for 
					if (C%i==0) {
						if (2*(C/i+i)<perimeter) {
							perimeter = 2*(C/i+i);
							length = i;
							width = C/i;
						}
					}
				}
			}
			System.out.println("Minimum perimeter is "+perimeter+" with dimensions "+length+" x "+width);
		}
		
		
	}
}
