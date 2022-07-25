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
		
		//디자인메서드 호출
		setDesign();
		this.setVisible(true);
	
	}
	
	public void setDesign() {
		
		String[][] data = { //이차원배열
				{"송혜교","서울","010-7777-8888"},
				{"김동규","용인","010-4713-3241"},
				{"임현정","용인","010-5714-3241"}	};
		
		String [] title= {"이름","주소","연락처"};
		
		//라벨생성
		lblTitle = new JLabel("JTable 연습", JLabel.CENTER);
		lblOut = new JLabel("결과나오는곳", JLabel.CENTER);
		
		//테이블
		table = new JTable(data, title);
		JScrollPane pane = new JScrollPane(table);
		
		//★ 테이블에 마우스 이벤트 추가 ★
		table.addMouseListener(new TableEvent());
		
		this.add("North", lblTitle);
		this.add("Center", pane);
		this.add("South", lblOut);
	}
	
	//마우스 이벤트..테이블 클릭시 (내부클래스)
	class TableEvent extends MouseAdapter{
	
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			
			System.out.println("테이블 클릭!!");
			//선택한 행번호 얻기
			int rowNum = table.getSelectedRow();
			
			//JOptionPane.showMessageDialog(_04_JTableEx.this, "행번호:"+rowNum);
			
			String str = "이름: "+table.getValueAt(rowNum, 0)
			+",주소: "+table.getValueAt(rowNum, 1)
			+",핸드폰 "+table.getValueAt(rowNum, 2);
	
			//라벨 출력
			lblOut.setText(str);
		}
	}	
	
	///////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _04_JTableEx("JTable 연습");
		
	}

}
