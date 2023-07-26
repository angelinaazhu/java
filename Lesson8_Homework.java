import java.util.*;
import java.io.*;
public class Lesson8_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//4J1 Opening Ceremony
		Scanner olympics = new Scanner(System.in);
		
		String cost = olympics.nextLine();
		String[] costs = cost.split(" ");
		int revenue = 0;
		
		String ticket = olympics.nextLine();
		String[] tickets = ticket.split(" ");
		int audience = 0;
		
		for (int i=0; i<3; i++) {
			revenue += Integer.parseInt(costs[i]) * Integer.parseInt(tickets[i]); //tally
			audience += Integer.parseInt(tickets[i]); //tally
		}
		
		System.out.println(audience + " " + revenue);
		
		/*
		//5J1 Final Velocity
		Scanner car = new Scanner(System.in);
		int u = car.nextInt(); //input initial velocity
		int a = 3;
		int t = car.nextInt(); //input time
		System.out.println(u+a*t);
		
		
		//14J1 Love Overdose --> Can't figure out what's wrong!!
		Scanner lovePotion = new Scanner(System.in);
		int A = lovePotion.nextInt();
		int B = lovePotion.nextInt();
		int R = lovePotion.nextInt();
		if ((A > 1000 || B > 1000 || R > 1000) && (A < 0 || B < 0 || R < 0)) {
		} else if (A > R) {
			System.out.println("Bob overdoses on day 1.");
		} else if ((A*0.5+B) > R) {
			System.out.println("Bob overdoses on day 2.");
		} else {
			System.out.println("Bob never overdoses.");
		}
		
		
		//6J1 Pusheen's Report Card
		Scanner reportCard = new Scanner(System.in);
		int A1 = reportCard.nextInt(); //CS452
		int B1 = reportCard.nextInt(); //PHIL145
		if (A1>B1) {
			System.out.println("CS452");
		} else if (A1<B1) {
			System.out.println("PHIL145");
		} else {
		}
		*/
		
	}

}
