package day0209;

public class _07_ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("안녕하세요");
		System.out.println("5초후 헤어집시다");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("안녕히가세요");
	}

}
