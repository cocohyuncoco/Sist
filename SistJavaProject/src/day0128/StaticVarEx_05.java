package day0128;


//스테틱 테스트
class InstCnt{

	static int instNum;

	//생성자
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스생성: "+instNum);

	}
}
////////////////////////////////////
public class StaticVarEx_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstCnt cnt1= new InstCnt();
		InstCnt cnt2= new InstCnt();
		InstCnt cnt3= new InstCnt();
		//이렇게 3개를 생성해도 얘네는 공간을 공통으로 갖는다. 각각X




	}

}

