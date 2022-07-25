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
		
		//테이블 생성후 db로부터 데이터 가져오는데..1번을 전체출력
		this.sawonTableWrite(1);
		
		this.setVisible(true);
	}

	//디자인
	public void initDesign() {

		this.setLayout(null);

		//테이블 추가
		String[] title = {"No.","ID","사원명","부서명","성별","월급"};
		model = new DefaultTableModel(title, 0); //제목, 행갯수
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		js.setBounds(10,100,670,350);
		this.add(js);

		//라디오버튼 추가
		ButtonGroup bg = new ButtonGroup();

		//1.전체사원 2.여자 3.남자 4.개발부 5.홍보부 6.교육부
		String[] rb_label = {"전체","여자","남자","개발부","홍보부","교육부"};

		int xpos=10;
		for (int i=0;i<rb.length;i++) {

			//라디오버튼 생성..전체를 기본선택
			rb[i]=new JRadioButton(rb_label[i], i==0?true:false);
			rb[i].setBounds(xpos, 50, 90, 30);
			rb[i].setOpaque(false);

			//이벤트추가
			rb[i].addItemListener(this);
			bg.add(rb[i]);
			this.add(rb[i]);
			xpos+=100;

		}

		//추가버튼
		btnAdd = new JButton("추가");
		btnAdd.setBounds(250, 10, 80, 30);
		this.add(btnAdd);
		btnAdd.addActionListener(this);
		//삭제버튼
		btnDel = new JButton("삭제");
		btnDel.setBounds(350, 10, 80, 30);		
		this.add(btnDel);		
		btnDel.addActionListener(this);
		
	}

	//db조회해서 테이블에 추가
	//1. 전체사원 2.여자. 3.남자 4.개발부 5.홍보부 6.교육부
	public void sawonTableWrite(int select) {

		String sql="";
		if (select==1) 
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon";
		else if (select==2) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where gender='여자'";
		}else if (select==3) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where gender='남자'";
		}else if (select==4) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where buseo='개발부'";
		}else if (select==5) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where buseo='홍보부'";
		}else if (select==6) {
			sql="select ROWNUM no,num id,name,buseo,gender,To_char(pay, 'L999,999,000') pay from sawon where buseo='교육부'";
		}

			Connection conn = db.getOracle();
			Statement stmt = null;
			ResultSet rs = null;

			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);

				//기존의 데이터 삭제후 가져오기 | 새로고침이니까
				model.setRowCount(0);

				while (rs.next()) {

					//테이블에 추가할 벡터 선언후 데이터 추가
					Vector<String> date = new Vector<String>();

					date.add(rs.getString("no"));
					date.add(rs.getString("id"));
					date.add(rs.getString("name"));
					date.add(rs.getString("buseo"));
					date.add(rs.getString("gender"));
					date.add(rs.getString("pay"));

					//벡터를 데이터 행으로 추가
					model.addRow(date);

				}


			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(rs, stmt, conn);

			}
		
			
		}
		
	
	//삭제메서드 delete...
		public void deleteData(String num) {

			System.out.println("num="+num);
			String sql="delete from sawon where num="+num;

			//sql문 실행한 다음에 해당번호 없으면 메세지...삭제되면 새로고침(set"")
			//새로고침의 의미는 tableWrite() 호출

			Connection conn = db.getOracle();
			Statement stmt = null;

			try {
				stmt = conn.createStatement();
				int a = stmt.executeUpdate(sql);

				if (a==0) {
					JOptionPane.showMessageDialog(this, "없는 데이터 번호입니다");
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


	//라디오버튼 이벤트
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

		Object ob = e.getSource();
		
		for (int i=0;i<rb.length;i++) {
			if (rb[i]==ob) 
				this.sawonTableWrite(i+1);			
		}
	}
	
	//추가,삭제 버튼 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt = null;
		String sql;
		
		if (ob==btnDel) {
			
			//방법1
			//행번호 얻기..선택 안할시 -1			
			int row = table.getSelectedRow();
			
			if (row==1) {
				JOptionPane.showMessageDialog(this, "삭제할 행을 선택해주세요");
				return;
			}
			
			//선택한 행의 id(num)값 얻기
			String num = (String)model.getValueAt(row, 1);
			
			sql="delete from sawon where num=?";
			
			try {
				pstmt=conn.prepareStatement(sql);
				//바인딩
				pstmt.setString(1, num);
				//생성
				pstmt.execute();
				//데이터 다시 불러오기
				this.sawonTableWrite(1);
				
			} catch (Exception e2) {
				// TODO: handle exception
			}finally {
				db.dbClose(pstmt, conn);
			}
				
		//방법2 
		//	String num = JOptionPane.showInputDialog("삭제할 ID를 입력해주세요");
		//삭제메서드 호촐
		//	deleteData(num);
		}else if (ob==btnAdd) {
			
			//방법1
			//이름, 성별, 부서, 급여
			String name = JOptionPane.showInputDialog("학생명을 입력해주세요");
			String gender = JOptionPane.showInputDialog("성별을 입력해주세요");
			String buseo = JOptionPane.showInputDialog("부서명을 입력해주세요");
			int pay = Integer.parseInt(JOptionPane.showInputDialog("월급을 입력해주세요"));
			
			sql="insert into sawon values(seq_sawon.nextval,?,?,?,?)";
			
			try {
				pstmt=conn.prepareStatement(sql);
				
				//바인딩 좀 해라
				pstmt.setString(1, name);
				pstmt.setString(2, gender);
				pstmt.setString(3, buseo);
				pstmt.setInt(4, pay);
				//생성도 까먹지마
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
		new _01_SawonDbSwing("사원조회 테이블");


	}

	



}
