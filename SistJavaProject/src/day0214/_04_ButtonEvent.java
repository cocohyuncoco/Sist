package day0214;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 버튼2개 가로로 생성할것
 * 1. 배경색변경_그린색
 * 2. 배경색변경_노란색
 * 
 * 이벤트는 익명내부클래스로 해보세요
 */
public class _04_ButtonEvent extends JFrame{

	JButton btn1, btn2;
		
	public _04_ButtonEvent(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 200, 155));
		
		//디자인메서드 호출
		initDesign();
		
		this.setVisible(true);
	}
	
	public void initDesign() {
		
		this.setLayout(new FlowLayout());

		//버튼1
		btn1=new JButton("배경색변경_그린");
		this.add(btn1);
		
		//익명내부클래스_이벤트
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().setBackground(Color.green);
				}
		});
		
		
		//버튼2
		btn2=new JButton("배경샥변경_맘대로");
		this.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().setBackground(Color.magenta);
			}
		});
		
		
	}
	


	////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _04_ButtonEvent("버튼이벤트 #4");
	}


	

}
