package day0128;


class MyDate{

	//�ν��Ͻ� ��������
	private int year;
	private int month;
	private int day;
	
	//����� ������
	//�⺻�����ڴ� �������� �ʴ´�
	public MyDate(int y,int m,int d) {
		year=y;
		month=m;
		day=d;
	}
	//setter, getter �ڵ��ϼ� �ϴ¹�
	//��Ŭ�� -> Source(Alt+Shift+S) -> Generate Getter and Setters

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

		//��ü����
		//���� 3��¥�� ����� �����ڷ� ����

		MyDate date = new MyDate(2022, 12, 25);

		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDay());



	}

}

