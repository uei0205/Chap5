package classpart;

public class Student_129 {
	//�л��� �Ӽ�(Ư��)  : ��� ����
	int studentId;
	String studentName;
	int grade;
	String address;
	
	//�޼���(���)
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
    public static void main(String[] args) {
		Student_129 std = new Student_129(); //�⺻ ������
		std.studentName = "������";
		std.address = "�λ�� ��� �ַʵ�";
		std.showStudentInfo();
				
	}
}
