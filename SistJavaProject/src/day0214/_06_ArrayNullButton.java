package day0214;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _06_ArrayNullButton extends JFrame{

	Container cp;
	//�迭��ư
	JButton[] btn = new JButton[6];
	//����迭
	Color[] colors = {Color.blue, Color.yellow, Color.pink, Color.gray, Color.magenta, Color.cyan};
	String[] text = {"�Ķ�","���","��ũ","ȸ��","����ũ","�����"};

	
	public _06_ArrayNullButton(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		cp=this.getContentPane();
		this.setBounds(200,100,400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,200,155));
		
		
		//�����θ޼��� ȣ��
		initDesign();
		this.setVisible(true);
	
	}

	public void initDesign() {
		
		//���̾ƿ� ���ֱ�
		this.setLayout(null);

		//������ġ ����
		int top=20;
		
		//������ ��ư ����, ��ġ�� ũ��
		for (int i=0;i<btn.length;i++) {
			
			//��ư6��
			btn[i]=new JButton(text[i]);
			
			//��ġ, ũ��
			btn[i].setBounds(20, top, 90, 30);
			top+=40; //���� 40�� ����
			
			//�迭 ������ ��ư�� ����
			btn[i].setBackground(colors[i]);
			
			//�����ӿ� �߰�
			this.add(btn[i]);
			
			//����Ŭ���� ��ư�̺�Ʈ �߻�
			btn[i].addActionListener(new MyButton());
			
			int index=i;
			
			//������ ��ư�� �͸���Ŭ���� ����
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					cp.setBackground(colors[index]);
				}
			});
			
		}
		
	}
	
	//��ư �̺�Ʈ�� ���� ���� Ŭ����
	class MyButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Object ob=e.getSource();
			
			for (int i=0;i<btn.length;i++) {
				
				if (ob==btn[i]) {
					cp.setBackground(colors[i]);
				}
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new _06_ArrayNullButton("���̾ƿ����� �迭��ư ����#6");
		
	}

}
