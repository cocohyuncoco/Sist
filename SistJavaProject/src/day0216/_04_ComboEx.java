package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class _04_ComboEx extends JFrame implements ActionListener, ItemListener{

	Container cp;

	//JComboBox<E> // E->������Ʈ / ���׸�Ÿ��
	JComboBox<String> combo;
	String[] names = {"������","������","�̴ټ�","������"};
	
	JTextField tfname;
	JButton btnAdd, btnDel;
	JLabel lblResult;
	
	int idx=-1; //������� 0���� �ڵ��ʱ�ȭ �Ǵµ� 0�� ������ �������ؼ� -1 �������� �ش�
	
	public _04_ComboEx(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,255,155));
		
		//�����θ޼��� ȣ��
		setDesign();
		this.setVisible(true);
	}
	
	public void setDesign() {
		
		this.setLayout(null);
		
		//�޺��ڽ��� ���� ������ ������ �����Ͽ� �ֱ�
		//������ �迭�� ����Ѵ�
		//�޺��ڽ��� �� �־������ �־���Ұ� �ƴϾ�
		combo = new JComboBox<String>(names);
		combo.setBounds(30,30,100,30);
		this.add(combo);
	
		tfname = new JTextField();
		tfname.setBounds(30,90,100,30);
		this.add(tfname);
		
		btnAdd = new JButton("�߰�");
		btnAdd.setBounds(150,90,80,30);
		this.add(btnAdd);
		
		btnDel = new JButton("����");
		btnDel.setBounds(250,90,80,30);
		this.add(btnDel);
		
		lblResult = new JLabel("Reslut", JLabel.CENTER);
		lblResult.setBorder(new LineBorder(Color.orange,8));
		lblResult.setBounds(20,250,350,50);
		this.add(lblResult);
		
		//�׼��߰�
		combo.addItemListener(this); // �� �׼Ǹ����� ���� �ȳ��� ��
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		
		
	}
	//��ư 2�� �̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		if (ob==btnAdd) {			
			
			String text = tfname.getText().trim();
			
			if (text.length()==0) {
				JOptionPane.showMessageDialog(this, "�̸��� �Է��� �߰���ư�� �����ּ���");
			}else {
				combo.addItem(text);//�߰� ���شٴ� �޼���. �޺����߰�
				tfname.setText("");
				lblResult.setText("�ش� �׸��� �߰���");
			}
		}else if (ob==btnDel) {
			
			if (idx==-1) {
				JOptionPane.showMessageDialog(this, "������ �׸� ���� �� �������ּ���");
			}else {
				combo.removeItemAt(idx);
				lblResult.setText("�ش��׸��� ���� �߽��ϴ�");
			}	
		}
	}
	
	//�޺��̺�Ʈ
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		idx=combo.getSelectedIndex();
		
		//��ȯ�� Ʋ������ �տ� ���� ��ȯ���̶� �����ָ��
		String item = (String)combo.getSelectedItem();
		
		lblResult.setText(idx+"�� �ε����� "+item+"����!!");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _04_ComboEx("���� �޺��ڽ�#4"); 
	
	}

	

}
