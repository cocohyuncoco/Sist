package day0214;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _02_SwingIconButton extends JFrame{

	//각각의 이미지 아이콘 가져오기
	ImageIcon icon1=new ImageIcon("C:\\sist0117\\image\\jquery_img\\01.png");
	ImageIcon icon2=new ImageIcon("C:\\sist0117\\image\\jquery_img\\02.png");
	ImageIcon icon3=new ImageIcon("C:\\sist0117\\image\\jquery_img\\03.png");
	ImageIcon icon4=new ImageIcon("C:\\sist0117\\image\\jquery_img\\04.png");
	
	ImageIcon icon5=new ImageIcon("C:\\sist0117\\image\\swingimage\\leftDown.gif");
	ImageIcon icon6=new ImageIcon("C:\\sist0117\\image\\swingimage\\LEFT.GIF");
	
	JButton btn1,btn2,btn3,btn4;
	
	public _02_SwingIconButton(String title) {
		// TODO Auto-generated constructor stub
		super(title); //스윙제목
		this.setBounds(200, 100, 400, 400); //스윙창 크기		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스윙 창 닫기
		this.getContentPane().setBackground(new Color(255,217,236)); //스윙 배경색깔
		
		//디자인메서드호출
		initDesign();
		
		
		this.setVisible(true); //스윙 디자인 보이게하기 
			
	}
	//디자인
	public void initDesign() {
		
		// this.setLayout(null); <-필요에따라 텍스트창, 체크박스창 만드는 null을 가장 많이쓰게 될거다
		
		//레이아웃
		this.setLayout(new GridLayout(2, 2)); //버튼을 2행 2열로 배치하겠다
		
		//버튼1
		btn1 = new JButton("hello", icon1);
		btn1.setHorizontalTextPosition(JButton.CENTER); //텍스트 가로위치
		btn1.setVerticalTextPosition(JButton.TOP); //텍스트 세로위치
		this.add(btn1);
		
		btn1.setRolloverIcon(icon4); //마우스 올렸을때 이벤트
		btn1.setPressedIcon(icon5); //마우스 클릭했을때 이벤트
		
		//버튼2
		btn2 = new JButton(icon2);
		btn2.setPressedIcon(icon6);
		
		this.add(btn2);
		
		//버튼2
		btn3 = new JButton(icon3);
		this.add(btn3);
				
		//버튼2
		btn4 = new JButton("Hi", icon4);
		this.add(btn4);
		
		
		
		
	}
	
	
	//////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _02_SwingIconButton("버튼아이콘 연습");
		
	}

}
