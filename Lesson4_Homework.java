import java.util.*;
import java.io.*;

public class Lesson4_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 1
		int month = 10;
		if (month == 1) {
			System.out.println("Jan");
		} else if (month == 2) {
			System.out.println("Feb");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("Oct");
		} else if (month == 11) {
			System.out.println("Nov");
		} else if (month == 12) {
			System.out.println("Dec");
		} else {
		}
		
		//Task 2
		int number = 58;
		if (number > 10 && number < 100) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Task 3
		double speed = 10.11;
		double time = 5.6;
		double distance = speed*time;
		if (distance < 12) {
			System.out.println("too slow");
		} else if (distance == 12 && distance < 50) {
			System.out.println("ok speed");
		} else {
			System.out.println("too fast");
		}
		
		//Task 4
		int mathmark = 98;
		int englishmark = 50;
		int frenchmark = 70;
		if ((mathmark + englishmark + frenchmark) < 200) {
			System.out.println("Fail");
		} else {
			System.out.println("Pass");
		}
		
		//Task 5
		double money = 500;
		if (money >= 1000) {
			System.out.println("Rich");
		} else {
			System.out.println("Poor");
		}
		
		//12J1
		Scanner radar = new Scanner(System.in);
		int speedLimit = radar.nextInt();
		int speedCar = radar.nextInt();
		int speedDifference = speedCar-speedLimit;
		if (speedDifference <= 0) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else if (speedDifference >= 1 && speedDifference <= 20) {
			System.out.println("You are speeding and your fine is $100.");
		} else if (speedDifference >= 21 && speedDifference <= 30) {
			System.out.println("You are speeding and your fine is $270.");
		} else {
			System.out.println("You are speeding and your fine is $500.");
		}
		
		//13J1
		Scanner age = new Scanner(System.in);
		int Y = age.nextInt();
		int M = age.nextInt();
		System.out.println(M+(M-Y));
		
		//14J1
		Scanner triangle = new Scanner(System.in);
		int A = triangle.nextInt();
		int B = triangle.nextInt();
		int C = triangle.nextInt();
		if (A == 60 && B == 60 && C == 60) {
			System.out.println("Equilateral");
		} else if ((A+B+C) == 180 && (A == B || B == C || A == C)) {
			System.out.println("Isosceles");
		} else if ((A+B+C) != 180) {
			System.out.println("Error");
		} else {
			System.out.println("Scalene");
		}
	}

}
