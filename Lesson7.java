import java.util.Scanner;
public class Lesson7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//20J1
		Scanner dog = new Scanner(System.in);
	      int S = dog.nextInt();
	      int M = dog.nextInt();
	      int L = dog.nextInt();
	      if(1*S+2*M+3*L >= 10) {
	        System.out.println("happy");
	      } else {
	        System.out.println("sad");
	      }
	    */
		
		/*
	    //13J2
	      Scanner artist = new Scanner(System.in);
	      String newWord = artist.next();
	      String newWord = newWord.replace("I", "");
	      newWord = newWord.replace("O", "");
	      newWord = newWord.replace("S", "");
	      newWord = newWord.replace("H", "");
	      newWord = newWord.replace("Z", "");
	      newWord = newWord.replace("X", "");
	      newWord = newWord.replace("N", "");
	      int fin = newWord.length();
	      if (fin == 0) {
	    	  System.out.println("YES");
	      } else {
	    	  System.out.println("NO");
	      }
	      */
	      
		/*
		//15J2
		Scanner emoticon = new Scanner(System.in);
		String statement = emoticon.nextLine();       
		int original = statement.length();
		
		String removehappy = statement.replace(":-)", "");
		int afterremovehappy = removehappy.length();
		
		String removesad = statement.replace(":-(", "");
		int afterremovesad = removesad.length();
		
		if (afterremovehappy < afterremovesad) {
			System.out.println("happy");
		} else if (afterremovehappy > afterremovesad) {
			System.out.println("sad");
		} else if (afterremovehappy == afterremovesad && afterremovehappy != original) {
			System.out.println("unsure");
		} else {
			System.out.println("none");
		}
		*/
		
		/*
		//Teacher solution
		Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();  //input String with spaces (reads the whole line)

        //S -- How are you :-) doing :-( today :-)?
        String happy = S.replace(":-)","");
        //happy How are you  doing :-( today 

        String sad = S.replace(":-(","");

        int countH = (S.length()-happy.length())/3;
        int countS = (S.length()-sad.length())/3;

        if (countH>countS) {
          System.out.println("happy");
        } else if (countH<countS) {
          System.out.println("sad");
        } else if (countH==0 && countS==0) {
            System.out.println("none");
          } else {
            System.out.println("unsure")
          }
        */
        
		/*
        //Task 1: Output name 3 times
        for (int i=0; i<2; i++) {
        	System.out.println("Angelina");
        }
        
        //Task 2
        //input N as int
        //output "Cool" N times
        Scanner ang = new Scanner(System.in);
        int N = ang.nextInt();
        for (int i=0; i<N; i++) {
            System.out.println("Cool");
        }
        */
        
		/*
      //Task 3
        //input A as int
        //input B as int
        //output Alex A+B times
        Scanner ang1 = new Scanner(System.in);
        int A = ang1.nextInt();
        int B = ang1.nextInt();
        for (int i = 0; i < (A+B); i++) {
        	System.out.println("Alex");
		}
        */
        
      //Task 4
        //2 4 6 8 10  using for loop
       
        for (int i = 2; i < 11; i+=2) {
        	System.out.println(i);
        }
        
	}

}
