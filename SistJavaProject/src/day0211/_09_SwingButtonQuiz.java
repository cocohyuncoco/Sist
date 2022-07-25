package day0211;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _09_SwingButtonQuiz extends JFrame implements ActionListener{

	JButton btn1,btn2;
	
	public _09_SwingButtonQuiz(String title) {
		
		super(title);
		
		this.setBounds(200, 200, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.gray);
		
		
		
		//디자인메서드 호출
		//initDesign
		initDesign();
		
		
		this.setVisible(true);
	}
	
	public void initDesign() {
		
		this.setLayout(new FlowLayout());
		
		btn1=new JButton("◀");
		btn2=new JButton("▶");
	
		this.add("South", btn1);
		this.add("South", btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		btn1.setBackground(Color.black);
		btn2.setBackground(Color.black);
		
		btn1.setForeground(Color.white);
		btn2.setForeground(Color.white);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		if (ob==btn1) {
			JOptionPane.showConfirmDialog(this, "왼쪽페이지");
		}else {
			JOptionPane.showConfirmDialog(this, "오른쪽페이지");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _09_SwingButtonQuiz("버튼퀴즈");		
	}

	

}
