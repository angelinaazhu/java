import java.io.*;
import java.util.*;

public class Lesson17_Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		if (S.length()%2==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//
		
		String T = "I like summer vacation";
		System.out.println(T.substring(T.indexOf("summer"), T.indexOf("summer")+6));

	}

}
