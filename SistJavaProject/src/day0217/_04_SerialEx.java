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
		
		System.out.println("이름: "+name+", 나이: "+age);
	}
	
}
////////////////////
public class _04_SerialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//파일에 오브젝트 통채로 저장
		Apple a1 = new Apple("임현정", 25);
		
		FileOutputStream fs = null;
		ObjectOutputStream ob = null;
		
		try {
			fs=new FileOutputStream("C:\\sist0117\\javawork\\apple.txt");
			ob=new ObjectOutputStream(fs);
			
			//객체저장
			ob.writeObject(a1);
			
			System.out.println("Apple파일에 저장됨");
			
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
