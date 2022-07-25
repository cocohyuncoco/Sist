package day0217;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class _11_ServerChat extends JFrame implements Runnable{ //Runnable 인터페이스 이용해서 만듬

	JTextArea area;
	ServerSocket severSocket;

	//클라이언트 정보 담을 리스트변수. 클래스니까 new로 생성가능
	Vector<ClientList> list = new Vector<ClientList>();


	public _11_ServerChat() {
		// TODO Auto-generated constructor stub
		super("서버입니다");
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDesign();
		this.setVisible(true);
	}

	public void setDesign() {

		area=new JTextArea();
		area.setFont(new Font("",Font.BOLD,16));
		this.add(new JScrollPane(area));

	}

	//클라이언트를 담을 내부클래스
	class ClientList extends Thread{
		//이미 Runnable이 돌고있기 때문에 하나 더 만들기위해 Thread 사용

		Socket socket;
		BufferedReader br = null;
		PrintWriter pw = null;

		String nickName;

		public ClientList(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket=socket;

			//네트워크 통해서 메세지 읽고 쓰기위한 인풋,아웃풋 변수 = printWriter. 
			//PrintWriter를 쓰고 BufferedReader로 읽는다

			try {
				pw = new PrintWriter(socket.getOutputStream());
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		//Run2 (대화하기 위한 쓰레드)..대화용
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();

			while (true) {

				//클라이언트가 보낸 메세지를 한줄단위로 읽는다
				try {
					String msg = br.readLine();

					//분리
					StringTokenizer st = new StringTokenizer(msg, "|");

					String num = st.nextToken(); //잘라주는 메서드
					String data = st.nextToken();

					//num이 뭘 할건지 조건을 주기
					switch (num) {
					case "1"://1일경우 닉네임만 보낵;
						this.nickName = data; //1일경우는 두번째 인자가 닉네임이고

						for (ClientList cc:list) { //for문을 이용해서 list 대입

							cc.pw.write(nickName+"님이 입장하셨습니다\n");
							cc.pw.flush(); // 네트워크 전송이되는 메서드
							//flush를 해야 네트워크 전송이 비로서 됨
						}
						break;
					case "2": //2일 경우는 모든 클라이언트 들한테 메세지 보내기

						String send = st.nextToken();

						for (ClientList cc:list) {

							cc.pw.write("\n"+send+"==>"+data+"\n");
							cc.pw.flush();
						}
						break;
					case "9"://9일 경우는 퇴장
						//data가 퇴장하는 사람 닉네임임으로 벡터에서 찾아 삭제
						for (int i=0;i<list.size();i++) {

							ClientList cc = list.get(i);

							if (data.equals(cc.nickName)) {
								list.remove(i);
								break;
							}
						}
						//for문 하나로 해도 되는데 구분짓기 위해 이렇게 한거. 나눠논게 섞이지 말라고
						//전체 클라이언트 한테 퇴장 알리기
						for (int i=0;i<list.size();i++) {

							ClientList cc = list.get(i); //백터에서 가져온 데이터
							cc.pw.write(data+"님이 퇴장했습니다\n");
							cc.pw.flush();
						}
						break;
						
					}
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}	//클라이언트를 담을 내부클래스 END

	
	//Run1
	@Override
	public void run() {
		// TODO Auto-generated method stub

		//서버소켓 생성
		try {
			severSocket = new ServerSocket(6000); //5000번 이후 아무거나
			area.append("서버소켓 생성 성공!!!\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			area.append("서버소켓 생성 실패: "+e.getMessage());
		}

		//접속을 시도하는 클라이언트 허용 대기상태...쓰레드 안에서 계속 돌아야 누가 접속해도 허용
		//쓰레드2개 (접속허용) (클라이언트 대화용)

		while (true) {

			try {
				Socket socket = severSocket.accept();

				area.append(socket.getInetAddress().getHostAddress()+"IP로 접속함\n");
				
				//벡터에 접속한 클라이언트 추가
				ClientList client = new ClientList(socket);
				
				list.add(client); //리스트 접속한 클라이언트 추가
				client.start(); //쓰레드 호출 메서드 (Run2 호출)  		
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				area.append("클라이언트 접속 실패: "+e.getMessage());
			}
		}
		
		
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_11_ServerChat ex = new _11_ServerChat();
		Thread th = new Thread(ex);
		th.start(); //Run1 호출
	}

}
