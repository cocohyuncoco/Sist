package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class _03_FileDialog extends JFrame{

	Container cp;
	
	JTextArea area;
	JButton btnOpen, btnSave;
	
	public _03_FileDialog(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		cp=this.getContentPane();
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,255,155));
		
		//디자인메서드 호출
		setDesign();
		this.setVisible(true);
	
	}
	
	public void setDesign() {
		
		this.setLayout(null);
		
		//btnOpen
		btnOpen = new JButton("파일불러오기");
		btnOpen.setBounds(40,20,120,30);
		this.add(btnOpen);
		
		//불러오기 버튼 이벤트
		btnOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FileDialog dlg =new FileDialog(_03_FileDialog.this, "파일열기", FileDialog.LOAD);	
				dlg.setVisible(true); //★이거 해줘야 보여짐★
				
				//선택한 디렉토리
				String dir = dlg.getDirectory();
				
				//선택한 파일명
				String file = dlg.getFile();
				
				System.out.println(dir+"\n"+file);
				
				//취소누르면 종료
				if (dir==null) {
					return;
				}
				
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					
					fr = new FileReader(dir+file);
					br = new BufferedReader(fr);
					
					//기존데이터 항상 삭제후 불러오기					
					area.setText(""); //초기화
					
					while (true) {
						
						String s = br.readLine();
						
						if (s==null) {
							break;
						}
						
						//area에 읽은데이터 출력
						area.append(s+"\n");
					}
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
						try {
							if (br!=null) br.close();							
							if (fr!=null) fr.close();
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				}
				
			
			}
		});
		
		//btnSave
		btnSave = new JButton("파일저장하기");
		btnSave.setBounds(220,20,120,30);
		this.add(btnSave);
		
		//파일 저장 이벤트
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				FileDialog  dlg= new FileDialog(_03_FileDialog.this, "파일저장", FileDialog.SAVE);
				dlg.setVisible(true);
				
				String dir = dlg.getDirectory();
				String file = dlg.getFile();
				
				if (dir==null) {
					return;
				}
				
				FileWriter fw = null;
				
				try {
					fw = new FileWriter(dir+file);
					
					//area의 내용 가지고와서 파일에 저장
					fw.write(area.getText()+"\n");
					
					//area에 저장메세지
					area.setText(file+" 파일로 저장됨");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					try {
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
			}
		});
		
		
		
		//area
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String day = sdf.format(new Date());
		
		area = new JTextArea(day);
		area.setFont(new Font("맑은고딕", Font.BOLD, 12));
		
		JScrollPane js = new JScrollPane(area);
		js.setBounds(40,50,300,200);
		
		this.add(js);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _03_FileDialog("스윙 파일 다이얼로그#3");  
	
	}

}
