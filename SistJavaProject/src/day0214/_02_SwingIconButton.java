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

	//������ �̹��� ������ ��������
	ImageIcon icon1=new ImageIcon("C:\\sist0117\\image\\jquery_img\\01.png");
	ImageIcon icon2=new ImageIcon("C:\\sist0117\\image\\jquery_img\\02.png");
	ImageIcon icon3=new ImageIcon("C:\\sist0117\\image\\jquery_img\\03.png");
	ImageIcon icon4=new ImageIcon("C:\\sist0117\\image\\jquery_img\\04.png");
	
	ImageIcon icon5=new ImageIcon("C:\\sist0117\\image\\swingimage\\leftDown.gif");
	ImageIcon icon6=new ImageIcon("C:\\sist0117\\image\\swingimage\\LEFT.GIF");
	
	JButton btn1,btn2,btn3,btn4;
	
	public _02_SwingIconButton(String title) {
		// TODO Auto-generated constructor stub
		super(title); //��������
		this.setBounds(200, 100, 400, 400); //����â ũ��		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� â �ݱ�
		this.getContentPane().setBackground(new Color(255,217,236)); //���� ������
		
		//�����θ޼���ȣ��
		initDesign();
		
		
		this.setVisible(true); //���� ������ ���̰��ϱ� 
			
	}
	//������
	public void initDesign() {
		
		// this.setLayout(null); <-�ʿ信���� �ؽ�Ʈâ, üũ�ڽ�â ����� null�� ���� ���̾��� �ɰŴ�
		
		//���̾ƿ�
		this.setLayout(new GridLayout(2, 2)); //��ư�� 2�� 2���� ��ġ�ϰڴ�
		
		//��ư1
		btn1 = new JButton("hello", icon1);
		btn1.setHorizontalTextPosition(JButton.CENTER); //�ؽ�Ʈ ������ġ
		btn1.setVerticalTextPosition(JButton.TOP); //�ؽ�Ʈ ������ġ
		this.add(btn1);
		
		btn1.setRolloverIcon(icon4); //���콺 �÷����� �̺�Ʈ
		btn1.setPressedIcon(icon5); //���콺 Ŭ�������� �̺�Ʈ
		
		//��ư2
		btn2 = new JButton(icon2);
		btn2.setPressedIcon(icon6);
		
		this.add(btn2);
		
		//��ư2
		btn3 = new JButton(icon3);
		this.add(btn3);
				
		//��ư2
		btn4 = new JButton("Hi", icon4);
		this.add(btn4);
		
		
		
		
	}
	
	
	//////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _02_SwingIconButton("��ư������ ����");
		
	}

}
