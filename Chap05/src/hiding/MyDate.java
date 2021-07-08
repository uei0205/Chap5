package hiding;

public class MyDate {
	//외부클래스에서 접근 불가능한 접근 제어자
	int year; //디폴트 접근 제어자, 디폴트는 쓰지 않음. 동일한 패키지 내에서만 사용 가능
	private int month;
	private int day;
	
	void setDay(int d) {
		if(month != 2) { //2월이 아닌 경우
			day = d; //날짜 출력 메서드 호출
			printDate();
		}
		else { //2월인 경우, 윤년 체크 제외
			if(d<1 || d>28) {
				System.out.println("날짜 오류!");
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
