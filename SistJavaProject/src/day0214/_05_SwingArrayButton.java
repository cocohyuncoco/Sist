package day0214;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _05_SwingArrayButton extends JFrame implements ActionListener{

	JButton[] btn = new JButton[6];
	String[] btnLabel = {"Red","Cyan","Magenta","Yellow","Gray","Blue"};
	Color[] btnColor = {Color.RED,Color.CYAN,Color.magenta,Color.yellow,Color.gray,Color.blue};
	
	public _05_SwingArrayButton(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255,200,155));
		
		//�����θ޼���ȣ��
		initDesign();
		
		this.setVisible(true);
	
	}
	
	public void initDesign() {
		
		//�гλ���..�⺻�� Flow���̾ƿ�
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);
		this.add(panel, BorderLayout.NORTH); //�����ӿ� ��ܿ� �гι�ġ
		
		//��ư����
		for (int i=0;i<btn.length;i++) {
			//��ư 6�� ����
			btn[i] = new JButton(btnLabel[i]);
			//��ư6�� �󺧿� �°� ���󺯰�
			btn[i].setBackground(btnColor[i]);
			//��ư6���� ���п� �߰�
			panel.add(btn[i]);
			//��ư6�� �̺�Ʈ �߰�
			btn[i].addActionListener(this);
		}
		
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob=e.getSource();
		
		for (int i=0;i<btn.length;i++) {
			
			if (ob==btn[i]) {
				//�������� ���� ����
				getContentPane().setBackground(btnColor[i]);
				//â������ ����:Color:Red
				this.setTitle("Color:"+btnLabel[i]);
			}
			
		}
		
	}
	
	
	///////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _05_SwingArrayButton("���� �迭 ����#5");
		
	}

	

}
