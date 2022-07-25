package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class _02_SwingRadioCheck extends JFrame implements ActionListener{

	Container cp;

	//하나만 선택하고 싶을때
	JRadioButton[] rb = new JRadioButton[4];

	JCheckBox[] cb = new JCheckBox[4];

	JLabel lblMessage;

	Color[] colors = {Color.red, Color.yellow, Color.blue, Color.cyan};


	public _02_SwingRadioCheck(String title) {
		super(title);
		this.setBounds(100, 100, 400, 400);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(Color.white);
		setDesign();
		this.setVisible(true);
	}

	//디자인 메서드 
	public void setDesign() {

		//상단패널에 보더로 감싼 4개의 라디오버튼
		String [] str = {"빨강","노랑","파랑","연파랑"};
		//패널 생성
		JPanel pTop = new JPanel(); //아무것도 안주면 flow 레이아웃
		pTop.setBorder(new TitledBorder("글자색"));
		this.add("North", pTop);

		//라디오버튼..하나만 선택하기 위해선 그룹
		ButtonGroup bg = new ButtonGroup();

		//라디오 버튼 생성..배열
		for (int i=0;i<rb.length;i++) {

			//삼항연산자 조건을 굉장히많이줌
			rb[i] = new JRadioButton(str[i], i==1?true:false);

			//탑패널에 추가
			pTop.add(rb[i]);
			//버튼그룹에 추가
			bg.add(rb[i]);
		
			//액션추가
			rb[i].addActionListener(this);
			
		}

		//센터..lblMessage
		ImageIcon icon = new ImageIcon("C:\\sist0117\\image\\jquery_img\\image_02.png");

		lblMessage = new JLabel("Have a Nice Day!", icon, JLabel.CENTER);
		lblMessage.setHorizontalAlignment(JLabel.LEFT);
		lblMessage.setBorder(new LineBorder(Color.red, 2));
		this.add("Center", lblMessage);


		//하단...체크박스(다중선택가능)
		String[] str2 = {"자바","오라클","스프링","자바스크립트"};

		JPanel pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder("가능한 컴퓨터 언어는?"));
		this.add("South",pBottom);

		for (int i=0;i<cb.length;i++) {

			//4개 체크박스 생성..str2로
			cb[i] = new JCheckBox(str2[i]);
			
			//하단패널에 추가
			pBottom.add(cb[i]);

			//체크박스에 액션 추가
			cb[i].addActionListener(this);
		}
	}//디자인 메서드 END
	
	//이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		//라디오버튼 호출처리
		for (int i=0;i<rb.length;i++) {
			
			if (ob==rb[i]) {
				//라벨의 글꼴색에 맞춰 출력
				lblMessage.setForeground(colors[i]);
				
				//폰트 이용해서 20pt로
				lblMessage.setFont(new Font("", Font.BOLD, 20));
				
			}
			
		}
		//체크박스 호출처리
		String msg="";
		
		for (int i=0;i<cb.length;i++) {
			
			if (cb[i].isSelected()==true) { //체크박스 값 누적 메서드
				lblMessage.setFont(new Font("궁서체", Font.BOLD, 14));
				msg += cb[i].getText()+" ";
			}
			
		}
		
		lblMessage.setText(msg);
	}
	//이벤트 처리 END



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _02_SwingRadioCheck("스윙라디오 체크 연습#2");
	}

	
}
