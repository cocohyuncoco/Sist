package day0217;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class _08_ObjectShopRead {

	ArrayList<_07_Shop> list = new ArrayList<_07_Shop>();
	
	public void FileObjectRead() {
		
		//파일에서 읽어서 출력(역직렬화)
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		
		try {
			fi = new FileInputStream("C:\\sist0117\\javawork\\shop0217.txt");
			oi = new ObjectInputStream(fi);
			
			list=(ArrayList<_07_Shop>)oi.readObject();
			
			System.out.println("상품명\t수량\t단가");
			System.out.println("====================");
		
			for (_07_Shop s:list) {
				System.out.println(s.getSang()+"\t"+s.getSu()+"\t"+s.getDan());				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oi.close();
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_08_ObjectShopRead osr = new _08_ObjectShopRead();
		osr.FileObjectRead();
		
	}

}
