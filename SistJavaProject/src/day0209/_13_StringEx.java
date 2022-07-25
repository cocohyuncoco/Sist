package day0209;
//자주쓰는애들 모음
public class _13_StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		//String aa = String.valueOf(a); //문자형으로 변환가능
		String aa =a+""; //숫자+문자 하면 문자변환
		System.out.println(aa);
		
		char[] b= {'a','p','1','e'};
		String bb=String.valueOf(b);
		System.out.println(bb);
		
		String str="Happy my life!!";
		System.out.println(str.length());
		
		
		//substring(n) :n부터 끝까지
		//substring(m, n) :m~(n-1)까지 추출
		System.out.println(str.substring(6)); //my life!!
		System.out.println(str.substring(6, 9)); //my
		
		//문자 바꾸기
		String s1 = str.replace('a', '*');
		System.out.println(s1);
		
		String s2 = str.replace("Happy", "Wonderful");
		System.out.println(s2);
	
		
	}

}
