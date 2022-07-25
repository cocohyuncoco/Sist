package day0208;

import java.util.Scanner;

//게시판로직을 굉장히 많이 만들게된다. 게시판 안에는 모든 로직이있다
abstract class Board{ //일반메서드도 가질수있다
	
	public abstract void process(); //몸통부가 없는 미완의 메서드 	
}
/////////////////////////
class List extends Board{

	@Override
	public void process() { //추상클래스를 상속받으면 이렇게 미완의메서드 오버라이딩 받아야한다
		// TODO Auto-generated method stub
		System.out.println("게시판의 글을 출력합니다");
	}
	
}
/////////////////////////
class write extends Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("게시판의 글을 작성합니다");
	}
	
}
/////////////////////////
class Update extends Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("게시판의 글을 수정합니다");
	}
	
}
/////////////////////////
class Delete extends Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("게시판의 글을 삭제합니다");
	}
	
}
//////////////////////////////////////////////////
public class AbstEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//추상클래스의 목적은 오버라이딩이다. 대신 일반 메서드도 가질수있다. 인터페이스와의 차이점
		
		//Board bo = new Board(); 추상클래스는 new로 객체생성이 안된다. 다형성생성 밖에 안됨
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		Board bo = null;
		
		while (true) {
			System.out.println("1.글작성 2.글출력 3.수정 4.삭제 9.종료");
			num=sc.nextInt();
			switch (num) {
			case 1:
				bo=new write();
				break;
			case 2:
				bo=new List();
				break;
			case 3:
				bo=new Update();
				break;
			case 4:
				bo=new Delete();
				break;	
			default:
				System.out.println("종료합니다");
				System.exit(0); //강제종료 
				break;
			}
			
			bo.process(); //생성한거에 맞춰 호출
		}
		
				
		
		
	}

}
