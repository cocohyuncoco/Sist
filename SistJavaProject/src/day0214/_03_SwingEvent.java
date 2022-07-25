package day0214;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _03_SwingEvent extends JFrame implements ActionListener{
	
	JButton btn1,btn2,btn3;
	
	//이미지 경로
	static final String ICON1 ="C:\\sist0117\\image\\swingimage\\img1.gif";
	static final String ICON2 ="C:\\sist0117\\image\\swingimage\\an08.gif";
	static final String ICON3 ="C:\\sist0117\\image\\swingimage\\chick.gif";
	
	public _03_SwingEvent(String title) {
		// TODO Auto-generated constructor stub
		super(title); //스윙제목
		this.setBounds(200, 100, 400, 300); //스윙창 크기		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스윙 창 닫기
		this.getContentPane().setBackground(new Color(255,217,236)); //스윙 배경색깔
		
		//디자인메서드호출
		initDesign();		
		
		this.setVisible(true); //스윙 디자인 보이게하기 
			
	}
	//디자인
	public void initDesign() {
		
		this.setLayout(null); //레이아웃 없애기
		
		//버튼1
		btn1 = new JButton("Hello");
		//크기위치
		btn1.setBounds(20, 30, 80, 30); //x,y,w,h
		//프레임추가
		this.add(btn1);
		
		//버튼2
		btn2 = new JButton("버튼2", new ImageIcon(ICON1));
		btn2.setBounds(20, 70, 100, 50);
		this.add(btn2);
		
		//버튼3
		btn3 = new JButton(new ImageIcon(ICON2));
		btn3.setBounds(150, 100, 150, 150);
		btn3.setPressedIcon(new ImageIcon(ICON3));
		this.add(btn3);
		
		//버튼에 액션이벤트 추가
		btn1.addActionListener(this); //이벤트객체와연결
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = (JButton)e.getSource();
		
		if (ob==btn1) {
			JOptionPane.showConfirmDialog(this, "안녕");
		}else if (ob==btn2) {
			JOptionPane.showConfirmDialog(this, "잘가");
		}else {
			JOptionPane.showConfirmDialog(this, "어디가게");
		}
		
	}

	
	///////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _03_SwingEvent("버튼이벤트연습#3");
		
	}
	
}
