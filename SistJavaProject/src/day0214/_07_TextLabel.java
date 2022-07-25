package day0214;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class _07_TextLabel extends JFrame{

	Container cp;
	
	JTextField text1, text2;
	JLabel label1, label2, label3, label4, lblResult;
	Icon icon1 = new ImageIcon("C:\\sist0117\\image\\swingimage\\an07.gif");
	Icon icon2 = new ImageIcon("C:\\sist0117\\image\\swingimage\\an08.gif");
	
	JButton btnResult;
	
	public _07_TextLabel(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,200,155));
		
		//디자인메서드 호출
		initDesign();
		this.setVisible(true);
		
		
	}
	
	
	public void initDesign() {
		
		this.setLayout(null);
		
		text1=new JTextField();
		text1.setBounds(10,20,90,30);
		this.add(text1);
		
		text2=new JTextField("Have a Nice Day!!");
		text2.setBounds(10,60,150,30);
		this.add(text2);
		
		label1=new JLabel("안녕하세요", JLabel.CENTER);
		label1.setBounds(10,100,200,30);
		label1.setBackground(Color.gray);
		label1.setOpaque(true);  //불투명 모드..라벨에서 적용
		this.add(label1);
		
		label2=new JLabel("Today", icon1, JLabel.RIGHT);
		label2.setBounds(10,150,200,30);
		//Bodrder 인터페이스 구현한 LineBorder, TitleBorder
		label2.setBackground(Color.red);
		this.add(label2);
		
		label3=new JLabel("스윙공부중", icon2, JLabel.CENTER);
		label3.setBounds(10,210,200,50);
		label3.setBorder(new TitledBorder("SIST"));
		this.add(label3);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		
		label4=new JLabel(sdf.format(new Date()), icon1, JLabel.CENTER);
		label4.setBounds(10,260,200,50);
		label4.setBorder(new LineBorder(Color.pink,5));
		this.add(label4);
		
		//결과라벨
		lblResult = new JLabel("결과나오는곳", icon1, JLabel.CENTER);
		lblResult.setBounds(250,100,200,70);
		lblResult.setBorder(new TitledBorder("결과확인"));
		this.add(lblResult);
		
		//버튼
		btnResult = new JButton("확인");
		btnResult.setBounds(300, 200, 70, 30);
		this.add(btnResult);
		
		//확인버튼 누를때 이벤트..익명내부 클래스
		btnResult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String s = text1.getText();
				String s1 = text2.getText();
				lblResult.setText(s);
				
			}
		});
}
	
////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _07_TextLabel("텍스트 라벨 연습#7");
	}

}
