package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class _04_JTableEx extends JFrame{
	

	Container cp;
	
	JTable table;
	JLabel lblTitle,lblOut;
	
	public _04_JTableEx(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,200,155));
		
		//�����θ޼��� ȣ��
		setDesign();
		this.setVisible(true);
	
	}
	
	public void setDesign() {
		
		String[][] data = { //�������迭
				{"������","����","010-7777-8888"},
				{"�赿��","����","010-4713-3241"},
				{"������","����","010-5714-3241"}	};
		
		String [] title= {"�̸�","�ּ�","����ó"};
		
		//�󺧻���
		lblTitle = new JLabel("JTable ����", JLabel.CENTER);
		lblOut = new JLabel("��������°�", JLabel.CENTER);
		
		//���̺�
		table = new JTable(data, title);
		JScrollPane pane = new JScrollPane(table);
		
		//�� ���̺� ���콺 �̺�Ʈ �߰� ��
		table.addMouseListener(new TableEvent());
		
		this.add("North", lblTitle);
		this.add("Center", pane);
		this.add("South", lblOut);
	}
	
	//���콺 �̺�Ʈ..���̺� Ŭ���� (����Ŭ����)
	class TableEvent extends MouseAdapter{
	
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			
			System.out.println("���̺� Ŭ��!!");
			//������ ���ȣ ���
			int rowNum = table.getSelectedRow();
			
			//JOptionPane.showMessageDialog(_04_JTableEx.this, "���ȣ:"+rowNum);
			
			String str = "�̸�: "+table.getValueAt(rowNum, 0)
			+",�ּ�: "+table.getValueAt(rowNum, 1)
			+",�ڵ��� "+table.getValueAt(rowNum, 2);
	
			//�� ���
			lblOut.setText(str);
		}
	}	
	
	///////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _04_JTableEx("JTable ����");
		
	}

}
