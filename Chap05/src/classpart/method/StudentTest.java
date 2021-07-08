package classpart.method;

public class StudentTest {

	public static void main(String[] args) {
		Student_129 student = new Student_129(); 
//		student.studentName = "이루마";
		student.setStudentName("이루마"); //이것도 없으면 이름은 NULL로 뜬다.
		System.out.println(student.getStudentName());//호츨하면 거기에 해당하는 이름을 출력하게 됨
		
		Student_129 student2 = new Student_129(); //기본 생성자 호출하여 인스턴스 생성
		student2.setStudentName("홍길동");
		System.out.println(student2.getStudentName());
		
		System.out.println(student);
		System.out.println(student2);
	}

}
