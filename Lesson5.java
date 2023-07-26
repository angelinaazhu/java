import java.util.*;
import java.io.*;
public class Lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Dad's example
		String aString = "Lin Zhu";
		System.out.println(aString.length());
		*/
		
		//Task 1
		//define a string variable W
		//if W equals to “Cindy” output “YES”, else output NO
		//using functions (find out which one to use)
		String A = "Cindy";
		if (A.contains("Cindy")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Task 2 (continuation of ^^)
		//if the second char inside W equals to ‘A’, output YES else output NO
		if ((A.charAt(1)) == 'A') {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Task 3
		//create String W = “I like Winter”;
		//output “like” using W.substring function
		String B = "I like Winter";
			System.out.println(B.substring(2,6));

		//Task 4 (continuation of ^^)
		//if W contains like, output YES, else NO
		if (B.contains("like")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}

}
