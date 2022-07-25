package day0128;

public class MemoryCount_04 {

	//int count=0;
	static int count=0;

	//생성자.. 클래스명
	public MemoryCount_04() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemoryCount_04 mc1 = new MemoryCount_04();
		MemoryCount_04 mc2 = new MemoryCount_04();
		//인스턴스 변수들은 각각 서로 다른 메모리를 가지므로 인스턴스는 카운트가 증가하지 않는다 1,1

		//static 변수는 공용으로 가지므로 카운트 증가한다 1,2,3




	}

}

