package day0126;

import java.util.Iterator;

public class StringEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("string객체에 대한 멤버 메서드 공부합니다");
		
		String str1="apple";
		String str2="Apple";
		String str3="Have a Nice Day";
		String str4="    Happy Day    ";
		
		
		System.out.println("str3의길이 :"+str3.length());//공백까지 포함 몇 글자인지 보여줌
		System.out.println("str4의길이 :"+str4.length());//공백까지 포함 몇 글자인지 보여줌
		
		System.out.println("앞뒤 공백제거 str4의길이 :"+str4.trim().length());//공백제거 몇 글자인지 보여줌, 글자사이 공백은 글자로침
		
		System.out.println("*"+str4.trim()+"*"); //trim 자주씀
		
		System.out.println("str3에서 0번문자: "+str3.charAt(7));//숫자 입력하면 그 숫자 위치에있는 문자 보여줌

		System.out.println("str3에서 H의 인덱스: "+str3.indexOf('H'));//어떤 단어의 번호 값을 찾아서 보여줌
		System.out.println("str3에서 H의 인덱스: "+str3.indexOf('N'));//어떤 단어의 번호 값을 찾아서 보여줌
		
		System.out.println("str3에서 Have출력: "+str3.substring(0, 4));//0~4 까지 추출
		System.out.println("str3에서 Nice출력: "+str3.substring(7, 11));//7~10까지 추출
		
		
		//equals는 같으면 true,다르면 false
		System.out.println("문자열비교:"+str1.equals(str2));//fales
		System.out.println("문자열비교:"+str1.equalsIgnoreCase(str2));//true
		
		//a.compareTo(b) -오름차순, 내림차순 정렬 할때 자주씀★
		//a와 b가 같은경우 0
		//a가 작은경우 -(알파벳 차이만큼 마이너스값)
		//a가 큰경우 -(알파벳 차이만큼 플러스값)
		
		System.out.println(str1.compareTo(str2)); //a(97), A(65)
		System.out.println(str1.compareTo(str1)); //a(97), A(65)
		System.out.println("computer".compareTo("command")); //다똑같으면 순번에 따라서 p와m을 비교합니다
		System.out.println("hello".compareTo("hello"));
		System.out.println("apple".compareTo("banana"));
		System.out.println("kiwi".compareTo("orange"));
		System.out.println("홍".compareTo("차")); //홍이 차보다 큰 경우
		
		System.out.println("str3가 Have로 시작하면 true:"+str3.startsWith("Have"));
		System.out.println("str3가 Have로 시작하면 true:"+str3.startsWith("Happy"));
		
		System.out.println(str3.endsWith("Day"));//대,소문자 구분 true
		System.out.println(str3.endsWith("day"));//대,소문자 구분 false
		
		//문자열 분리하는 메서드 split <-많이쓰임★
		String str5="red,blue,green,yellow,pink,white";//<-split는 구분할게 있어야함★
		System.out.println("str5 를 컴마로 분리하여 출력하기");
		String[] arr=str5.split(","); //뭘 구분으로 문자열을 쪼갤거냐
		System.out.println(",로 구분된 색상개수:"+arr.length);
		
		//출력
		for (String color:arr) 
			System.out.println(color);
			
		System.out.println("str3의 소문자 출력:"+str3.toLowerCase()); //소문자출력 /잘안씀
		System.out.println("str3의 소문자 출력:"+str3.toUpperCase()); //대문자출력 /잘안씀
		
		String a=String.valueOf(100); //int였었던 100을 String화 시켜줌
		String b=String.valueOf(12.345); //double였었던 12.324을 String화 시켜줌
		System.out.println(a+b);//문자로변경 
		
		String a2=100+""; //String이됨 ★
		String b2=23.5+""; //String이됨
		System.out.println(a2+b2);//문자로변경
		
		System.out.println("문자열의 일부변경");
		System.out.println(str3.replace('a', '*'));//★
		System.out.println(str3.replace("Nice", "Wonderful"));
		
		
		
	}

}
