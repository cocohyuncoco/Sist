package day0209;


public class _04_ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,6,7};
		
		for (int i=0;i<=arr.length;i++) {			
			try {
				System.out.println(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("�����޼���-> "+e.getMessage());
			}
		}
		System.out.println("��������");
	
	
	
	}

}
