package day0209;

import java.util.Scanner;

import day0209.PayOuter.InputInner;
import day0209.PayOuter.SudangInner;

class PayOuter{
	
	
	private String sawonName;
	private int gibonPay,timeSu,familSu;
	
	//����Ŭ���� ��ü���� /�̷��� �ƿ�Ŭ������ ����Ŭ���� ��ü �����صθ� ���θ޼��忡�� �θ��� ����� �޶�����
	InputInner input=new InputInner();
	SudangInner output = new SudangInner();
	
	//�ܺθ޼���_����Ŭ���� ȣ��
	public void process() {
		//�������Է�
		input.inputData();
		
		//���������
		output.writeData();
	}
	
	
	//�Է¿� ���� ���� Ŭ����
	class InputInner{

		public void inputData() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("����� �Է�");
			sawonName = sc.nextLine();
			
			System.out.println("�⺻�� �Է�");
			gibonPay = sc.nextInt();
			
			System.out.println("�ʰ��ð� �Է�");
			timeSu = sc.nextInt();
			
			System.out.println("������ �Է�");
			familSu = sc.nextInt();
		}
	}
	//��¿� ���� �޼��带 ���� Ŭ������
	class SudangInner{
		//�ð��ܼ���
		public int getTimeSudang() {
			return timeSu*10000;
		}
		
		//��������
		public int getFamilySudang() {
			if (familSu<=3) {
				return 200000;	
			}else {
				return 300000;
			}
		}
		//�Ǽ��ɾ�
		private int getNetpay() {
			return gibonPay+getFamilySudang()+getTimeSudang();
		}
		
		//��¸޼���
		public void writeData() {
			System.out.println("�����\t�⺻��\t�ʰ��ð���\t������\t�ð�����\t��������\t�Ǽ��ɾ�");
			System.out.println(sawonName+"\t"+gibonPay+"\t"+timeSu+"\t"+familSu+"\t"+
			getTimeSudang()+"\t"+getFamilySudang()+"\t"+getNetpay());
			
		}
		
	}
	
} 

public class _02_InnerReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���1 �ܺ�Ŭ������ ����Ŭ���� ��ü���� ������ ���
		//PayOuter pay = new PayOuter();
		//pay.process();
		
		//���2 �ܺ�Ŭ������ ����Ŭ���� ��ü���� �������� ���
		PayOuter pay = new PayOuter();
		PayOuter.InputInner input = pay.new InputInner();
		input.inputData(); //�������Է�
		
		PayOuter.SudangInner output = pay.new SudangInner();
		output.writeData(); //�������Է�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
