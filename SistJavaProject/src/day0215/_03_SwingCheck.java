package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class _03_SwingCheck extends JFrame implements ActionListener,ItemListener{
	
	Container cp;
	
	JCheckBox cbDriver, cbBold; //운전면허여부, 결과값 굵게
	JCheckBox[] cbctiy = new JCheckBox[4];
	
	JButton btnOK; //버튼이벤트
	
	JLabel lblResult; //결과출력
	
	
	public _03_SwingCheck(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(100,100,420,420);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,255,155));
		
		setDesign();
		this.setVisible(true);
	}
	
	//디자인 메서드
	public void setDesign() {
		
		this.setLayout(null);
		
		//면허여부
		cbDriver = new JCheckBox("운전면허");
		cbDriver.setOpaque(false); // 체크박스 기존 못생긴 디자인 없앰
		cbDriver.setBounds(20, 20, 100, 30);
		this.add(cbDriver);
		cbDriver.addItemListener(this); //아이템리스너 객체추가
		
		//폰트굵게
		cbBold = new JCheckBox("라벨을 굵게");
		cbBold.setBounds(20, 60, 150, 30);
		cbBold.setOpaque(false);
		this.add(cbBold);
		cbBold.addItemListener(this); //아이템리스너 객체추가 
		
		//결과라벨
		lblResult = new JLabel("결과출력 하는곳", JLabel.CENTER);
		lblResult.setBounds(20, 250, 350, 50);
		lblResult.setBorder(new LineBorder(Color.pink, 5));//선 색깔, 선 굵기
		this.add(lblResult);


		//체크박스
		String [] ctiy = {"프라하","도쿄","빈","시드니"};
		int xpos = 20;
		
		for (int i=0;i<cbctiy.length;i++) {
			
			cbctiy[i] = new JCheckBox(ctiy[i]);
			cbctiy[i].setBounds(xpos, 100, 80, 30);
			cbctiy[i].setOpaque(false);
			this.add(cbctiy[i]);
			xpos+=80;
		}
		
		//버튼
		btnOK = new JButton("가보고 싶은 도시 알아보기");
		btnOK.setBounds(100, 180, 200, 30);
		this.add(btnOK);
		btnOK.addActionListener(this);
	}
	//디자인 메서드 END
	
	//운전면허, 라벨굵기 이벤트
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		if (ob==cbDriver) {
			String s ="체크상태: "+cbDriver.isSelected()+", 텍스트:"+cbDriver.getText();
			lblResult.setText(s);	
		}else if (ob==cbBold) {
			
			if (cbBold.isSelected()) {
				lblResult.setFont(new Font("",Font.BOLD,20));
			}else {
				lblResult.setFont(new Font("",Font.PLAIN,12));
			}
		}
	}

	//버튼이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		int select=0;
		String s="내가 가고싶은 도시는 ";
		
		for (int i=0;i<cbctiy.length;i++) {
			
			if (cbctiy[i].isSelected()) {
				select++;
				s += "["+cbctiy[i].getText()+"]";
			}
		}
		
		if (select==0) {
			s = "저는 가고싶은 도시가 없네요";
		}else {
			s +=" 를 가고싶어요";
		}
		
		//라벨에 출력
		lblResult.setText(s);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _03_SwingCheck("여러가지 체크박스 연습#3");
	}
}
