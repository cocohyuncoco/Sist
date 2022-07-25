package day0211;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.text.Collator;

import javax.swing.JButton;
import javax.swing.JFrame;
//��� �����̳ʴ� �����ؼ� ���������ӿ� �÷�����Ѵ�.
//�ȱ׷� �ȳ�Ÿ��.���߿� �ǳ��̶��� �÷����Ѵ�. �׷� �ǳڿ� �÷�����
//��� �����ӿ��� �̷� �������� ���ݾ��ִ�
//������ �ļӱ��� ���� �ƴ϶� �� ǥ���Ҽ� �մ�������
public class _07_SwingLay extends JFrame{

	//��� ��. �׳� �����ͼ����Ű�
	Container cp;
	//��״� Ŭ����. �������� �ʰ��� ��������
	JButton btn1;

	public _07_SwingLay(String title) {
		super(title);

		cp=this.getContentPane();
		this.setBounds(200,100,400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(235, 213, 252));

		//��ư����
		btn1=new JButton("��ư1");
		//�����ӿ� ��ư�߰�
		//�������� �⺻���̾ƿ��� BorderLayout
		//�� ��쿡�� �߰��Ҷ� ��ġ�� �����ؾ��Ѵ�
		this.add("North", btn1); //ù���� �빮�� North��, South��, ��,��

		//������ ���ÿ� �����ӿ� �߰��ϴ� ���
		this.add("South",new JButton("�Ʒ���"));

		//this.add("West",new JButton("����"));
		//this.add("East",new JButton("������"));
		this.add("Center",new JButton("���"));

		this.add(new JButton("����"),BorderLayout.WEST);
		this.add(new JButton("������"),BorderLayout.EAST);

		//��ư�Ӽ�
		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.red);


		this.setVisible(true);//�׻� ��� �Ǹ�������

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _07_SwingLay("���̾ƿ� ����");

	}

}
