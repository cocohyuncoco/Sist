package day0211;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _08_SwingBurronEx extends JFrame implements ActionListener{	
	
	Container cp;
	JButton btn1,btn2,btn3;
	
	public _08_SwingBurronEx(String title) {
	
		cp=this.getContentPane();
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(Color.WHITE);
		
		
		initDesign();
		//�����θ޼��� ȣ��(�긦 ��� ������)
		this.setVisible(true);
	}
	
	//�����θ޼���
	public void initDesign() {
		
		//��ư�� ���̾ƿ� ������_�������̾ƿ�
		//1. ���̾ƿ� �����ؼ� ����
		this.setLayout(new FlowLayout()); //������ �� �����ϴ� �޼���
		
		//��ư����
		btn1=new JButton("�۾���");
		btn2=new JButton("����");
		btn3=new JButton("����");
		
		//�� �����ӿ� �߰� �� 
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		//�̺�Ʈ�߻�_�̺�Ʈ �ڵ鷯�޼���� �̺�Ʈ �߻� ��ü����
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		//��ư�Ӽ�
		//1. ��ư����
		btn1.setBackground(new Color(122,201,247));
		btn2.setBackground(new Color(170,243,104));
		btn3.setBackground(new Color(247,122,122));
		//2. ��ư�۾���
		btn1.setForeground(new Color(52,52,52));
		btn2.setForeground(new Color(52,52,52));
		btn3.setForeground(new Color(52,52,52));
		
	}
	
	//�׼��̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//�̺�Ʈ�� �߻��� ������Ʈ�� object�� ���� ���´�
		Object ob = e.getSource();
		
		//JOptionPane.showMessageDialog(this, "Ŭ��");
				
		//��ư�� � �޼��带 ȣ���ϴ��� ��Ȯ�ϰ� ����
		//��Ȯ�ϰ� ���ٷ��ϱ� ���ǹ� �����
		if (ob==btn1) {
			JOptionPane.showConfirmDialog(this, "�۾��� �Ͻðڽ��ϱ�?");
		}else if (ob==btn2) {
			JOptionPane.showConfirmDialog(this, "���� �Ͻðڽ��ϱ�?");
		}else {
			JOptionPane.showConfirmDialog(this, "���� �Ͻðڽ��ϱ�?");
		}
				
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_08_SwingBurronEx sw = new _08_SwingBurronEx("��ư����_08");
		
	}

	

}
