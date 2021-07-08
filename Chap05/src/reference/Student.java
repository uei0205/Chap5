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
	
	public void setKorea(String name, int score) { //���� ���� ���� �޼���
		korea.setSubjectName(name);
		korea.setSubjectScore(score);
	}
	
	public void setMath(String name, int score) { //���� ���� ���� �޼���
		math.setSubjectName(name);
		math.setSubjectScore(score);
	}
	
	void showStudentInfo() {//�л����� ��� �޼���
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName + "�л��� ���� ������ " + korea.getSubjectScore()+", ���� ������ "+math.getSubjectScore()+"��, ������ "+total+"�� �Դϴ�.");
	}
}
