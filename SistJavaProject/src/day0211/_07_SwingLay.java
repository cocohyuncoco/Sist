package day0211;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.text.Collator;

import javax.swing.JButton;
import javax.swing.JFrame;
//모든 컨테이너는 생성해서 제이프레임에 올려줘야한다.
//안그럼 안나타나.나중에 판넬이란데 올려야한다. 그럼 판넬에 올려야해
//모든 프레임에서 이런 귀찮음은 조금씩있다
//스윙은 뼛속까지 들어갈건 아니라 뭘 표현할수 잇는정도로
public class _07_SwingLay extends JFrame{

	//얘넨 펜. 그냥 가져와서쓴거고
	Container cp;
	//얘네는 클래스. 생성하지 않고서는 쓸수없다
	JButton btn1;

	public _07_SwingLay(String title) {
		super(title);

		cp=this.getContentPane();
		this.setBounds(200,100,400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(235, 213, 252));

		//버튼생성
		btn1=new JButton("버튼1");
		//프레임에 버튼추가
		//프레임은 기본레이아웃이 BorderLayout
		//이 경우에는 추가할때 위치를 지정해야한다
		this.add("North", btn1); //첫글자 대문자 North북, South남, 서,남

		//생성과 동시에 프레임에 추가하는 방법
		this.add("South",new JButton("아래쪽"));

		//this.add("West",new JButton("왼쪽"));
		//this.add("East",new JButton("오른쪽"));
		this.add("Center",new JButton("가운데"));

		this.add(new JButton("왼쪽"),BorderLayout.WEST);
		this.add(new JButton("오른쪽"),BorderLayout.EAST);

		//버튼속성
		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.red);


		this.setVisible(true);//항상 얘는 맨마지막에

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _07_SwingLay("레이아웃 연습");

	}

}
