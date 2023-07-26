import java.io.*;
import java.util.*;
public class Lesson17_Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while (true) {
			int num = sc.nextInt();
			if (num==55) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);

	}

}
