import java.util.*;
import java.io.*;

public class Lesson16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		
		//09J2 Old Fishin' Hole
		int troutPoints = sc.nextInt();
		int[] numberTrout = new int[troutPoints];
		for (int i=0; i<=troutPoints; i++ ) {
			numberTrout[i] = i;
		}
		int pikePoints = sc.nextInt();
		int[] numberPike = new int[pikePoints];
		for (int i=0; i<=pikePoints; i++ ) {
			numberPike[i] = i;
		}
		int pickerelPoints = sc.nextInt();
		int[] numberPickerel = new int[pickerelPoints];
		for (int i=0; i<=pickerelPoints; i++ ) {
			numberPickerel[i];
		}
		int totalPoints = sc.nextInt(); //total points allowed
		
		int countTrout = 0;
		int countPike = 0;
		int countPickerel = 0;
		
		for (int i=0; i<troutPoints; i++) {
			for (int j=0; j<pikePoints; j++) {
				for (int k=0; j<pickerelPoints; j++) {
					if (numberTrout[i]+numberPike[i]+numberPickerel[i]<=totalPoints) {
					countTrout += numberTrout[i];
					countPike += numberPike[i];
					countPickerel += numberPickerel[i];
					}
				}
			}
		}
		
		
		//task 1
		int[] A = {11,12};
		int[] B = {3,6,9,12};
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<B.length; j++) {
				System.out.println(A[i]+" "+B[j]);
			}
		}
		
		//task 2
		int total = 5;  //total money
	    int apple = 2;
	    int banana = 4;

	    int maxApple = total/apple;
	    int maxBanana = total/banana;

	    //you allow either 0 apple or 0 banana
	    //you can not purchase 0 fruit
	    //you can not use over total money
	    //how many possible way to do this

	    for (int a = 0; a<=maxApple; a++) {
	        for (int b=0; b<=maxBanana; b++) {
	             //a apple b banana
	             if (a*apple+b*banana<=total) {
	                  System.out.println(a+" apple "+b+" banana");
	             }
	        }
	    }
	   
		
	    //09J2 old fishin' hole
	    int troutPoints = sc.nextInt();
	    int pikePoints = sc.nextInt();
	    int pickerelPoints = sc.nextInt();
	    int totalPoints = sc.nextInt();
	    int ways = 0; 
	    
	    int maxTrout = totalPoints/troutPoints; 
	    int maxPike = totalPoints/pikePoints;
	    int maxPickerel = totalPoints/pickerelPoints;
	    
	    for (int i=0; i<=maxTrout; i++) {
	    	for (int j=0; j<=maxPike; j++) {
	    		for (int k=0; k<=maxPickerel; k++) { //i trouts, j pikes, k pickerels
	    			if ((i*troutPoints+j*pikePoints+k*pickerelPoints)<=totalPoints && (i*troutPoints+j*pikePoints+k*pickerelPoints)>0) {
	    				System.out.println(i+" Brown Trout, "+j+" Northern Pike, "+k+" Yellow Pickerel");
	    				ways ++;
	    			}
	    		}
	    	}
	    }
	    System.out.println("Number of ways to catch fish: "+ways); 
		
		
		//repeat forever & add break point
		//input numbers
			//when number equals to 0 end the loop
		while (true) {
			int num = sc.nextInt();
			if (num==0) {
				break; //add break point
			}
		}
		
		//change while condition within the while
		boolean test = true;
		int count = 0;
		
		while (test) {
			System.out.println("yay!");
			count ++;
			if (count==10) {
				test = false; //can use this as a break too
				System.out.println("stopped");
			}
		}
		
		
		//input numbers
			// when number equals to 100 end the loop
		//output the sum of all the numbers you input
		
		while (true) {
			int num = sc.nextInt();
			if (num==100) {
				break;
			}
		}
		
		
		//input numbers
			//when number can be divided by 3 end the loop
		//output the sum of all the numbers you input
		int sum = 0;
		while (true) {
			int num = sc.nextInt();
			if (num%3==0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
		
		//input Strings and output the String you input
			//when String equals to "Cindy" end the loop
		while (true) {
			String angelina = sc.next();
			if (angelina.equals("Cindy")) {
				break;
			}
			System.out.println(angelina);
		}
		
		
		//07J2 I Speak TXTMSG
	    while (true) {
	        String input = sc.next(); //output immediately after input
	        if (input.equals("TTYL")) {
	          System.out.println("talk to you later");
	          break;
	        } else if (input.equals("CU")) {
	          System.out.println("see you");
	        } else if (input.equals(":-)")) {
	          System.out.println("I'm happy");
	        } else if (input.equals(":-(")) {
	          System.out.println("I'm unhappy");
	        } else if (input.equals(";-)")) {
	          System.out.println("wink");
	        } else if (input.equals(":-P")) {
	          System.out.println("stick out my tongue");
	        } else if (input.equals("(~.~)")) {
	          System.out.println("sleepy");
	        } else if (input.equals("TA")) {
	          System.out.println("totally awesome");
	        } else if (input.equals("CCC")) {
	          System.out.println("Canadian Computing Competition");
	        } else if (input.equals("CUZ")) {
	          System.out.println("because");
	        } else if (input.equals("TY")) {
	          System.out.println("Thank-you");
	        } else if (input.equals("YW")) {
	          System.out.println("you're welcome");
	        } else {
        	System.out.println(input);
      		}
	      }
	    */
		
	    //07J2 with switch
		while (true) {
			String input = sc.next();
			String output = "";
			switch (input) {
				case "CU": output = "see you";
					break;
				case "hi": System.out.println("bye");//output = "I'm happy";
					break;
				case ":-(": output = "I'm sad";
					break;
				default: output = input;
			}
			System.out.println(output);
		}
		
		
	}

}
