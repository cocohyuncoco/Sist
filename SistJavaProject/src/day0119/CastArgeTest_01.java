package day0119;

public class CastArgeTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name=args[0];
//		String age=args[1];
		
//		System.out.println("이름 : "+name);
//		System.out.println("나이 : "+age);

		//숫자를 파라메타로 보내도 문자열로 읽음으로 
		int num1 =Integer.parseInt(args[0]);
		int num2 =Integer.parseInt(args[1]);

		int sum =num1+num2;
		int sub =num1-num2;
		int mul =num1*num2;
		double div =(double)num1/num2;
		
		System.out.println("두수의 합 "+sum);
		System.out.println("두수의 차 "+sub);
		System.out.println("두수의 곱 "+mul);
		System.out.println("두수의 나누기 "+div);
		
	}

}
