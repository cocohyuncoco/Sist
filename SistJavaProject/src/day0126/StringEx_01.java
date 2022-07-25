package day0126;

import java.util.Iterator;

public class StringEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("string��ü�� ���� ��� �޼��� �����մϴ�");
		
		String str1="apple";
		String str2="Apple";
		String str3="Have a Nice Day";
		String str4="    Happy Day    ";
		
		
		System.out.println("str3�Ǳ��� :"+str3.length());//������� ���� �� �������� ������
		System.out.println("str4�Ǳ��� :"+str4.length());//������� ���� �� �������� ������
		
		System.out.println("�յ� �������� str4�Ǳ��� :"+str4.trim().length());//�������� �� �������� ������, ���ڻ��� ������ ���ڷ�ħ
		
		System.out.println("*"+str4.trim()+"*"); //trim ���־�
		
		System.out.println("str3���� 0������: "+str3.charAt(7));//���� �Է��ϸ� �� ���� ��ġ���ִ� ���� ������

		System.out.println("str3���� H�� �ε���: "+str3.indexOf('H'));//� �ܾ��� ��ȣ ���� ã�Ƽ� ������
		System.out.println("str3���� H�� �ε���: "+str3.indexOf('N'));//� �ܾ��� ��ȣ ���� ã�Ƽ� ������
		
		System.out.println("str3���� Have���: "+str3.substring(0, 4));//0~4 ���� ����
		System.out.println("str3���� Nice���: "+str3.substring(7, 11));//7~10���� ����
		
		
		//equals�� ������ true,�ٸ��� false
		System.out.println("���ڿ���:"+str1.equals(str2));//fales
		System.out.println("���ڿ���:"+str1.equalsIgnoreCase(str2));//true
		
		//a.compareTo(b) -��������, �������� ���� �Ҷ� ���־���
		//a�� b�� ������� 0
		//a�� ������� -(���ĺ� ���̸�ŭ ���̳ʽ���)
		//a�� ū��� -(���ĺ� ���̸�ŭ �÷�����)
		
		System.out.println(str1.compareTo(str2)); //a(97), A(65)
		System.out.println(str1.compareTo(str1)); //a(97), A(65)
		System.out.println("computer".compareTo("command")); //�ٶȰ����� ������ ���� p��m�� ���մϴ�
		System.out.println("hello".compareTo("hello"));
		System.out.println("apple".compareTo("banana"));
		System.out.println("kiwi".compareTo("orange"));
		System.out.println("ȫ".compareTo("��")); //ȫ�� ������ ū ���
		
		System.out.println("str3�� Have�� �����ϸ� true:"+str3.startsWith("Have"));
		System.out.println("str3�� Have�� �����ϸ� true:"+str3.startsWith("Happy"));
		
		System.out.println(str3.endsWith("Day"));//��,�ҹ��� ���� true
		System.out.println(str3.endsWith("day"));//��,�ҹ��� ���� false
		
		//���ڿ� �и��ϴ� �޼��� split <-���̾��ӡ�
		String str5="red,blue,green,yellow,pink,white";//<-split�� �����Ұ� �־���ԡ�
		System.out.println("str5 �� �ĸ��� �и��Ͽ� ����ϱ�");
		String[] arr=str5.split(","); //�� �������� ���ڿ��� �ɰ��ų�
		System.out.println(",�� ���е� ���󰳼�:"+arr.length);
		
		//���
		for (String color:arr) 
			System.out.println(color);
			
		System.out.println("str3�� �ҹ��� ���:"+str3.toLowerCase()); //�ҹ������ /�߾Ⱦ�
		System.out.println("str3�� �ҹ��� ���:"+str3.toUpperCase()); //�빮����� /�߾Ⱦ�
		
		String a=String.valueOf(100); //int������ 100�� Stringȭ ������
		String b=String.valueOf(12.345); //double������ 12.324�� Stringȭ ������
		System.out.println(a+b);//���ڷκ��� 
		
		String a2=100+""; //String�̵� ��
		String b2=23.5+""; //String�̵�
		System.out.println(a2+b2);//���ڷκ���
		
		System.out.println("���ڿ��� �Ϻκ���");
		System.out.println(str3.replace('a', '*'));//��
		System.out.println(str3.replace("Nice", "Wonderful"));
		
		
		
	}

}
