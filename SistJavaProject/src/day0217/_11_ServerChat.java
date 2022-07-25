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

public class _11_ServerChat extends JFrame implements Runnable{ //Runnable �������̽� �̿��ؼ� ����

	JTextArea area;
	ServerSocket severSocket;

	//Ŭ���̾�Ʈ ���� ���� ����Ʈ����. Ŭ�����ϱ� new�� ��������
	Vector<ClientList> list = new Vector<ClientList>();


	public _11_ServerChat() {
		// TODO Auto-generated constructor stub
		super("�����Դϴ�");
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

	//Ŭ���̾�Ʈ�� ���� ����Ŭ����
	class ClientList extends Thread{
		//�̹� Runnable�� �����ֱ� ������ �ϳ� �� ��������� Thread ���

		Socket socket;
		BufferedReader br = null;
		PrintWriter pw = null;

		String nickName;

		public ClientList(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket=socket;

			//��Ʈ��ũ ���ؼ� �޼��� �а� �������� ��ǲ,�ƿ�ǲ ���� = printWriter. 
			//PrintWriter�� ���� BufferedReader�� �д´�

			try {
				pw = new PrintWriter(socket.getOutputStream());
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		//Run2 (��ȭ�ϱ� ���� ������)..��ȭ��
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();

			while (true) {

				//Ŭ���̾�Ʈ�� ���� �޼����� ���ٴ����� �д´�
				try {
					String msg = br.readLine();

					//�и�
					StringTokenizer st = new StringTokenizer(msg, "|");

					String num = st.nextToken(); //�߶��ִ� �޼���
					String data = st.nextToken();

					//num�� �� �Ұ��� ������ �ֱ�
					switch (num) {
					case "1"://1�ϰ�� �г��Ӹ� ����;
						this.nickName = data; //1�ϰ��� �ι�° ���ڰ� �г����̰�

						for (ClientList cc:list) { //for���� �̿��ؼ� list ����

							cc.pw.write(nickName+"���� �����ϼ̽��ϴ�\n");
							cc.pw.flush(); // ��Ʈ��ũ �����̵Ǵ� �޼���
							//flush�� �ؾ� ��Ʈ��ũ ������ ��μ� ��
						}
						break;
					case "2": //2�� ���� ��� Ŭ���̾�Ʈ ������ �޼��� ������

						String send = st.nextToken();

						for (ClientList cc:list) {

							cc.pw.write("\n"+send+"==>"+data+"\n");
							cc.pw.flush();
						}
						break;
					case "9"://9�� ���� ����
						//data�� �����ϴ� ��� �г��������� ���Ϳ��� ã�� ����
						for (int i=0;i<list.size();i++) {

							ClientList cc = list.get(i);

							if (data.equals(cc.nickName)) {
								list.remove(i);
								break;
							}
						}
						//for�� �ϳ��� �ص� �Ǵµ� �������� ���� �̷��� �Ѱ�. ������� ������ �����
						//��ü Ŭ���̾�Ʈ ���� ���� �˸���
						for (int i=0;i<list.size();i++) {

							ClientList cc = list.get(i); //���Ϳ��� ������ ������
							cc.pw.write(data+"���� �����߽��ϴ�\n");
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
	}	//Ŭ���̾�Ʈ�� ���� ����Ŭ���� END

	
	//Run1
	@Override
	public void run() {
		// TODO Auto-generated method stub

		//�������� ����
		try {
			severSocket = new ServerSocket(6000); //5000�� ���� �ƹ��ų�
			area.append("�������� ���� ����!!!\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			area.append("�������� ���� ����: "+e.getMessage());
		}

		//������ �õ��ϴ� Ŭ���̾�Ʈ ��� ������...������ �ȿ��� ��� ���ƾ� ���� �����ص� ���
		//������2�� (�������) (Ŭ���̾�Ʈ ��ȭ��)

		while (true) {

			try {
				Socket socket = severSocket.accept();

				area.append(socket.getInetAddress().getHostAddress()+"IP�� ������\n");
				
				//���Ϳ� ������ Ŭ���̾�Ʈ �߰�
				ClientList client = new ClientList(socket);
				
				list.add(client); //����Ʈ ������ Ŭ���̾�Ʈ �߰�
				client.start(); //������ ȣ�� �޼��� (Run2 ȣ��)  		
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				area.append("Ŭ���̾�Ʈ ���� ����: "+e.getMessage());
			}
		}
		
		
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_11_ServerChat ex = new _11_ServerChat();
		Thread th = new Thread(ex);
		th.start(); //Run1 ȣ��
	}

}
