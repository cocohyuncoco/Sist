package day0303;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class _02_SwingStuDb extends JFrame implements ActionListener{

	DbConnect db = new DbConnect();

	Container cp;

	//����,������ ������ ���̺��� ����Ʈ ���̺� �𵨻� | ����Ʈ���̺���� �ִ��ؼ� JTable�� ���� �ȵȴ�
	DefaultTableModel model;
	JTable table;

	//�߰�, ����, ���� ��ư
	JButton btnAdd,btnDel,btnUpdate;

	//�߰� �޼��� ȣ�� AddFrame
	AddFrame addFrame = new AddFrame("�����߰�");

	//���� �޼��� ȣ��
	UpdateFrame updateFrame = new UpdateFrame("��������");


	public _02_SwingStuDb(String title) {

		super(title);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500, 100, 400, 300);
		cp.setBackground(new Color(255,255,100));

		initDesign();
		this.setVisible(true);
	}

	//������
	public void initDesign() {

		String[] title= {"��ȣ","�̸�","��","JAVA","JSP","Spring","����","���"};

		model=new DefaultTableModel(title, 0); //�ƹ��͵� ������ 0 �ϱ�
		table=new JTable(model); //����Ʈ���̺�� ���
		this.add("Center", new JScrollPane(table)); //��ũ���濡�� ���̺���

		//���̺� DB������ ��� �޼��� ȣ��
		tableWrite();

		JPanel pTop=new JPanel(); //��� ����
		this.add("North", pTop); //�����ٰ� �����ž� pTop��

		//��ο��� ��ư3�� �ø��ž�
		btnAdd = new JButton("�߰�");
		btnAdd.addActionListener(this);
		pTop.add(btnAdd);

		btnDel = new JButton("����");
		btnDel.addActionListener(this);
		pTop.add(btnDel);

		btnUpdate = new JButton("����");
		btnUpdate.addActionListener(this);
		pTop.add(btnUpdate);

		//���� ������ �߰��������� ��ư | �߰��������� ��ư�� ��� �θ���?
		addFrame.btnAdd.addActionListener(this); //�̷���

		//���� ������ ������Ʈ �������� ��ư 
		updateFrame.btnMod.addActionListener(this);



	}

	//insert....AddFrame.btnAdd�� Ŭ����...
	public void insertDate() {

		String name = addFrame.tfName.getText();
		String java = addFrame.tfJava.getText();
		String jsp = addFrame.tfJsp.getText();
		String spring = addFrame.tfSpring.getText();
		String ban = (String)addFrame.cbBan.getSelectedItem(); // ������ �׻� getSelectedItem, ������ �ȸ����� �׳� () ���� �����ֱ�

		int tot = Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		Double avg = tot/3.0;

		String sql="insert into studentinfo values(seq_test.nextval, ?,?,?)";

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			//? 7�� ���ε�
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avg);
			pstmt.setString(7, ban);

			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}

	//update....updateFrame.btnAdd�� Ŭ����...
	public void updateData() {
		
		String num = updateFrame.num;
		
		String name = updateFrame.tfName.getText();
		String java = updateFrame.tfJava.getText();
		String jsp = updateFrame.tfJsp.getText();
		String spring = updateFrame.tfSpring.getText();
		String ban = (String)updateFrame.cbBan.getSelectedItem(); // ������ �׻� getSelectedItem, ������ �ȸ����� �׳� () ���� �����ֱ�

		int tot = Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		Double avg = tot/3.0;
		

		//������ insert�� Ʋ������
		String sql="update studentinfo set name=?,java=?,jsp=?,spring=?,total=?,average=?,ban=? where num=?";
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		try {
			pstmt=conn.prepareStatement(sql);
			//? 7�� ���ε�
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avg);
			pstmt.setString(7, ban);
			pstmt.setString(8, num);
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}

	//���̺� ����ϴ� �޼���
	public void tableWrite() {
		//���̺� �ʱ�ȭ
		model.setRowCount(0);

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		//������ ��������
		String sql="select * from studentinfo order by num asc";

		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();

			//�迭�� ������ ����, ������ �ȵȴ�. �׷��� �ٸ��ɷ� ��������
			//�迭���� �� ��ȭ�Ѱ� Vector(����), ��̸���Ʈ 
			while (rs.next()) {

				//�ٷ��� ���·� ��ڴ�. Vector. string ���·� ��ڴ�. int,class�� ����������
				Vector<String> date = new Vector<String>();

				//���Ϳ��� �߰����ִ� �޼��� ����.add
				date.add(rs.getString("num"));
				date.add(rs.getString("name"));
				date.add(rs.getString("ban"));
				date.add(rs.getString("java"));
				date.add(rs.getString("jsp"));
				date.add(rs.getString("spring"));
				date.add(rs.getString("total"));
				date.add(rs.getString("average"));

				//���̺� �߰�
				model.addRow(date);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
	}


	//�����޼��� delete...
	public void deleteData(String num) {

		System.out.println("num="+num);
		String sql="delete from studentinfo where num="+num;

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
				tableWrite();
			} 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	} 





	//��ư3�� �̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object ob = e.getSource();

		if (ob==btnAdd) { //�߰� �������� �����°�
			//System.out.println("add");			
			addFrame.setVisible(true);			

		}else if (ob==btnDel) {
			//System.out.println("del");
			//�ڵ��߰�

			//�Է¹��� ��ȣ �Ķ��Ÿ ������ �Ѱܼ� num ���� �ν��ϰ� ����
			String num = JOptionPane.showInputDialog("������ ������ ��ȣ�� �Է����ּ���");
			//�����޼��� ȣ��
			deleteData(num);

		}else if (ob==btnUpdate) {
			System.out.println("update");
			//�ڵ��߰�
			String num = JOptionPane.showInputDialog("������ ������ ��ȣ�� �Է����ּ���");
			
			String sql="select * from studentinfo where num="+num;
			Connection conn = db.getOracle();
			Statement stmt = null;
			ResultSet rs = null;
			
			try {
				stmt=conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				//������ �����Ͱ� ������ while��, �ϳ��ϋ� if�� 
				if (rs.next()) {
					
					//����â�� �ش絥���� ������ ������ ���°�!!
					
					updateFrame.num=num;//���̰� �������� �������� �ѱ�� ��� ǥ���ԡ�
					updateFrame.tfName.setText(rs.getString("name"));
					updateFrame.tfJava.setText(rs.getString("java"));
					updateFrame.tfJsp.setText(rs.getString("jsp"));
					updateFrame.tfSpring.setText(rs.getString("spring"));
					updateFrame.cbBan.setSelectedItem(rs.getString("ban"));		
					updateFrame.setVisible(true);
			
				}else {
					JOptionPane.showMessageDialog(this, "�ش� ��ȣ�� ���¹�ȣ �Դϴ�");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				db.dbClose(rs, stmt, conn);				
			}
		}else if (ob==addFrame.btnAdd) { //���� insert
			//System.out.println("�߰������� �׼��׽�Ʈ");
			//�Էµ����� �о�ͼ� DB�߰�
			insertDate();
			//���̺��� �ٽ����
			tableWrite();

			//�ʱ�ȭ...�׻� setText�� ������ְ�
			addFrame.tfName.setText("");
			addFrame.tfJava.setText("");
			addFrame.tfJsp.setText("");
			addFrame.tfSpring.setText("");
			addFrame.cbBan.setSelectedItem(0);

			//��Ŀ�� �ٽ� ��ó������
			addFrame.tfName.requestFocus();

			//�߰������� �������
			addFrame.setVisible(false);
		}else if (ob==updateFrame.btnMod) {
			//�����޼���
			updateData();
			//���̺��� �ٽ����
			tableWrite();

			updateFrame.tfName.setText("");
			updateFrame.tfJava.setText("");
			updateFrame.tfJsp.setText("");
			updateFrame.tfSpring.setText("");
			
			updateFrame.tfName.requestFocus();

			//�߰������� �������
			updateFrame.setVisible(false);
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _02_SwingStuDb("��������DB");

	}



}
