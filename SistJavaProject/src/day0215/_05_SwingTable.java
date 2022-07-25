package day0215;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class _05_SwingTable extends JFrame{

	Container cp;
	
	JTable tb1, tb2, tb3;
	JTextArea area;
	
	
	public _05_SwingTable(String title) {
	
		super(title);
		cp=this.getContentPane();
		this.setBounds(100, 100, 600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,200,155));
		
		//�����θ޼��� ȣ��
		setDesign();
		this.setVisible(true);
	}
	
	public void setDesign() {
		
		this.setLayout(new GridLayout(2, 2)); //2��2��
		
		//1. 1��° ���̺�..�� ���� ����
		tb1 = new JTable(5, 4);
		this.add(tb1);
		
		//2. 2��° ���̺��� �����Ҷ� ������ �ֱ�
		String[] title1 = {"�̸�","�а�","�ּ�"};
		String[][] data1 = {
				{"������","�ð������ΰ�","����"},
				{"�赿��","���̿������а�","����"},
				{"������","��ǰ�а�","����"}
		};
		
		tb2 = new JTable(data1, title1);
		this.add(new JScrollPane(tb2));

		//3. 3��° ���̺�..Model �̿��ؼ� ����(���߿� �߰�, ������ ����)
		DefaultTableModel model=new DefaultTableModel(data1, title1);
		tb3 = new JTable(model);
		this.add(new JScrollPane(tb3));
		//tb3�� ���� �̿��������� �߰� ����
		
		String[] addData = {"������","�󸧽ÿ���","�ϱ�"};
		model.addRow(addData);
		
		//�� ���ͷ� ������ �߰� �� ���̾�
		Vector<String> addData2 = new Vector<String>();
		//�ϳ��� �߰��� ����
		addData2.add("���缮");
		addData2.add("��Ƽ�̵���");
		//addData2.add("�����"); 
		
		model.addRow(addData2);
		
		
		//���
		area=new JTextArea();
		this.add(new JScrollPane(area));
		
		//JTable Model �޼��� Ȯ��
		int rowCount = tb3.getRowCount();
		int rowCount2 = model.getRowCount();
		
		//�హ��
		area.append("tb3 �� �హ��: "+rowCount+"\n");
		area.append("tb3 �� �హ��: "+rowCount2+"\n");
		
		//������
		int columnCount = tb3.getColumnCount();				
		area.append("tb3 �� ������: "+columnCount+"\n");

		//�࿭�� ���� ��
		area.append("1��1���� ��: "+tb3.getValueAt(1, 1)+"\n");
		area.append("3��2���� ��: "+tb3.getValueAt(3, 2)+"\n");
		area.append("3��2���� ��: "+model.getValueAt(3, 2)+"\n");
		
		//tb3�� ���콺Ŭ�� �̺�Ʈ�� �߰��ؼ� area�� ���
		tb3.addMouseListener(new MouseAdapter() {
			
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			
			//System.out.println("���̺� Ŭ��!!");
			
			//������ ���ȣ ���
			int row = tb3.getSelectedRow();
		
			//������ ����ȣ ���
			int col = tb3.getSelectedColumn();		
	
			//��, ����ȣ ������ �� ���
			area.append(row+","+col+" ---> "+tb3.getValueAt(row, col)+"\n");
			
		}
			
		});
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _05_SwingTable("���̺���#5");
	}

}
