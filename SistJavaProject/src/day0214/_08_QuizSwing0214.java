package day0214;
/*
 * 2���� �ؽ�Ʈ�� �Ѱ��� ��ư�� ���� �� 
 * ������ �ؽ�Ʈ�� ���ڸ� �ְ� ��ư�� Ŭ���ϸ� �󺧿�
 * 10+20=30.. �䷸�� ��µǰ� ���ּ���
 * 
 * ���� Ÿ��Ʋ���� (������ ���Ȯ��)
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class _08_QuizSwing0214 extends JFrame implements ActionListener{
	
	Container cp;
	
	JLabel lblResult;
	JTextField tfSu1, tfSu2;
	JButton btnAdd;
	
	Icon icon1 = new ImageIcon("");
	Icon icon2 = new ImageIcon("");

	
	public _08_QuizSwing0214(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,200,155));
		
		//�����θ޼��� ȣ��
		initDesign();
		this.setVisible(true);
	
	}
	
	public void initDesign() {
		
		this.setLayout(null); //�⺻ ���̾ƿ� ���ְ� ���� �����Ұ�� ���
		
		JLabel lbl1 = new JLabel("����1");
		JLabel lbl2 = new JLabel("����2");
		lbl1.setBounds(20,20,50,30);
		this.add(lbl1);
		
		lbl2.setBounds(20,60,50,30);
		this.add(lbl2);
		
		tfSu1=new JTextField();
		tfSu1.setBounds(70,20,60,30);
		this.add(tfSu1);
		
		tfSu2=new JTextField();
		tfSu2.setBounds(70,60,60,30);
		this.add(tfSu2);
		
		btnAdd=new JButton("���ڴ��ϱ�", icon1);
		btnAdd.setBounds(30, 110, 150, 40);
		this.add(btnAdd);
		
		lblResult = new JLabel("��������°�",icon2,JLabel.CENTER);
		lblResult.setBounds(10, 170, 250, 60);
		lblResult.setBorder(new TitledBorder("���Ȯ��"));
		
		//�۲ú���
		lblResult.setFont(new Font("", Font.BOLD, 20));
		this.add(lblResult);
		
		//��ư�̺�Ʈ �͸���Ŭ����
		btnAdd.addActionListener(this);
		
	
		
		//��ư�̺�Ʈ �͸���Ŭ����
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int su1=Integer.parseInt(tfSu1.getText().trim());
				int su2=Integer.parseInt(tfSu2.getText().trim());
				
				int sum=su1+su2;
				
				String s = su1+"+"+su2+"="+sum;
				
				lblResult.setText(s); //�󺧿� s�� ���
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _08_QuizSwing0214("0214 ����������");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
