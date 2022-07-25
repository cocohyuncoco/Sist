package day0118;

public class WrapperTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wrapper 란? 클래스간의 변환해주는 클래스를 래퍼클래스라 한다.
		// 스트링형을 계산으로 쓸려할때 int로 변경시켜주는거
		
		// string(문자열)타입을 int(정수) 타입으로 변경하려면?
		// wrapper 클래스 이용하기
		// Integer.parseInt("1"): 문자열1이 정수1로 반환된다.
		
		// Double.parseDouble("12.5"): 문자열 12.5가 실수12.5로 반환된다.
		
		String su1="5";
		String su2="3";
		System.out.println("두수 더하기: "+(su1+su2));

		//문자열 su1,su2를 정수타입으로 변환 후 계산해보자
		//Wrapper class: 기본형과 클래스형 간의 변환을 위한 클래스(Integer, Double, Long,)
		
		int num1=Integer.parseInt(su1);
		int num2=Integer.parseInt(su2);
		int addresult=num1+num2;
		
		System.out.println("변환후 두수 더하기:"+(num1+num2));
		System.out.println("변환후 두수 더하기:"+addresult);
		System.out.println("변환후 두수 빼기:"+(num1-num2));
		System.out.println("변환후 두수 곱하기:"+(num1*num2));
		System.out.println("변환후 두수 나누기:"+(num1/num2)); //정수형끼리 연산시 정수도
		
	
	}

}
