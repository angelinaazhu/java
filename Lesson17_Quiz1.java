import java.io.*;
import java.util.*;
public class Lesson17_Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		String S = sc.next();
		for (int i=0; i<S.length()-3; i++) {
			if (S.substring(i,i+4).equals("GOOD")) {
				count ++;
			}
		}
		System.out.println(count);

	}

}
