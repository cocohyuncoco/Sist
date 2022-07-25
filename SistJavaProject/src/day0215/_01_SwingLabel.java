package day0215;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class _01_SwingLabel extends JFrame implements ActionListener{
	
	Container cp;
	
	JLabel[] lblLabel = new JLabel[9];
	String[] str = {"�ɶ���","�ѱ�","�̱�","�±�","�߱�","�Ϻ�","������","����Ʈ���ϸ���","��Ű"};
	
	JButton btnOK;
	
	public _01_SwingLabel(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(100,100,600,600);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,255,155));
		
		setDesign();
		this.setVisible(true);
	}

	public void setDesign() {
	
		//�����ӿ� �г� ���� �ø��� //�����̳ʸ� �ٷ� �ø����� �г��� �ø����� �����ؼ� �ϱ�
		Panel pCenter = new Panel(new GridLayout(3, 3));
		this.add(pCenter, BorderLayout.CENTER);
		
		//���� �гο� �߰� (�迭�� ��������� for������)
		for (int i=0;i<lblLabel.length;i++) {
			
			//9���� �� ���� ����
			lblLabel[i] = new JLabel(str[i], JLabel.CENTER);
			
			//R,G,B �÷����� 0~255 ������ 
			int r=(int)(Math.random()*256); //0~255
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			
			//�� ���� �ֱ�//���� ������ �ؾ��Ѵ�
			lblLabel[i].setBackground(new Color(r, g, b));
			//�۲�
			lblLabel[i].setFont(new Font("�ü�ü", Font.BOLD, 15));
			//������
			lblLabel[i].setOpaque(true);
			//�� �гο� �ø��� ��
			pCenter.add(lblLabel[i]);
			
		}//���� �гο� �߰� END
		
		//��ư����
		btnOK = new JButton("�󺧻��� ����");
		//�̺�Ʈ�� �߻��� ��ư
		this.add(btnOK, BorderLayout.SOUTH);		
		//�� ��ư�� �̺�Ʈ ��ü��°� ǥ�� ��
		btnOK.addActionListener(this);
	}
	
	//�̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<lblLabel.length;i++) {
			
			
			//R,G,B �÷����� 0~255 ������ 
			int r=(int)(Math.random()*256); //0~255
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			
			//�� ���� �ֱ�//���� ������ �ؾ��Ѵ�
			lblLabel[i].setBackground(new Color(r, g, b));
		
			
		}
	}//�̺�Ʈ END

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _01_SwingLabel("�г� ����");
	}


	
}
