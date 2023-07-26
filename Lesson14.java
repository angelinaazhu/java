import java.io.*;
import java.util.*;

public class Lesson14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		//16S2 Tandem Bicycle
		int question = sc.nextInt(); //1st line input
		
		int N = sc.nextInt(); //2nd line input
		
		//DMOJISTAN
		int[] DmojistanSpeeds = new int[N];
		for (int i=0; i<N; i++) {
			DmojistanSpeeds[i] = sc.nextInt(); //3rd line input --> directly fills in as int array
		}
		sc.nextLine();
		Arrays.sort(DmojistanSpeeds);
		
		//PEGLAND
		int[] PeglandSpeeds = new int[N];
		for (int i=0; i<N; i++) {
			PeglandSpeeds[i] = sc.nextInt(); //4th line input --> directly fills in as int array
		}
		sc.nextLine();
		Arrays.sort(PeglandSpeeds);
		
		int totalSpeed = 0;
		
		if (question==1) { //pair min speeds together and only count max
			for (int i=0; i<N; i++) {
				totalSpeed += Math.max(DmojistanSpeeds[i], PeglandSpeeds[i]); //only count max
			}
		} else if (question==2) { //pair max with min and only count max
			for (int i=0; i<N; i++) {
				totalSpeed += Math.max(DmojistanSpeeds[i], PeglandSpeeds[N-1-i]); //only count max
			}
		}
		System.out.println(totalSpeed);
		*/
		
		//15S2 Jerseys
		int J = sc.nextInt(); //1st line input
		int A = sc.nextInt(); //2nd line input
		char[] sizes = new char[J];
		
		for (int i=0; i<J; i++) {
			sizes[i] = sc.next().charAt(0);
		}

	}

}
