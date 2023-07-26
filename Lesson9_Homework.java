import java.util.*;
import java.io.*;

public class Lesson9_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Task 1
		String S = "ABCD";
		System.out.println(S.charAt(0));
		
		
		//Task 2
		Scanner two = new Scanner(System.in);
		String B = two.next();
		B = B.replace("a", "");
		B = B.replace("e", "");
		B = B.replace("i", "");
		B = B.replace("o", "");
		B = B.replace("u", "");
		System.out.println(B);
		
		
		//Task 3
		Scanner three = new Scanner(System.in);
		String C = three.next();
		
		String removeT = C.replace("T", "");
		int countT = C.length() - removeT.length();
		
		String removeS = C.replace("S", "");
		int countS = C.length() - removeS.length();
		
		if (countT > countS) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Task 4
		String E = "Happy new year, every one";
		E = E.replace("e", "E");
		System.out.println(E);
		
		
		//Task 5
		Scanner five = new Scanner(System.in);
		String F = five.next();
		if (F.contains("Hello")) {
			System.out.println("How are you?");
		} else {
			System.out.println("Thank you!");
		}
		
		
		//Task 6
		Scanner six = new Scanner(System.in);
		String G = six.next();
		if (G.contentEquals("Sarah")) {
			System.out.println("Smart");
		} else {
			System.out.println("Pretty");
		}
		
		
		//Task 7
		Scanner seven = new Scanner(System.in);
		String color = seven.next();
		System.out.println(color.length());
		
		
		//14J2 Vote Count
		Scanner competition = new Scanner(System.in);
		int V = competition.nextInt();
		String votes = competition.next();
		
		String removeA = votes.replace("A", "");
		int countA = V - removeA.length();
		
		String removeB = votes.replace("B", "");
		int countB = V - removeB.length();
		
		if (countA>countB) {
			System.out.println("A");
		} else if (countB>countA) {
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
		
		
		//15J2 Happy or Sad
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
		
		//13J2 Rotating letters
		  Scanner artist = new Scanner(System.in);
	      String Word = artist.next();
	      String newWord = Word.replace("I", "");
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
	    
	      
	}

}
