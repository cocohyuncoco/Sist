package day0217;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class _07_SeriaShop {

	//리스트를 뽑을땐 ArrayList를 가장 많이쓴다
	//클래스를 담겠다.
	ArrayList<_07_Shop> list = new ArrayList<_07_Shop>();
	Scanner sc = new Scanner(System.in);
	
	//키보드로 입력하면 list추가
	public void addShop() {
		
		System.out.println("상품명은?");
		String sang = sc.nextLine();
		System.out.println("수량은?");
		int su = Integer.parseInt(sc.nextLine());
		System.out.println("단가는?");
		int dan = Integer.parseInt(sc.nextLine());
		
		//shop객체 생성
		_07_Shop s = new _07_Shop(sang, su, dan);
		
		//리스트에 추가
		list.add(s);
		
		System.out.println(list.size()+"번째 상품이 추가되었습니다");
	}
	
	
	
	//list를 파일에 저장...직렬화 이용
	public void whiteFile() {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream("C:\\sist0117\\javawork\\shop0217.txt");
			oos = new ObjectOutputStream(fos);
			
			//파일에 오브젝트 통채로 저장
			oos.writeObject(list); //담아놓은 리스트 넣기
			System.out.println("**파일에 list 전체를 저장하였습니다**");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	//메인에서 호출되는 메서드
	public void process() {
		
		while (true) {
			
			System.out.println("1.Shop정보추가 2.전체목록파일에 저장 3.종료");
			int n=Integer.parseInt(sc.nextLine());
			
			switch (n) {
			case 1:
				addShop();
				break;
			case 2:
				whiteFile();
				break;
			default:
				System.out.println("시스템을 종료합니다");
				System.exit(0);
				break;
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_07_SeriaShop se = new _07_SeriaShop();
		se.process();
	}

}
