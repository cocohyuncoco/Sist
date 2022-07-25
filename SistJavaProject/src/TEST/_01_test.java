package TEST;

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
public class _01_test extends JFrame{

	JButton btn1, btn2;
	
	
	public _01_test(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(100,100,800,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.white);
		
		setDesign();
		
		this.setVisible(true);
	}
	

	public void setDesign() {
		
		this.setLayout(new FlowLayout(FlowLayout.RIGHT,30,40)); 
		//FlowLayout ��ġ������ 
		//������Ʈ ���ʹ�ġ, ������Ʈ�¿찣�� 30, ������Ʈ ���ϰ��� 40
		
		btn1 = new JButton("�׸������� ��溯��");
		this.add(btn1);
		
		btn2 = new JButton("��������� ��溯��");
		this.add(btn2);

		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				getContentPane().setBackground(Color.green);
			}
		});


		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().setBackground(Color.yellow);
			}
		});

		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _01_test("��ư�̺�Ʈ �׽�Ʈ");
		
	}

}
