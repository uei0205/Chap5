package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {} //����Ʈ ������, �ϳ��� �����ڵ� ���� ��� �����Ϸ��� �ڵ��� ����		
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheigth, float pweight) {//�޼��忡�� �޼�Ʈ �����ε�
		name = pname;
		height = pheigth;
		weight = pweight;				
	}

}
