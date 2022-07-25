package day0214;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _05_SwingArrayButton extends JFrame implements ActionListener{

	JButton[] btn = new JButton[6];
	String[] btnLabel = {"Red","Cyan","Magenta","Yellow","Gray","Blue"};
	Color[] btnColor = {Color.RED,Color.CYAN,Color.magenta,Color.yellow,Color.gray,Color.blue};
	
	public _05_SwingArrayButton(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255,200,155));
		
		//디자인메서드호출
		initDesign();
		
		this.setVisible(true);
	
	}
	
	public void initDesign() {
		
		//패널생성..기본이 Flow레이아웃
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);
		this.add(panel, BorderLayout.NORTH); //프레임에 상단에 패널배치
		
		//버튼생성
		for (int i=0;i<btn.length;i++) {
			//버튼 6개 생성
			btn[i] = new JButton(btnLabel[i]);
			//버튼6개 라벨에 맞게 색상변경
			btn[i].setBackground(btnColor[i]);
			//버튼6개는 패털에 추가
			panel.add(btn[i]);
			//버튼6개 이벤트 추가
			btn[i].addActionListener(this);
		}
		
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob=e.getSource();
		
		for (int i=0;i<btn.length;i++) {
			
			if (ob==btn[i]) {
				//프레임의 배경색 변경
				getContentPane().setBackground(btnColor[i]);
				//창제목을 변경:Color:Red
				this.setTitle("Color:"+btnLabel[i]);
			}
			
		}
		
	}
	
	
	///////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _05_SwingArrayButton("스윙 배열 연습#5");
		
	}

	

}
