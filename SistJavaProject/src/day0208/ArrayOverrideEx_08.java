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
		System.out.println("나리가 게임을 시작합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("나리가 게임을 종료합니다");
	}
}
//////////////////////////
class ara extends GameC{
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("아라가 게임을 시작합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("아라가 게임을 종료합니다");
	}
}
//////////////////////////
class jongmin extends GameC{
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("정민이가 게임을 시작합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("정민이가 게임을 종료합니다");
	}
}
public class ArrayOverrideEx_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열선언
	
		GameC[] gc = new GameC[3]; //배열로 객체선언
		
		//선언한 배열로 객체생성
		
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
