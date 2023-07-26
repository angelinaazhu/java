import java.io.*;
import java.util.*;
public class Lesson170 {

	//class is template
	  //inside the class you only write them what kind of data the class has
	  //what kind of behavior the class can do

	  //name
	  //mathMark
	  //engishMark
	  //computerMark
	      
	  public static class Student {
	      //create instance variable
	      //type name;
	      String name;
	      double mathMark;  
	      double englishMark;
	      double computerMark;

	      //set instance variable's value
	      //create constructor
	      //constructor has the same name as class
	      public Student(String n, double m, double e, double c) {
	           name= n;
	           mathMark = m;
	           englishMark = e;
	           computerMark = c;
	      }
	  }


	  public static void main(String[] args) {
	         
	         //type name = value

	       	Student angelina = new Student("Angelina", 50, 60, 70);
	        System.out.println(angelina.name+" "+angelina.englishMark+" "+angelina.mathMark+" "+angelina.computerMark);

	}

}
