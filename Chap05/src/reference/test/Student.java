package reference.test;

public class Student {
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
	
	//����Ʈ ������
	public Student() {
		korea = new Subject("����"); //�� �л����� ��� �־��� �ʿ����
		math = new Subject("����");
	}
	//�й��� �̸��� �Ű������� ���� ������
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korea = new Subject("����");
		math = new Subject("����");
	}
	public void setKorea(int score) {
//		korea.subjectScore = score;
		korea.setSubjectScore(score);
	}
	public void setMath(int score) {
//		math.subjectScore = score;
		math.setSubjectScore(score);
	}
	
	//�л��� ������ ����ϴ� �޼���
	public void printStudentInfo() {
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName + "�л��� " + korea.subjectName + "������ ������" + korea.getSubjectScore() + "��, " + math.subjectName +
				 "������ ������" + math.getSubjectScore() + "��, ������" + total + "���Դϴ�."	);
	}
}
