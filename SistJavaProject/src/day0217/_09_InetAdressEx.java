package day0217;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

public class _09_InetAdressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InetAddress myAddr = InetAddress.getLocalHost();

			System.out.println("Local IP: "+myAddr.getHostAddress());
			System.out.println("Local Name: "+myAddr.getHostName());
			System.out.println("===================================");

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//자원열어논거 없으니 finaly 생략

		String hostName1 = "www.naver.com";
		String hostName2 = "www.google.com";
		String hostName3 = "www.nate.com";

		try {
			InetAddress []addr1 = InetAddress.getAllByName(hostName1);
			InetAddress []addr2 = InetAddress.getAllByName(hostName2);
			InetAddress []addr3 = InetAddress.getAllByName(hostName3);

			for (InetAddress ia:addr1) {

				System.out.println("name: "+ia.getHostName());
				System.out.println("IP: "+ia.getHostAddress());
				
			}

			for (InetAddress ia:addr2) {

				System.out.println("name: "+ia.getHostName());
				System.out.println("IP: "+ia.getHostAddress());
			}
			for (InetAddress ia:addr3) {

				System.out.println("name: "+ia.getHostName());
				System.out.println("IP: "+ia.getHostAddress());

			}



		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
