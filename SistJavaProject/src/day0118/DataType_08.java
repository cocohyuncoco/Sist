package day0118;

public class DataType_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리형 true, false
		boolean flag=false;
		
		//문자형 char 기본적으로 정수형, 아스키코드로 변환가능
		char ch='가';
		
		//정수형 
		byte a=-128; //1byte -128~127까지 가능
		short b=32000; //2byte 
		int c=670000; // 32bit
		long num=100L; //접미사 필수. 뒤에L(대,소문자 다 가능)을 붙여야 컴퓨터가 long으로 인식하낟
		
		//실수형
		double d=4356.3452; //소수점의 숫자를 의미, double가 기본이라 접미사 안붙여도
		float e=3.1435F; //f를 안붙이면 컴퓨터가 double로 인식한다

		//int, float 같은 32bit를 사용하지만 기본적으로 실수형을 더 크게 처리한다
		
		System.out.println("flag="+flag);
		System.out.println("not flag="+!flag); //not을 의미하는 !
		System.out.println("ch="+ch);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("num="+num);
		System.out.println("f="+e);
	    System.out.printf("d=%10.2f\n",d); //전체 자리수 10자리 소수점 2자리
		System.out.printf("d=%.1f\n",d); //소수점 1자리
		
	}

}
