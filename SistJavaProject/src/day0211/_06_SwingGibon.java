package day0211;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class _06_SwingGibon extends JFrame{
	//������ �Ϸ��� ������ JFrame�� ����� �޾ƾ��Ѵ�
	
	Container cp;
	
	public _06_SwingGibon(String title) {
		// TODO Auto-generated constructor stub
		super(title); //JFrame �θ�����ڸ� ���ؼ� â���� ������ 
		
 
		cp = this.getContentPane(); //������ ���� �⺻�г�
		
		//�������α׷� ����ɶ� ���α׷��� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//����Ŭ���� ȣ���غ��� (JFrame)
		//this.addWindowListener(new Winclose());
		
		
		//this�� �ǹ��ϴ°� JFrame�̴�
		this.setBounds(200, 200, 500, 500); //������ġ����, ������ġ����, ���α���, ���α���
		//cp.setBackground(new Color(255,255,200));
		cp.setBackground(Color.WHITE); //static ����� �̿��� ������
		this.setVisible(true); //������ ���̰�
		
	}
	
	//������ ũ��¡  /����Ŭ����
	class Winclose extends WindowAdapter{
		//����� �� �ް������ ����Ŭ������ ����
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			System.exit(0); //���α׷�����
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//_06_SwingGibon sw = new _06_SwingGibon("�����⺻����");
		//���������� ���������� ���ؼ� �� �θ����̾���. �׷��� �ʿ����
		new _06_SwingGibon("�����⺻����"); //�̷��Ը� ���൵ �ȴ�
		
		
	}

}
