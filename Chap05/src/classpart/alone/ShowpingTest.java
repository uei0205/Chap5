package classpart.alone;

public class ShowpingTest {
	public static void main(String[] args) {
	Showping showping = new Showping();//���ο� �ν��Ͻ� ����
//	System.out.println(person);//�ν��Ͻ��� ������ Ȯ��
	
	//�ν��Ͻ� ���� �� �ʱ�ȭ (���� ������ ��Ʈ �����ڷ� ��� ������ �޼��忡 ���� ����
	showping.number = 201803120001l;
	showping.ID = "abc123";
	showping.year = 2018;
	showping.month = 3;
	showping.day = 12;	
	showping.Name ="ȫ���";
	showping.itnumber = "PD0345-12";
	showping.address = "����� �������� ���ǵ��� 20����";
	
	System.out.println("�ֹ� ��ȣ : " + showping.number);
	System.out.println("�ֹ��� ���̵� : " + showping.ID);
	System.out.println("�ֹ� ��¥ : " +showping.year+"�� "+showping.month+"�� "+ showping.day+"�� ");
	System.out.println("�ֹ��� �̸� : " + showping.Name);
	System.out.println("�ֹ� ��ǰ ��ȣ :" + showping.itnumber);
	System.out.println("��� �ּ� : "+ showping.address);

	}
	
}
