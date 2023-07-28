import java.io.*;
import java.util.*;
public class Lesson19_Homework {
	
//	Task 1
//	Create function:
//	name is plus
//	input parameter is int A, int B
//	return is A+B
	//public static returnType functionName(input parameter)
	public static int plus(int A,int B) {
		return A+B;
	}
	
//	Task 2:
//	Create function:
//	name is evenA
//	input parameter is String S
//	count how many letter 'A' inside String S
//	if the amount of 'A' is even number, return true
//	else return false
	public static boolean evenA(String S) {
		int countEven = 0;
		for (int i=0; i<S.length(); i++) {
			countEven ++;
		}
		if (countEven%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
//	Task 3:
//	Create function:
//	name is isEven
//	input parameter is int N
//	if N is even return true
//	else return false
	public static boolean isEven(int N) {
		if (N%2==0) {
			return true;
		} else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 4: 11J2 Who Has Seen The Wind
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int M = sc.nextInt();
		int t = 1;
		int A = (-6)*t*t*t*t + h*t*t*t + 2*t*t + t;
		while (true) {
			A = (-6)*t*t*t*t + h*t*t*t + 2*t*t + t;
			if (t>M && A>0) {
				System.out.println("The balloon does not touch ground in the given time.");
				break;
			}
			if (A<=0) {
				System.out.println("The balloon first touches ground at hour:\n"+t);
				break;
			} else t++;
		}

	}

}
