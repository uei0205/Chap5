package classpart;

public class Student_129 {
	//학생의 속성(특성)  : 멤버 변수
	int studentId;
	String studentName;
	int grade;
	String address;
	
	//메서드(기능)
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
    public static void main(String[] args) {
		Student_129 std = new Student_129(); //기본 생성자
		std.studentName = "오의정";
		std.address = "부산시 사상구 주례동";
		std.showStudentInfo();
				
	}
}
