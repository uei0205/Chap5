package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person(); //디폴트 생성자 : 클래스 이름과 같고 매개변수는 없으며 반환 값이 없는 특수한 형태의 함수
		
		System.out.println(person);
		person.name = "홍길동";
		person.weight = 75.5f;
		person.height = 180;
		System.out.println(person.name+"님의 키는 " + person.height + "cm 이고, 몸무게는 "+person.weight+"Kg입니다.");
		
		Person personOh = new Person("오의정", 165, 10.5f);
		System.out.println(personOh.name+"님의 키는 " + personOh.height + "cm 이고, 몸무게는 "+personOh.weight+"Kg입니다.");

		
	}

}
                                          