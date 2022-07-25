package day0118;

public class ReferVarTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String 클래스 이용 ""로 표현
		
		char a='A';
		char b='가';
		
		String str = "Hello";
		String str2 =new String("Happy Day");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
		System.out.println(str2);
		
		// 실행단계에서 문자열을 읽어와서 변수에 저장
		String name=args[0];
		String ctiy=args[1];
		String age=args[2];
	
	
		//출력
		System.out.println("이름은 "+name+" 사는지역은 "+ctiy+"입니다. 나이는"+age+"입니다");
	
	
	
	
	
	}

}
