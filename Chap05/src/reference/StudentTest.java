package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.studentName = "������";
		std1.korea.setSubjectName ("����");
		std1.math.setSubjectName ("����");
		std1.korea.setSubjectScore(90);
		std1.math.setSubjectScore(96);
		std1.showStudentInfo();
		
		Student std2 = new Student(1111, "�̷縶");
		std2.setKorea("����", 100);
		std2.setMath("����", 90);
		std2.showStudentInfo();

	}

}