package day0210;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class _05_VectorBoard {

	//클래스로 지정을 했음으로 데이터를 꺼내고 받을때도 클래스
	List<Board> list = new Vector<Board>();
	
	//데이터입력
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		String name, subject, content;
		
		System.out.println("작성자명?");
		name = sc.nextLine();
		System.out.println("제목?");
		subject = sc.nextLine();
		System.out.println("내용?");
		content = sc.nextLine();
		
		//Board 생성
		//Board data = new Board(name, subject, content);
		//list.add(data);
		
		list.add(new Board(name, subject, content));
		System.out.println("현재데이터 갯수: "+list.size()+"개"); 
	}
	
	//데이터출력
	public void writeData() {
		System.out.println("**게시판**");
		System.out.println("-----------------------");
		
		for (int i=0;i<list.size();i++) {
			Board b = list.get(i); //리스트내 지정된 위치에있는 요소값 돌려줌
			System.out.println("No: "+(i+1)+"\t작성자: "+b.getName());
			System.out.println("제목: "+b.getSubject());
			System.out.println("내용: "+b.getContent());
			System.out.println("-----------------------");	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_05_VectorBoard vt = new _05_VectorBoard();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.println("1.추가 2.전체출력  9.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if (n==1) {
				vt.inputData();
			}else if (n==2) {
				vt.writeData();
			}else {
				System.out.println("종료합니다");
				break;
			}
			
		}

		
		
	}

}
