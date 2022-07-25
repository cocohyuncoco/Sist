package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class _02_SwingSettingSave extends JFrame{
	
	Container cp;
	int fsize; //라디오박스 글꼴 크기 선택 변수
	
	//버튼 체크된게 true, 체크 안된게 falus 여서 boolean
	boolean italic, bold; 
	
	//파일명
	static final String FILENAME="C:\\sist0117\\javawork\\setting.txt";
	
	JCheckBox cbItalic, cbBold; //이탤릭에 체크해야지 볼드에 체크해야지 하게끔
	
	JRadioButton[] rbFont = new JRadioButton[4];
	
	JLabel lblResult;
	
	public _02_SwingSettingSave(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		cp=this.getContentPane();
		this.setBounds(100, 100, 400, 400);
	//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255,255,155));
	
			
		setDeisgin();
		//셋팅값을 파일에서 불러와서 디자인에 반영함으로 여기서 호출
		
		
		
		//닫을때 저장되는 종료 이벤트..특별지시 있을경우는 당연히 만들어주셔야 합니다
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);

				//저장에 관한 메서드호출
				saveSetting();
				
				//메세지
				JOptionPane.showMessageDialog(_02_SwingSettingSave.this, "셋팅값 저장후 종료합니다");
				//this에서 에러나면 클래스명(제목).this
				
				//종료
				System.exit(0); //강제종료
			
			}
		});

		readSetting();
		this.setVisible(true);
		
	}
	
	//스윙생성시 셋팅값 불러오는 메서드
	public void readSetting() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			fsize = Integer.parseInt(br.readLine()); //readLine은 반환형이 string이라고 정해져있음. 우리가 필요한건 int라 변형해줘야함 //숫자로 확인
			
			italic = Boolean.parseBoolean(br.readLine()); //얘는 참, 거짓으로 확인할거야 
			bold = Boolean.parseBoolean(br.readLine());
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			//초기값 없을경우 지정
			fsize=15;
			italic=false;
			bold=false;
			
		}catch (IOException e) {
			
		}finally {
			System.out.println("확인: fsize "+fsize);
			System.out.println("확인: italic "+italic);
			System.out.println("확인: bold "+bold);
			try {
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	//종료할때 셋팅값 저장해주는 메서드
	
	public void saveSetting() {
		
		//fsize, italic, bold 순으로 저장
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(FILENAME);
			
			//저장
			fw.write(fsize+"\n");
			fw.write(italic+"\n");
			fw.write(bold+"\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void setDeisgin() {
		
		this.setLayout(null);
		
		lblResult = new JLabel("파일입출력 저장확인", JLabel.CENTER);
		lblResult.setBounds(20,30,350,80);
		lblResult.setBorder(new LineBorder(Color.MAGENTA, 5));
		lblResult.setOpaque(true);
		lblResult.setBackground(Color.orange);
		this.add(lblResult); //프레임에추가
		
		//라디오버튼..폰트사이즈
		int init=10; //기본글꼴사이즈..10
		int xpos=50;
		ButtonGroup bg = new ButtonGroup();
		
		for (int i=0;i<rbFont.length;i++) {
			
			//라디오4개생성
			rbFont[i] = new JRadioButton(String.valueOf(init));
			init += 5; //10부터 5씩 증가..10,15,20,25

			//라디오 그룹에 라디오넣고
			bg.add(rbFont[i]);
			
			//라디오 디자인
			rbFont[i].setBounds(xpos, 150, 40, 30);
			rbFont[i].setOpaque(false);
			
			//라디오 생성
			this.add(rbFont[i]);
			
			//라디오 위치 정렬
			xpos += 50;
			
			int idx=i;
			
			//익명내부클래스..폰트바꾸는
			rbFont[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					fsize = Integer.parseInt(rbFont[idx].getText());
					changeFont();
					
				}
			});
			
		}
		
		
		//체크박스..굵게, 기울기
		//기울게 생성 및 위치지정
		cbItalic = new JCheckBox("기울게",italic);
		cbItalic.setBounds(150,200,80,30);
		cbItalic.setOpaque(false);
		this.add(cbItalic);
		
		//기울게 이벤트
		cbItalic.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				//italic = cbItalic.isSelected(); //선택시 true..방법1
				
				JCheckBox ob=(JCheckBox)e.getSource(); //방법2
				italic = ob.isSelected();
				
				changeFont();
			}
		});
		
		//굵게 생성 및 위치지정
		cbBold = new JCheckBox("굵게",bold);
		cbBold.setBounds(60,200,60,30);
		cbBold.setOpaque(false);
		this.add(cbBold);
		
		//굵게 이벤트
		cbBold.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//방법1
				//bold = cbBold.isSelected();
				//changeFont();
				
				//방법2
				bold=cbBold.isSelected();
				changeFont();
			}
		});
	}
	//폰트, 굵게, 기울림(이탤릭)...에 관한 메서드
	public void changeFont() {
		
		if (italic && bold) {
			lblResult.setFont(new Font("궁서체", Font.BOLD|Font.ITALIC, fsize));
		}else if (italic && !bold) {
			lblResult.setFont(new Font("궁서체", Font.ITALIC, fsize));
		}else if (!italic && bold) {
			lblResult.setFont(new Font("궁서체", Font.BOLD, fsize));
		}else {
			lblResult.setFont(new Font("궁서체", Font.PLAIN, fsize));
		}
	}
	
	//////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _02_SwingSettingSave("#2");
	}

}
