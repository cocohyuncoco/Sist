package day0217;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Iterator;

//예제2번을 구현하는 Runnable(쓰레드가 가지고있는 인터페이스)를 구현하는 클래스로
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

		//인터페이스를 구현한 클래스 생성
		_03_ThreadEx ex1 = new _03_ThreadEx("one", 300);
		_03_ThreadEx ex2 = new _03_ThreadEx("two", 300);
		_03_ThreadEx ex3 = new _03_ThreadEx("three", 300);
		
		//쓰레드생성
		Thread th1=new Thread(ex1);
		Thread th2=new Thread(ex2);
		Thread th3=new Thread(ex3);
		
		//run메서드 호출 -start
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
				Thread.sleep(1000); //1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	
	
	
	
	
}
