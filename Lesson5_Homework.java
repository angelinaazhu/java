import java.util.*;
public class Lesson5_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		//15J1 Special Day
//		int month = sc.nextInt();
//		int day = sc.nextInt();
//		
//		if ((month<2) || (month==2 && day<18)) {
//			System.out.println("Before");
//		} else if ((month>2) || (month==2 && day>18)) {
//			System.out.println("After");
//		} else if (month==2 && day==18) {
//			System.out.println("Special");
//		}
		
		//17J1 Quadrant Selection
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if (X>0 && Y>0) {
			System.out.println("1");
		} else if (X>0 && Y<0) {
			System.out.println("2");
		}
		
		
		/*
		//18J1 Telemarketer or not?
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int fourth = sc.nextInt();
		
		if ((first == 8 || first == 9) && (second == third) && (fourth == 8 || fourth == 9)) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
		
		
		//19J1 Winning Score
		int Apple3 = sc.nextInt();
		int Apple2 = sc.nextInt();
		int Apple1 = sc.nextInt();
		int Banana3 = sc.nextInt();
		int Banana2 = sc.nextInt();
		int Banana1 = sc.nextInt();
		
		int AppleTotal = (Apple3*3 + Apple2*2 + Apple1);
		int BananaTotal = (Banana3*3 + Banana2*2 + Banana1);
		
		if (AppleTotal>BananaTotal) {
			System.out.println("A");
		} else if (AppleTotal<BananaTotal) {
			System.out.println("B");
		} else {
			System.out.println("T");
		}
		
		
		//Task
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		int d4 = sc.nextInt();
		
		if (d1==8 || d1==9 || d4==8 || d4==9 || d2==d3) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
		*/
		
	}

}
