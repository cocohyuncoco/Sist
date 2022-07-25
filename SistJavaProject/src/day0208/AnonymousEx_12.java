package day0208;

//한번 이벤트 처리되면 바로 사라지기 때문에 이름조차 필요없다
//정의된 클래스에 이름이 없다 -> 익명클래스
//왜쓴다? 일회용
//이벤트 발생하고 끝나면 메모리에서 제거 된다


abstract class AbstEx{
	
	//abstract클래스는 일반메서드도 포함할수 있다
	abstract public void show(); 
}
class OutEx{
	
	//클래스 생성과 객체의 선언을 동시에 하는 이름없는 클래스(1회용)
	AbstEx ab = new AbstEx() {//이게 익명내부클래스
		
		@Override
		public void show() {//클래스처럼 안보이는데 클래스다
			// TODO Auto-generated method stub
			System.out.println("익명내부 클래스");
			
		}
	};
}
////////////////////////////////////
public class AnonymousEx_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//익명내부클래스를 어떻게 불러올까?
		
		OutEx ex = new OutEx();
		ex.ab.show();
	}

}
