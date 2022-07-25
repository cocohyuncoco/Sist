package day0128;


class MyDate{

	//인스턴스 변수선언
	private int year;
	private int month;
	private int day;
	
	//명시적 생성자
	//기본생성자는 생성되지 않는다
	public MyDate(int y,int m,int d) {
		year=y;
		month=m;
		day=d;
	}
	//setter, getter 자동완성 하는법
	//우클릭 -> Source(Alt+Shift+S) -> Generate Getter and Setters

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
	public void setDay(int day) {
		this.day = day;
	}


}


/////////////////////////////////////////////
public class TestMyDate_09 {

	public static void main(String[] args) {

		//객체생성
		//인자 3개짜리 명시적 생성자로 생성

		MyDate date = new MyDate(2022, 12, 25);

		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDay());



	}

}

