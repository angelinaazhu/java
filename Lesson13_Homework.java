import java.io.*;
import java.util.*;

public class Lesson13_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		/*
		//Task 1
		int[] A = new int[4];
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(A[1]);
		
		//Task 2
		double[] B = new double[5];
		for (int i=0; i<B.length; i++) {
			B[i] = sc.nextInt();
		}
		System.out.println(B[0]+B[3]);
		
		
		//Task 3
		int[] C = new int[5];
		int countC = 0;
		for (int i=0; i<C.length; i++) {
			C[i] = sc.nextInt();
			countC += C[i];
		}
		System.out.println(countC);
		
		
		//Task 4
		int[] D = new int[7];
		for (int i=0; i<D.length; i++) {
			D[i] = sc.nextInt();
		}
		Arrays.sort(D);
		System.out.println(D[0]);
		
		
		//Task 5 --> how to directly sort greatest to least
		int[] E = new int[8];
		for (int i=0; i<E.length; i++) {
			E[i] = sc.nextInt();
		}
		Arrays.sort(E);
		System.out.println(E[E.length-1]);
		
		
		//Task 6
		int[] F = new int[4];
		int countEven = 0;
		
		for (int i=0; i<F.length; i++) {
			F[i] = sc.nextInt();
			if (F[i]%2==0) {
				countEven += F[i];
			}
		}
		System.out.println(countEven);
		
		
		//21P1 Bubble Tea Tracker
		int N = sc.nextInt(); //processing number of bubble teas bought
		int[] spent = new int[N]; //setting up counter with array to store multiple spend values ($$)
		int[] spendCounter = new int[N];
		
		spendCounter[0] = sc.nextInt(); //accounting for the fact that in the next for loop, spendCounter[i-1] will error out
		
		for (int i=1; i<N; i++) {
			spent[i] = sc.nextInt(); //inputting values to fill up spend values
			spendCounter[i] = spendCounter[i-1] + spent[i]; //adding the current spent amt to the previous spendcounter amts (tallying while still keeping each step)
			
		}
		for (int i=0; i<N; i++) {
			System.out.println(spendCounter[i]); //printing one by one, but only after all the input is done
		}
		*/
		
		//22P2 Rhyming Numbers --> how???
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			String AB = sc.nextLine();
			String[] newAB = AB.split(" ");
			if () {
				
			}
		}
		
		/*
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
	}

}
