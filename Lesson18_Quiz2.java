import java.util.*;
import java.io.*;

public class Lesson18_Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Task 1:
		// input N as int
		// if N is less than 3 output "Small"
		// else if N is greater equals to 3 and less than 10 output "Middle"
		// else output "Big"
		int N = sc.nextInt();
		if (N<3) {
			System.out.println("Small");
		} else if (N>=3 && N<10) {
			System.out.println("Middle");
		} else {
			System.out.println("Big");
		}

		// Task 2:
		// input String S
		// output char one by one from S
		String S = sc.next();
		for (int i=0; i<S.length(); i++) {
			System.out.print(S.charAt(i));
		}
		   
		// Task 3:
		// input 11 numbers and store into array A
		// output the third biggest number from array A
		int[] A = new int[11];
		for (int i=0; i<11; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		System.out.println(A[A.length-3]);
		     
		// Task 4:
		// output 10, 20, 30, 40, 50, 60 and 70 using for loop
		// output 5 "Teacher" using for loop
		for (int i=10; i<71; i+=10) {
			System.out.println(i);
		}
		for (int i=0; i<5; i++) {
			System.out.println("Teacher");
		}
		
	}

}
