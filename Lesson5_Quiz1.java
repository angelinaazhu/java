
public class Lesson5_Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "I don't like coding";
		
		if (A.contentEquals("like")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		if (A.contains("like")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		System.out.println(A.substring(8, 13));
		
	}

}
