package day0118;

public class PrintfTest_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수:%d, 실수:%f, 문자:%c, 문자열:%s
		
		int num1=10, num2=20;
		int num3=num1+num2;
		
		System.out.println(num1+"+"+num2+"="+num3);
		
		//printf를 이용: num1의 값은 10, num2의 값은 20, num3의 값은 30 입니다.
		System.out.printf("num1의 값은:%d, num2의 값은:%d, num3의 값은:%d 입니다", 10, 20, 30);
		
		/*
		 Q. printf를 이용하여 출력할것, 변수명은 name, age
		 안녕하세요 제 이름은 임현정입니다.
		 나이는 26세 입니다
		  */
		
		String name="임현정";
		int age=26;
		
		System.out.printf("\n안녕하세요 제 이름은 %s 입니다. \n나이는 %d 입니다", name, age);
	}

}
