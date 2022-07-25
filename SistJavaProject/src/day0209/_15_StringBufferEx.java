package day0209;

public class _15_StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자열저장, 편집기능이 추가된 자료형
		StringBuffer sb = new StringBuffer();
		
		sb.append("Happy");
		sb.append("Nice");
		sb.append(200);
		sb.append(3.14);
		sb.append('A');
		System.out.println(sb);
		
		sb.insert(5, "Apple"); //5번 인덱스 앞에 Apple 추가
		System.out.println(sb);
		
		sb.delete(5, 10); //5~9까지가 삭제
		System.out.println(sb);
		
		sb.replace(5, 9, "Angel"); //5~8번까지를 Angel로 대체
		System.out.println(sb);
	}

}
