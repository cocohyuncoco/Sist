package day0208;

interface GameA{
	void play();
}
//////////////
interface GameB extends GameA{ 
	void stop();
}
////////////////////////
class MyGame implements GameB{//인터페이스 구현

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play호출");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop호출");
	}
}
//////////////////////////
public class InterEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyGame mg = new MyGame();
		mg.play();
		mg.stop();
		System.out.println("--------------------");
		
		GameB gb = null;
		gb = new MyGame();
		gb.play();
		gb.stop();
		
	}

}
