package day0217;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class _11_ClientChst extends JFrame implements Runnable, ActionListener{
	//Runnable은 서버가 보내주면 그 메세지를 받기위한것

	JTextArea area;
	String nickname;
	JTextField tfSErverIP, tfNickName, tfMessage;
	JButton btnConnect, btnSend;

	Socket socket; //소켓이 있어야 서버와 대화 주고받음
	//서버와 대화 주고받는건 클라이언트 ...그래서 미리 변수 선언

	BufferedReader br;
	PrintWriter pw;

	public _11_ClientChst() {
		// TODO Auto-generated constructor stub
		super("클라이언트 입니다");
		this.setBounds(800, 100, 400, 500);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//종료시 이벤트
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);


				//서버에 9번째 닉네임 보내서 퇴장 알린다
				pw.write("9|"+tfNickName.getText()+"\n");
				pw.flush();

				System.exit(0);
			}
		});


		this.setDesign();
		this.setVisible(true);
	}

	public void setDesign() {

		this.setLayout(null);

		JLabel lbl1 = new JLabel("서버IP");
		lbl1.setBounds(25, 20, 50, 30);
		this.add(lbl1);

		tfNickName=new JTextField("임현정"); //자기이름
		tfNickName.setBounds(70,20,80,30);
		this.add(tfNickName);

		tfSErverIP=new JTextField("192.168.1.6"); //자기 IP주소
		tfSErverIP.setBounds(160,20,80,30);
		this.add(tfSErverIP);

		btnConnect=new JButton("접속");
		btnConnect.setBounds(280, 20, 80, 30);
		this.add(btnConnect);

		//접속 이벤트 (내부클래스)
		btnConnect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				//서버ip읽어온다
				String serverIP = tfSErverIP.getText().trim();


				//서버에 접속 
				try {
					socket = new Socket(serverIP, 6000);

					area.append("서버에 성공적으로 접속\n");

					//네트워크 통해서 메세지 읽고 쓰기위한 io변수생성
					pw = new PrintWriter(socket.getOutputStream());
					br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

					//창제목을 닉네임으로 변경
					_11_ClientChst.this.setTitle(tfNickName.getText()+" 님의 채팅창");

					//서버에 메세지 보내기
					pw.write("1|"+tfNickName.getText().trim()+"\n");
					pw.flush();

					//Run 메서드 호출 (Run메서드는 서버가 보내준 메세지를 읽는것)
					Thread th = new Thread(_11_ClientChst.this);
					th.start(); //Run 호출

				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					area.append("서버주소, 포트 다시 확인하세요"+e1.getMessage()+"\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					area.append("접속오류: "+e1.getMessage()+"\n");
				}
}
		});

		area=new JTextArea();
		area.setFont(new Font("",Font.BOLD,16));
		JScrollPane js = new JScrollPane(area);
		js.setBounds(20,50,340,330);
		this.add(js);

		tfMessage = new JTextField();
		tfMessage.setBounds(20,390,260,30);
		this.add(tfMessage);

		btnSend = new JButton("전송");
		btnSend.setBounds(290,390,60,30);
		this.add(btnSend);
		
		//액션 객체
		tfMessage.addActionListener(this);
		btnSend.addActionListener(this);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object ob = e.getSource();
		
		//메세지 입력후 엔터 혹은 전송버튼
		if (ob==tfMessage || ob==btnSend) {
			
			//서버에 메세지...2|메세지|닉네임형식으로 보냄
			pw.write("2|"+tfMessage.getText().trim()+"|"+tfNickName.getText().trim()+"\n");
			pw.flush();
			
			//입력창 메세지 지우기 (기본)
			tfMessage.setText("");
			
			//커서 메세지창에 두기
			tfMessage.requestFocus();
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true) {

			try {
				//서버가 보내준 메세지 읽는다
				String msg = br.readLine();
				//area에 출력
				area.append(msg+"\n");
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _11_ClientChst();

	}



}
