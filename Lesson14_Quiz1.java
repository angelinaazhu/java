import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Lesson14_Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//input 11 numbers and save into array A
		//output the sum

		int[] A = new int[11];
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i=0; i<A.length; i++) {
			sum += A[i];
		}
		System.out.println(sum);
		
		//then find out the largest number in the array and output
		Arrays.sort(A);
		System.out.println(A[A.length-1]);

		
	}

}
