package day0125;

import java.util.Scanner;

public class RandomSumatch_04 {

	public static void main(String[] args) {
		
		//����ȸ���� ���ļ� ����(������) �˾Ƹ��߱�
		//1: 77
		// 77���� �۽��ϴ�
		//2: 66
		//�¾ƿ�~������ 66�Դϴ�..���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		
		int rnd = (int)(Math.random()*100)+1; //1~100���� �����߻� / 1~100���� �߿��� ������ ���ض� �Ҷ� �̰� �Ἥ ���ؾ��Ѵ� 
		//  rnd�� ��Ÿ�� ���� rnd ���� �̹� �����ִ°Ŵ�. �츮�� �װ� �����
		int su; //�Է��� ��
		int cnt=0; //Ƚ���� ���ϴ� ����
		
		System.out.println("������ ���纸����");
		while (true) {//������ �𸣴°� ���� while(true)�� ����
			cnt++;
			System.out.print(cnt+"ȸ: ");
			su=sc.nextInt();
			
			if(cnt==5)
				break;
				
			if (su>rnd) {
				System.out.println(su+"���� �۽��ϴ�");
			}else if(su<rnd) {
				System.out.println(su+"���� Ů�ϴ�");
			}else {
				System.out.println("�¾ƿ� ������ "+rnd+" �Դϴ�");
				break;
			}
			
		}System.out.println("���α׷� ����");
		
		
		
	}//main��
}//class��
