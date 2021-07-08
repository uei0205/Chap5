package classpart.alone;

public class ShowpingTest {
	public static void main(String[] args) {
	Showping showping = new Showping();//새로운 인스턴스 생성
//	System.out.println(person);//인스턴스의 참조값 확인
	
	//인스턴스 변수 값 초기화 (참조 변수는 도트 연산자로 멤버 변수와 메서드에 접근 가능
	showping.number = 201803120001l;
	showping.ID = "abc123";
	showping.year = 2018;
	showping.month = 3;
	showping.day = 12;	
	showping.Name ="홍길순";
	showping.itnumber = "PD0345-12";
	showping.address = "서울시 영등포구 여의도동 20번지";
	
	System.out.println("주문 번호 : " + showping.number);
	System.out.println("주문자 아이디 : " + showping.ID);
	System.out.println("주문 날짜 : " +showping.year+"년 "+showping.month+"월 "+ showping.day+"일 ");
	System.out.println("주문자 이름 : " + showping.Name);
	System.out.println("주문 상품 번호 :" + showping.itnumber);
	System.out.println("배송 주소 : "+ showping.address);

	}
	
}
