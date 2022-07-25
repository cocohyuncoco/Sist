package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class _01_RadioReview extends JFrame implements ActionListener{
	
	Container cp;

	JRadioButton rbMan, rbWoman;
	
	JRadioButton[] rbColor = new JRadioButton[6];
	
	JLabel lblResult;
	
	String[] strcolors = {"����","���","�ʷ�","���","ȸ��","��ũ"};
	
	Color[] bgcolors = {Color.red, Color.yellow, Color.green, Color.blue, Color.gray, Color.pink};
	
	
	
	public _01_RadioReview(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		cp=this.getContentPane();
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,255,155));
		
		setDeisgin();
		this.setVisible(true);
	}
	
	//������
	public void setDeisgin() {
		
		this.setLayout(null);
		
		rbMan = new JRadioButton("����", true);
		rbMan.setBounds(20, 30, 60, 30);
		rbMan.setOpaque(false);
		this.add(rbMan);
		
		rbWoman = new JRadioButton("����");
		rbWoman.setBounds(100, 30, 60, 30);
		rbWoman.setOpaque(false);
		this.add(rbWoman);
		
		//�� ���� ���� ������ư �׷� ��
		ButtonGroup bgGroup = new ButtonGroup();
		bgGroup.add(rbMan);
		bgGroup.add(rbWoman);
		
		//���� ���� ��ư�� �̺�Ʈ �߰�
		rbMan.addActionListener(this);
		rbWoman.addActionListener(this);
		
		//�󺧻���
		lblResult = new JLabel("�������ϴ°�.....");
		lblResult.setBounds(20, 250, 350, 50);
		this.add(lblResult);
		
		//�� ������
		lblResult.setFont(new Font("�ü�ü", Font.BOLD, 18));
		lblResult.setBorder(new LineBorder(Color.pink, 5));
		lblResult.setOpaque(true);
		 
		//bgColor
		
		ButtonGroup bg = new ButtonGroup();
		int xpos=10;
		
		for (int i=0;i<rbColor.length;i++) {
			
			rbColor[i] = new JRadioButton(strcolors[i]);
			bg.add(rbColor[i]); //�׷쿡 �߰�..�ϳ������õǰ�
			rbColor[i].setBounds(xpos, 90, 70, 30);
			rbColor[i].setOpaque(false);
			this.add(rbColor[i]);
			xpos += 50;
			
			//�͸��� Ŭ�������� �ݺ��� �ȵǼ� index ����
			int index=i;
			
			//�͸��� Ŭ������ �̺�Ʈ
			rbColor[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					//�͸��� Ŭ�������� �ݺ��� �ȵǼ� index�� ������
					lblResult.setBackground(bgcolors[index]);
					lblResult.setForeground(Color.white);
					
				}
			});
		}
	}
	//������ END
	
	//�׼�������
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		if (ob==rbMan) {
			lblResult.setText("���� ���� �Դϴ�");
		}else {
			lblResult.setText("���� ���� �Դϴ�");
		}
		
	}
	//�׼������� END
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _01_RadioReview("���� ����#1");
	}

	

}
