package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {} //디폴트 생성자, 하나의 생성자도 없는 경우 컴파일러가 자동을 생성		
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheigth, float pweight) {//메서드에서 메서트 오버로딩
		name = pname;
		height = pheigth;
		weight = pweight;				
	}

}
