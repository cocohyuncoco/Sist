package day0214;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class _07_TextLabel extends JFrame{

	Container cp;
	
	JTextField text1, text2;
	JLabel label1, label2, label3, label4, lblResult;
	Icon icon1 = new ImageIcon("C:\\sist0117\\image\\swingimage\\an07.gif");
	Icon icon2 = new ImageIcon("C:\\sist0117\\image\\swingimage\\an08.gif");
	
	JButton btnResult;
	
	public _07_TextLabel(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,200,155));
		
		//�����θ޼��� ȣ��
		initDesign();
		this.setVisible(true);
		
		
	}
	
	
	public void initDesign() {
		
		this.setLayout(null);
		
		text1=new JTextField();
		text1.setBounds(10,20,90,30);
		this.add(text1);
		
		text2=new JTextField("Have a Nice Day!!");
		text2.setBounds(10,60,150,30);
		this.add(text2);
		
		label1=new JLabel("�ȳ��ϼ���", JLabel.CENTER);
		label1.setBounds(10,100,200,30);
		label1.setBackground(Color.gray);
		label1.setOpaque(true);  //������ ���..�󺧿��� ����
		this.add(label1);
		
		label2=new JLabel("Today", icon1, JLabel.RIGHT);
		label2.setBounds(10,150,200,30);
		//Bodrder �������̽� ������ LineBorder, TitleBorder
		label2.setBackground(Color.red);
		this.add(label2);
		
		label3=new JLabel("����������", icon2, JLabel.CENTER);
		label3.setBounds(10,210,200,50);
		label3.setBorder(new TitledBorder("SIST"));
		this.add(label3);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm��");
		
		label4=new JLabel(sdf.format(new Date()), icon1, JLabel.CENTER);
		label4.setBounds(10,260,200,50);
		label4.setBorder(new LineBorder(Color.pink,5));
		this.add(label4);
		
		//�����
		lblResult = new JLabel("��������°�", icon1, JLabel.CENTER);
		lblResult.setBounds(250,100,200,70);
		lblResult.setBorder(new TitledBorder("���Ȯ��"));
		this.add(lblResult);
		
		//��ư
		btnResult = new JButton("Ȯ��");
		btnResult.setBounds(300, 200, 70, 30);
		this.add(btnResult);
		
		//Ȯ�ι�ư ������ �̺�Ʈ..�͸��� Ŭ����
		btnResult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String s = text1.getText();
				String s1 = text2.getText();
				lblResult.setText(s);
				
			}
		});
}
	
////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _07_TextLabel("�ؽ�Ʈ �� ����#7");
	}

}
