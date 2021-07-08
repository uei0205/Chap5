package hiding.test;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("홍길동"); //공개된 메서드로 은닉된 멤버 변수의 값을 변경 가능

	}

}
