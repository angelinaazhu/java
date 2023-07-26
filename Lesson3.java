import java.util.Scanner;
public class Lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a virtual scanner (review)
		
		Scanner hello = new Scanner(System.in);
		System.out.println("Please input an integer:");
		int A = hello.nextInt();
		System.out.println("Please input another integer on the next line:");
		int B = hello.nextInt();
		System.out.println("The sum of the two integers is: "+(A+B));
		
		int C = hello.nextInt();
		int D = hello.nextInt();
		int E = hello.nextInt();
		System.out.println(C*D-E);
		
		
		//Task 1
		if (A>3) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Task 2
	    if (A<4) {
	        System.out.println("Summer");
	    } else {
	        System.out.println("Winter");
	    }
	      
	    //Task 3
	    if (A>=5) {
	        System.out.println("Cindy");
	    } else {
	        System.out.println("Teacher");
	    }
	    
	    //Task 4
	    if (A!=11) {
	    		System.out.println("Solution");
	    } else {
	    		System.out.println("Great");
	    }
	    
	    
	    
		}
	}
