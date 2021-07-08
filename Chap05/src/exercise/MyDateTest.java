package exercise;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		String isValid = date1.isValid(); // 메서드의 리턴 값이 스트링 타입이라 변수에 대입
		System.out.println(isValid); // 결과 변수를 출력

		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
		date2.isValid();
	}

}
 