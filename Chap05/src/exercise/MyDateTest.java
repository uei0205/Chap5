package exercise;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		String isValid = date1.isValid(); // �޼����� ���� ���� ��Ʈ�� Ÿ���̶� ������ ����
		System.out.println(isValid); // ��� ������ ���

		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
		date2.isValid();
	}

}
 