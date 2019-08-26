
public class Student {
	private String name;
	private double totalQuizScore;
	private int quizNoTaken;
	
	public Student(String studName, int total){
		name = studName;
		if(total != 0){
			totalQuizScore = total;
			quizNoTaken = 1;
		}
		else{
			totalQuizScore = 0.0;
			quizNoTaken = 0;
		}	
	}
	public String getName(){
		return name;
	}
	public double getTotalScore(){
		return totalQuizScore;
	}
	public double getAverageScore(){
		double avg;
		avg = getTotalScore()/getNoQuiz();
		return avg;
	}
	public int getNoQuiz(){
		return quizNoTaken;
	}
	public void addQuiz(int score){
		totalQuizScore += score;
		quizNoTaken++;
	}
	public String displayResults(){
		String toScreen = " ";
		toScreen += "Name: " + getName() + "  |  Average quiz score: " + getAverageScore() + "  |  No. of quizzes attempted " + getNoQuiz();
		return toScreen;
	}
}
