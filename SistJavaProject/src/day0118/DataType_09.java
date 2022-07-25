package day0118;

public class DataType_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=-127; // -128~127
		
		
		 byte b=(byte)128; //더 작은 자료형으로의 변환(디모션), 값 손실
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//강제형변환(cast연산자) 바르게 사용
		
		int x=7;
		int y=4;
		
		System.out.println(x/y); //정수형끼리의 계산은 무조건 정수형
		System.out.println((double)x/y); //double로 변환.. 결과도 double
		System.out.println(x/(double)y); //수식중 double있을경우 결과도 double타입
		
		double d=100.0;
		int i=100;
		int result=(int)d+i;
		double result2=(double)i+d;
		
		System.out.println("result="+result);
		System.out.println("result2="+result2);		
				
	} 

}
