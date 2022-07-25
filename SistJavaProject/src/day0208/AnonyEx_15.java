package day0208;

//익명클래스는 추상클래스를 통해 자주쓴다
abstract class AbstractEx{
	abstract public void play();
	abstract public void stop();
}
//////////////////////////
class Abst{//익명클래스

	AbstractEx ab = new AbstractEx() {
		
		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("게임을 멈춥니다");
		}
		
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("게임을 시작합니다");
		}
	};	
}

///////////////////////////
public class AnonyEx_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abst abst = new Abst();
		abst.ab.stop();
		abst.ab.play();
		
	}

}
