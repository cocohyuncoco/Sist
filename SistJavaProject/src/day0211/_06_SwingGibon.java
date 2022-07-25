package day0211;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class _06_SwingGibon extends JFrame{
	//스윙을 하려면 무조건 JFrame의 상속을 받아야한다
	
	Container cp;
	
	public _06_SwingGibon(String title) {
		// TODO Auto-generated constructor stub
		super(title); //JFrame 부모생성자를 통해서 창제목 보내기 
		
 
		cp = this.getContentPane(); //프레임 위에 기본패널
		
		//메인프로그램 종료될때 프로그램도 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//내부클래스 호출해보자 (JFrame)
		//this.addWindowListener(new Winclose());
		
		
		//this가 의미하는건 JFrame이다
		this.setBounds(200, 200, 500, 500); //시작위치가로, 시작위치세로, 가로길이, 세로길이
		//cp.setBackground(new Color(255,255,200));
		cp.setBackground(Color.WHITE); //static 상수를 이용한 색변경
		this.setVisible(true); //프레임 보이게
		
	}
	
	//윈도우 크로징  /내부클래스
	class Winclose extends WindowAdapter{
		//상속을 또 받고싶을때 내부클래스를 쓴다
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			System.exit(0); //프로그램종료
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//_06_SwingGibon sw = new _06_SwingGibon("스윙기본연습");
		//스윙에서는 참조변수를 통해서 뭘 부를일이없다. 그래서 필요없음
		new _06_SwingGibon("스윙기본연습"); //이렇게만 써줘도 된다
		
		
	}

}
