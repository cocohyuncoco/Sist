package day0207_1;

public class TestObj_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3개의 인스턴스변수를 생성해서 메서드를 호출할 건데
		//자식이 부모꺼 가져갔으니 자식걸 생성해야해
		
		//자식 생성자호출
		//자식 생성자 호출하면 부모클래스가 먼저 호출되고 자식이 온다
		//super(name, age); 때문에
		SubObj_03 sub = new SubObj_03("이효리", 33, "제주도 애월읍");
		//이름,나이가 부모님한테 받은거
		//주소가 내가 만든거
		
		
		
		//자식 참조변수.출력메서드 호출
		sub.whileData();
	}

}
