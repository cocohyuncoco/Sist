package day0304;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import day0303.AddFrame;
import day0303.DbConnect;
import day0303.UpdateFrame;

public class _01_SawonDbSwing extends JFrame implements ItemListener, ActionListener{

	DbConnect db = new DbConnect();
	Container cp;
	DefaultTableModel model;
	JTable table;
	JRadioButton [] rb = new JRadioButton[6];
	JButton btnAdd, btnDel;
	
	public _01_SawonDbSwing(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(800, 100, 700, 500);
		cp.setBackground(new Color(255,255,200));

		this.initDesign();
		
		//���̺� ������ db�κ��� ������ �������µ�..1���� ��ü���
		this.sawonTableWrite(1);
		
		this.setVisible(true);
	}

	//������
	public void initDesign() {

		this.setLayout(null);

		//���̺� �߰�
		String[] title = {"No.","ID","�����","�μ���","����","����"};
		model = new DefaultTableModel(title, 0); //����, �హ��
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		js.setBounds(10,100,670,350);
		this.add(js);

		//������ư �߰�
		ButtonGroup bg = new ButtonGroup();

		//1.��ü��� 2.���� 3.���� 4.���ߺ� 5.ȫ���� 6.������
		String[] rb_label = {"��ü","����","����","���ߺ�","ȫ����","������"};

		int xpos=10;
		for (int i=0;i<rb.length;i++) {

			//������ư ����..��ü�� �⺻����
			rb[i]=new JRadioButton(rb_label[i], i==0?true:false);
			rb[i].setBounds(xpos, 50, 90, 30);
			rb[i].setOpaque(false);

			//�̺�Ʈ�߰�
			rb[i].addItemListener(this);
			bg.add(rb[i]);
			this.add(rb[i]);
			xpos+=100;

		}

		//�߰���ư
		btnAdd = new JButton("�߰�");
		btnAdd.setBounds(250, 10, 80, 30);
		this.add(btnAdd);
		btnAdd.addActionListener(this);
		//������ư
		btnDel = new JButton("����");
		btnDel.setBounds(350, 10, 80, 30);		
		this.add(btnDel);		
		btnDel.addActionListener(this);
		
	}

	//db��ȸ�ؼ� ���̺� �߰�
	//1. ��ü��� 2.����. 3.���� 4.���ߺ� 5.ȫ���� 6.������
	public void sawonTableWrite(int select) {

		String sql="";
		if (select==1) 
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon";
		else if (select==2) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where gender='����'";
		}else if (select==3) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where gender='����'";
		}else if (select==4) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where buseo='���ߺ�'";
		}else if (select==5) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where buseo='ȫ����'";
		}else if (select==6) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where buseo='������'";
		}

			Connection conn = db.getOracle();
			Statement stmt = null;
			ResultSet rs = null;

			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);

				//������ ������ ������ �������� | ���ΰ�ħ�̴ϱ�
				model.setRowCount(0);

				while (rs.next()) {

					//���̺� �߰��� ���� ������ ������ �߰�
					Vector<String> date = new Vector<String>();

					date.add(rs.getString("no"));
					date.add(rs.getString("id"));
					date.add(rs.getString("name"));
					date.add(rs.getString("buseo"));
					date.add(rs.getString("gender"));
					date.add(rs.getString("pay"));

					//���͸� ������ ������ �߰�
					model.addRow(date);

				}


			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(rs, stmt, conn);

			}
		
			
		}
		
	
	//�����޼��� delete...
		public void deleteData(String num) {

			System.out.println("num="+num);
			String sql="delete from sawon where num="+num;

			//sql�� ������ ������ �ش��ȣ ������ �޼���...�����Ǹ� ���ΰ�ħ(set"")
			//���ΰ�ħ�� �ǹ̴� tableWrite() ȣ��

			Connection conn = db.getOracle();
			Statement stmt = null;

			try {
				stmt = conn.createStatement();
				int a = stmt.executeUpdate(sql);

				if (a==0) {
					JOptionPane.showMessageDialog(this, "���� ������ ��ȣ�Դϴ�");
				}else {
					sawonTableWrite(1);
				} 

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(stmt, conn);
			}
		} 


	//������ư �̺�Ʈ
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

		Object ob = e.getSource();
		
		for (int i=0;i<rb.length;i++) {
			if (rb[i]==ob) 
				this.sawonTableWrite(i+1);			
		}
	}
	
	//�߰�,���� ��ư �̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt = null;
		String sql;
		
		if (ob==btnDel) {
			
			//���1
			//���ȣ ���..���� ���ҽ� -1			
			int row = table.getSelectedRow();
			
			if (row==1) {
				JOptionPane.showMessageDialog(this, "������ ���� �������ּ���");
				return;
			}
			
			//������ ���� id(num)�� ���
			String num = (String)model.getValueAt(row, 1);
			
			sql="delete from sawon where num=?";
			
			try {
				pstmt=conn.prepareStatement(sql);
				//���ε�
				pstmt.setString(1, num);
				//����
				pstmt.execute();
				//������ �ٽ� �ҷ�����
				this.sawonTableWrite(1);
				
			} catch (Exception e2) {
				// TODO: handle exception
			}finally {
				db.dbClose(pstmt, conn);
			}
				
		//���2 
		//	String num = JOptionPane.showInputDialog("������ ID�� �Է����ּ���");
		//�����޼��� ȣ��
		//	deleteData(num);
		}else if (ob==btnAdd) {
			
			//���1
			//�̸�, ����, �μ�, �޿�
			String name = JOptionPane.showInputDialog("�л����� �Է����ּ���");
			String gender = JOptionPane.showInputDialog("������ �Է����ּ���");
			String buseo = JOptionPane.showInputDialog("�μ����� �Է����ּ���");
			int pay = Integer.parseInt(JOptionPane.showInputDialog("������ �Է����ּ���"));
			
			sql="insert into sawon values(seq_sawon.nextval,?,?,?,?)";
			
			try {
				pstmt=conn.prepareStatement(sql);
				
				//���ε� �� �ض�
				pstmt.setString(1, name);
				pstmt.setString(2, gender);
				pstmt.setString(3, buseo);
				pstmt.setInt(4, pay);
				//������ �������
				pstmt.execute();
				this.sawonTableWrite(1);
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				db.dbClose(pstmt, conn);
			}
			
			
			
		}
	}
	
	
//////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _01_SawonDbSwing("�����ȸ ���̺�");


	}

	



}
