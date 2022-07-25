package day0204;


/*
 * �⺻�� ����Ÿ Ÿ��: int, long, char, double, float, �� �� ��8�� <- ���� ����
 * ���۷�����: Ŭ����(�ձ��ڰ� �빮��)����, �迭����(�迭�� Ŭ���� ���ֿ� ���ٴ°� ���۷����� �̱� ����) <-���۷��� ����
 *  
 *  call By Value: ���� ����
 *  call By reference: �ּ�
 */

class Test1{

	String name ="������";
	String addr = "����";
}

public class CallByEx_02 {

	public static void changInt(int n) {//n���� �����ؼ� �����Ű�� �޼���
		
		//1. call By Value: ���� ���޹���, ������ a�� ������ n�� �ּҰ� Ʋ��
		System.out.println("���޹��� ������: "+n);
		n=20;
	}
	
		//2. call By reference: �迭�� ��ü�� �νĵȴ�.(�׷��� Ŭ������ ���� ���ֿ� �ִ�), �ּҰ� ���޵�, ���⼭ �����ϸ� ȣ��Ȱ� ���ұ�?
		public static void changeArray(int[] arr) {
			
			System.out.println("���޹��� �迭 ���");
			
			for (int a:arr) {
				System.out.println(a);
				arr[2]=100;//2���� ���� 100���� �ٲ�
			}
			
		}
	
		//3. Test1 ������ �ּҸ� ����
		public static void changeTest(Test1 t1) {
			
			
			System.out.println("���޹��� Test1��ü ���");
			System.out.println(t1.name+","+t1.addr);
				
			//������
			t1.name="��ȿ��";
			t1.addr="���ֽ� �ֿ���";
			
		}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.
		int a = 50;
		changInt(a); //���� ����
		System.out.println("a�� ���� �ٲ��?"+a);
		
		
		//2. 
		int [] arr2 = {10,20,30};
		changeArray(arr2);
		System.out.println("�޼��� ȣ�� �� �迭���� Ȯ���ϱ�");
		
		for (int ar:arr2) {
			System.out.println(ar); //2���� ���� 100���� �ٲ�
			
		}
		
		//3. 
		Test1 t1 = new Test1();
		changeTest(t1);
		
		System.out.println("������ ���");
		System.out.println(t1.name+","+t1.addr);
		
		
	}

}
