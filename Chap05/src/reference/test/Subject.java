package reference.test;

public class Subject {
	String subjectName;
	int subjectScore;
	
	//������� �Ű������� ���� ������
	public Subject(String name) {
		subjectName = name; 
	}
	
	//�� ��� ������ ���� �����ϰ� ��ȯ�ϴ� �޼��� �߰�
	public void setSubjectName (String name) {//���ϰ��� ������ void
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
