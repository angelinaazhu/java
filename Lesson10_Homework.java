import java.io.*;
import java.util.*;

public class Lesson10_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		//Task 1
		String S = sc.next();
		for (int i=0; i<S.length(); i++) {
			System.out.print(S.charAt(i));
		}
		
		
		//Task 2
		for (int i=2; i<15; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i=9; i<64; i+=9) {
				System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i=1; i<22; i+=4) {
			System.out.print(i + " ");
		}
		
		
		//Task 3
		for (int i=0; i<100; i++) {
			System.out.print("Hayson ");
		}
		
		
		//Task 4
		String T = "ABCDE";
		for (int i=0; i<T.length(); i++) {
			System.out.print(T.charAt(i));
		}
		
		
		//Task 6
		String A = sc.next();
		for (int i=0; i<A.length(); i++) {
			System.out.print(A.charAt(i));
		}
		
		
		//Task 7
		String B = sc.next();
		B = B.replace("a", "");
		B = B.replace("e", "");
		B = B.replace("i", "");
		B = B.replace("o", "");
		B = B.replace("u", "");
		System.out.println(B);
		
		
		//Task 8
		String C = sc.next();
		int countA = 0;
		int countB = 0;
		
		for (int i=0; i<C.length(); i++) {
			char a = C.charAt(i);
			if (a=='A') {
				countA++;
			} else if (a=='B') {
				countB++;
			}
		}
		
		if (countA > countB) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		//Task 9
		String L = sc.next();
		if (L.contains("Cindy")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Task 10.0
		String P = sc.next();
		if (P.contains("A") || P.contains("B") || P.contains("C")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		//Task 10.1
		String P = sc.next();
		int count = 0;
		
		if (P.contains("A") || P.contains("B") || P.contains("C")) {
			count ++;
		}
		
		if (count == P.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Task 10.2
		String P = sc.next();
		int count = 0;
		for (int k=0; k<P.length(); k++) {
		      if (P.charAt(k)=='A' || P.charAt(k)=='B' || P.charAt(k)=='C') {
		        count++;
		      }
		}
		if (count==P.length()) {
		      System.out.println("YES");
		} else {
		      System.out.println("NO");
		}
		
		
		//Task 11
		String Q = sc.next();
		if (Q.equals("Apple")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		//Task 12
		String R = sc.next();
		int count = 0;
		
		for (int i=0; i<R.length(); i++) {
			char b = R.charAt(i);
			if (b=='A') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
