import java.io.*;
import java.util.*;
public class Lesson19_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Task 1
		//input S as String
	    //if S equals to "Cindy"  output YES
	    //else output NO
		String S = sc.next();
		if (S.equals("Cindy")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Task 2
		//input T as String
		//count how many letter "T" inside String T
		String T = sc.next();
		int countT = 0;
		for (int i=0; i<T.length(); i++) {
			if (T.charAt(i)=='T') {
				countT++;
			}
		}
		
		//Task 3
		//input 5 numbers and save into array A
		//output the second largest number inside array A
		int[] A = new int[5];
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		System.out.println(A[A.length-2]);
		
		//Task 4
		//input String K
		//output char one by one from String K forward
		//output char one by one from String K backward
		String K = sc.next();
		for (int i=0; i<K.length(); i++) {
			System.out.print(K.charAt(i));
		}
		System.out.println();
		for (int i=0; i<K.length(); i++) {
			System.out.print(K.charAt(K.length()-1-i));
		}
		System.out.println();
		
		//Task 5
		int sum = 0;
		while (true) {
			int num = sc.nextInt();
			if (num==0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
		
		//Task 6
		//Combination
		//m     4 6 8 10
		//n     5 7 9
		//output m+" "+n
		int[] m = {4,6,8,10};
		int[] n = {5,7,9};
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<n.length; j++) {
				System.out.println(m[i]+" "+n[j]);
			}
		}
		
		//Task 7
		//input A as int
		//input B as int
		//input C as int
		//
		//repeat A times
		//    output B "&", output C "^" at the same line 
		//    output a new line
		int A1 = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		for (int i=0; i<A1; i++) {
			for (int j=0; j<B; j++) {
				System.out.print("&");
			}
			for (int j=0; j<B; j++) {
				System.out.print("^");
			}
			System.out.println();
		}
		
		//Task 8
		//input 6 numbers and store into array H
		//output the sum, mean and medium
		int[] H = new int[6];
		double sum1 = 0;
		for (int i=0; i<H.length; i++) {
		  H[i] = sc.nextInt();
		  sum1 += H[i];
		}
		Arrays.sort(H);
		System.out.println(sum1); //sum
		System.out.println(sum1/H.length); //mean
		System.out.println((H[2]+H[3])/2.0); //medium (of even numbers)
		
		//Task 9
		//using while loop to input numbers with decimal
		//output the even number sum
		//when number equals to 77 end the loop
		int sum2 = 0;
		while (true) {
			double num = sc.nextDouble();
			if (num%2==0) {
				sum2 += num;
			}
			if (num==77) {
				break;
			}
		}
		System.out.println(sum2);
		
	}

}
