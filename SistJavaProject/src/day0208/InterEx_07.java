package day0208;

interface GameA{
	void play();
}
//////////////
interface GameB extends GameA{ 
	void stop();
}
////////////////////////
class MyGame implements GameB{//�������̽� ����

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playȣ��");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stopȣ��");
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
