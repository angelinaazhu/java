import java.io.*;
import java.util.*;
public class Lesson17_Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[10];
		int sum = 0;
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
			if (A[i]%3==0) {
				sum += A[i];
			}
		}
		System.out.println(sum);

	}

}
