package classpart.method;

public class StudentTest {

	public static void main(String[] args) {
		Student_129 student = new Student_129(); 
//		student.studentName = "�̷縶";
		student.setStudentName("�̷縶"); //�̰͵� ������ �̸��� NULL�� ���.
		System.out.println(student.getStudentName());//ȣ���ϸ� �ű⿡ �ش��ϴ� �̸��� ����ϰ� ��
		
		Student_129 student2 = new Student_129(); //�⺻ ������ ȣ���Ͽ� �ν��Ͻ� ����
		student2.setStudentName("ȫ�浿");
		System.out.println(student2.getStudentName());
		
		System.out.println(student);
		System.out.println(student2);
	}

}
