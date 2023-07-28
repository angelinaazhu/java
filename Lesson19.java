import java.util.*;
import java.io.*;
public class Lesson19 {
	
	//create a global function
	//public static returntype functionname(input parameter)
	
	//MATH
	//plus
	public static double plus(double A,double B) {
		return A+B;
	}
	//minus
	public static double minus(double A,double B) {
		return A-B;
	}
	//multiply
	public static double multiply(double A,double B) {
		return A*B;
	}
	//divide
	public static double divide(double A,double B) {
		return A/B;
	}
	
    //check if it is a palindrome (isPalindrome & String S)
    public static boolean isPalindrome(String S) {
      for(int i=0; i<S.length(); i++) {
        if(S.charAt(i)!=S.charAt(S.length()-1-i)) {
          return false;
        } 
      }
      return true;
    }
    
    //int N
    //has4Factor
    public static boolean has4Factor(int N) {
    	int count = 0;
    	for (int i=0; i<N; i++) {
    		if (N%i==0) { //has no remainder
    			count ++;
    		}
    	}
    	if (count==4) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    //pass in String S
    //countHappy	:-)
    //return type is int
    public static int countHappy(String S) {
    	int count = 0;
    	for (int i=0; i<S.length(); i++) {
    		if (S.charAt(i)==';' && S.charAt(i+1)=='-' && S.charAt(i+2)==')') {
    			count ++;
    		}
    	}
    	return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MATH
		System.out.println(plus(3,4));
		System.out.println(divide(6,2));
		
		//ISPALINDROME
		
		//has4Factor
		
		//
	}

}
