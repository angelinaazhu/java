import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//integers
	    byte A0 = 3;
	    short B0 = 4;
	    System.out.println(A0+B0);
	    short C0 = 11;
	    int D0 = 12;
	    System.out.println(C0*D0);
	    
	    //decimals
	    double King = 5.7;
	    float Can = 11.2f;
	    System.out.println(King*Can);
	    
	    //other
	    char angelina = 'A';
	    boolean zhu = true;
	    System.out.println(angelina);
	    System.out.println(zhu);
	    
	    //Create a virtual Scanner
	    Scanner sc = new Scanner(System.in);
	    int A1 = sc.nextInt();
	    int B1 = sc.nextInt();
	    System.out.println(A1+B1);
	    
	    
	}

}
