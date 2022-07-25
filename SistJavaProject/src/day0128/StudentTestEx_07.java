package day0128;

public class StudentTestEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 접근을 하려면 무조건 객체생성
		/*
		 * 클래스명 참조변수(내가만드는변수란뜻)명 = new 클래스명([값]); <-생성자호출
		 * -접근할때는
		 * 참조변수명.변수명; <- private는 접근안됨
		 * 참조변수명.메소드명; <-
		 * 
		 */

		Student07 stu1 = new Student07();

		//setter 메서드를 이용한 값 설정,수정
		stu1.setName("임현정");
		stu1.setAge(28);


		//getter메서드를 이용한 값 얻기
		String name = stu1.getName();
		int age = stu1.getAge();

		//출력
		System.out.println(name+","+age);

		//-----------------------
		//2번째 명시적 생성자를 통한 생성
		Student07 stu2 = new Student07("이다솔",23);

		//get메서드를 통한 출력
		System.out.println(stu2.getName());
		System.out.println(stu2.getAge());


	}

}
