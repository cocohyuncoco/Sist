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
		
		//디자인메서드 호출
		setDesign();
		this.setVisible(true);
	}
	
	public void setDesign() {
		
		this.setLayout(new GridLayout(2, 2)); //2행2열
		
		//1. 1번째 테이블..행 열만 지정
		tb1 = new JTable(5, 4);
		this.add(tb1);
		
		//2. 2번째 테이블은 생성할때 데이터 넣기
		String[] title1 = {"이름","학과","주소"};
		String[][] data1 = {
				{"임현정","시각디자인과","용인"},
				{"김동규","바이오융합학과","용인"},
				{"이초코","식품학과","서울"}
		};
		
		tb2 = new JTable(data1, title1);
		this.add(new JScrollPane(tb2));

		//3. 3번째 테이블..Model 이용해서 생성(나중에 추가, 삭제가 가능)
		DefaultTableModel model=new DefaultTableModel(data1, title1);
		tb3 = new JTable(model);
		this.add(new JScrollPane(tb3));
		//tb3는 모델을 이용했음으로 추가 가능
		
		String[] addData = {"강펭하","얼름시원과","북극"};
		model.addRow(addData);
		
		//★ 백터로 생성후 추가 ★ 많이씀
		Vector<String> addData2 = new Vector<String>();
		//하나씩 추가도 가능
		addData2.add("유재석");
		addData2.add("멀티미디어과");
		//addData2.add("서울시"); 
		
		model.addRow(addData2);
		
		
		//출력
		area=new JTextArea();
		this.add(new JScrollPane(area));
		
		//JTable Model 메서드 확인
		int rowCount = tb3.getRowCount();
		int rowCount2 = model.getRowCount();
		
		//행갯수
		area.append("tb3 의 행갯수: "+rowCount+"\n");
		area.append("tb3 의 행갯수: "+rowCount2+"\n");
		
		//열갯수
		int columnCount = tb3.getColumnCount();				
		area.append("tb3 의 열갯수: "+columnCount+"\n");

		//행열에 관한 값
		area.append("1행1열의 값: "+tb3.getValueAt(1, 1)+"\n");
		area.append("3행2열의 값: "+tb3.getValueAt(3, 2)+"\n");
		area.append("3행2열의 값: "+model.getValueAt(3, 2)+"\n");
		
		//tb3에 마우스클릭 이벤트를 추가해서 area에 출력
		tb3.addMouseListener(new MouseAdapter() {
			
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			
			//System.out.println("테이블 클릭!!");
			
			//선택한 행번호 얻기
			int row = tb3.getSelectedRow();
		
			//선택한 열번호 얻기
			int col = tb3.getSelectedColumn();		
	
			//행, 열번호 데이터 얻어서 출력
			area.append(row+","+col+" ---> "+tb3.getValueAt(row, col)+"\n");
			
		}
			
		});
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _05_SwingTable("테이블연습#5");
	}

}
