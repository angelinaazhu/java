import java.io.*;
import java.util.*;
public class Lesson15_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input A as int
	    //input B as int
	    //if A greater than B output "YES"
	    //else output "NO"
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A>B) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//input String S
	    //count how many "A" inside String S
	    //output the count
		String S = sc.next();
		int countA = 0;
		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i)=='A') {
				countA++;
			}
		}
		System.out.println(countA);


	    //input 5 numbers and save into array T
	    //output the sum of all the numbers inside array T
		int[] T = new int[5];
		int sum = 0;
		
		for (int i=0; i<T.length; i++) {
			T[i] = sc.nextInt();
			sum += T[i];
		}
		System.out.println(sum);
		
		//C is 7 8 9
	    //D is 2 4 6 8
	    //output C and D's combination
		for (int C=7; C<10; C++) {
			for (int D=2; D<9; D+=2) {
				System.out.println(C+" "+D);
			}
		}
		
	}

}
