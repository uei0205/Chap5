package classpart.alone;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;

		int sum = add(num1, num2); // �Լ� ȣ�� , ������� ��ȯ �޾� sum ������ ����
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		int bbegi = min(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + bbegi);
		
		int gop = gophagi(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + gop);
		
		nanugi(num1, num2);

	}

	public static int add(int num1, int num2) { // �Լ� ���� , ���� �ڷ����� ��ġ�ϰų� Ŀ����.
		int result = num1 + num2;
		return result;
	}
	public static int min(int num1, int num2) { 
		int result = num1 - num2;
		return result;
	}
	public static int gophagi(int num1, int num2) { 
		int result = num1 * num2;
		return result;
	}
	public static void nanugi(int num1, int num2) { 
		if(num2 != 0) {
		double result = (double)num1 / (double)num2;
		System.out.println(num1 + " / " + num2 + " = " +result);
//		return result;
		} else {
			System.out.println("�������� 0�� �ƴϿ��� �մϴ�");
		}
	}
	
	
}
