package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class _02_SwingRadioCheck extends JFrame implements ActionListener{

	Container cp;

	//�ϳ��� �����ϰ� ������
	JRadioButton[] rb = new JRadioButton[4];

	JCheckBox[] cb = new JCheckBox[4];

	JLabel lblMessage;

	Color[] colors = {Color.red, Color.yellow, Color.blue, Color.cyan};


	public _02_SwingRadioCheck(String title) {
		super(title);
		this.setBounds(100, 100, 400, 400);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(Color.white);
		setDesign();
		this.setVisible(true);
	}

	//������ �޼��� 
	public void setDesign() {

		//����гο� ������ ���� 4���� ������ư
		String [] str = {"����","���","�Ķ�","���Ķ�"};
		//�г� ����
		JPanel pTop = new JPanel(); //�ƹ��͵� ���ָ� flow ���̾ƿ�
		pTop.setBorder(new TitledBorder("���ڻ�"));
		this.add("North", pTop);

		//������ư..�ϳ��� �����ϱ� ���ؼ� �׷�
		ButtonGroup bg = new ButtonGroup();

		//���� ��ư ����..�迭
		for (int i=0;i<rb.length;i++) {

			//���׿����� ������ ������������
			rb[i] = new JRadioButton(str[i], i==1?true:false);

			//ž�гο� �߰�
			pTop.add(rb[i]);
			//��ư�׷쿡 �߰�
			bg.add(rb[i]);
		
			//�׼��߰�
			rb[i].addActionListener(this);
			
		}

		//����..lblMessage
		ImageIcon icon = new ImageIcon("C:\\sist0117\\image\\jquery_img\\image_02.png");

		lblMessage = new JLabel("Have a Nice Day!", icon, JLabel.CENTER);
		lblMessage.setHorizontalAlignment(JLabel.LEFT);
		lblMessage.setBorder(new LineBorder(Color.red, 2));
		this.add("Center", lblMessage);


		//�ϴ�...üũ�ڽ�(���߼��ð���)
		String[] str2 = {"�ڹ�","����Ŭ","������","�ڹٽ�ũ��Ʈ"};

		JPanel pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder("������ ��ǻ�� ����?"));
		this.add("South",pBottom);

		for (int i=0;i<cb.length;i++) {

			//4�� üũ�ڽ� ����..str2��
			cb[i] = new JCheckBox(str2[i]);
			
			//�ϴ��гο� �߰�
			pBottom.add(cb[i]);

			//üũ�ڽ��� �׼� �߰�
			cb[i].addActionListener(this);
		}
	}//������ �޼��� END
	
	//�̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		//������ư ȣ��ó��
		for (int i=0;i<rb.length;i++) {
			
			if (ob==rb[i]) {
				//���� �۲û��� ���� ���
				lblMessage.setForeground(colors[i]);
				
				//��Ʈ �̿��ؼ� 20pt��
				lblMessage.setFont(new Font("", Font.BOLD, 20));
				
			}
			
		}
		//üũ�ڽ� ȣ��ó��
		String msg="";
		
		for (int i=0;i<cb.length;i++) {
			
			if (cb[i].isSelected()==true) { //üũ�ڽ� �� ���� �޼���
				lblMessage.setFont(new Font("�ü�ü", Font.BOLD, 14));
				msg += cb[i].getText()+" ";
			}
			
		}
		
		lblMessage.setText(msg);
	}
	//�̺�Ʈ ó�� END



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _02_SwingRadioCheck("�������� üũ ����#2");
	}

	
}
