package day0207_1;

import java.awt.geom.Arc2D.Float;

import day0207.Apple_09;
import day0207.Banana_09;
import day0207.Fruit_09;
import day0207.Orange_09;

public class FruitTest_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*#1_자식클래스 참조변수 = new 자식클래스();
		Apple_09 app = new Apple_09();
		Orange_09 ora = new Orange_09();
		Banana_09 ban = new Banana_09();
		
		app.showMessage();
		ora.showMessage();
		ban.showMessage(); 
	 	*/
		//이럴때의 단점은 다 연결된 애들인데 자식이 3이다 보니 참조변수도 3이게됨
		//참조변수 다 써줘야해서 불편할때가있다

		//#2_<다형성처리>
		//같은 자식변수에게 하나의 참조변수를 주는것 = 다형성
		//다형성은 하나의 변수로 여러가지 일을 처리할때 이용
		//다형성은 하위클래스로 생성
		//(부모클래스명) (참조변수명)=new (자식클래스명)();
		
		Fruit_09 fruit;
		
		fruit=new Apple_09();
		fruit.showMessage();
		
		fruit=new Orange_09();
		fruit.showMessage();
		
		fruit=new Banana_09();
		fruit.showMessage();
		
	}

}
