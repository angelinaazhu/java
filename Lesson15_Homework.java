import java.io.*;
import java.util.*;
public class Lesson15_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		//19J3 Cold Compress
		int N = sc.nextInt(); //number of lines
		int countSymbol = 1; //counter
		for (int i=0; i<N; i++) { //repeating it for the number of lines there are
			String code = sc.next()+" "; //coded message
			System.out.println();
			for (int j=0; j<code.length()-1; j++) { 
				if (code.charAt(j+1)==code.charAt(j)) { 
					countSymbol ++;
				} else { //the count is done
					System.out.print(countSymbol+" "+code.charAt(j)+" "); //output part of the code
					countSymbol = 1; //reset counter
				}
			}
		}
		
		
		//20J3 Art
		int N1 = sc.nextInt(); //number of drops of paint (number of lines)
		int[] Xcoordinates = new int[N1];
		int[] Ycoordinates = new int[N1];
		sc.nextLine(); //reads next line
		for (int i=0; i<N1; i++) {
			String coordinates = sc.nextLine(); //reads coordinate input as a string 
			String[] coordinateArray = coordinates.split(","); //splits x and y coordinate into two array elements
			Xcoordinates[i] = Integer.parseInt(coordinateArray[0]);
			Ycoordinates[i] = Integer.parseInt(coordinateArray[1]);
		}
		//minX, minY
		//maxX, maxY
		Arrays.sort(Xcoordinates);
		Arrays.sort(Ycoordinates);
		System.out.println((Xcoordinates[0]-1)+","+(Ycoordinates[0]-1));
		System.out.println((Xcoordinates[N1-1]+1)+","+(Ycoordinates[N1-1]+1));
		
		
		//21J3 Secret Instructions
		String turn = ""; //right/left
		String steps = ""; //how many steps to take
		
		for (;;) { //for all the lines -> no change, repeats forever
			String directions = sc.next();
			int sum = Integer.parseInt(String.valueOf(directions.charAt(0)))+Integer.parseInt((String.valueOf(directions.charAt(1))));
			if (directions.contentEquals("99999")) { //for each line -> repeat until a line says 99999 -> nothing happens
				break;
			} else if (sum==0) { //if it is zero -> same direction to turn as previous instruction
				//nothing happens
			} else if (sum%2==0) { //if it is even
				turn = "right"; //right
			} else { //if it is odd
				turn = "left"; //left
			}
			steps = directions.substring(2);
			System.out.println(turn+" "+steps);
		}
				
		
		//18J3 Are we there yet?
		//didn't i already do this
		
		
		//17J3 Exactly Electrical
		int[] starting = new int[2];
		int[] destination = new int[2];
		for (int i=0; i<2; i++) {
			starting[i] = sc.nextInt();
		}
		sc.nextLine();
		for (int i=0; i<2; i++) {
			destination[i] = sc.nextInt();
		}
		int charge = sc.nextInt();
		
		int distance = 0;
		for (int i=0; i<2; i++) {
			distance += Math.abs(starting[i]-destination[i]);
		}
		
		if ((charge-distance)%2==0 && charge>=distance) { //if it's even
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		
		
		
		
		//input A as int
		//input B as int
		//if A*B greater than 5 output YES
		//else output NO
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A*B>5) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}


		//input C as double
		//input D as double
		//if C is greater than D output YES
		//else output NO
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		if (C>D) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		//input 5 numbers and store into array A
		//output the sum of numbers from array A
		int[] A1 = new int[5];
		int sum = 0;
		for (int i=0; i<5; i++) {
			A1[i] = sc.nextInt();
			sum += A1[i];
		}
		System.out.println(sum);

		//input String S
		//output char one by one from String S forward
		String S = sc.next();
		for (int i=0; i<S.length(); i++) {
			System.out.println(S.charAt(i));
		}

		//input String T
		//output char one by one from String T backward
		String T = sc.next();
		for (int i=0; i<T.length(); i++) {
			System.out.println(T.charAt(T.length()-1-i));
		}
		
	}

}
