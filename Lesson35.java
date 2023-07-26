import java.util.Scanner;
public class Lesson35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner finalTask = new Scanner(System.in);
		
		System.out.println("Please input an integer: ");
		int B = finalTask.nextInt();
		if (B>0 && B<10) {
			System.out.println("It is an integer between 0 and 10.");
		} else {
			System.out.println("It is not an integer between 0 and 10.");
		}
		
		System.out.println("Please input another integer: ");
		int C = finalTask.nextInt();
		if (C>50 || C<100) {
			System.out.println("It is an integer either greater than 50 or less than 100.");
		} else {
			System.out.println("It is not an integer either greater than 50 or less than 100.");
		}
		
	}

}
