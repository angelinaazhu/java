import java.io.*;
import java.util.*;

public class Lesson12_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Task 1
		int C = sc.nextInt();
		int D = sc.nextInt();
		System.out.println(C+D);
		
		//Task 2
		for (int i=0; i<100; i++) {
			System.out.println("Computer");
		}
		
		//Task 3
		int E = sc.nextInt();
		int F = sc.nextInt();
		int G = sc.nextInt();
		
		for (int i=0; i<E; i++) {
			for (int j=0; j<F; j++) {
				System.out.print("%");
			}
			for (int j=0; j<G; j++) {
				System.out.print("^");
			}
			System.out.println();
		}
		
		//Task 4
		int H = sc.nextInt();
		if (H>5) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Task 5
		for (int i=7; i<22; i+=2) {
			System.out.print(i+" ");
		}
		
		//Task 6
		String Q = "AAAABBBCCCABC";
		int countA = 0;
		int countB = 0;
		for (int i=0; i<Q.length(); i++) {
			if (Q.charAt(i)=='A') {
				countA++;
			} else if (Q.charAt(i)=='B') {
				countB++;
			}
		}
		System.out.println("There are "+countA+" A's and "+countB+" B's");
		
		//Task 7
		String R = "AKAKAKAAAAAK";
		int countAK = 0;
		for (int i=0; i<R.length(); i++) {
			if (R.charAt(i)=='A' && R.charAt(i+1)=='K') {
				countAK++;
			}
		}
		System.out.println("There are "+countAK+" AK's");
		
		//Task 8
		String S = "CinCinCinCCCCCCCin";
		int countCin = 0;
		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i)=='C' && S.charAt(i+1)=='i' && S.charAt(i+2)=='n') {
				countCin++;
			}
		}
		System.out.println("There are "+countCin+" Cin's");
		
		//Task 9
		String L = sc.next();
		for (int i=0; i<L.length(); i++) {
			System.out.print(L.charAt(i));
		}
		
		//Task 10
		String M = sc.next();
		for (int i=0; i<M.length(); i++) {
			System.out.print(M.charAt(i));
		}
		
	}

}
