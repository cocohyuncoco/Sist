package day0214;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _03_SwingEvent extends JFrame implements ActionListener{
	
	JButton btn1,btn2,btn3;
	
	//�̹��� ���
	static final String ICON1 ="C:\\sist0117\\image\\swingimage\\img1.gif";
	static final String ICON2 ="C:\\sist0117\\image\\swingimage\\an08.gif";
	static final String ICON3 ="C:\\sist0117\\image\\swingimage\\chick.gif";
	
	public _03_SwingEvent(String title) {
		// TODO Auto-generated constructor stub
		super(title); //��������
		this.setBounds(200, 100, 400, 300); //����â ũ��		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� â �ݱ�
		this.getContentPane().setBackground(new Color(255,217,236)); //���� ������
		
		//�����θ޼���ȣ��
		initDesign();		
		
		this.setVisible(true); //���� ������ ���̰��ϱ� 
			
	}
	//������
	public void initDesign() {
		
		this.setLayout(null); //���̾ƿ� ���ֱ�
		
		//��ư1
		btn1 = new JButton("Hello");
		//ũ����ġ
		btn1.setBounds(20, 30, 80, 30); //x,y,w,h
		//�������߰�
		this.add(btn1);
		
		//��ư2
		btn2 = new JButton("��ư2", new ImageIcon(ICON1));
		btn2.setBounds(20, 70, 100, 50);
		this.add(btn2);
		
		//��ư3
		btn3 = new JButton(new ImageIcon(ICON2));
		btn3.setBounds(150, 100, 150, 150);
		btn3.setPressedIcon(new ImageIcon(ICON3));
		this.add(btn3);
		
		//��ư�� �׼��̺�Ʈ �߰�
		btn1.addActionListener(this); //�̺�Ʈ��ü�Ϳ���
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = (JButton)e.getSource();
		
		if (ob==btn1) {
			JOptionPane.showConfirmDialog(this, "�ȳ�");
		}else if (ob==btn2) {
			JOptionPane.showConfirmDialog(this, "�߰�");
		}else {
			JOptionPane.showConfirmDialog(this, "��𰡰�");
		}
		
	}

	
	///////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _03_SwingEvent("��ư�̺�Ʈ����#3");
		
	}
	
}
