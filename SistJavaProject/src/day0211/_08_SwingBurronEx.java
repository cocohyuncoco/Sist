package day0211;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _08_SwingBurronEx extends JFrame implements ActionListener{	
	
	Container cp;
	JButton btn1,btn2,btn3;
	
	public _08_SwingBurronEx(String title) {
	
		cp=this.getContentPane();
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(Color.WHITE);
		
		
		initDesign();
		//디자인메서드 호출(얘를 써야 보여짐)
		this.setVisible(true);
	}
	
	//디자인메서드
	public void initDesign() {
		
		//버튼은 레이아웃 생략시_보더레이아웃
		//1. 레이아웃 변경해서 생성
		this.setLayout(new FlowLayout()); //옆으로 쭉 나열하는 메서드
		
		//버튼생성
		btn1=new JButton("글쓰기");
		btn2=new JButton("수정");
		btn3=new JButton("삭제");
		
		//★ 프레임에 추가 ★ 
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		//이벤트발생_이벤트 핸들러메서드와 이벤트 발생 객체연결
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		//버튼속성
		//1. 버튼배경색
		btn1.setBackground(new Color(122,201,247));
		btn2.setBackground(new Color(170,243,104));
		btn3.setBackground(new Color(247,122,122));
		//2. 버튼글씨색
		btn1.setForeground(new Color(52,52,52));
		btn2.setForeground(new Color(52,52,52));
		btn3.setForeground(new Color(52,52,52));
		
	}
	
	//액션이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//이벤트가 발생한 컴포넌트를 object로 부터 얻어온다
		Object ob = e.getSource();
		
		//JOptionPane.showMessageDialog(this, "클릭");
				
		//버튼의 어떤 메서드를 호출하는지 정확하게 지정
		//정확하게 해줄려니까 조건문 줘야함
		if (ob==btn1) {
			JOptionPane.showConfirmDialog(this, "글쓰기 하시겠습니까?");
		}else if (ob==btn2) {
			JOptionPane.showConfirmDialog(this, "수정 하시겠습니까?");
		}else {
			JOptionPane.showConfirmDialog(this, "삭제 하시겠습니까?");
		}
				
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_08_SwingBurronEx sw = new _08_SwingBurronEx("버튼연습_08");
		
	}

	

}
