package day0208;

import java.util.Iterator;

abstract class GameC{
	
	abstract void play();
	abstract void stop();
}
//////////////////////////
class Nari extends GameC{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("������ ������ �����մϴ�");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ ������ �����մϴ�");
	}
}
//////////////////////////
class ara extends GameC{
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("�ƶ� ������ �����մϴ�");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("�ƶ� ������ �����մϴ�");
	}
}
//////////////////////////
class jongmin extends GameC{
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("�����̰� ������ �����մϴ�");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("�����̰� ������ �����մϴ�");
	}
}
public class ArrayOverrideEx_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�迭����
	
		GameC[] gc = new GameC[3]; //�迭�� ��ü����
		
		//������ �迭�� ��ü����
		
		gc[0] = new Nari();
		gc[1] = new ara();
		gc[2] = new jongmin();
		
		for (int i=0;i<gc.length;i++) {
			gc[i].play();
		}
		System.out.println("-------------------");
		for (int i=gc.length-1;i>=0;i--) {
			gc[i].stop();
		}
		
	}

}
