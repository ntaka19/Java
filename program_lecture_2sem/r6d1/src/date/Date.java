package date;

public class Date {
	int day;
	int month;
	int year;
	
	public Date(int day, int month, int year) {
		if ((1<=day && day <= 31)&&(1<=month && month <= 12)&& (1900 <= year)){
			this.day = day;
			this.month = month;
			this.year = year;
	}else {
			throw new RuntimeException("the given numbers do not specify a date");
		}
	}
}
