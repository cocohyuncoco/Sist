package day0121;

public class ForEx_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�ʱⰪ�� ������ ���� ������ �ѹ��� �ݺ�����
		for (int i=5;i<=1;i++) {
			System.out.print(i+" ");
			}
		
		//1 2 3 4 5 6 7 8 9 10		
		int i=1;
		for (;i<=10;i++) {
			System.out.println(i+" ");
			}
		System.out.print("\n�������� ���� i�� "+i);

		int a=10;
		for (;a<=50;a+=5) {
			System.out.println(a+" ");
		}
		System.out.print("\n�������� ���� a�� "+a);
		
		
		//���η� Hello�� 5�� ����Ͻÿ�
		for (int n=5;n>=1;n--) {
			System.out.print("\nHello"+" ");
		}
		System.out.println();
	
		//1~10������ �� �߿� ¦���� ����ϱ� ..for,if�� ���
		//2 4 6 8 10
		System.out.println("1~10���� ������ ¦���� ����ϱ�");
		
		for (int t=1;t<=10;t++) {
			if (t%2==0) {
				System.out.print(t+" ");	
			}
		}
		System.out.println();
	}

}
