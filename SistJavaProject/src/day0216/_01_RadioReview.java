package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class _01_RadioReview extends JFrame implements ActionListener{
	
	Container cp;

	JRadioButton rbMan, rbWoman;
	
	JRadioButton[] rbColor = new JRadioButton[6];
	
	JLabel lblResult;
	
	String[] strcolors = {"빨강","노랑","초록","블루","회색","핑크"};
	
	Color[] bgcolors = {Color.red, Color.yellow, Color.green, Color.blue, Color.gray, Color.pink};
	
	
	
	public _01_RadioReview(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		cp=this.getContentPane();
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,255,155));
		
		setDeisgin();
		this.setVisible(true);
	}
	
	//디자인
	public void setDeisgin() {
		
		this.setLayout(null);
		
		rbMan = new JRadioButton("남자", true);
		rbMan.setBounds(20, 30, 60, 30);
		rbMan.setOpaque(false);
		this.add(rbMan);
		
		rbWoman = new JRadioButton("여자");
		rbWoman.setBounds(100, 30, 60, 30);
		rbWoman.setOpaque(false);
		this.add(rbWoman);
		
		//★ 남자 여자 라디오버튼 그룹 ★
		ButtonGroup bgGroup = new ButtonGroup();
		bgGroup.add(rbMan);
		bgGroup.add(rbWoman);
		
		//성별 라디오 버튼에 이벤트 추가
		rbMan.addActionListener(this);
		rbWoman.addActionListener(this);
		
		//라벨생성
		lblResult = new JLabel("결과출력하는곳.....");
		lblResult.setBounds(20, 250, 350, 50);
		this.add(lblResult);
		
		//라벨 디자인
		lblResult.setFont(new Font("궁서체", Font.BOLD, 18));
		lblResult.setBorder(new LineBorder(Color.pink, 5));
		lblResult.setOpaque(true);
		 
		//bgColor
		
		ButtonGroup bg = new ButtonGroup();
		int xpos=10;
		
		for (int i=0;i<rbColor.length;i++) {
			
			rbColor[i] = new JRadioButton(strcolors[i]);
			bg.add(rbColor[i]); //그룹에 추가..하나만선택되게
			rbColor[i].setBounds(xpos, 90, 70, 30);
			rbColor[i].setOpaque(false);
			this.add(rbColor[i]);
			xpos += 50;
			
			//익명내부 클래스에선 반복문 안되서 index 만듬
			int index=i;
			
			//익명내부 클래스로 이벤트
			rbColor[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					//익명내부 클래스에선 반복문 안되서 index로 가져옴
					lblResult.setBackground(bgcolors[index]);
					lblResult.setForeground(Color.white);
					
				}
			});
		}
	}
	//디자인 END
	
	//액션퍼폼드
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		if (ob==rbMan) {
			lblResult.setText("나는 남자 입니다");
		}else {
			lblResult.setText("나는 여자 입니다");
		}
		
	}
	//액션퍼폼드 END
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _01_RadioReview("스윙 라디오#1");
	}

	

}
