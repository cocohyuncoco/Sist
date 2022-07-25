package day0303;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//�߰� ��ư �������� ������ ������...�̸�,java,jsp,spring �Է¹�ư
//�󺧰� �ؽ�Ʈ�ʵ� �� �����Է�
//  �̸� : ������
// java : ������
// jsp : ������

public class AddFrame extends JFrame{
	
	Container cp;
	JLabel titleName, titleBan, titleJava, titleJsp, titleSpring;
	JTextField tfName, tfJava, tfJsp, tfSpring;
	JComboBox<String> cbBan;
	JButton btnAdd;
	
	
	public AddFrame(String title) {
		// TODO Auto-generated constructor stub
		
		super(title);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 100, 290, 300);
		cp.setBackground(new Color(255,255,100));
		
		initDesign();
		//this.setVisible(true);
	}
	
	public void initDesign() {
		
		this.setLayout(null);
		//label
		titleName = new JLabel("�̸�");		
		titleBan = new JLabel("��");		
		titleJava = new JLabel("JAVA");		
		titleJsp = new JLabel("Jsp");		
		titleSpring = new JLabel("Spring");
		
		//tf
		tfName = new JTextField(4);
		tfJava = new JTextField(4);
		tfJsp = new JTextField(4);
		tfSpring = new JTextField(4);
		
		//cb
		String[] ban = {"A��","B��","C��","D��"};
		cbBan = new JComboBox<String>(ban); //�迭�� ����� �޺��ڽ��� ���
		
		//btn
		btnAdd = new JButton("�߰�");
		
		//������Ʈ���� ��ġ����
		titleName.setBounds(30, 10, 60, 30);
		this.add(titleName);
		
		titleBan.setBounds(30, 40, 60, 30);
		this.add(titleBan);
		
		titleJava.setBounds(30, 70, 60, 30);
		this.add(titleJava);
		
		titleJsp.setBounds(30, 100, 60, 30);
		this.add(titleJsp);
		
		titleSpring.setBounds(30, 130, 60, 30);
		this.add(titleSpring);
	
		tfName.setBounds(90, 15, 150, 20);
		this.add(tfName);
		
		cbBan.setBounds(90, 45, 150, 20);
		this.add(cbBan);
		
		tfJava.setBounds(90, 75, 150, 20);
		this.add(tfJava);
		
		tfJsp.setBounds(90, 105, 150, 20);
		this.add(tfJsp);
		
		tfSpring.setBounds(90, 135, 150, 20);
		this.add(tfSpring);
			
		btnAdd.setBounds(30, 180, 200, 25);
		this.add(btnAdd);
	}
	
	
	/* public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AddFrame("�����߰���");
	}*/

}
