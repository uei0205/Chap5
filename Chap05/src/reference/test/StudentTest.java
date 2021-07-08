package reference.test;

public class StudentTest {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.studentName = "홍길동";
		std1.setKorea(100);
		std1.setMath(95);
		std1.printStudentInfo();
		
		Student std2 = new Student(20211111, "홍길순");
		std2.setKorea(80);
		std2.setMath(90);
		std2.printStudentInfo();
		
		// 힙메모리에 생성 서브젝트랑 스튜던트, 학생의 아이디 이름 국어 수학은 멤버 변수, 힙메모리에 필요에 의해 생성됨
		// 깔끔하게 사라지고 생성된다는데

	}

}
