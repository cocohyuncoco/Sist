package day0214;
/*
 * 2개의 텍스트와 한개의 버튼을 만든 후 
 * 각각의 텍스트에 숫자를 넣고 버튼을 클릭하면 라벨에
 * 10+20=30.. 요렇게 출력되게 해주세요
 * 
 * 라벨은 타이틀보더 (제목은 결과확인)
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class _08_QuizSwing0214 extends JFrame implements ActionListener{
	
	Container cp;
	
	JLabel lblResult;
	JTextField tfSu1, tfSu2;
	JButton btnAdd;
	
	Icon icon1 = new ImageIcon("");
	Icon icon2 = new ImageIcon("");

	
	public _08_QuizSwing0214(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,200,155));
		
		//디자인메서드 호출
		initDesign();
		this.setVisible(true);
	
	}
	
	public void initDesign() {
		
		this.setLayout(null); //기본 레이아웃 없애고 직접 지정할경우 사용
		
		JLabel lbl1 = new JLabel("숫자1");
		JLabel lbl2 = new JLabel("숫자2");
		lbl1.setBounds(20,20,50,30);
		this.add(lbl1);
		
		lbl2.setBounds(20,60,50,30);
		this.add(lbl2);
		
		tfSu1=new JTextField();
		tfSu1.setBounds(70,20,60,30);
		this.add(tfSu1);
		
		tfSu2=new JTextField();
		tfSu2.setBounds(70,60,60,30);
		this.add(tfSu2);
		
		btnAdd=new JButton("숫자더하기", icon1);
		btnAdd.setBounds(30, 110, 150, 40);
		this.add(btnAdd);
		
		lblResult = new JLabel("결과나오는곳",icon2,JLabel.CENTER);
		lblResult.setBounds(10, 170, 250, 60);
		lblResult.setBorder(new TitledBorder("결과확인"));
		
		//글꼴변경
		lblResult.setFont(new Font("", Font.BOLD, 20));
		this.add(lblResult);
		
		//버튼이벤트 익명내부클래스
		btnAdd.addActionListener(this);
		
	
		
		//버튼이벤트 익명내부클래스
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int su1=Integer.parseInt(tfSu1.getText().trim());
				int su2=Integer.parseInt(tfSu2.getText().trim());
				
				int sum=su1+su2;
				
				String s = su1+"+"+su2+"="+sum;
				
				lblResult.setText(s); //라벨에 s값 출력
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _08_QuizSwing0214("0214 스윙과제물");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
