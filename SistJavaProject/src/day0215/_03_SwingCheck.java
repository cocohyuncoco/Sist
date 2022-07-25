package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class _03_SwingCheck extends JFrame implements ActionListener,ItemListener{
	
	Container cp;
	
	JCheckBox cbDriver, cbBold; //�������㿩��, ����� ����
	JCheckBox[] cbctiy = new JCheckBox[4];
	
	JButton btnOK; //��ư�̺�Ʈ
	
	JLabel lblResult; //������
	
	
	public _03_SwingCheck(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(100,100,420,420);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,255,155));
		
		setDesign();
		this.setVisible(true);
	}
	
	//������ �޼���
	public void setDesign() {
		
		this.setLayout(null);
		
		//���㿩��
		cbDriver = new JCheckBox("��������");
		cbDriver.setOpaque(false); // üũ�ڽ� ���� ������ ������ ����
		cbDriver.setBounds(20, 20, 100, 30);
		this.add(cbDriver);
		cbDriver.addItemListener(this); //�����۸����� ��ü�߰�
		
		//��Ʈ����
		cbBold = new JCheckBox("���� ����");
		cbBold.setBounds(20, 60, 150, 30);
		cbBold.setOpaque(false);
		this.add(cbBold);
		cbBold.addItemListener(this); //�����۸����� ��ü�߰� 
		
		//�����
		lblResult = new JLabel("������ �ϴ°�", JLabel.CENTER);
		lblResult.setBounds(20, 250, 350, 50);
		lblResult.setBorder(new LineBorder(Color.pink, 5));//�� ����, �� ����
		this.add(lblResult);


		//üũ�ڽ�
		String [] ctiy = {"������","����","��","�õ��"};
		int xpos = 20;
		
		for (int i=0;i<cbctiy.length;i++) {
			
			cbctiy[i] = new JCheckBox(ctiy[i]);
			cbctiy[i].setBounds(xpos, 100, 80, 30);
			cbctiy[i].setOpaque(false);
			this.add(cbctiy[i]);
			xpos+=80;
		}
		
		//��ư
		btnOK = new JButton("������ ���� ���� �˾ƺ���");
		btnOK.setBounds(100, 180, 200, 30);
		this.add(btnOK);
		btnOK.addActionListener(this);
	}
	//������ �޼��� END
	
	//��������, �󺧱��� �̺�Ʈ
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		if (ob==cbDriver) {
			String s ="üũ����: "+cbDriver.isSelected()+", �ؽ�Ʈ:"+cbDriver.getText();
			lblResult.setText(s);	
		}else if (ob==cbBold) {
			
			if (cbBold.isSelected()) {
				lblResult.setFont(new Font("",Font.BOLD,20));
			}else {
				lblResult.setFont(new Font("",Font.PLAIN,12));
			}
		}
	}

	//��ư�̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		int select=0;
		String s="���� ������� ���ô� ";
		
		for (int i=0;i<cbctiy.length;i++) {
			
			if (cbctiy[i].isSelected()) {
				select++;
				s += "["+cbctiy[i].getText()+"]";
			}
		}
		
		if (select==0) {
			s = "���� ������� ���ð� ���׿�";
		}else {
			s +=" �� ����;��";
		}
		
		//�󺧿� ���
		lblResult.setText(s);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _03_SwingCheck("�������� üũ�ڽ� ����#3");
	}
}
