package day0118;

public class VarTest_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수: 메모리공간의 할당과 접근, 2가지를 해결하기 위해서 변수도입
		//코드에서 변수선언 -> 메모리공간 할당 -> 할당 된 메모리에 접근을 위해서 이름(변수)
		
		int num1; //변수 선언. 자바에서는 반드시 (자료형 이름) 으로 변수 선언
		num1=100;
		
		int num2 = 200;
		int result = num1+num2;
		
		System.out.println(num1+num2);
		System.out.println("num1+num2="+(num1+num2));
		System.out.println(num1+"+"+num2+"="+result);
	}

}
