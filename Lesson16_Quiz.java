import java.io.*;
import java.util.*;
public class Lesson16_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Task 1
//		A is 6 7 8
//		B is  4 6 8 10
//		using for loop to combine A and B
		
		int[] A = {6,7,8};
		int[] B = {4,6,8,10};
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<B.length; j++) {
				System.out.println(A[i]+" "+B[i]);
			}
		}
		
		//Task 2
//		input numbers and add into sum
//		when number equals to 888 end the loop
//		output the sum
		
		int sum = 0;
		while (true) {
			int num = sc.nextInt();
			if (num==888) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
		
		//Task 3
//		String S = "CindyCindyCindy.....";
//		output the amount of "Cindy" inside String S
		
		String S = "CindyCindyCindy.....";
		int counter = 0;
		int index = 0;
		while (index<S.length()-5) {
			if (S.substring(index, index+5).equals("Cindy")) {
				counter ++;
			}
			index ++;
		}
		System.out.println(counter);

	}

}
