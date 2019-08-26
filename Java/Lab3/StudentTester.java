
public class StudentTester {

	public static void main(String[] args) {
		Student stud1 = new Student("James", 0);
		Student stud2 = new Student("Mary", 0);
		stud1.addQuiz(35);
		stud1.addQuiz(77);
		stud1.addQuiz(25);
		stud1.addQuiz(54);
		stud2.addQuiz(99);
		System.out.println(stud1.displayResults());
		System.out.println(stud2.displayResults());

	}

}
