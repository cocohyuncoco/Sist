package book;

/*
 * 참조변수의 형변환
 * 기본형변수와 같이 참조변수도 형변환이 가능하다, 단
 * 
 * 1. 자손타입 -> 조상타입 (Up-casting) 업캐스팅 : 형변환 생략가능
 * 2. 자손타입 <- 조상타입 (Down-casting) 다운캐스팅 : 형변환 생략불가
 * 으로 바꾸는 형 변환만 가능하다
 * 
 * 모든 참조변수는 모든 클래스의 조상인 Object클ㄹ래스 타입으로 형변환이 가능하다
 * 
 * 기본형 변수의 형변환에서 작은 자료형에서 큰 자료형의 형변환은 생략가능 하듯이
 * 참조형 변수의 형변환에서는 자손타입의 참조변수를 조상타입으로 향변환하는 경우에는 형변환을 생략할수있다
 * 
 * 쓰는법은?
 * 참조변수간의 형변환 역시 캐스트연산자를 사용 하며
 * 괄호()안에 변환하고자 하는 타입의 이름(클래스명)을 적어주면 된다
 */
import day0128.Card;

class Car{//부모클래스 차
	String color;
	int door;
	
	public void drive() { //운전하는기능
	System.out.println("drive, brrrr~");
	}
	
	public void stop() { //멈추는기능
		System.out.println("stop!!!!!!");
		}
}

 class FireEngine extends Car{ //자식클래스 //소방차
	 public void water() { //물뿌리는기능
		 System.out.println("watar!!!!!!");
			}
 }
/////////////////////////////
public class Chap359_7_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Car car=null;
		Car car;
		
		FireEngine fe = new FireEngine();
		fe.water();
		car = fe; // car=(Car)fe; 에서 형변환이 생략된 상태다
		//car.water(); <-컴파일에러. Car타입의 참조변수로는 water을 불러올수없다.water();는 자식클래스에 있기때문에
				
		
		//FireEngine fe2 = null;
		FireEngine fe2;		
		fe2=(FireEngine)car; //자손타입 <- 조상타입 : 다운캐스팅은 이렇게 꼭 써줘야 가능
		fe2.water();
		
		
		
		
	}

}
