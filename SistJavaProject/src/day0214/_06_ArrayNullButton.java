package day0214;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _06_ArrayNullButton extends JFrame{

	Container cp;
	//배열버튼
	JButton[] btn = new JButton[6];
	//색상배열
	Color[] colors = {Color.blue, Color.yellow, Color.pink, Color.gray, Color.magenta, Color.cyan};
	String[] text = {"파랑","노랑","핑크","회색","핫핑크","연블루"};

	
	public _06_ArrayNullButton(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		cp=this.getContentPane();
		this.setBounds(200,100,400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,200,155));
		
		
		//디자인메서드 호출
		initDesign();
		this.setVisible(true);
	
	}

	public void initDesign() {
		
		//레이아웃 없애기
		this.setLayout(null);

		//시작위치 지정
		int top=20;
		
		//각각의 버튼 생성, 위치및 크기
		for (int i=0;i<btn.length;i++) {
			
			//버튼6개
			btn[i]=new JButton(text[i]);
			
			//위치, 크기
			btn[i].setBounds(20, top, 90, 30);
			top+=40; //세로 40씩 증가
			
			//배열 색상대로 버튼색 지정
			btn[i].setBackground(colors[i]);
			
			//프레임에 추가
			this.add(btn[i]);
			
			//내부클래스 버튼이벤트 발생
			btn[i].addActionListener(new MyButton());
			
			int index=i;
			
			//각각의 버튼에 익명내부클래스 적용
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					cp.setBackground(colors[index]);
				}
			});
			
		}
		
	}
	
	//버튼 이벤트에 대한 내부 클래스
	class MyButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Object ob=e.getSource();
			
			for (int i=0;i<btn.length;i++) {
				
				if (ob==btn[i]) {
					cp.setBackground(colors[i]);
				}
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new _06_ArrayNullButton("레이아웃없이 배열버튼 연습#6");
		
	}

}
