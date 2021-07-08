package reference.test;

public class Student {
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
	
	//디폴트 생성자
	public Student() {
		korea = new Subject("국어"); //매 학생마다 국어를 넣어줄 필요없음
		math = new Subject("수학");
	}
	//학번과 이름을 매개변수로 갖는 생성자
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	public void setKorea(int score) {
//		korea.subjectScore = score;
		korea.setSubjectScore(score);
	}
	public void setMath(int score) {
//		math.subjectScore = score;
		math.setSubjectScore(score);
	}
	
	//학생의 정보를 출력하는 메서드
	public void printStudentInfo() {
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName + "학생의 " + korea.subjectName + "과목의 점수는" + korea.getSubjectScore() + "점, " + math.subjectName +
				 "과목의 점수는" + math.getSubjectScore() + "점, 총점은" + total + "점입니다."	);
	}
}
