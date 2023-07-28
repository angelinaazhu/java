import java.io.*;
import java.util.*;
public class Lesson18_Homework {

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
