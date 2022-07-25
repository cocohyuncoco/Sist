package day0203;

import java.util.Calendar;

import day0203_01.TestP;

public class ConstEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TestP t1 = new TestP(); <- 안만들어짐 private 이라서
		// private 은 다른 패키지에서는 생성안됨

		TestP t1 = TestP.getInstance();
		t1.writMessage();

		//Calendar cal= new Calendar(); // 생성자가 protected 이므로 에러
		Calendar cal = Calendar.getInstance();

		int y = cal.get(Calendar.YEAR);
		System.out.println(y+"년 입니다.");


	}

}

