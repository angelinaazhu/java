import java.io.*;
import java.util.*;
public class Lesson11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		//input String S
	    //count the amount of "H" inside String S
	    //output the count
		
		//using contains
		String S = sc.next();
		int count = 0;
		if (S.contains("H")) {
			count++;
		}
		System.out.println(count);
		
		//using charAt
		String S1 = sc.next();
		int count1 = 0;
		for (int i=0; i<S1.length(); i++) {
			if (S1.charAt(i)=='H') {
				count++;
			}
		}
		
		//another task
		String P = "Chicken wing";
		//output # of i & w
		int count = 0;
        
        for (int a=0; a<P.length(); a++) {
          if (P.charAt(a)=='i' || P.charAt(a)=='w') {
            count ++;
          } 
        }
        System.out.println("There are " + count + " i's and w's in " + P + ".");
		
		
		
		//11S1.0 English or French?
		int countT = 0;
		int countS = 0;
		
		int N = sc.nextInt();
		sc.nextLine(); 
		
		for (int i=0; i<N; i++) {
			String text = sc.nextLine();
			if (text.contains("t") || text.contains("T")) { //if there are multiple T, t's only counting once
				countT ++;
			} else if (text.contains("s") || text.contains("S")) {
				countS ++;
			}
		}
		
		if (countT>countS) {
			System.out.println("English");
		} else {
			System.out.println("French");
		}
		

		//11S1.1 
		int countT = 0;
		int countS = 0;
		
		int N = sc.nextInt();
		sc.nextLine(); 
		
		if ((N > 0) && (N < 1000)) {
			for (int i=0; i<N; i++) {
				String text = sc.nextLine();
				if ((text.length() > 0) && (text.length() <= 100)) {
					if (text.contains("t") || text.contains("T")) {
						countT ++;
					} else if (text.contains("s") || text.contains("S")) {
						countS ++;
					}
				}
			}
		
			if (countT>countS) {
				System.out.println("English");
			} else {
				System.out.println("French");
			}
		}
		
		
		//11S1.2 ANSWER!!
		int countT = 0;
		int countS = 0;
		
		int N = sc.nextInt();
		sc.nextLine(); 
		
		for (int i=0; i<N; i++) {
			String text = sc.nextLine();
			for (int j=0; j<text.length(); j++) {
				if (text.charAt(j)=='t' || text.charAt(j)=='T') {
					countT ++;
				} else if (text.charAt(j)=='s' || text.charAt(j)=='S') {
					countS ++;
				}
			}
		}
		
		if (countT>countS) {
			System.out.println("English");
		} else {
			System.out.println("French");
		}
		
		
		//18J3 Are we there yet?
		String input = sc.nextLine();
		String [] segment = input.split(" ");
		int [] distance = new int[segment.length]; //convert string array to integer array to avoid repetition
		for (int i=0; i<distance.length; i++) {
			distance[i] = Integer.parseInt(segment[i]);
		}
		
		for (int i=0; i<5; i++) { //each row
			int [] trip = new int [segment.length + 1];
			for (int j=0; j<5; j++) { //each trip
				trip[j-i] = distance[]
				
			}
		}
		*/
				
		
	}

}
