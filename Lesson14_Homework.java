import java.io.*;
import java.util.*;
public class Lesson14_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Task 1
		int[] A = new int[5];
		int sum = 0;
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		System.out.println(sum);
		
		//Task 2
		int[] B = new int[7];
		for (int i=0; i<B.length; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(B);
		System.out.println(B[0]);
		
		//Task 3
		int[] C = new int[8];
		for (int i=0; i<C.length; i++) {
			C[i] = sc.nextInt();
		}
		Arrays.sort(C);
		System.out.println(C[C.length-1]);
		
		//Task 4
		int[] D = new int[5];
		for (int i=0; i<D.length; i++) {
			D[i] = sc.nextInt();
		}
		Arrays.sort(D);
		for (int i=0; i<D.length; i++) {
			System.out.println(D[D.length-1-i]);
		}

	}

}
