package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		int sum = add(num1, num2); //�Լ� ȣ�� , ������� ��ȯ �޾� sum ������ ����
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		System.out.println("1���� 10������ �� : " + getTotal());
	}
	
	public static int add(int num1, int num2) { // �Լ� ���� , ���� �ڷ����� ��ġ�ϰų� Ŀ����.
		int result = num1 + num2;
		return result;
	}
	
	public static int getTotal() { //int ������ ���
		int total = 0;
		for(int i=1; i<11; i++) {
			total += i;
		}
		return total;		
	}
}
