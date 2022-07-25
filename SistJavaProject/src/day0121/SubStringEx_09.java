package day0121;

public class SubStringEx_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "나는 강남 쌍용교육센터에서 자바를 공부중입니다";
		int i = str.length();
		
		//문자열에서 문자추출
		char ch = str.charAt(4);
		String word1 = str.substring(3);
		String word2 = str.substring(6, 12);
		
		System.out.println(ch); //남...빈칸도 index에 포함
		System.out.println(word1); //3번(강) 부터 끝까지 추출
		System.out.println(word2); //endindex는 n-1까지 추출
		System.out.println(i); // 문자열개수. 공백까지 포함
		
		
	}

}
