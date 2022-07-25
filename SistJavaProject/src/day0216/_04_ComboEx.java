package day0216;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class _04_ComboEx extends JFrame implements ActionListener, ItemListener{

	Container cp;

	//JComboBox<E> // E->엘리먼트 / 제네릭타입
	JComboBox<String> combo;
	String[] names = {"조정언","류슬영","이다솔","김주찬"};
	
	JTextField tfname;
	JButton btnAdd, btnDel;
	JLabel lblResult;
	
	int idx=-1; //멤버변수 0으로 자동초기화 되는데 0번 삭제를 막기위해서 -1 음수값을 준다
	
	public _04_ComboEx(String title) {
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
		
		//콤보박스에 담을 내용을 변수로 지정하여 넣기
		//언제나 배열로 줘야한다
		//콤보박스에 뭘 넣어야할지 넣어야할거 아니얌
		combo = new JComboBox<String>(names);
		combo.setBounds(30,30,100,30);
		this.add(combo);
	
		tfname = new JTextField();
		tfname.setBounds(30,90,100,30);
		this.add(tfname);
		
		btnAdd = new JButton("추가");
		btnAdd.setBounds(150,90,80,30);
		this.add(btnAdd);
		
		btnDel = new JButton("삭제");
		btnDel.setBounds(250,90,80,30);
		this.add(btnDel);
		
		lblResult = new JLabel("Reslut", JLabel.CENTER);
		lblResult.setBorder(new LineBorder(Color.orange,8));
		lblResult.setBounds(20,250,350,50);
		this.add(lblResult);
		
		//액션추가
		combo.addItemListener(this); // ★ 액션리스너 쓰면 안나옴 ★
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		
		
	}
	//버튼 2개 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		
		if (ob==btnAdd) {			
			
			String text = tfname.getText().trim();
			
			if (text.length()==0) {
				JOptionPane.showMessageDialog(this, "이름을 입력후 추가버튼을 눌러주세요");
			}else {
				combo.addItem(text);//추가 해준다는 메서드. 콤보에추가
				tfname.setText("");
				lblResult.setText("해당 항목이 추가됨");
			}
		}else if (ob==btnDel) {
			
			if (idx==-1) {
				JOptionPane.showMessageDialog(this, "삭제할 항목 선택 후 삭제해주세요");
			}else {
				combo.removeItemAt(idx);
				lblResult.setText("해당항목을 삭제 했습니다");
			}	
		}
	}
	
	//콤보이벤트
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		idx=combo.getSelectedIndex();
		
		//반환형 틀릴때는 앞에 변수 반환형이랑 맞춰주면됨
		String item = (String)combo.getSelectedItem();
		
		lblResult.setText(idx+"번 인덱스의 "+item+"선택!!");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _04_ComboEx("스윙 콤보박스#4"); 
	
	}

	

}
