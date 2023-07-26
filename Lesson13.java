import java.io.*;
import java.util.*;

public class Lesson13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ang = new Scanner(System.in);
		
		/*
		//Create array
		double[] C = new double[5];
		//Save value into array
		C[0] = 1.1;
	    C[1] = 2;
	    C[2] = 3;
	    C[3] = -1;
	    C[4] = -2;
	    //Print array values
		for (int i=0; i<C.length; i++) {
			System.out.println(C[i]);
		}
		
	    //Initialize values in array when you create it
	    int[] initializing = {1,2,3,4,5};
	    System.out.println(initializing[4]);
		
		//Task 2
		//input 6 numbers and store into array K
		
		//scanner
		int[] K = new int[6];
		for (int i=0; i<K.length; i++) {
			K[i] = ang.nextInt();
		}
		//use for loop to output value one by one from Array K
		for (int i=0; i<K.length; i++) {
			System.out.println(K[i]);
		}
		
		//Task 4
		//input 5 numbers and save into array N
		//output the sum
		
		//Scanner
	    int[] N = new int[5];
	    for (int i=0; i<N.length; i++) {
	      N[i] = ang.nextInt();
	    }
	    int sum = 0;
	    for (int i=0; i<N.length; i++) {
	      sum += N[i];
	    }
	    System.out.println(sum);
		
	    //Task 5
	    double[] O = new double[4];
	    for (int i=0; i<O.length; i++) {
	    	O[i] = ang.nextDouble();
	    }
	    double sum1 = 0;
	    for (int i=0; i<O.length; i++) {
	    	sum += O[i];
	    }
	    System.out.println(sum);
	    
	    
	    //07J3 Deal or No Deal Calculator
	    int numberOpened = ang.nextInt(); //input amount of cases opened so far
	    int[] dollars = {100,500,1000,5000,10000,25000,50000,100000,500000,1000000}; //setting monetary values in briefcase
	    int[] casesOpened = new int [numberOpened];
	    
	    int totalSum = 0; //finding total monetary sum of all briefcases in the game
	    for (int i=0; i<dollars.length; i++) {
	    	totalSum += dollars[i];
	    }
	    
	    int openedSum = 0;
	    for (int i=0; i<numberOpened; i++) {
	    	casesOpened[i] = ang.nextInt(); //input cases that have been opened
	    	openedSum += dollars[casesOpened[i]-1]; //find monetary value in opened cases
	    } 
	    
	    int unopenedSum = totalSum - openedSum; //sum of monetary values left
	    int numberUnopened = 10 - numberOpened; //number of briefcases left
	    
	    double average = unopenedSum/numberUnopened; //average of unopened briefcases
	    
	    int offer = ang.nextInt();
	    
	    if (offer>average) { //if banker offers higher than average
	    	System.out.println("deal");
	    } else {
	    	System.out.println("no deal");
	    }
	    */
	    
	    //06J2 Roll the Dice
	    //dice 1, m sides
	    int m = ang.nextInt();
	    int n = ang.nextInt();
	    
	    int count = 0;
	    for (int d1=1; d1<=m; d1++) {
	    	for (int d2=1; d2<=n; d2++) {
		    	if (d1+d2==10) {
		    		count++;
		    	}
		    }
	    }
	    
	    if (count==1) {
	    	System.out.println("There is 1 way to get the sum 10.");
	    } else {
	    	System.out.println("There are "+count+" ways to get the sum 10.");
	    }
	    
	}

}
