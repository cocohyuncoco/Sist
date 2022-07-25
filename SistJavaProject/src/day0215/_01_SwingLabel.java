package day0215;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class _01_SwingLabel extends JFrame implements ActionListener{
	
	Container cp;
	
	JLabel[] lblLabel = new JLabel[9];
	String[] str = {"핀란드","한국","미국","태국","중국","일본","프랑스","오스트레일리아","터키"};
	
	JButton btnOK;
	
	public _01_SwingLabel(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(100,100,600,600);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,255,155));
		
		setDesign();
		this.setVisible(true);
	}

	public void setDesign() {
	
		//프레임에 패널 먼저 올리기 //컨테이너를 바로 올릴건지 패널을 올릴건지 선택해서 하기
		Panel pCenter = new Panel(new GridLayout(3, 3));
		this.add(pCenter, BorderLayout.CENTER);
		
		//라벨을 패널에 추가 (배열로 만들었으니 for문으로)
		for (int i=0;i<lblLabel.length;i++) {
			
			//9개의 라벨 먼저 생성
			lblLabel[i] = new JLabel(str[i], JLabel.CENTER);
			
			//R,G,B 컬러지정 0~255 랜덤수 
			int r=(int)(Math.random()*256); //0~255
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			
			//라벨 배경색 주기//라벨은 투명도도 해야한다
			lblLabel[i].setBackground(new Color(r, g, b));
			//글꼴
			lblLabel[i].setFont(new Font("궁서체", Font.BOLD, 15));
			//불투명도
			lblLabel[i].setOpaque(true);
			//★ 패널에 올리기 ★
			pCenter.add(lblLabel[i]);
			
		}//라벨을 패널에 추가 END
		
		//버튼생성
		btnOK = new JButton("라벨색상 변경");
		//이벤트가 발생할 버튼
		this.add(btnOK, BorderLayout.SOUTH);		
		//★ 버튼이 이벤트 객체라는거 표시 ★
		btnOK.addActionListener(this);
	}
	
	//이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<lblLabel.length;i++) {
			
			
			//R,G,B 컬러지정 0~255 랜덤수 
			int r=(int)(Math.random()*256); //0~255
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			
			//라벨 배경색 주기//라벨은 투명도도 해야한다
			lblLabel[i].setBackground(new Color(r, g, b));
		
			
		}
	}//이벤트 END

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _01_SwingLabel("패널 랜덤");
	}


	
}
