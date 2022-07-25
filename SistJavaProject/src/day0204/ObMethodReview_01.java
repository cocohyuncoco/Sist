package day0204;


class Mango{
	//멤버 클래스에서는 실제로 이렇게 둔다
	//멤버 클래스에서는 변수선언,세터,게터
	
	private String writer;
	private String subject;
	private static String mes="Happy Friday!!";
	
	//게터, 세터
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public static String getMes() {
		return mes;
	}
	public static void setMes(String mes) {
		Mango.mes = mes;
	}
	
	
	
}
//////////////////////////////
public class ObMethodReview_01 {

	// Mango 클래스의 변수값을 출력하기 위한 메서드
	
	public static void writMango(Mango m) { //m이라는 참조변수를 통해서 불러오기
		
		System.out.println("**망고클래스 출력**");
		System.out.println("작성자: "+m.getWriter()); // 참조변수를 통해서 불러올 수밖에 없다.
		//System.out.println("이름: "+Mango.getMes()); // 이렇게하면 mes밖에 안불러온다.
		System.out.println("제목: "+m.getSubject());
		
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//망고클래스 mes 호출
		//static 메서드도 static 변수처럼 클래스명으로 호출합니다
		
		System.out.println(Mango.getMes());
		
		Mango m1 = new Mango();
		m1.setWriter("임현정"); //set으로 수정
		m1.setSubject("오늘은 즐거운 금요일");
		
		Mango m2 = new Mango();
		m2.setWriter("곽경태");
		m2.setSubject("안녕~~");
		
		//같은 클래스의 static 메서드 호출은 클래스명 생략 가능하다.
		writMango(m1);
		writMango(m2);
		
		
	}

}
