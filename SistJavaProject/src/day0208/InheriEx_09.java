package day0208;

import java.util.Scanner;

interface Command{
	
	//여기에는 상수와
	//추상클래스만 들어올수있따
	
	public void while2();
}
////////////////////////////////
class Insert2 implements Command{

	@Override
	public void while2() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 글을 추가합니다");
	}	
}
////////////////////////////////
class Modify2 implements Command{ //미구현메서드를 역시나 구현해야함

	@Override
	public void while2() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 글을 수정합니다");
	}
}
////////////////////////////////
class Delete2 implements Command{

	@Override
	public void while2() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 글을 삭제합니다");
	}
}
////////////////////////////////
class List2 implements Command{

	@Override
	public void while2() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 글을 출력합니다");
	}
}
////////////////////////////////
public class InheriEx_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Command comm = null; //다형성
		
		int n;
		
		
		
		exit: while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.출력 5~.종료");
			System.out.println("=============================");
			System.out.print("select==>");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				comm = new Insert2();
				break;
			case 2:
				comm = new Modify2();
				break;
			case 3:
				comm = new Delete2();
				break;
			case 4:
				comm = new List2();
				break;

			default:
				System.out.println("종료");
				break exit;
			}
			
			if (n<=4) {
				comm.while2(); //1,2,3,4
			}else {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
