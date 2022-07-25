package day0214;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _01_SwingLayNull extends JFrame{
	
	JButton btn1, btn2;
	
	public _01_SwingLayNull(String title) {
		// TODO Auto-generated constructor stub
		super(title); //��������
		this.setBounds(200, 100, 400, 300); //����â ũ��		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� â �ݱ�
		this.getContentPane().setBackground(new Color(255,217,236)); //���� ������
		
		//�����θ޼���ȣ��
		initDesign();
	
		//���� ������ ���̰��ϱ�
		this.setVisible(true); 
	}
	
	
	//������ �޼���
	public void initDesign() {
		
		this.setLayout(null);
		
		btn1=new JButton("��");
		btn2=new JButton("��");
		
		this.add(btn1);
		this.add(btn2);
		
		//��ư�� ��ġ�� ũ�� ��������
		btn1.setBounds(50, 100, 80, 30);
		btn2.setBounds(150, 100, 80, 30);
	
		//�͸� ����Ŭ���� �̺�Ʈ
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//JOptionPane.showMessageDialog(rootPane, "�������� �̵�");
				JOptionPane.showMessageDialog(getContentPane(), "�������� �̵�");
				
			}
		});
	
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(rootPane, "���������� �̵�");
				//JOptionPane.showMessageDialog(getContentPane(), "���������� �̵�");
			}
		});
	}
	
	///////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _01_SwingLayNull("����� ���̾ƿ� ����");
		
	}
	

}
