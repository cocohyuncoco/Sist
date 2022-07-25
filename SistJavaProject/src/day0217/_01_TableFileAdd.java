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
		
		//테이블 생성 후 파일데이터 추가
		tableDataSave();
		tableReadData();
		
		//종료시 이벤트 데이터저장
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				
				//파일저장 메서드 호출
				tableDataSave();
				System.exit(0);
				
			}
		});
		
		this.setVisible(true);
		
	}
	
	
	//데이터 저장
	//저장시 -> <바나나:3:1000:> 저장할땐 항상 구분기호 준 다음에 마지막 기호는(:) 빼고 저장
	public void tableDataSave() {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			
			for (int i=0;i<table.getRowCount();i++) { //이차원배열 할때 쓰는 이중포문
				
				String s =""; //누적할 변수
				
				for (int j=0;j<table.getColumnCount();j++) {
					
					s += table.getValueAt(i, j)+":"; //0행의 0값 을 s에 누적 
				}
				//마지막 한글자 : 제거
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
	
	
	
	//데이터 불러오기
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
				
				//테이블에 배열형 데이터 추가
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

		JLabel lbl1 = new JLabel("상품명");
		JLabel lbl2 = new JLabel("수량");
		JLabel lbl3 = new JLabel("단가");
	
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
		
		//버튼
		btnAdd = new JButton("추가하기");
		btnAdd.setBounds(50,120,100,30);
		this.add(btnAdd);

		btnDel = new JButton("삭제하기");
		btnDel.setBounds(200,120,100,30);
		this.add(btnDel);
			
		//버튼2개 이벤트연결
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		//테이블생성
		String[] title = {"상품명","수량","단가","총금액"};
		model = new DefaultTableModel(title, 0);//0은 행갯수
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		js.setBounds(20, 170, 350, 180);
		this.add(js);
		
		//테이블 클릭시 선택한 행번호를 selectRow에 저장
		table.addMouseListener(new MouseAdapter() { //마우스어뎁터
		
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				selectRow=table.getSelectedRow(); //selectRow 변수에 행번호 저장. 
			}
		});
	}
	
	//버튼이벤트2개
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		Object ob = e.getSource();
		
		if (ob==btnAdd) {
			
			String sang = tfSang.getText().trim();
			String su = tfSu.getText().trim();
			String dan = tfDan.getText().trim();
			
			if (sang.length()==0 || su.length()==0 || dan.length()==0) {
				JOptionPane.showMessageDialog(this, "3개값 모두 입력해주세요");
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
			
			//★ 테이블에 추가 ★
			model.addRow(data);
			
			//입력값 지워주기
			tfSang.setText("");
			tfSu.setText("");
			tfDan.setText("");
			
			
			
		}else if (ob==btnDel) {
			
			if (selectRow==-1) {
				JOptionPane.showMessageDialog(this, "삭제할 행을 먼저 선택해주세요");
			}else {
				model.removeRow(selectRow);
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _01_TableFileAdd("테이플 파일 추가 삭제 연습");
		
	}

	

}
