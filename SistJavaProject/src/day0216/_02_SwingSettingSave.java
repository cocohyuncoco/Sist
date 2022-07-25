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
	int fsize; //�����ڽ� �۲� ũ�� ���� ����
	
	//��ư üũ�Ȱ� true, üũ �ȵȰ� falus ���� boolean
	boolean italic, bold; 
	
	//���ϸ�
	static final String FILENAME="C:\\sist0117\\javawork\\setting.txt";
	
	JCheckBox cbItalic, cbBold; //���Ÿ��� üũ�ؾ��� ���忡 üũ�ؾ��� �ϰԲ�
	
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
		//���ð��� ���Ͽ��� �ҷ��ͼ� �����ο� �ݿ������� ���⼭ ȣ��
		
		
		
		//������ ����Ǵ� ���� �̺�Ʈ..Ư������ �������� �翬�� ������ּž� �մϴ�
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);

				//���忡 ���� �޼���ȣ��
				saveSetting();
				
				//�޼���
				JOptionPane.showMessageDialog(_02_SwingSettingSave.this, "���ð� ������ �����մϴ�");
				//this���� �������� Ŭ������(����).this
				
				//����
				System.exit(0); //��������
			
			}
		});

		readSetting();
		this.setVisible(true);
		
	}
	
	//���������� ���ð� �ҷ����� �޼���
	public void readSetting() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			fsize = Integer.parseInt(br.readLine()); //readLine�� ��ȯ���� string�̶�� ����������. �츮�� �ʿ��Ѱ� int�� ����������� //���ڷ� Ȯ��
			
			italic = Boolean.parseBoolean(br.readLine()); //��� ��, �������� Ȯ���Ұž� 
			bold = Boolean.parseBoolean(br.readLine());
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			//�ʱⰪ ������� ����
			fsize=15;
			italic=false;
			bold=false;
			
		}catch (IOException e) {
			
		}finally {
			System.out.println("Ȯ��: fsize "+fsize);
			System.out.println("Ȯ��: italic "+italic);
			System.out.println("Ȯ��: bold "+bold);
			try {
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	//�����Ҷ� ���ð� �������ִ� �޼���
	
	public void saveSetting() {
		
		//fsize, italic, bold ������ ����
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(FILENAME);
			
			//����
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
		
		lblResult = new JLabel("��������� ����Ȯ��", JLabel.CENTER);
		lblResult.setBounds(20,30,350,80);
		lblResult.setBorder(new LineBorder(Color.MAGENTA, 5));
		lblResult.setOpaque(true);
		lblResult.setBackground(Color.orange);
		this.add(lblResult); //�����ӿ��߰�
		
		//������ư..��Ʈ������
		int init=10; //�⺻�۲û�����..10
		int xpos=50;
		ButtonGroup bg = new ButtonGroup();
		
		for (int i=0;i<rbFont.length;i++) {
			
			//����4������
			rbFont[i] = new JRadioButton(String.valueOf(init));
			init += 5; //10���� 5�� ����..10,15,20,25

			//���� �׷쿡 �����ְ�
			bg.add(rbFont[i]);
			
			//���� ������
			rbFont[i].setBounds(xpos, 150, 40, 30);
			rbFont[i].setOpaque(false);
			
			//���� ����
			this.add(rbFont[i]);
			
			//���� ��ġ ����
			xpos += 50;
			
			int idx=i;
			
			//�͸���Ŭ����..��Ʈ�ٲٴ�
			rbFont[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					fsize = Integer.parseInt(rbFont[idx].getText());
					changeFont();
					
				}
			});
			
		}
		
		
		//üũ�ڽ�..����, ����
		//���� ���� �� ��ġ����
		cbItalic = new JCheckBox("����",italic);
		cbItalic.setBounds(150,200,80,30);
		cbItalic.setOpaque(false);
		this.add(cbItalic);
		
		//���� �̺�Ʈ
		cbItalic.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				//italic = cbItalic.isSelected(); //���ý� true..���1
				
				JCheckBox ob=(JCheckBox)e.getSource(); //���2
				italic = ob.isSelected();
				
				changeFont();
			}
		});
		
		//���� ���� �� ��ġ����
		cbBold = new JCheckBox("����",bold);
		cbBold.setBounds(60,200,60,30);
		cbBold.setOpaque(false);
		this.add(cbBold);
		
		//���� �̺�Ʈ
		cbBold.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//���1
				//bold = cbBold.isSelected();
				//changeFont();
				
				//���2
				bold=cbBold.isSelected();
				changeFont();
			}
		});
	}
	//��Ʈ, ����, ��︲(���Ÿ�)...�� ���� �޼���
	public void changeFont() {
		
		if (italic && bold) {
			lblResult.setFont(new Font("�ü�ü", Font.BOLD|Font.ITALIC, fsize));
		}else if (italic && !bold) {
			lblResult.setFont(new Font("�ü�ü", Font.ITALIC, fsize));
		}else if (!italic && bold) {
			lblResult.setFont(new Font("�ü�ü", Font.BOLD, fsize));
		}else {
			lblResult.setFont(new Font("�ü�ü", Font.PLAIN, fsize));
		}
	}
	
	//////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _02_SwingSettingSave("#2");
	}

}
