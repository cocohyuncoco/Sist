package day0217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class _10_URLEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String hostname="https://www.naver.com";
		
		try {
			URL url = new URL(hostname);
			
			InputStream is = url.openStream();
			BufferedReader br = null;
			
			br = new BufferedReader(new InputStreamReader(is));
			
			while (true) {
				
				String line = br.readLine();
				
				if (line==null) break;
				System.out.println(line);
				
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}

}
