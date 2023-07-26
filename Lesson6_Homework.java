import java.util.Scanner;

public class Lesson6_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//11J1 Which Alien
		Scanner alien = new Scanner(System.in);
		byte antennae = alien.nextByte();
		byte eyes = alien.nextByte();
		
		if (antennae >= 3 && eyes <= 4) {
			System.out.println("TroyMartian");
		}
	
		if (antennae <= 6 && eyes >= 2) {
			System.out.println("VladSaturnian");
		}
		
		if (antennae <= 2 && eyes <= 3) {
			System.out.println("GraemeMercurian");
		}
	
		
		//10J1 What is n, Daddy? *Dad's Solution*
		Scanner natalie = new Scanner(System.in);
		int n = natalie.nextInt();
		int count = 0;
		
		for (int i=5; i>=(n+1)/2; i--) {
			if ((n-i)>=0) {
				count += 1;
			}
		}
		System.out.println(count);
		
		
		//9J1 ISBN
		Scanner books = new Scanner(System.in);
		int A = books.nextInt();
		int B = books.nextInt();
		int C = books.nextInt();
		
		int sum = 9*1 + 7*3 + 8*1 + 0*3 + 9*1 + 2*3 + 1*1 + 4*3 + 1*1 + 8*3 + A*1 + B*3 + C*1;
		
		System.out.println(sum);
		
		
		//9J1 again
		Scanner books = new Scanner(System.in);
		int[] ISBN = new int[13]; //taking integer array
		
		for (int i=0; i<13; i++) {
			ISBN[i] = books.nextInt();
		}
		int count = ISBN[0]; //accounting for the first number (since 13 is odd)
		for (int i=1; i<13; i+=2) {
			count += ISBN[i]*3 + ISBN[i+1];
		}
		System.out.println(count);
		
		
		//8J1 BMI
		Scanner health = new Scanner(System.in);
		double weight = health.nextDouble();
		double height = health.nextDouble();
		double BMI = weight/(height*height);
		
		if (BMI > 25) {
			System.out.println("Overweight");
		} else if (BMI < 18.5) {
			System.out.println("Underweight");
		} else {
			System.out.println("Normal weight");
		}
		*/
		
	}

}
