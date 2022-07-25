package day0217;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Iterator;

//����2���� �����ϴ� Runnable(�����尡 �������ִ� �������̽�)�� �����ϴ� Ŭ������
public class _03_ThreadEx implements Runnable{

	String name;
	int num;
	
	
	public _03_ThreadEx(String name, int num) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.num = num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�������̽��� ������ Ŭ���� ����
		_03_ThreadEx ex1 = new _03_ThreadEx("one", 300);
		_03_ThreadEx ex2 = new _03_ThreadEx("two", 300);
		_03_ThreadEx ex3 = new _03_ThreadEx("three", 300);
		
		//���������
		Thread th1=new Thread(ex1);
		Thread th2=new Thread(ex2);
		Thread th3=new Thread(ex3);
		
		//run�޼��� ȣ�� -start
		th1.start();
		th2.start();
		th3.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=num;i++) {
			System.out.println(name+"===>"+i);
		
			try {
				Thread.sleep(1000); //1��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	
	
	
	
	
}
