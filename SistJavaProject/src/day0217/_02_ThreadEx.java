package day0217;

import java.util.Iterator;

public class _02_ThreadEx extends Thread{

	String name;
	int num;
	
	public _02_ThreadEx(String name, int num) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.num=num;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i=1;i<=num;i++) {
			System.out.println(name+"==>"+i);
			
		}
	}
	
	/* public void run() {
					
		for (int i=1;i<=num;i++) {
			System.out.println(name+"==>"+i);
			
		}
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_02_ThreadEx th1 = new _02_ThreadEx("one", 300);
		_02_ThreadEx th2 = new _02_ThreadEx("two", 300);
		_02_ThreadEx th3 = new _02_ThreadEx("three", 300);
		
		
		//runȣ��
		//th1.run();
		//th2.run();
		//th3.run();
		//runȣ���� -start // Runnable���¿��� �����췯�� ���ؼ� �ϳ��� Running���� �ȴ�
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}

}
