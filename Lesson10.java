import java.io.*;
import java.util.*;

public class Lesson10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		/*
		//Task 1
		
		//input N as int
        //input A as int
        //input B as int
		
		//repeat N as time
            //output "@" A times, output "#" B times at the same line
			//output a newline
		
		int N7 = sc.nextInt();
		int A7 = sc.nextInt();
		int B7 = sc.nextInt();

		for (int i=0; i<N7; i++) {
		  for (int j=0; j<A7; j++) {
		    System.out.print("@");
		    }
		  for (int j=0; j<B7; j++) {
		    System.out.print("#");
		  }
		System.out.println();
		}
		
		
		//19J2 Time to Decompress
		int L = sc.nextInt(); //number of lines in the message
		
		for (int i=0; i<L; i++) {
			Scanner message = new Scanner(System.in);
			String encoded = message.nextLine(); //N *
			String[] splitted = encoded.split(" ");
			int N = Integer.parseInt(splitted[0]);
			for (int j=0; j<N; j++) {
				System.out.print(splitted[1]);
			}
			System.out.println();
		}
		*/
		
		
		//step 1
		int L = sc.nextInt();
	    for (int i=0; i<L; i++) {
	      int N = sc.nextInt();
	      int symbol = sc.nextInt();

	      for (int a=0; a<N; a++) {
	        System.out.print(symbol);
	      }
	    System.out.println();
	    }
	    
		//step 2
	    String L1 = "AAAAAAAAAAABB";
	    int countA = 0;
	    int countB = 0;
	    		
	    for (int i=0; i<L1.length(); i++) {
	    	if (L1.charAt(i)=='A') {
	    		countA++;
	    	} else if (L1.charAt(i)=='B') {
	    		countB++;
	    	}
	    }
	    System.out.println("There are " + countA + " A's.");
	    System.out.println("There are " + countB + " B's.");
		
	    
	    //step 3
	    String S = sc.next();  //input a String S
	     int count = 0;
	     for(int i=0; i<S.length(); i++){
	           char c = S.charAt(i);
	           if(c =='I' || c=='O' || c=='S'|| c=='H' || c=='Z' || c=='X' || c=='N'){ //compare if every character entered equals to a rotating letter
	              count++;
	           }
	     } 

	     if (count==S.length()) { //if count = original length, then it is rotate-able
	          System.out.println("YES");
	     } else {
	          System.out.println("NO");
	     }
	    }
	}

}
