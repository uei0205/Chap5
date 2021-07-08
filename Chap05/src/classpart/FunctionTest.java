package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		int sum = add(num1, num2); //함수 호출 , 결과값을 반환 받아 sum 변수에 대입
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		System.out.println("1부터 10까지의 합 : " + getTotal());
	}
	
	public static int add(int num1, int num2) { // 함수 정의 , 위에 자료형과 일치하거나 커야함.
		int result = num1 + num2;
		return result;
	}
	
	public static int getTotal() { //int 정수형 사용
		int total = 0;
		for(int i=1; i<11; i++) {
			total += i;
		}
		return total;		
	}
}
