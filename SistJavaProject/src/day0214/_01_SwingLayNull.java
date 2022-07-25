package day0214;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _01_SwingLayNull extends JFrame{
	
	JButton btn1, btn2;
	
	public _01_SwingLayNull(String title) {
		// TODO Auto-generated constructor stub
		super(title); //스윙제목
		this.setBounds(200, 100, 400, 300); //스윙창 크기		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스윙 창 닫기
		this.getContentPane().setBackground(new Color(255,217,236)); //스윙 배경색깔
		
		//디자인메서드호출
		initDesign();
	
		//스윙 디자인 보이게하기
		this.setVisible(true); 
	}
	
	
	//디자인 메서드
	public void initDesign() {
		
		this.setLayout(null);
		
		btn1=new JButton("◁");
		btn2=new JButton("▷");
		
		this.add(btn1);
		this.add(btn2);
		
		//버튼의 위치및 크기 직접지정
		btn1.setBounds(50, 100, 80, 30);
		btn2.setBounds(150, 100, 80, 30);
	
		//익명 내부클래스 이벤트
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//JOptionPane.showMessageDialog(rootPane, "왼쪽으로 이동");
				JOptionPane.showMessageDialog(getContentPane(), "왼쪽으로 이동");
				
			}
		});
	
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(rootPane, "으론쪽으로 이동");
				//JOptionPane.showMessageDialog(getContentPane(), "오른쪽으로 이동");
			}
		});
	}
	
	///////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _01_SwingLayNull("맘대로 레이아웃 연습");
		
	}
	

}
