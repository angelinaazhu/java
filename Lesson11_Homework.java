import java.io.*;
import java.util.*;

public class Lesson11_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		//Task 1
		String A  = "AAATTBB";
		int countA = 0;
		for (int i=0; i<A.length(); i++) {
			if (A.charAt(i)=='T') {
				countA++;
			}
		}
		System.out.println(countA);
		
		
		//Task 2
		String B = "ABABAAAABCABCABC";
		int countAB = 0;
		for (int i=0; i<B.length(); i++) {
			if (B.charAt(i)=='A' && B.charAt(i+1)=='B') { 
				countAB ++;
			}
		}
		System.out.println(countAB);
		
		
		//Task 3
		String C = "CATCCCATUUUCA";
		int countCAT = 0;
		for (int i=0; i<C.length()-2; i++) {
			if (C.charAt(i)=='C' && C.charAt(i+1)=='A' && C.charAt(i+2)=='T') { 
				countCAT ++;
			}
		}
		System.out.println(countCAT);
		
		
		//Task 4
		String D = "Cindy";
		for (int i=0; i<D.length(); i++) {
			System.out.print(D.charAt(i));
		}
		
		
		
		//Task 5
		String E = "Life is so good when summer coming";
		System.out.println(E.substring(E.indexOf("summer"), E.indexOf("summer")+6));
		
		
		//Task 6
		String F = "I like computer coding";
		System.out.println(F.indexOf("computer"));
		
		
		//Task 7
		String L = sc.next();
		if (L.equals("Cindy")) {
			System.out.println("Teacher");
		} else {
			System.out.println("Student");
		}
		
		
		//Task 8
		String M = sc.next();
		if (M.endsWith("super")) { 
			System.out.println("Super");
		} else {
			System.out.println("Easy");
		}
		
		
		//Task 9
		double N = sc.nextDouble();
		if (N>3 && N<10) {
			System.out.println("Great");
		} else {
			System.out.println("Small");
		}
		
		
		//Task 10
		int P = sc.nextInt();
		if (P*5-9>100) {
			System.out.println("YES");
		}
		
		
		//Task 11
		String Q = sc.next();
		int count = 0;
		
		for (int i=0; i<Q.length(); i++) {
			if (Q.charAt(i)=='A' || Q.charAt(i)=='E' || Q.charAt(i)=='I' || Q.charAt(i)=='O' || Q.charAt(i)=='U') {
				count ++;
			}
		}
		if (count==Q.length()) {
			System.out.println("Vowel");
		} else {
			System.out.println("Continue");
		}
	}

}
