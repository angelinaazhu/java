
public class Lesson18_Quiz1 {

	public static class Student {
		String name;
		double englishMark;
		double mathMark;
		double codingMark;
		
		public Student (String n, double e, double m, double c) {
			name = n;
			englishMark = e;
			mathMark = m;
			codingMark = c;
		}
		
		public double calculateTotalMark() {
			return englishMark+mathMark+codingMark;
		}
		
		public double calculateAverageMark() {
			return (englishMark+mathMark+codingMark)/3;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student angelina = new Student("Angelina",100,50,80);
		System.out.println(angelina.name+"'s total mark is "+angelina.calculateTotalMark()+" and average mark is "+angelina.calculateAverageMark());
		
	}

}
