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

	//수정,삭제가 가능한 테이블은 디폴트 테이블 모델뿐 | 디폴트테이블모델이 있다해서 JTable가 없음 안된다
	DefaultTableModel model;
	JTable table;

	//추가, 삭제, 수정 버튼
	JButton btnAdd,btnDel,btnUpdate;

	//추가 메서드 호출 AddFrame
	AddFrame addFrame = new AddFrame("성적추가");

	//수정 메서드 호출
	UpdateFrame updateFrame = new UpdateFrame("성적수정");


	public _02_SwingStuDb(String title) {

		super(title);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500, 100, 400, 300);
		cp.setBackground(new Color(255,255,100));

		initDesign();
		this.setVisible(true);
	}

	//디자인
	public void initDesign() {

		String[] title= {"번호","이름","반","JAVA","JSP","Spring","총점","평균"};

		model=new DefaultTableModel(title, 0); //아무것도 없을땐 0 하기
		table=new JTable(model); //디폴트테이블모델 담고
		this.add("Center", new JScrollPane(table)); //스크롤펜에는 테이블담고

		//테이블에 DB데이터 출력 메서드 호출
		tableWrite();

		JPanel pTop=new JPanel(); //페널 생성
		this.add("North", pTop); //위에다가 넣을거야 pTop을

		//페널에다 버튼3개 올릴거야
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pTop.add(btnAdd);

		btnDel = new JButton("삭제");
		btnDel.addActionListener(this);
		pTop.add(btnDel);

		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(this);
		pTop.add(btnUpdate);

		//새로 생성된 추가프레임의 버튼 | 추가프레임의 버튼은 어떻게 부를까?
		addFrame.btnAdd.addActionListener(this); //이렇게

		//새로 생성된 업데이트 프레임의 버튼 
		updateFrame.btnMod.addActionListener(this);



	}

	//insert....AddFrame.btnAdd를 클릭시...
	public void insertDate() {

		String name = addFrame.tfName.getText();
		String java = addFrame.tfJava.getText();
		String jsp = addFrame.tfJsp.getText();
		String spring = addFrame.tfSpring.getText();
		String ban = (String)addFrame.cbBan.getSelectedItem(); // 선택은 항상 getSelectedItem, 형식이 안맞으면 그냥 () 으로 맞춰주기

		int tot = Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		Double avg = tot/3.0;

		String sql="insert into studentinfo values(seq_test.nextval, ?,?,?)";

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			//? 7개 바인딩
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

	//update....updateFrame.btnAdd를 클릭시...
	public void updateData() {
		
		String num = updateFrame.num;
		
		String name = updateFrame.tfName.getText();
		String java = updateFrame.tfJava.getText();
		String jsp = updateFrame.tfJsp.getText();
		String spring = updateFrame.tfSpring.getText();
		String ban = (String)updateFrame.cbBan.getSelectedItem(); // 선택은 항상 getSelectedItem, 형식이 안맞으면 그냥 () 으로 맞춰주기

		int tot = Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		Double avg = tot/3.0;
		

		//순서는 insert랑 틀려도됨
		String sql="update studentinfo set name=?,java=?,jsp=?,spring=?,total=?,average=?,ban=? where num=?";
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		try {
			pstmt=conn.prepareStatement(sql);
			//? 7개 바인딩
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

	//테이블에 출력하는 메서드
	public void tableWrite() {
		//테이블 초기화
		model.setRowCount(0);

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		//시퀀스 오름차순
		String sql="select * from studentinfo order by num asc";

		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();

			//배열의 단점은 수정, 삭제가 안된다. 그래서 다른걸로 담아줘야함
			//배열보다 더 진화한건 Vector(백터), 어레이리스트 
			while (rs.next()) {

				//꾸러미 형태로 담겠다. Vector. string 형태로 담겠다. int,class도 담을수있음
				Vector<String> date = new Vector<String>();

				//백터에서 추가해주는 메서드 뭐뭐.add
				date.add(rs.getString("num"));
				date.add(rs.getString("name"));
				date.add(rs.getString("ban"));
				date.add(rs.getString("java"));
				date.add(rs.getString("jsp"));
				date.add(rs.getString("spring"));
				date.add(rs.getString("total"));
				date.add(rs.getString("average"));

				//테이블에 추가
				model.addRow(date);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
	}


	//삭제메서드 delete...
	public void deleteData(String num) {

		System.out.println("num="+num);
		String sql="delete from studentinfo where num="+num;

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
				tableWrite();
			} 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	} 





	//버튼3개 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object ob = e.getSource();

		if (ob==btnAdd) { //추가 프레임이 나오는거
			//System.out.println("add");			
			addFrame.setVisible(true);			

		}else if (ob==btnDel) {
			//System.out.println("del");
			//코드추가

			//입력받은 번호 파라메타 값으로 넘겨서 num 값을 인식하고 삭제
			String num = JOptionPane.showInputDialog("삭제할 데이터 번호를 입력해주세요");
			//삭제메서드 호촐
			deleteData(num);

		}else if (ob==btnUpdate) {
			System.out.println("update");
			//코드추가
			String num = JOptionPane.showInputDialog("수정할 데이터 번호를 입력해주세요");
			
			String sql="select * from studentinfo where num="+num;
			Connection conn = db.getOracle();
			Statement stmt = null;
			ResultSet rs = null;
			
			try {
				stmt=conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				//가져올 데이터가 여러개 while로, 하나일떈 if로 
				if (rs.next()) {
					
					//수정창에 해당데이터 ㄱ밧을 가지고 오는것!!
					
					updateFrame.num=num;//★이걸 웹에서는 히든으로 넘긴다 라고 표현함★
					updateFrame.tfName.setText(rs.getString("name"));
					updateFrame.tfJava.setText(rs.getString("java"));
					updateFrame.tfJsp.setText(rs.getString("jsp"));
					updateFrame.tfSpring.setText(rs.getString("spring"));
					updateFrame.cbBan.setSelectedItem(rs.getString("ban"));		
					updateFrame.setVisible(true);
			
				}else {
					JOptionPane.showMessageDialog(this, "해당 번호는 없는번호 입니다");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				db.dbClose(rs, stmt, conn);				
			}
		}else if (ob==addFrame.btnAdd) { //실제 insert
			//System.out.println("추가프레임 액션테스트");
			//입력데이터 읽어와서 DB추가
			insertDate();
			//테이블을 다시출력
			tableWrite();

			//초기화...항상 setText가 비워져있고
			addFrame.tfName.setText("");
			addFrame.tfJava.setText("");
			addFrame.tfJsp.setText("");
			addFrame.tfSpring.setText("");
			addFrame.cbBan.setSelectedItem(0);

			//포커스 다시 맨처음으로
			addFrame.tfName.requestFocus();

			//추가프레임 사라지게
			addFrame.setVisible(false);
		}else if (ob==updateFrame.btnMod) {
			//수정메서드
			updateData();
			//테이블을 다시출력
			tableWrite();

			updateFrame.tfName.setText("");
			updateFrame.tfJava.setText("");
			updateFrame.tfJsp.setText("");
			updateFrame.tfSpring.setText("");
			
			updateFrame.tfName.requestFocus();

			//추가프레임 사라지게
			updateFrame.setVisible(false);
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _02_SwingStuDb("성적관리DB");

	}



}
