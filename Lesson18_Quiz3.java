import java.util.*;
import java.io.*;

public class Lesson18_Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		// Task 5:
		// input numbers using while loop
		// when number equals to 0 end
		// output the sum of all the numbers
		int sum = 0;
		while (true) {
			int num = sc.nextInt();
			if (num==0) {
				break;
			} else {
				sum += num;
			}
		}
		System.out.println(sum);
		     
		// Task 6:
		// input String T
		// count how many "A" inside String T
		// count how many "B" inside String T
		// if amount of "A" more than amount of "B" output "A"
		// else if amount of "B" more than amount of "A" output "B"
		// else output "Tie"
		String T = sc.next();
		int countA = 0;
		int countB = 0;
		for (int i=0; i<T.length(); i++) {
			if (T.charAt(i)=='A') {
				countA ++;
			} else if (T.charAt(i)=='B') {
				countB ++;
			}
		}
		if (countA>countB) {
			System.out.println("A");
		} else if (countB>countA) {
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
		     
		// Task 7:
		// input 7 numbers and store into array C
		// output the amount of number which is bigger than 11
		int[] C = new int[7];
		int count = 0;
		for (int i=0; i<7; i++) {
			C[i] = sc.nextInt();
			if (C[i]>11) {
				count ++;
			}
		}
		System.out.println(count);
		     
		// Task 8
		// input String S1
		// if S contains "A" output "YES"
		// else output "NO"
		String S1 = sc.next();
		if (S1.contains("A")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// Task 9
		// input String R
		// update all "A" from R to "&"
		// output R
		String R = sc.next();
		R = R.replace("A", "&");
		System.out.println(R);
	}

}
