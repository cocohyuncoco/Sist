package day0119;

public class CastArgsTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Q이름 최지우
		 * JAVA점수: 88
		 * JSP점수: 99
		 * 합계: 187
		 */
		
		//1. 변수...매개변수 args를 이용한 변수 _ name,java,jsp
		String name="최지우";
		int java=Integer.parseInt(args[0]);
		int jsp=Integer.parseInt(args[1]);

		//2. 계산..tot
		int tot = java+jsp;
		
		//3. 출력
		System.out.println("이름: "+name);
		System.out.println("JAVA점수: "+java);
		System.out.println("JSP점수: "+jsp);
		System.out.println("합계: "+tot);
		
		
	}

}
