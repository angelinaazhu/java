import java.util.Scanner;
public class Lesson3_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 1
		Scanner one = new Scanner(System.in);
		int A = one.nextInt();
		int B = one.nextInt();
		System.out.println(A+B);
		
		//Task 2
		Scanner two = new Scanner(System.in);
		double C = two.nextDouble();
		double D = two.nextDouble();
		int E = two.nextInt();
		System.out.println(C*D-E);
		
		//Task 3
		Scanner three = new Scanner(System.in);
		int F = three.nextInt();
		double G = three.nextDouble();
		int H = three.nextInt();
		System.out.println(F+G*H);
		
		//Task 4
		Scanner four = new Scanner(System.in);
		byte apple = four.nextByte();
		short banana = four.nextShort();
		int carrot = four.nextInt();
		long dog = four.nextLong();
		System.out.println(apple*banana-carrot*dog);
		
		//Task 5
		Scanner five = new Scanner(System.in);
		double K = five.nextDouble();
		float L = five.nextFloat();
		System.out.println(K/L);
		
		//Task 6
		Scanner six = new Scanner(System.in);
		boolean M = six.nextBoolean();
		System.out.println(M);
		
		//Task 7
		Scanner seven = new Scanner(System.in);
		int table = seven.nextInt();
		double tennis = seven.nextDouble();
		System.out.println(table*tennis);
		
	}

}
