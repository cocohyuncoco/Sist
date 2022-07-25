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
	//Runnable�� ������ �����ָ� �� �޼����� �ޱ����Ѱ�

	JTextArea area;
	String nickname;
	JTextField tfSErverIP, tfNickName, tfMessage;
	JButton btnConnect, btnSend;

	Socket socket; //������ �־�� ������ ��ȭ �ְ����
	//������ ��ȭ �ְ�޴°� Ŭ���̾�Ʈ ...�׷��� �̸� ���� ����

	BufferedReader br;
	PrintWriter pw;

	public _11_ClientChst() {
		// TODO Auto-generated constructor stub
		super("Ŭ���̾�Ʈ �Դϴ�");
		this.setBounds(800, 100, 400, 500);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//����� �̺�Ʈ
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);


				//������ 9��° �г��� ������ ���� �˸���
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

		JLabel lbl1 = new JLabel("����IP");
		lbl1.setBounds(25, 20, 50, 30);
		this.add(lbl1);

		tfNickName=new JTextField("������"); //�ڱ��̸�
		tfNickName.setBounds(70,20,80,30);
		this.add(tfNickName);

		tfSErverIP=new JTextField("192.168.1.6"); //�ڱ� IP�ּ�
		tfSErverIP.setBounds(160,20,80,30);
		this.add(tfSErverIP);

		btnConnect=new JButton("����");
		btnConnect.setBounds(280, 20, 80, 30);
		this.add(btnConnect);

		//���� �̺�Ʈ (����Ŭ����)
		btnConnect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				//����ip�о�´�
				String serverIP = tfSErverIP.getText().trim();


				//������ ���� 
				try {
					socket = new Socket(serverIP, 6000);

					area.append("������ ���������� ����\n");

					//��Ʈ��ũ ���ؼ� �޼��� �а� �������� io��������
					pw = new PrintWriter(socket.getOutputStream());
					br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

					//â������ �г������� ����
					_11_ClientChst.this.setTitle(tfNickName.getText()+" ���� ä��â");

					//������ �޼��� ������
					pw.write("1|"+tfNickName.getText().trim()+"\n");
					pw.flush();

					//Run �޼��� ȣ�� (Run�޼���� ������ ������ �޼����� �д°�)
					Thread th = new Thread(_11_ClientChst.this);
					th.start(); //Run ȣ��

				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					area.append("�����ּ�, ��Ʈ �ٽ� Ȯ���ϼ���"+e1.getMessage()+"\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					area.append("���ӿ���: "+e1.getMessage()+"\n");
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

		btnSend = new JButton("����");
		btnSend.setBounds(290,390,60,30);
		this.add(btnSend);
		
		//�׼� ��ü
		tfMessage.addActionListener(this);
		btnSend.addActionListener(this);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object ob = e.getSource();
		
		//�޼��� �Է��� ���� Ȥ�� ���۹�ư
		if (ob==tfMessage || ob==btnSend) {
			
			//������ �޼���...2|�޼���|�г����������� ����
			pw.write("2|"+tfMessage.getText().trim()+"|"+tfNickName.getText().trim()+"\n");
			pw.flush();
			
			//�Է�â �޼��� ����� (�⺻)
			tfMessage.setText("");
			
			//Ŀ�� �޼���â�� �α�
			tfMessage.requestFocus();
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true) {

			try {
				//������ ������ �޼��� �д´�
				String msg = br.readLine();
				//area�� ���
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
