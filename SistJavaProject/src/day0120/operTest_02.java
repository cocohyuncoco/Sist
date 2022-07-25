package day0120;

public class operTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a=b=5;
		
		//단항일 경우에는 앞에 붙이나 뒤에 붙이나 같다
		++a; // 원래 a값에서 1증가
		b++; //b=b+1
		
		System.out.println("a="+a+", b="+b); //a=6, b=6

		// 수식에서 사용할때는 전치 후치가 결과값이 틀리다
		int m,n;
		m=n=0;
		a=b=5;
		
		m=a++; //후치일 경우에는 먼저 대입 후 증가
		System.out.println("m="+m+", a="+a);
		
		n=++b; //전치일 경우에는 먼저 증가 후 대입
		System.out.println("n="+n+", b="+b);
	}

}
