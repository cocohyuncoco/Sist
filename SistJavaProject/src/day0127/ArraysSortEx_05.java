package day0127;

import java.util.Iterator;

import org.xml.sax.helpers.NamespaceSupport;

public class ArraysSortEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"��ȿ��","��ȣ��","������","���缮","����"};
		int[] ages = {39,45,33,38,32};
		/*
		 * ��ȣ   �̸�     ����
		 * 1     ��ȣ��   45
		 */
		//�̸��� ������������ ���
//		for (int i=0;i<names.length-1;i++) {
//			for (int j=i+1;j<names.length;j++) {
//			}
//		}
		//�������� ����
		for (int i=0;i<names.length-1;i++) 
		{
			for (int j=i+1;j<names.length;j++)
			{
				if (names[i].compareTo(names[j])>0) 
				{
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
					
					//�̸����� �� ���̵� ���� ����
					int n=ages[i];
					ages[i]=ages[j];
					ages[j]=n;
				}
			}
		}
		//���
		System.out.println("��ȣ\t�̸�\t����");
		for (int i=0;i<names.length;i++) 
		{
			System.out.println(i+1+"\t"+names[i]+"\t"+ages[i]);
		}		
	}
}
