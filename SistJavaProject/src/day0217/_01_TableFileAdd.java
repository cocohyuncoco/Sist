package day0217;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class _01_TableFileAdd extends JFrame implements ActionListener{

	JTextField tfSang,tfSu,tfDan;
	JButton btnAdd, btnDel;
	DefaultTableModel model;
	JTable table;
	int selectRow=-1;
	static final String FILENAME="C:\\sist0117\\javawork\\tabledata.txt";
	
	
	public _01_TableFileAdd(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setBounds(700, 100, 400, 400);
		this.setDesign();
		
		//���̺� ���� �� ���ϵ����� �߰�
		tableDataSave();
		tableReadData();
		
		//����� �̺�Ʈ ����������
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				
				//�������� �޼��� ȣ��
				tableDataSave();
				System.exit(0);
				
			}
		});
		
		this.setVisible(true);
		
	}
	
	
	//������ ����
	//����� -> <�ٳ���:3:1000:> �����Ҷ� �׻� ���б�ȣ �� ������ ������ ��ȣ��(:) ���� ����
	public void tableDataSave() {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			
			for (int i=0;i<table.getRowCount();i++) { //�������迭 �Ҷ� ���� ��������
				
				String s =""; //������ ����
				
				for (int j=0;j<table.getColumnCount();j++) {
					
					s += table.getValueAt(i, j)+":"; //0���� 0�� �� s�� ���� 
				}
				//������ �ѱ��� : ����
				s = s.substring(0, s.length()-1);
				fw.write(s+"\n");
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	//������ �ҷ�����
	public void tableReadData() {
	
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			while (true) {
				
				String s = br.readLine();
				
				if (s==null) 
					break;
				
				String[] data =s.split(":");
				
				//���̺� �迭�� ������ �߰�
				model.addRow(data);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	public void setDesign() {
		
		this.setLayout(null);

		JLabel lbl1 = new JLabel("��ǰ��");
		JLabel lbl2 = new JLabel("����");
		JLabel lbl3 = new JLabel("�ܰ�");
	
		lbl1.setBounds(30,20,80,30);
		this.add(lbl1);
		
		lbl2.setBounds(150,20,80,30);
		this.add(lbl2);
		
		lbl3.setBounds(270,20,80,30);
		this.add(lbl3);
		
		tfSang = new JTextField();
		tfSang.setBounds(20,60,100,30);
		this.add(tfSang);
	
		tfSu = new JTextField();
		tfSu.setBounds(140,60,100,30);
		this.add(tfSu);
	
		tfDan = new JTextField();
		tfDan.setBounds(270,60,100,30);
		this.add(tfDan);
		
		//��ư
		btnAdd = new JButton("�߰��ϱ�");
		btnAdd.setBounds(50,120,100,30);
		this.add(btnAdd);

		btnDel = new JButton("�����ϱ�");
		btnDel.setBounds(200,120,100,30);
		this.add(btnDel);
			
		//��ư2�� �̺�Ʈ����
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		//���̺����
		String[] title = {"��ǰ��","����","�ܰ�","�ѱݾ�"};
		model = new DefaultTableModel(title, 0);//0�� �హ��
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		js.setBounds(20, 170, 350, 180);
		this.add(js);
		
		//���̺� Ŭ���� ������ ���ȣ�� selectRow�� ����
		table.addMouseListener(new MouseAdapter() { //���콺���
		
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				selectRow=table.getSelectedRow(); //selectRow ������ ���ȣ ����. 
			}
		});
	}
	
	//��ư�̺�Ʈ2��
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		Object ob = e.getSource();
		
		if (ob==btnAdd) {
			
			String sang = tfSang.getText().trim();
			String su = tfSu.getText().trim();
			String dan = tfDan.getText().trim();
			
			if (sang.length()==0 || su.length()==0 || dan.length()==0) {
				JOptionPane.showMessageDialog(this, "3���� ��� �Է����ּ���");
				return;
			}
			
			int total=0;
			total=Integer.parseInt(su)*Integer.parseInt(dan);
			
			
			NumberFormat nf = NumberFormat.getInstance();
			Vector<String> data = new Vector<String>();
			data.add(sang);
			data.add(su);
			data.add(dan);
			data.add(nf.format(total));
			
			//�� ���̺� �߰� ��
			model.addRow(data);
			
			//�Է°� �����ֱ�
			tfSang.setText("");
			tfSu.setText("");
			tfDan.setText("");
			
			
			
		}else if (ob==btnDel) {
			
			if (selectRow==-1) {
				JOptionPane.showMessageDialog(this, "������ ���� ���� �������ּ���");
			}else {
				model.removeRow(selectRow);
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _01_TableFileAdd("������ ���� �߰� ���� ����");
		
	}

	

}
