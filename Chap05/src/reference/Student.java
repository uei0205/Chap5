package reference;

public class Student {
	int studentID;
	String studentName;
//	String KoreaSubject;
//	int Koreascore;
	
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) { //국어 과목 설정 메서드
		korea.setSubjectName(name);
		korea.setSubjectScore(score);
	}
	
	public void setMath(String name, int score) { //수학 과목 설정 메서드
		math.setSubjectName(name);
		math.setSubjectScore(score);
	}
	
	void showStudentInfo() {//학생정보 출력 메서드
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName + "학생의 국어 점수는 " + korea.getSubjectScore()+", 수학 점수는 "+math.getSubjectScore()+"점, 총점은 "+total+"점 입니다.");
	}
}
