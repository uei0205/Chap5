package reference.test;

public class Subject {
	String subjectName;
	int subjectScore;
	
	//과목명을 매개변수로 갖는 생성자
	public Subject(String name) {
		subjectName = name; 
	}
	
	//각 멤버 변수의 값을 설정하고 변환하는 메서드 추가
	public void setSubjectName (String name) {//리턴값이 없으니 void
		subjectName = name;
	}
	public String getSubjectName () {
		return subjectName;
	}
	
	public void setSubjectScore(int score) {
		subjectScore = score;
	}
	
	public int getSubjectScore() {
		return subjectScore;
	}
}
