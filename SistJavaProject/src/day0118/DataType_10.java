package day0118;

public class DataType_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아스키코드 A=65
		// 묵시적 형변환은 자동으로 결정되는것
		// string+int=string
		// double+int=double
		// long+short=long
		//char+int=int
		
		char a='A';
		System.out.println(a); //A
		System.out.println(a+32); //97
		System.out.println((char)(a+32)); //a
	
		//char는 내부적으로 아스키코드 값으로 인식
		
		System.out.println("Happy"+5+6);
		System.out.println("Happy"+(5+6));
		System.out.println('A'+3);
		System.out.println(2+'b');
		System.out.println('a'+'b'); //97+98=195
		
		//printf를 이용하는데 아스키 숫자로만 JAVA라고 출력
		System.out.printf("%c%c%c%c\n", 74, 65, 86, 65); // %c는 char(문자)
	}

}
