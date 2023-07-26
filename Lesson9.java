import java.util.Scanner;

public class Lesson9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//Task 1
		//output ^ 8 times on the same line
		//output new line
		for (int i=0; i<8; i++) {
	        System.out.print("^");
	    }
	    System.out.println();
	    */
		
	     /*
	    //12J3
	    //My solution
		Scanner scale = new Scanner(System.in);
	    int k = scale.nextInt();
	    
	    for (int a=0; a<k; a++) {
	      for (int b=0; b<k; b++) {
	        System.out.print("*");
	      }
	      for (int b=0; b<k; b++) {
	        System.out.print("x");
	      }
	      for (int b=0; b<k; b++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    
	    //Dad's solution
		Scanner scale = new Scanner(System.in);
	    int k = scale.nextInt();
	    
	    String stencil = "*x* xx* *";
	    
	    for (int l=0; l<3; l++) {
	    	for (int a=0; a<k; a++) {
	  	      	for (int b=0; b<k; b++) {
	  	      		System.out.print(stencil.charAt(0+3*l));
	  	      	}
	  	      	for (int b=0; b<k; b++) {
	  	      		System.out.print(stencil.charAt(1+3*l));
	  	      	}
	  	      	for (int b=0; b<k; b++) {
	  	      		System.out.print(stencil.charAt(2+3*l));
	  	      	}
	  	    System.out.println();
	  	    }
	    }
	    */
		
		//3J1 Trident (fork thing)
		
		/*
		*  *  *
		*  *  *
		*  *  *
		*******
		   *
		   *
		   *
		   *
		*/
				
		Scanner dimensions = new Scanner(System.in);
		int t = dimensions.nextInt(); //height of tines
		int s = dimensions.nextInt(); //spacing between tines
		int h = dimensions.nextInt(); //length of handle
		
		//tines
		for (int b=0; b<t; b++) {
			System.out.print("*");
			for (int a=0; a<s; a++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int a=0; a<s; a++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		//base
		for (int a=0; a<2*s+3; a++) {
			System.out.print("*");
		}
		System.out.println();
		
		//handle
		for (int b=0; b<h; b++) {
			System.out.print(" ");
			for (int a=0; a<s; a++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int a=0; a<s; a++) {
				System.out.print(" ");
			}
			System.out.print(" ");
			System.out.println();
		}
	    
	}

}
