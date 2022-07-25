package day0214;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * ��ư2�� ���η� �����Ұ�
 * 1. ��������_�׸���
 * 2. ��������_�����
 * 
 * �̺�Ʈ�� �͸���Ŭ������ �غ�����
 */
public class _04_ButtonEvent extends JFrame{

	JButton btn1, btn2;
		
	public _04_ButtonEvent(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 200, 155));
		
		//�����θ޼��� ȣ��
		initDesign();
		
		this.setVisible(true);
	}
	
	public void initDesign() {
		
		this.setLayout(new FlowLayout());

		//��ư1
		btn1=new JButton("��������_�׸�");
		this.add(btn1);
		
		//�͸���Ŭ����_�̺�Ʈ
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().setBackground(Color.green);
				}
		});
		
		
		//��ư2
		btn2=new JButton("��漡����_�����");
		this.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().setBackground(Color.magenta);
			}
		});
		
		
	}
	


	////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _04_ButtonEvent("��ư�̺�Ʈ #4");
	}


	

}
