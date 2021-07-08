package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.year = 2021;
//		date.day = 31;
//		date.month = 7;
//		
//		System.out.println(date.day);
		
		date.setMonth(7);
		date.setDay(31);
//		date.printDate();

	}

}
