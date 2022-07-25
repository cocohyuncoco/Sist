package day0303;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//蓄亜 獄動 喚袈聖凶 持失吃 覗傾績...戚硯,java,jsp,spring 脊径獄動
//虞婚引 努什闘琶球 稽 舛左脊径
//  戚硯 : ししし
// java : ししし
// jsp : ししし

public class AddFrame extends JFrame{
	
	Container cp;
	JLabel titleName, titleBan, titleJava, titleJsp, titleSpring;
	JTextField tfName, tfJava, tfJsp, tfSpring;
	JComboBox<String> cbBan;
	JButton btnAdd;
	
	
	public AddFrame(String title) {
		// TODO Auto-generated constructor stub
		
		super(title);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 100, 290, 300);
		cp.setBackground(new Color(255,255,100));
		
		initDesign();
		//this.setVisible(true);
	}
	
	public void initDesign() {
		
		this.setLayout(null);
		//label
		titleName = new JLabel("戚硯");		
		titleBan = new JLabel("鋼");		
		titleJava = new JLabel("JAVA");		
		titleJsp = new JLabel("Jsp");		
		titleSpring = new JLabel("Spring");
		
		//tf
		tfName = new JTextField(4);
		tfJava = new JTextField(4);
		tfJsp = new JTextField(4);
		tfSpring = new JTextField(4);
		
		//cb
		String[] ban = {"A鋼","B鋼","C鋼","D鋼"};
		cbBan = new JComboBox<String>(ban); //壕伸稽 幻級嬢 爪左酵什拭 眼奄
		
		//btn
		btnAdd = new JButton("蓄亜");
		
		//陳匂獲闘級税 是帖識舛
		titleName.setBounds(30, 10, 60, 30);
		this.add(titleName);
		
		titleBan.setBounds(30, 40, 60, 30);
		this.add(titleBan);
		
		titleJava.setBounds(30, 70, 60, 30);
		this.add(titleJava);
		
		titleJsp.setBounds(30, 100, 60, 30);
		this.add(titleJsp);
		
		titleSpring.setBounds(30, 130, 60, 30);
		this.add(titleSpring);
	
		tfName.setBounds(90, 15, 150, 20);
		this.add(tfName);
		
		cbBan.setBounds(90, 45, 150, 20);
		this.add(cbBan);
		
		tfJava.setBounds(90, 75, 150, 20);
		this.add(tfJava);
		
		tfJsp.setBounds(90, 105, 150, 20);
		this.add(tfJsp);
		
		tfSpring.setBounds(90, 135, 150, 20);
		this.add(tfSpring);
			
		btnAdd.setBounds(30, 180, 200, 25);
		this.add(btnAdd);
	}
	
	
	/* public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AddFrame("失旋蓄亜廿");
	}*/

}
