import java.io.*;
import java.util.*;

public class Lesson12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String consonant = "bcdfghjklmnpqrstvwxyz";
		
		String english = sc.next(); 
		
		for (int i=0; i<english.length(); i++) {
			if (english.charAt(i)=='a' || english.charAt(i)=='e' || english.charAt(i)=='i' || english.charAt(i)=='o' || english.charAt(i)=='u') {
				System.out.print(english.charAt(i));
			} else if (english.charAt(i)=='z') {
				System.out.print("zuz");
			} else {
				int index = alphabet.indexOf(english.charAt(i));
				int indexInCons = consonant.indexOf(english.charAt(i));
				
				int aIndex = alphabet.indexOf('a');
				int eIndex = alphabet.indexOf('e');
				int iIndex = alphabet.indexOf('i');
				int oIndex = alphabet.indexOf('o');
				int uIndex = alphabet.indexOf('u');
				
				index - aIndex;
				
				int[] indexes = {index, aIndex, eIndex, iIndex, oIndex, uIndex};
				Arrays.sort(indexes);
				
				int indexOfInput = Arrays.binarySearch(indexes, index);
				int r1 = indexes[indexOfInput] - indexes(indexOfInput-1);
				int r2 = indexes[indexOfInput+1] - indexes(indexOfInput);
				if r1 <= r2 {
					System.out.print(english.charAt(i)+alphabet.charAt(indexes(indexOfInput-1))+consonant(consonant.indexOf(english.charAt(i))+1));
				}
				
			}
		}
		
	}

}
