package TEST;

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
public class _01_test extends JFrame{

	JButton btn1, btn2;
	
	
	public _01_test(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(100,100,800,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.white);
		
		setDesign();
		
		this.setVisible(true);
	}
	

	public void setDesign() {
		
		this.setLayout(new FlowLayout(FlowLayout.RIGHT,30,40)); 
		//FlowLayout 배치관리자 
		//컴포넌트 왼쪽배치, 컴포넌트좌우간격 30, 컴포넌트 상하간격 40
		
		btn1 = new JButton("그린색으로 배경변경");
		this.add(btn1);
		
		btn2 = new JButton("노란색으로 배경변경");
		this.add(btn2);

		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				getContentPane().setBackground(Color.green);
			}
		});


		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().setBackground(Color.yellow);
			}
		});

		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _01_test("버튼이벤트 테스트");
		
	}

}
