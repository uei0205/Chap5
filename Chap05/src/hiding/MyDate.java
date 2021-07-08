package hiding;

public class MyDate {
	//�ܺ�Ŭ�������� ���� �Ұ����� ���� ������
	int year; //����Ʈ ���� ������, ����Ʈ�� ���� ����. ������ ��Ű�� �������� ��� ����
	private int month;
	private int day;
	
	void setDay(int d) {
		if(month != 2) { //2���� �ƴ� ���
			day = d; //��¥ ��� �޼��� ȣ��
			printDate();
		}
		else { //2���� ���, ���� üũ ����
			if(d<1 || d>28) {
				System.out.println("��¥ ����!");
			}
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}
	
	void printDate() {
		System.out.println(year + "-" + month + "-" + day);
	}

}
