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

public class UpdateFrame extends JFrame{
	
	Container cp;
	JLabel titleName, titleBan, titleJava, titleJsp, titleSpring;
	JTextField tfName, tfJava, tfJsp, tfSpring;
	JComboBox<String> cbBan;
	JButton btnMod; //呪舛獄動
	String num; // 呪舛拝 腰硲 角移匝 痕呪 
	
	//呪舛拝凶澗 呪舛拝形澗 腰硲研 備窮生稽 角延陥【
	
	public UpdateFrame(String title) {
		// TODO Auto-generated constructor stub
		
		super(title);
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 100, 290, 300);
		cp.setBackground(new Color(255,155,155));
		
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
		btnMod = new JButton("呪舛");
		
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
			
		btnMod.setBounds(30, 180, 200, 25);
		this.add(btnMod);
	}
	
	
	/* public static void main(String[] args) {
		// TODO Auto-generated method stub

		new UpdateFrame("失旋呪舛廿");
	 }*/

}
