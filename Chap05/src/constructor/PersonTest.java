package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person(); //����Ʈ ������ : Ŭ���� �̸��� ���� �Ű������� ������ ��ȯ ���� ���� Ư���� ������ �Լ�
		
		System.out.println(person);
		person.name = "ȫ�浿";
		person.weight = 75.5f;
		person.height = 180;
		System.out.println(person.name+"���� Ű�� " + person.height + "cm �̰�, �����Դ� "+person.weight+"Kg�Դϴ�.");
		
		Person personOh = new Person("������", 165, 10.5f);
		System.out.println(personOh.name+"���� Ű�� " + personOh.height + "cm �̰�, �����Դ� "+personOh.weight+"Kg�Դϴ�.");

		
	}

}
                                          