package day0208;

abstract class AbstEx1{
	abstract public void dataAdd();
	abstract public void dataList();
}
class SubAbst extends AbstEx1{

	@Override
	public void dataAdd() {
		// TODO Auto-generated method stub
		System.out.println("회원추가");
	}

	@Override
	public void dataList() {
		// TODO Auto-generated method stub
		System.out.println("회원 목록 출력");
	}
	
}

/////////////////////////////////
public class AbstAnonyEx_16 {
	//추상을 상속으로 받아도 되고 익명내부로 받아도된다
	//익명내부는 이벤트처리를 위한 방식
	
	//익명내부 클래스 형태로 
	AbstEx1 ab1 = new AbstEx1() {
		
		@Override
		public void dataList() {
			// TODO Auto-generated method stub
			System.out.println("데이터를 출력합니다");
		}
		
		@Override
		public void dataAdd() {
			// TODO Auto-generated method stub
			System.out.println("데이터를 추가합니다");
		}
	}; //<- ; 이 있으면 익명클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//상속받은 클래스
		AbstEx1 abs = null;
		abs = new SubAbst();
		abs.dataAdd();
		abs.dataList();
		
		//익명내부 클래스
		AbstAnonyEx_16 abs1 = new AbstAnonyEx_16();
		abs1.ab1.dataAdd();
		abs1.ab1.dataList();
		

	}

}
