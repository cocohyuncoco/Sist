package day0118;

public class EscapeSequence_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자열 내에서 특별한 의미로 해석: Escape Sequence라 한다
		// 모두 \로 시작함
		// \t: 다음 탭 위치로 이동
		// \n: 다음 줄로 이동
		// \': 소따옴표
		// \": 쌍따옴표, 대따옴표
		// \\: 역슬래쉬
		
		System.out.println("Apple\tOrange");
		System.out.println("\"Apple\"");
		System.out.println("\"Hello\"");
		System.out.println("C:\\");
		System.out.println("\"apple\",\"banana\",\"kiwi\"");
	}

}
