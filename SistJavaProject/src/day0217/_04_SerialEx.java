package day0217;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Apple implements Serializable{
	String name;
	int age;

	public Apple(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	
	public void write() {
		
		System.out.println("�̸�: "+name+", ����: "+age);
	}
	
}
////////////////////
public class _04_SerialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���Ͽ� ������Ʈ ��ä�� ����
		Apple a1 = new Apple("������", 25);
		
		FileOutputStream fs = null;
		ObjectOutputStream ob = null;
		
		try {
			fs=new FileOutputStream("C:\\sist0117\\javawork\\apple.txt");
			ob=new ObjectOutputStream(fs);
			
			//��ü����
			ob.writeObject(a1);
			
			System.out.println("Apple���Ͽ� �����");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ob.close();
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
