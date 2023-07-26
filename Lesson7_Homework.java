import  java.util.*;
import java.io.*;

public class Lesson7_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//22J1 Cupcake Party
		Scanner cupcakes = new Scanner(System.in);
		int R = cupcakes.nextInt();
		int S = cupcakes.nextInt();
		int leftover = R*8+S*3-28;
		System.out.println(leftover);
		
		
		//21J1 Atmospheric Pressure
		//Above sea level	Pv	Bv
		//Below sea level	P^	B^
		
		Scanner pressure = new Scanner(System.in);
		int B = pressure.nextInt();
		int P = 5*B-400;
		System.out.println(P);
		if (P > 100) {
			System.out.println("-1");
		} else if (P == 100) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
		
		
		//20J1 Dog Treats
		Scanner treats = new Scanner(System.in);
		int S1 = treats.nextInt();
		int M = treats.nextInt();
		int L = treats.nextInt();
		if ((1*S1 + 2*M + 3*L) >= 10) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}
		
		
		//07J1 Middle -> IS THERE A BETTER WAY TO DO THIS? -> sort it better
		Scanner bowl = new Scanner(System.in);
		int bowlOne = bowl.nextInt();
		int bowlTwo = bowl.nextInt();
		int bowlThree = bowl.nextInt();
		if (bowlTwo > bowlOne) {
			if (bowlThree > bowlTwo) { // 3 > 2* > 1
				System.out.println(bowlTwo);
			} else if (bowlTwo > bowlThree && bowlThree > bowlOne) { // 2 > 3* > 1 
				System.out.println(bowlThree);
			} else if (bowlTwo > bowlThree && bowlOne > bowlThree) { // 2 > 1* > 3
				System.out.println(bowlOne);
			} else {
			}
		} else if (bowlOne > bowlTwo) {
			if (bowlThree > bowlOne) { // 3 > 1* > 2
				System.out.println(bowlOne);
			} else if (bowlOne > bowlThree && bowlThree > bowlTwo) { // 1 > 3* > 2
				System.out.println(bowlThree);
			} else if (bowlOne > bowlThree && bowlTwo > bowlThree) { // 1 > 2* > 3
				System.out.println(bowlTwo);
			} else {
			}
		} else {
		}
		
		
		//6J1 Canadian Calorie Counting -> can't figure it out again
		Scanner menu = new Scanner(System.in);
		
		//burger choice
		int burger = menu.nextInt();
		int calories = 0;
		
		if (burger == 1) {
			calories += 461;
		} else if (burger == 2) {
			calories += 431;
		} else if (burger == 3) {
			calories += 420;
		} else {
		}

		//side choice
		int side = menu.nextInt();
		if (side == 1) {
			calories += 100;
		} else if (side == 2) {
			calories += 57;
		} else if (side == 3) {
			calories += 70;
		} else {
		}
		
		//drink choice
		int drink = menu.nextInt();
		if (drink == 1) {
			calories += 130;
		} else if (drink == 2) {
			calories += 160;
		} else if (drink == 3) {
			calories += 118;
		} else {
		}
		
		//dessert choice
		int dessert = menu.nextInt();
		if (dessert == 1) {
			calories += 167;
		} else if (dessert == 2) {
			calories += 266;
		} else if (dessert == 3) {
			calories += 75;
		} else {
		}
		
		System.out.println("Your total Calorie count is " + calories + ".");
		
		
		//4J1
		Scanner squares = new Scanner(System.in);
		int tiles = squares.nextInt(); //user input number of tiles
		System.out.println("The largest square has side length " + Math.round(Math.floor(Math.sqrt(tiles))) + ".");
		
		
		//05J1 Cell Sell
		Scanner minutes = new Scanner(System.in);
		int day = minutes.nextInt();
		int evening = minutes.nextInt();
		int weekend = minutes.nextInt();
		
		int planA = 0;
		if (day>100) {
			planA = (day-100)*25;
		}
		planA += evening*15+weekend*20;
		System.out.printf("Plan A costs %.2f\n", planA/100.);
		
		
		int planB = 0;
		if (day>250) {
			planB = (day-250)*45;
		}
		planB += evening*35+weekend*25;
		System.out.printf("Plan B costs %.2f\n", planB/100.);
		
		if (planA > planB) {
			System.out.println("Plan B is cheapest.");
		} else if (planA == planB) {
			System.out.println("Plan A and B are the same price.");
		} else {
			System.out.println("Plan A is cheapest.");
		}
		
		//02J1
		Scanner digital = new Scanner(System.in);
		int N = digital.nextInt();
		if (N == 8) {
			System.out.println(" * * *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println(" * * *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println(" * * *");
		} 
		
	}

}
