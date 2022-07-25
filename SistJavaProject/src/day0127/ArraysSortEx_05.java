package day0127;

import java.util.Iterator;

import org.xml.sax.helpers.NamespaceSupport;

public class ArraysSortEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"이효리","강호동","김태희","유재석","하하"};
		int[] ages = {39,45,33,38,32};
		/*
		 * 번호   이름     나이
		 * 1     강호동   45
		 */
		//이름의 오름차순으로 출력
//		for (int i=0;i<names.length-1;i++) {
//			for (int j=i+1;j<names.length;j++) {
//			}
//		}
		//오름차순 정렬
		for (int i=0;i<names.length-1;i++) 
		{
			for (int j=i+1;j<names.length;j++)
			{
				if (names[i].compareTo(names[j])>0) 
				{
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
					
					//이름변경 시 나이도 같이 변경
					int n=ages[i];
					ages[i]=ages[j];
					ages[j]=n;
				}
			}
		}
		//출력
		System.out.println("번호\t이름\t나이");
		for (int i=0;i<names.length;i++) 
		{
			System.out.println(i+1+"\t"+names[i]+"\t"+ages[i]);
		}		
	}
}
