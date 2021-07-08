package exercise;

import java.util.Calendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	// 날짜를 설정하기 위한 년, 월, 일 메서드를 호출
	public MyDate(int day, int month, int year) {
		setYear(year); // true
		setMonth(month);
		setDay(day);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day < 0 || day > 31) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day < 0 || day > 30) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;
		case 2:
			if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) { // 윤년인 경우
				if (day < 0 || day > 29) {
					isValid = false;
				} else { // 1~29
					this.day = day;
				}
			} else {
				if (day < 0 || day > 28) {
					isValid = false;
				} else {
					this.day = day;
				}
			}
			break;
		default:
			isValid = false;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		} else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		} else {
			this.year = year;
		}
	}

	// 날짜가 유효한지 체크한 결과 리턴(문자열)
	public String isValid() {
		if (isValid) { 
			System.out.println("유효한 날짜입니다!");
			return "유효한 날짜입니다.";
		} else { 
			System.out.println("요효하지 않은 날짜입니다!");
			return "유효하지 않은 날짜입니다.";
		}
	}
	
	public void valid() {
		if(isValid) {
			System.out.println("유효한 날짜래요");
		} else {
			System.out.println("유효하지 않은 날짜래요");
		}
	}
}
